require_relative("menu")

class Persona
    extend MenuGenerico
    def initialize
        @nombre = nil
        @nif = nil
        @direccion = Direccion.new
        @aficiones = []
    end
    
    def Persona.id
        :nif
    end
end

class Direccion
    def initialize
        @calle = nil
    end
end

Persona.menu # el método "menu" lanza la ejecución del menú, y debe implementarse en MenuGenerico