#ejemplo lde
require_relative("conferencia")

class Test1 < ConferenciaLDE
    conferencia "Conferencia de Lenguajes de Programación Dinámicos", "Madrid", "2020-5-2", "2020-5-3" do
        sesion "mañana1", 10, "2020-5-2" do
            articulo "articulo1" do
                autor "Pepito", "indepen", "hombre libre"
                autor "Juanito", "iokese", "ejemplo"
                ponente "Pepito"
            end
            articulo "articulo2" do
                autor "Gollum", "Mi Tesoro", "La Comarca"
                ponente "Gollum"
            end
            moderador "Pepito"
        end

        sesion "tarde1", 15, "2020-5-2" do
            articulo "articulo-1" do
                autor "Weeb", "Anime", "Not Japan"
                autor "Edgy", "Not Anime", "Edge"
                ponente "Weeb"
            end
            articulo "articulo-2" do
                autor "helpme", "imoutof", "ideas"
                ponente "helpme"
            end
            moderador "helpme"
        end

        actividad_social "Party Hard", 18, "2020-5-2"

        sesion "mañana2", 8, "2020-5-3" do
            articulo "articulo10" do
                autor "Definitely Not Pepito", "cosas", "meh"
                autor "Obviosly Not Juanito", "xd", "tinfoil"
                ponente "Definitely Not Pepito"
            end
            articulo "articulo11" do
                autor "cringe", "no leas esto", "es horrible"
                ponente "cringe"
            end
            moderador "Definitely Not Pepito"
        end

        #probar mas casos si eso
    end
end