module SistemaLDE

    def self.sistema(&proc)
        sistema = Sistema.new
        sistema.instance_eval(&proc)
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
            end
            regla.instance_eval(&proc)
            @reglas.push(regla)
        end

        def bloque(&proc)
            bloque = Bloque.new
            bloque.instance_eval(&proc)
        end
    end

    class Regla 
        def initialize(nombre)
            @nombre = nombre
        end

        attr_reader :nombre

        def patron_entrada(&proc)
            @patron_ent = PatronEntrada.new
            @patron_ent.instance_eval(&proc)
        end

        def patron_salida(&proc)
            @patron_sal = PatronSalida.new
            @patron_sal.instance_eval(&proc)

        end
    end

    class Patron 
        def initialize
            @variables = Array.new
        end

        def variable(nombre, tipo)
            #nombre unico
            variable = Variable.new

        end
    end

    class PatronEntrada < Patron
        def initialize
            super
        end
    end

    class PatronSalida < Patron

    end

    class Variable
        
        #si variable de entrada y variable de salida tienen mismo nombre, deben tener mismo tipo
        def initialize(nombre, tipo)
            @nombre = nombre
            @tipo = tipo
        end

        def condicion
            #opcional: condiciones sobre datos de variable (usar bloques de codigo) para entrada
            #opcional: asignaciones de valores de variable (usar bloques de codigo) para salida
        end
    end

    class Bloque
        #bloques: contienen reglas y otros bloques
        #no pueden estar vacios o contener solo un bloque
        def initialize
            @reglas = Array.new
            @bloques = Array.new
        end

        def regla(nombre, &proc)
            regla = @reglas.find{|x| x.nombre == nombre}
            if(regla == nil)
                regla = Regla.new(nombre)
            end
            regla.instance_eval(&proc)
            @reglas.push(regla)
        end
    end

end