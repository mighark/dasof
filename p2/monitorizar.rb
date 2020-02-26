def monitorizar(objeto)
    metodosI = objeto.class.instance_methods(false)
    metodosC = objeto.class.singleton_methods(false)

    if(metodosI.find{|x| x == :monitorizar} || metodosC.find{|x| x == :monitorizar})
        raise NameError.new(), "Monitorizar ya es un método"
    end

    metodosI.each{|x| 
        #crea variables para contar invocaciones de cada metodo
        objeto.instance_variable_set(("@" + x.to_s + "counter"), 0)
        #sobreescribe los metodos por uno que incrementa el contador y se llama a si mismo
        #esta es la parte que no me sale
        objeto.class.send(:define_method, x) do |*param| 
            alias_method ("old_" + x.to_s).to_sym, x
            valorActual = objeto.instance_variables.find{|y| y == ("@" + x.to_s + "counter").to_sym}
            objeto.instance_variable_set(valorActual, objeto.instance_variable_get(valorActual) + 1)
            objeto.send(("old_" + x.to_s).to_sym, param)
        end
    }

    #crea el metodo de instancia monitorizar
    objeto.class.send(:define_method, :monitorizar) do |param=0|
        counters = instance_variables.select{|x| x.to_s[-1..-7] == "counter"}.select{|x| instance_variable_get(x) >= param}
        total = counters.inject(0){|sum, x| sum += instance_variable_get(x)}
        counters.each{|x| puts x.to_s[0..-7] + " = " + instance_variable_get(x) + " #{100*instance_variable_get(x)/total}%"}
    end

    #puts objeto.instance_variables.each{|x| x.to_s}


end