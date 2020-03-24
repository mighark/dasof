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
            @reglas = Array.new
            @bloques = Array.new
        end

        def regla(nombre, &proc)
            regla = @reglas.find{|x| x.nombre == nombre}
            if(regla == nil)
                regla = Regla.new(nombre)
            else
                raise ExcepcionLDE.new, "Las reglas deben tener nombre único."
            end
            regla.instance_eval(&proc) if block_given?
            regla.comprobar
            @reglas.push(regla)
        end

        def bloque(&proc)
            bloque = Bloque.new
            bloque.instance_eval(&proc) if block_given?
            #comprobar que bloque tiene al menos 1 regla o 2 bloques
            bloque.comprobar
            @bloques.push(bloque)
        end

        def debug
            if @reglas.length > 0
                puts "Reglas:"
                @reglas.each{|x| x.debug}
            end
            if @bloques.length > 0
                puts "Bloques:"
                @bloques.each{|x| x.debug}
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

        def debug
            puts "\tNombre: #{@nombre}"
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
                raise ExcepcionLDE.new, "Las reglas deben tener nombre único."
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

        #WIP: comprobar condiciones sobre variables

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

        #WIP: realizar asignaciones sobre variables

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
            @reglas = Array.new
            @bloques = Array.new
        end

        def regla(nombre, &proc)
            regla = @reglas.find{|x| x.nombre == nombre}
            if(regla == nil)
                regla = Regla.new(nombre)
            end
            regla.instance_eval(&proc) if block_given?
            @reglas.push(regla)
        end

        def bloque(&proc)
            bloque = Bloque.new
            bloque.instance_eval(&proc) if block_given?
            #comprobar que bloque tiene al menos 1 regla o 2 bloques
            bloque.comprobar
            @bloques.push(bloque)
        end

        def comprobar
            if @reglas.length == 0 && @bloques.length <= 1
                raise ExcepcionLDE.new, "Cada bloque debe contener al menos una regla o dos bloques."
            end
        end

        def debug
            puts "*Bloque:"
            if @reglas.length > 0
                puts "Reglas:"
                @reglas.each{|x| x.debug}
            end
            if @bloques.length > 0
                puts "Bloques:"
                @bloques.each{|x| x.debug}
            end
        end
    end

    class ExcepcionLDE < RuntimeError

    end

end