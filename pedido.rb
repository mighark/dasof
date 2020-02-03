class Producto
    def initialize(desc, peso, dir, distrito, tipo, refr=false)
        @desc = desc
        @peso = peso
        @dir = dir
        @distrito = distrito
        @tipo = tipo
        @refr = refr

        attr_accessor :desc, :peso, :dir, :distrito, :tipo
    end

    def validarPeso
        if @tipo == "fragil"
            @peso <= 1000
        else
            @peso <= 5000
        end
    end

    def validarDistrito
        #TODO ficheros
        true
    end

    def validar
        return validarPeso && validarDistrito
    end

end

require "Date"

class Pedido
    def initialize
        @productos = []
    end

    def addProducto(producto)
        @productos.push(producto)
    end

    def darAlta
        unless @productos.find{|x| !x.validar}
            #@fecha = DateTime.now()
            puts "success"
        else
            puts "fail"
        end
    end

end

end

puts "a"

p = Pedido.new()
p.addProducto(Producto.new("ejemplo", 100, "noexixte", "nope", "fragil"))
p.darAlta

p2 = Pedido.new()
p2.addProducto(Producto.new("ejemplo", 1200, "noexixte", "nope", "fragil"))
p.darAlta



