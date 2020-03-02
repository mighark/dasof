def monitorizar(objeto)
    metodosI = objeto.class.instance_methods(false)

    if(metodosI.find{|x| x == :monitorizar})
        raise NameError.new(), "Monitorizar ya es un método"
    end

    metodosI.each do |x| 
        #crea variables para contar invocaciones de cada metodo
        objeto.instance_variable_set(("@" + x.to_s + "counter"), 0)

        #crea variables para contar invocaciones de cada metodo
        #solo si la clase no tiene monitorizacion
        if(!objeto.class.respond_to?(:monitorizar))
            objeto.class.class_variable_set(("@@" + x.to_s + "counter"), 0)
        end

        #sobreescribe los metodos por uno que incrementa el contador y se llama a si mismo
        objeto.send(:define_singleton_method, x) do |*param| 
            #actualiza el contador en el objeto
            contador = objeto.instance_variables.find{|y| y == ("@" + x.to_s + "counter").to_sym}
            objeto.instance_variable_set(contador, objeto.instance_variable_get(contador) + 1)
            #actualiza el contador en la clase
            contador = objeto.class.class_variables.find{|y| y == ("@@" + x.to_s + "counter").to_sym}
            objeto.class.class_variable_set(contador, objeto.class.class_variable_get(contador) + 1)
            #llama al metodo original
            super(*param)
        end
    end

    #crea el metodo de instancia monitorizar
    objeto.send(:define_singleton_method, :monitorizar) do |param=0|
        #obtiene las variables de contador
        counters = objeto.instance_variables.select{|x| metodosI.include?(x.to_s[1..-8].to_sym)}
        #quita aquellas que sean menores al parametro
        filteredCounters = counters.select{|x| instance_variable_get(x) >= param}

        #calcula el total de llamadas (para el porcentaje)
        total = filteredCounters.inject(0){|sum, x| sum += instance_variable_get(x)}
        #si el total es 0, evita division por 0
        if(total == 0) then total = 1 end

        #imprime los resultados
        filteredCounters.each do |x|
            nombre = x.to_s[1..-8]
            llamadas = instance_variable_get(x)
            porcentaje = 100.0*llamadas/total
            puts nombre + " = #{llamadas} (#{porcentaje}%)"
        end
    end

    #crea el metodo de clase monitorizar
    if(!objeto.class.respond_to?(:monitorizar))
        objeto.class.send(:define_singleton_method, :monitorizar) do |param=0|
            #obtiene las variables de contador
            counters = objeto.class.class_variables.select{|x|metodosI.include?(x.to_s[2..-8].to_sym)}
            #quita aquellas que sean menores al parametro
            filteredCounters = counters.select{|x|class_variable_get(x) >= param}
            
            #calcula el total de llamadas (para el porcentaje)
            total = filteredCounters.inject(0){|sum, x| sum += class_variable_get(x)}
            #si el total es 0, evita division por 0
            if(total == 0) then total = 1 end
                
            #imprime los resultados
            filteredCounters.each do |x|
                nombre = x.to_s[2..-8]
                llamadas = class_variable_get(x)
                porcentaje = 100.0*llamadas/total
                puts nombre + " = #{llamadas} (#{porcentaje}%)"
            end
        end
    end
end