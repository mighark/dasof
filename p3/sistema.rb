#@file sistema.rb
#@author Miguel García Moya

module SistemaLDE

    def self.sistema(&proc)
        sistema = Sistema.new
        sistema.instance_eval(&proc)
        sistema
    end
    
    class Sistema
        def initialize
            @entradas = Array.new
        end

        def regla(nombre, &proc)
            regla = @entradas.find{|x| x.nombre == nombre}
            if(regla == nil)
                regla = Regla.new(nombre)
            else
                raise ExcepcionLDE.new, "Las reglas deben tener nombre único."
            end
            regla.instance_eval(&proc) if block_given?
            regla.comprobar
            @entradas.push(regla)
        end

        def bloque(&proc)
            bloque = Bloque.new
            bloque.instance_eval(&proc) if block_given?
            #comprobar que bloque tiene al menos 1 regla o 2 bloques
            bloque.comprobar
            @entradas.push(bloque)
        end

        def aplicar(objetos)
            #aplicar sistema al conjunto de objetos
            @entradas.each{|regla| regla.aplicar(objetos)}
        end

        def debug
            puts "Sistema:"
            if @entradas.length > 0
                @entradas.each{|x| x.debug}
            end
        end
    end

    class Regla 
        def initialize(nombre)
            @nombre = nombre
            @patron_ent = nil
            @patron_sal = nil
        end

        attr_reader :nombre

        def patron_entrada(&proc)
            @patron_ent = PatronEntrada.new
            @patron_ent.instance_eval(&proc) if block_given?
        end

        def patron_salida(&proc)
            @patron_sal = PatronSalida.new
            @patron_sal.instance_eval(&proc) if block_given?

        end

        def comprobar
            #comprobar que regla tiene patron de entrada y salida
            if @patron_ent == nil || @patron_sal == nil
                raise ExcepcionLDE.new, "Las reglas deben tener un patrón de entrada y un patrón de salida."
            end
            #comprobar que si hay variables en ambos patrones, tienen el mismo tipo
            @patron_ent.comprobar_var_repetidas(@patron_sal)
        end

        def aplicar(objetos)
            #selecciona ocurrencia
            ocurrencia = @patron_ent.comprobar_condicion(objetos)
            #si ocurrencia es nil, no aplicar regla
            if ocurrencia != nil
                #elimina ocurrencia del conjunto
                ocurrencia.each{|o| objetos.delete(o)}
                #aplica transformaciones sobre la ocurrencia
                @patron_sal.realizar_asignacion(ocurrencia)
                #añade la ocurrencia transformada al conjunto
                ocurrencia.each{|o| objetos.push(o)}
                #regla ejecutada: informar bloque
                return 1
            end
            #regla no ejecutada: informar bloque
            return 0
        end

        def debug
            puts "*Regla #{@nombre}:"
            @patron_ent.debug
            @patron_sal.debug
            puts
        end
    end

    class Patron 
        def initialize
            @variables = Array.new
        end

        def variable(nombre, tipo, &proc)
            #nombre unico
            variable = @variables.find{|x| x.nombre == nombre}
            if(variable == nil)
                variable = Variable.new(nombre, tipo, proc)
                if block_given?
                    variable.code(proc)
                end
            else
                raise ExcepcionLDE.new, "Las variables de un patrón deben tener nombre único."
            end
            @variables.push(variable)

        end

        def variable_con_nombre(nombre)
            @variables.find{|x| x.nombre == nombre}
        end

        def comprobar_var_repetidas(otro_patron)
            @variables.each{|x|
                repetida = otro_patron.variable_con_nombre(x.nombre)
                if repetida != nil
                    if repetida.tipo != x.tipo
                        raise ExcepcionLDE.new, "Si un patrón de entrada y un patrón de salida tienen una variable con el mismo nombre, debe tener el mismo tipo."
                    end
                end
            }
        end
    end

    class PatronEntrada < Patron
        def initialize
            super
        end

        def comprobar_condicion(objetos)
            objetos_aux = objetos.clone
            objetos_condicion = Array.new
            @variables.each{|v| 
                #busca un objeto que sea del tipo de la variable y cumpla la condicion
                objeto = objetos_aux.find{|x| x.is_a?(Object.const_get(v.tipo)) && v.ejecutar_code(x)}
                if objeto == nil
                    #una variable no existe: no aplicar regla
                    return nil
                end
                #elimina objeto del conjunto restante y pone objeto en conjunto que cumple condicion
                objetos_aux.delete(objeto)
                objetos_condicion.push(objeto)
            }
            return objetos_condicion
        end

        def debug
            puts "\tPatrón de entrada. Variables:"
            if @variables.length == 0
                puts "\t\tNinguna."
            end
            @variables.each{|x| x.debug(:entrada)}
        end
    end

    class PatronSalida < Patron
        def initialize
            super
        end

        def realizar_asignacion(objetos)
            objetos_aux = objetos.clone
            @variables.each{|v| 
                #busca un objeto que sea del tipo de la variable
                objeto = objetos_aux.find{|x| x.is_a?(Object.const_get(v.tipo))}
                if objeto == nil
                    #un objeto no existe: crear
                    objeto = Object.const_get(v.tipo).new
                    objetos.push(objeto)
                else
                    #aplica transformacion
                    v.ejecutar_code(objeto)
                    #elimina objeto del conjunto restante
                    objetos_aux.delete(objeto)
                end
            }
            #elimina objetos que esten en patron de entrada y no de salida
            objetos_aux.each{|o| objetos.delete(o)}
        end

        def debug
            puts "\tPatrón de salida. Variables:"
            if @variables.length == 0
                puts "\t\tNinguna."
            end
            @variables.each{|x| x.debug(:salida)}
        end
    end

    class Variable
        
        #si variable de entrada y variable de salida tienen mismo nombre, deben tener mismo tipo
        def initialize(nombre, tipo, condicion)
            @nombre = nombre
            @tipo = tipo
        end

        attr_reader :nombre, :tipo

        def code(proc)
            @codeblock = proc
        end

        def ejecutar_code(objeto)
            if @codeblock
                return @codeblock.call(objeto)
            end
            return true
        end

        def debug(patron)
            print "\t\tNombre: #{@nombre}. Tipo: #{@tipo}. "
            if @codeblock == nil
                if patron == :entrada
                    puts "Sin condición definida."
                else
                    puts "Sin asignación definida."
                end
            else
                if patron == :entrada
                    puts "Condición definida."
                else
                    puts "Asignación definida."
                end
            end
        end
    end

    class Bloque
        def initialize
            @entradas = Array.new
            @reglas = 0
            @bloques = 0
        end

        def regla(nombre, &proc)
            regla = @entradas.find{|x| x.nombre == nombre}
            if(regla == nil)
                regla = Regla.new(nombre)
            end
            regla.instance_eval(&proc) if block_given?
            @entradas.push(regla)
            @reglas += 1
        end

        def bloque(&proc)
            bloque = Bloque.new
            bloque.instance_eval(&proc) if block_given?
            #comprobar que bloque tiene al menos 1 regla o 2 bloques
            bloque.comprobar
            @entradas.push(bloque)
            @bloques += 1
        end

        def comprobar
            if @reglas == 0 && @bloques <= 1
                raise ExcepcionLDE.new, "Cada bloque debe contener al menos una regla o dos bloques."
            end
        end
        
        def aplicar(objetos)
            ejecutadas = 1
            #si no se ejecuta ninguna regla, dejar de ejecutar bloque
            while ejecutadas > 0
                ejecutadas = 0
                #aplicar sistema al conjunto de objetos
                @entradas.each{|regla| ejecutadas += regla.aplicar(objetos)}
            end
        end

        def debug
            puts "*Bloque:"
            if @entradas.length > 0
                @entradas.each{|x| x.debug}
            end
        end
    end

    class ExcepcionLDE < RuntimeError

    end

end