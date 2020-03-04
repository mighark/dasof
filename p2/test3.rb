require_relative("matriz")

class FichaBlanca
    def to_s; "b"; end
    
end

class FichaRoja
    def to_s; "r"; end

end

class FichaVerde
    def to_s; "v"; end

end
# definición de la matriz y sus condiciones
conecta4 = MatrizCondicionada.new(6,7)
conecta4.addCondicionObligatoria{|matriz, elem| elem.is_a? FichaRoja or elem.is_a? FichaBlanca}
conecta4.addCondicionObligatoria{|matriz, fila, columna| matriz.get(fila,columna)==nil}
conecta4.addCondicionAlternativa{|matriz, fila, columna| fila==0}
conecta4.addCondicionAlternativa{|matriz, fila, columna| fila>=1 and matriz.get(fila-1,columna)!=nil}

# añadimos elementos ala matriz
conecta4.set(0,0,FichaBlanca.new)# se añade el elemento
conecta4.set(0,1,FichaRoja.new)# se añade el elemento
conecta4.set(1,1,FichaBlanca.new)# se añade el elemento
conecta4.set(2,4,FichaRoja.new) # set falla porque no se cumple ninguna condición alternativa
conecta4.set(0,0,FichaRoja.new) # set falla porque no se cumple una condición obligatoria
conecta4.set(0,2,FichaVerde.new) # set falla porque no se cumple una condición obligatoria

# imprimimos la matriz por pantalla
conecta4.each do|matriz, fila, columna|
    print "#{matriz.get(fila,columna)},"
    if(columna>=6); puts end
end