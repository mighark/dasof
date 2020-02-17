require_relative "pedido"

class Paquete
    PesoMax = 5000
    def initialize(id)
        @id = id
        @peso = 0
        @productos = Array.new()
        @dir = nil
        @fragil = false
        @refr = false
    end

    attr_reader :id, :dir, :peso

    def anadirProducto(producto)
        #si hay producto fragil, fin
        if(@fragil)
            return false
        end

        #si el producto es fragil y hay mas productos, fin
        if(producto.tipo == "fragil" && @productos.length > 0)
            #fracaso
            return false
        end

        #si el paquete es refrigerado y el producto no, fin
        if(@refr && producto.tipo != "alimentacion_refr")
            #fracaso
            return false
        end

        #si el producto es refrigerado y el paquete no, fin
        if(producto.tipo == "alimentacion_refr" && !@refr && @productos.length > 0)
            #fracaso
            return false
        end

        #si cabe por peso meter
        if(producto.peso + @peso <= PesoMax)
            @productos.push(producto)
            #ajustar variables de paquete
            @peso += producto.peso
            @dir = producto.dir
            if producto.tipo == "fragil"
                @fragil = true
            elsif producto.tipo == "alimentacion_refr"
                @refr = true
            end
            #exito
            return true
        end
        #fracaso
        return false
    end

    def numProductos
        @productos.length
    end

    def to_s
        return "Id: #{@id}. Productos: #{@productos}"
    end
end


def anadirAPaquetes(paquetes, sinEntregar, producto)
    paquetesDireccion = paquetes.select{|x| x.dir.dir == producto.dir.dir}
    done = paquetesDireccion.inject(false){|done, x| done = done || x.anadirProducto(producto)}
    if !done
        paquete = Paquete.new(paquetes.length)
        paquete.anadirProducto(producto)
        paquetes.push(paquete)
        sinEntregar.push(paquete)
    end
end

class Pedido
    def empaquetarPedido(paquetes, sinEntregar)
        @productos.each{|x| anadirAPaquetes(paquetes, sinEntregar, x)}
    end
end

