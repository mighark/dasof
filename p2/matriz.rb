class MatrizCondicionada

def initialize(filas, columnas)
    @filas = filas
    @columnas = columnas
    @matriz = Array.new(filas*columnas)
    @cond = nil
end

def get(fila, columna)
    @matriz[fila + @filas*columna]
end

def set(fila, columna, elto)
    #comprueba que se este introduciendo en los limites de la matriz
    if(fila < @filas && columna < @columnas)
        #TODO: comprueba las condiciones del bloque de codigo
        #if(@cond)
            #introduce el elememto
            @matriz[fila + @filas*columna] = elto
        #end
    end

end

def each()
    if(block_given?)
        i = 0
        while(i <= @columnas)
            j = 0
            while(j <= @filas)
                yield(self, i, j)
                j += 1
            end
            i += 1
        end
    end
end

def addCondicionObligatoria

end

def addCondicionAlternativa

end















end