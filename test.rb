require_relative "empresa"
require_relative "pedido"
require_relative "paquete"
require_relative "reparto"

class Aplicacion
    def initialize()
        @@empresas = Array.new()
        @@pedidos = Array.new()
        @@paquetes = Array.new()
        @@sinEntregar = Array.new()
        @@camiones = Array.new()
    end

    #añade una nueva empresa
    def insertarEmpresa(nombre, cif)
        unless @@empresas.find{|x| (x.cif == cif)}
            empresa = Empresa.new(nombre, cif)
            @@empresas.push(empresa)
        end
    end

    #crea un nuevo pedido. Devuelve id del pedido
    def crearPedido()
        pedido = Pedido.new()
        @@pedidos.push(pedido)
        return @@pedidos.length
    end

    #añade un producto de tipo estandar
    def anadirProducto(pedido, desc, peso, dir, distrito)
        producto = Producto.new(desc, peso, dir, distrito, "normal")
        @@pedidos.at(pedido - 1).addProducto(producto)
    end

    #añade un producto de tipo fragil
    def anadirProductoFragil(pedido, desc, peso, dir, distrito)
        producto = Producto.new(desc, peso, dir, distrito, "fragil")
        @@pedidos.at(pedido - 1).addProducto(producto)
    end

    #añade un producto de tipo alimentacion
    def anadirProductoAlimentacion(pedido, desc, peso, dir, distrito, refr)
        if refr
            producto = Producto.new(desc, peso, dir, distrito, "alimentacion_refr")
        else
            producto = Producto.new(desc, peso, dir, distrito, "alimentacion")
        end
        @@pedidos.at(pedido - 1).addProducto(producto)
    end

    #da de alta un pedido
    def pedidoDarAlta(pedido)
        @@pedidos.at(pedido - 1).darAlta()
        @@pedidos.at(pedido - 1).empaquetarPedido(@@paquetes, @@sinEntregar)
    end

    #añade un nuevo camion
    def insertarCamion(matricula, maxPaquetes, maxPeso)
        unless @@camiones.find{|x| (x.matricula == matricula)}
            camion = Camion.new(matricula, maxPaquetes, maxPeso)
            @@camiones.push(camion)
        end
    end

    #hace la planificacion del reparto
    def planificarReparto(fecha, turno, distrito)
        #comprueba camiones disponibles
        camionesDisponibles = @@camiones.select{|x| x.disponibleReparto(fecha, turno)}
        if(camionesDisponibles.length <= 0) 
            return nil
        end
        
        paquetesDistrito = @@sinEntregar.select{|x| x.dir.distrito == distrito}
    
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
        repartoFinal[0].each{|x| @@sinEntregar.delete(x)}
    end

    #imprimir informacion    
    def verEmpresas()
        @@empresas.each{|x| puts x}
    end

    def verPaquetes()
        @@paquetes.each{|x| puts x}
    end

    def verPaquetesSinEntregar()
        @@sinEntregar.each{|x| puts x}
    end

    def verRepartos()
        @@camiones.each{|x| puts x.repartos}
    end

    #aplicacion por consola
    def main()
        camion = nil
        while(camion == nil)
            puts "Introduce matricula: "
            matricula = gets
            camion = @@camiones.find{|x| x.matricula == matricula.chomp}
            if(!camion)
                puts "No se ha encontrado el camión. Inténtelo de nuevo."
            end
        end
        
        if(camion.repartos.length <= 0)
            puts "No hay repartos asignados a este camión"
            return
        end

        repartos = Array.new()
        while(repartos.length <= 0) 
            puts "Introduce fecha: "
            string = gets
            fecha = Date.parse(string)
            repartos = camion.repartos.select{|x| x.fecha == fecha}
            if(repartos.length <= 0)
                puts "No se han encontrado repartos en esa fecha. Inténtelo de nuevo."
            end
        end
        
        reparto = nil
        while(reparto == nil) 
            puts "Introduce turno (M/T): "
            turno = gets
            if(turno.chomp == "M")
                turno = "mañana"
            elsif(turno.chomp == "T")
                turno = "tarde"
            end
            reparto = camion.repartos.find{|x| x.turno == turno.chomp}
            if(!reparto) 
                puts "No se ha encontrado un reparto en esa fecha y turno. Inténtelo de nuevo."
            end
        end
        
        entregados = reparto.verEntregados.collect{|x| x.id}
        noEntregados = reparto.verNoEntregados.collect{|x| x.id}
        puts "Paquetes entregados: #{entregados}"
        puts "Paquetes no entregados: #{noEntregados}"
        
        puts "Introduce id del paquete entregado (\"salir\" para salir):"
        entregado = gets
        if(entregado.chomp != "salir")
            id = Integer(entregado)
            if (!reparto.entregado(id))
                puts "Id de paquete no encontrado"
            end
        end
        
        puts "Entregados: "
        puts reparto.verEntregados
        puts "No entregados: "
        puts reparto.verNoEntregados

    end

end

#test apartado 1
puts "Test apartado 1"

aplicacion = Aplicacion.new()
aplicacion.insertarEmpresa("pepesl", 100)
aplicacion.insertarEmpresa("pepesl mk2", 101)
aplicacion.insertarEmpresa("definitelynotpepesl", 100)
aplicacion.verEmpresas()

#test apartado 2
puts "Test apartado 2"
p = aplicacion.crearPedido()
aplicacion.anadirProducto(p, "ejemplo", 1200, "noexixte", "Centro")
aplicacion.anadirProducto(p, "ejemplo2", 1200, "otracosa", "Centro")
aplicacion.anadirProducto(p, "ejemplo3", 1200, "noexixte", "Centro")
aplicacion.pedidoDarAlta(p)

p2 = aplicacion.crearPedido()
aplicacion.anadirProductoAlimentacion(p2, "ejemplo", 1200, "noexixte", "Centro", true)
aplicacion.pedidoDarAlta(p2)

p3 = aplicacion.crearPedido()
aplicacion.anadirProductoAlimentacion(p3, "ejemplo", 1200, "otracosa", "Centro", false)
aplicacion.anadirProductoAlimentacion(p3, "ejemplo", 1200, "noexixte", "Centro", true)
aplicacion.pedidoDarAlta(p3)

p4 = aplicacion.crearPedido()
aplicacion.anadirProductoFragil(p4, "ejemplo", 100, "noexixte", "Centro")
aplicacion.pedidoDarAlta(p4)

p5 = aplicacion.crearPedido()
aplicacion.anadirProductoFragil(p5, "ejemplo", 100, "otracosa", "Centro")
aplicacion.anadirProductoFragil(p5, "ejemplo2", 1200, "noexixte", "Centro")
begin
    aplicacion.pedidoDarAlta(p5)
rescue ProductoInvalido => error
    puts "Pedido invalido. Errores: "
    puts error
end

p6 = aplicacion.crearPedido()
aplicacion.anadirProducto(p6, "ejemplo", 1000, "noexixte", "noexixte")
aplicacion.anadirProducto(p6, "ejemplo2", 6000, "otracosa", "Centro")
begin
    aplicacion.pedidoDarAlta(p6)
rescue ProductoInvalido => error
    puts "Pedido invalido. Errores: "
    puts error
end

#test apartado 3
puts "Test apartado 3"

#el empaquetado se produce automaticamente al hacer el apartado 2
aplicacion.verPaquetes()

#test apartado 4
puts "Test apartado 4"

aplicacion.insertarCamion("1234-BCD", 20, 300)
aplicacion.insertarCamion("9876-ZYX", 2, 1000)

aplicacion.planificarReparto(Date.new(2001,1,1), "mañana", "Centro")
aplicacion.planificarReparto(Date.new(2001,1,1), "mañana", "Centro")

aplicacion.verRepartos

#test apartado 5
puts "Test apartado 5"

aplicacion.main()