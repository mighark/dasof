class MatrizCondicionada

def initialize(filas, columnas)
    @filas = filas
    @columnas = columnas
    @matriz = Array.new(filas*columnas)
    @condOb = Array.new
    @condAlt = Array.new
end

def get(fila, columna)
    @matriz[fila + @filas*columna]
end

def set(fila, columna, elto)
    #comprueba que se este introduciendo en los limites de la matriz
    if(fila < @filas && columna < @columnas)
        #comprueba las condiciones obligatorias
        if(@condOb.length > 0)
            #toma las condiciones que no se cumplan
            noCumplidas = @condOb.reject{|x| evalCond(x, fila, columna, elto)}
            #si al menos una no se cumple, no introduce el elemento
            if(noCumplidas.length > 0)
                return
            end
        end
        #comprueba que se cumple una condicion alternativa
        if(@condAlt.length > 0)
            #busca una condicion alternativa que se cumpla
            condAltCumplida = @condAlt.find{|x| evalCond(x, fila, columna, elto)}
            #si no se cumple ninguna, no introduce el elemento
            if(condAltCumplida == nil)
                return
            end
        end
        #introduce el elemento
        @matriz[fila + @filas*columna] = elto
    end

end

def evalCond(proc, fila, columna, elto)
    #si la arity es 2, suponemos que los parametros son matriz y elto
    if proc.arity == 2
        return proc.call(self, elto)
    #si la arity no es 2, suponemos que los parametros son matriz, fila y columna (arity de 3)
    else
        return proc.call(self, fila, columna)
    end
end

def each()
    if(block_given?)
        i = 0
        while(i < @filas)
            j = 0
            while(j < @columnas)
                yield(self, i, j)
                j += 1
            end
            i += 1
        end
    end
end

def addCondicionObligatoria(&cond)
    @condOb.push(cond)
end

def addCondicionAlternativa(&cond)
    @condAlt.push(cond)
end

end