class Direccion
    def initialize(dir, distrito)
        @dir = dir
        @distrito = distrito
    end

    attr_accessor :dir, :distrito
end

class Producto
    def initialize(desc, peso, dir, distrito, tipo)
        @desc = desc
        @peso = peso
        @dir = Direccion.new(dir, distrito)
        @tipo = tipo
        @error = ""
    end
    
    attr_accessor :desc, :peso, :dir, :distrito, :tipo, :error

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
                if linea.chomp == @dir.distrito
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

    def to_s
        return "Descripcion: #{@desc}. Peso: #{@peso}. Direccion: #{@dir.dir}. Distrito: #{@dir.distrito}. Tipo: #{@tipo}."
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
        @productos = Array.new()
    end

    def addProducto(producto)
        @productos.push(producto)
    end

    def darAlta
        invalidos = @productos.inject(Array.new()){|invalidos,x| if(!x.validar) then invalidos.push(x) end}
        
        if !invalidos
            @fecha = DateTime.now()
        else
            error = ""
            invalidos.each{|x| error += "Producto: " + x.desc + ". Error: " + x.error + ". "}
            raise ProductoInvalido, error
        end
    end

end

