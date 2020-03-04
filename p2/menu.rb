module MenuGenerico

    def menu
        objetos = Array.new
        #bucle infinito: se rompe si no se pulsa 1
        while 0 == 0
            puts "Pulsa 1 para crear #{name}, enter para salir"
            input = gets
            if input.chomp() != "1"
                return
            end
            
            #crear objeto
            objeto = self.new
            instancia_vars = objeto.instance_variables

            #crear id: comprueba que no este repetido
            if(self.respond_to?(:id))
                repetido = true
                id_symbol = "@#{self.id}"
                while repetido
                    crear(id_symbol, objeto)
                    if(objetos.find{|a| a.instance_variable_get(id_symbol) == objeto.instance_variable_get(id_symbol)})
                        puts "Id repetido. Pruebe otro"
                    else
                        repetido = false
                    end
                end

                #quita el id de la lista de variables de instancia
                instancia_vars.delete("@#{self.id}".to_sym)
            end

            #crea las variables de instancia
            instancia_vars.each{|var| crear(var, objeto)}
            #imprime datos del objeto
            print "Se ha creado el objeto #{name} <"
            objeto.instance_variables.each{|var| print "#{var}=#{objeto.instance_variable_get(var)}; "}
            puts ">"

            #guarda objeto
            objetos.push(objeto)
        end

    end

    def crear(var, objeto)
        #si es array, entero o decimal hacer lo necesario
        if(objeto.instance_variable_get(var).is_a?(Array))
            crearArray(var, objeto)
        elsif(objeto.instance_variable_get(var).is_a?(Integer))
            crearInt(var, objeto)
        elsif(objeto.instance_variable_get(var).is_a?(Float))
            crearFloat(var, objeto)
        #si tiene variables de instancia, pedir sus valores
        elsif(objeto.instance_variable_get(var).instance_variables.length > 0)
            crearObject(var, objeto)
        else
        #tratar normal
            crearString(var, objeto)
        end
    end

    def crearString(var, objeto)
        puts "Introduce #{var.to_s[1..-1]}:"
        value = gets.chomp()
        objeto.instance_variable_set(var, value)
    end

    def crearArray(var, objeto)
        value = 1
        array = Array.new()
        while value != ""
            puts "Introduce valor para #{var.to_s[1..-1]} (enter para terminar):"
            value = gets.chomp()
            if(value != "")
                array.push(value)
            end
        end
        objeto.instance_variable_set(var, array)
    end

    def crearInt(var, objeto)
        puts "Introduce #{var.to_s[1..-1]}:"
        value = nil
        while value == nil
            begin
                value = Integer(gets)
            rescue
                puts "Valor no válido."
                value = nil
            end
        end
        objeto.instance_variable_set(var, value)
    end

    def crearFloat(var, objeto)
        puts "Introduce #{var.to_s[1..-1]}:"
        value = nil
        while value == nil
            begin
                value = Float(gets)
            rescue
                puts "Valor no válido."
                value = nil
            end
        end
        objeto.instance_variable_set(var, value)
    end

    def crearObject(var, objeto)
        puts "Introduce datos de #{var.to_s[1..-1]}:"
        objeto.instance_variable_get(var).instance_variables.each{|varaux| crear(varaux, objeto.instance_variable_get(var))}
    end

end