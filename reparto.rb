class Camion
    def initialize(matricula, maxPaquetes, maxPeso)
        @matricula = matricula
        @maxPaquetes = maxPaquetes
        @maxPeso = maxPeso
        @repartos = Array.new()
    end

    def disponibleReparto(fecha, turno)
        @repartos.inject(true){|avlb, x| avlb = avlb && (x.fecha != fecha || x.turno != turno)}
    end

    def paquetesPosibles(paquetes)
        nPaquetes = 0
        peso = 0
        nProd = 0
        paquetesPosibles = Array.new()
        #introduce los paquetes posibles en orden
        paquetes.each{|x| if(nPaquetes < @maxPaquetes && peso + x.peso <= @maxPeso)
            paquetesPosibles.push(x)
            nPaquetes += 1
            peso += x.peso
            nProd += x.numProductos
        end}
        return [paquetesPosibles, self, nProd]
    end

    def asignarReparto(reparto)
        @repartos.push(reparto)
    end

    attr_accessor :matricula, :maxPaquetes, :maxPeso
    attr_reader :repartos
end

class Reparto
    def initialize(fecha, turno, paquetes)
        @fecha = fecha
        @turno = turno
        @paquetes = paquetes
    end

    attr_accessor :fecha, :turno

    def to_s
        return "Fecha: #{@fecha}. Turno: #{@turno}. Paquetes: #{@paquetes}."
    end

end

def planificarReparto(fecha, turno, distrito, paquetes, camiones)
    camionesDisponibles = camiones.select{|x| x.disponibleReparto(fecha, turno)}
    if(camionesDisponibles.length <= 0) 
        return nil
    end
    
    paquetesDistrito = paquetes.select{|x| x.dir.distrito == distrito}

    #calcula los posibles repartos de cada camion
    #devuelve un array con la lista de paquetes, el camion y el numero de productos
    posiblesRepartos = camionesDisponibles.collect{|x| x.paquetesPosibles(paquetesDistrito)}

    #ordena la lista de mayor a menor numero de productos y toma el mayor
    repartoFinal = posiblesRepartos.sort!{|a,b| b[2] <=> a[2]}[0]
    #si no hay paquetes posibles, no asignar reparto
    if(repartoFinal[0].length <= 0)
        return nil
    end

    #asigna reparto y quita paquetes de la lista
    repartoFinal[1].asignarReparto(Reparto.new(fecha, turno, repartoFinal[0]))
    repartoFinal[0].each{|x| paquetes.delete(x)}

end