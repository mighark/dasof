#TODO mover cada parte del codigo a un script aparte para que no pete esto
require_relative "pedido"

class Paquete
    PesoMax = 5000
    def initialize(id)
        @id = id
        @peso = 0
        @productos = []
        @fragil = false
        @refr = false
    end

    attr_reader :id

    def anadirProducto(producto)
        #si hay producto fragil, fin
        if(!@fragil)
            return false
        end

        #si el producto es fragil y hay mas productos, fin
        if(producto.tipo == "fragil" && @productos.length > 0)
            #fracaso
            return false
        end

        #si el paquete es refrigerado y el producto no, fin
        if(@refr && (producto.tipo != "alimentacion" || producto.refr))
            #fracaso
            return false
        end

        #si cabe por peso meter
        if(producto.peso + @peso <= PesoMax)
            @productos.push(producto)
            #ajustar variables de paquete
            if producto.tipo == "fragil"
                @fragil = true
            elsif producto.tipo == "alimentacion" && producto.refr
                @refr = true
            end
            #exito
            return true
        end
        #fracaso
        return false
    end

end