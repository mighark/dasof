class Producto
    def initialize(desc, peso, dir, distrito, tipo, refr=false)
        @desc = desc
        @peso = peso
        @dir = dir
        @distrito = distrito
        @tipo = tipo
        if(tipo == "alimentacion") then @refr = refr end
        @error = ""
    end
    
    attr_accessor :desc, :peso, :dir, :distrito, :tipo, :error, :refr

    def validarPeso
        if @tipo == "fragil"
            valido = @peso <= 1000
        else
            valido = @peso <= 5000
        end
        if(!valido)
            @error = "Peso máximo superado"
        end
        return valido
    end

    def validarDistrito
        file = File.open("distritos.txt", "r") do |file|
            while linea = file.gets
                #compara que el distrito este en el fichero
                #chomp quita los \r y \n de la linea
                if linea.chomp == @distrito
                    return true
                end
            end
        end
        @error = "Distrito inválido"
        return false
    end

    def validar
        return validarPeso && validarDistrito
    end

end

class ProductoInvalido < StandardError
    def initialize(msg="Producto invalido")
        super
      end
end

require "Date"

class Pedido
    def initialize()
        @productos = []
    end

    def addProducto(producto)
        @productos.push(producto)
    end

    def darAlta
        invalidos = @productos.inject([]){|invalidos,x| if(!x.validar) then invalidos.push(x) end}
        
        if !invalidos
            @fecha = DateTime.now()
        else
            error = ""
            invalidos.each{|x| error += "Producto: " + x.desc + ". Error: " + x.error + ". "}
            raise ProductoInvalido, error
        end
    end

end

