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
    end
    ver
    imprimir_html
end

puts
puts "Comprobar situaciones de error:"

class Test2 < ConferenciaLDE
    #si se especifica una sola fecha, entonces fecha de inicio y de fin es la misma
    conferencia "Tests varios", "ejemplo", "2020-5-2" do
        #dura 1 dia: no es necesario especificar fecha
        sesion "mañana1", 10 do
            articulo "articulo1" do
                autor "autor1", "afil1", "nacion1"
                ponente "autor1"
            end
            moderador "autor1"
        end

        begin
            #nombre de sesion unico
            sesion "mañana1", 11
        rescue ExcepcionLDE => exception
            puts exception
        end

        begin
            #horario de 8 a 12 y de 14 a 18
            sesion "mañana2", 1
        rescue ExcepcionLDE => exception
            puts exception
        end

        begin
            #horario de 8 a 12 y de 14 a 18
            sesion "mañana2", 13
        rescue ExcepcionLDE => exception
            puts exception
        end

        begin
            #horario de 8 a 12 y de 14 a 18
            sesion "mañana2", 22
        rescue ExcepcionLDE => exception
            puts exception
        end

        sesion "mañana2", 11 do
            articulo "articulo1" do
                autor "autor1", "afil1", "nacion1"
                ponente "autor1"
            end
            moderador "autor1"
        end

        #maximo 2 sesiones de mañana
        begin
            sesion "mañana3", 9
        rescue ExcepcionLDE => exception
            puts exception
        end

        #no se permiten 2 sesiones que comiencen a la misma hora
        begin
            sesion "mañana3", 10
        rescue ExcepcionLDE => exception
            puts exception
        end

        sesion "tarde1", 14 do
            articulo "articulo1" do
                autor "autor1", "afil1", "nacion1"
                ponente "autor1"
            end
            moderador "autor1"
        end

        sesion "tarde2", 15 do
            articulo "articulo1" do
                autor "autor1", "afil1", "nacion1"
                ponente "autor1"
            end
            moderador "autor1"
        end

        #maximo 2 sesiones de tarde
        begin
            sesion "tarde3", 16
        rescue ExcepcionLDE => exception
            puts exception
        end

        #actividades sociales no empiezan hasta 2h despues de ultima sesion
        begin
            actividad_social "as1", 15, "2020-5-2"
        rescue ExcepcionLDE => exception
            puts exception
        end
    end

end

class Test3 < ConferenciaLDE
    begin
        conferencia "Otros tests varios", "ejemplo", "2020-5-2", "2020-5-3" do
            actividad_social "as1", 14, "2020-5-2"
            #sesiones no pueden hacer que una actividad social empieze antes de lo permitido
            begin
                sesion "tarde3", 16, "2020-5-2"
            rescue ExcepcionLDE => exception
                puts exception
            end

            #si la conferencia dura varios dias se debe especificar fecha
            begin
                sesion "tarde3", 16
            rescue ExcepcionLDE => exception
                puts exception
            end
        end
    #tiene que haber sesiones todos los dias
    rescue ExcepcionLDE => exception
        puts exception
    end
end

class Test4 < ConferenciaLDE
    begin
        conferencia "Test no articulos", "ejemplo", "2020-5-2" do
            #sesion debe tener min un articulo
            sesion "tarde3", 16, "2020-5-2"
        end
    rescue ExcepcionLDE => exception
        puts exception
    end
end

class Test5 < ConferenciaLDE
    begin
        conferencia "Test no articulos", "ejemplo", "2020-5-2" do
            #sesion debe tener un moderador
            sesion "tarde3", 16, "2020-5-2"  do
                articulo "articulo1" do
                    autor "autor1", "afil1", "nacion1"
                    ponente "autor1"
                end
            end
        end
    rescue ExcepcionLDE => exception
        puts exception
    end
end

class Test6 < ConferenciaLDE
    begin
        conferencia "Test no autores", "ejemplo", "2020-5-2" do
            sesion "tarde3", 16, "2020-5-2" do
                articulo "articulo1" do
                    autor "autor1", "afil1", "nacion1"
                    ponente "autor1"
                end
                #articulo debe tener min un autor
                articulo "articulo2"
                moderador "autor1"
            end
        end
    rescue ExcepcionLDE => exception
        puts exception
    end
end

class Test7 < ConferenciaLDE
    begin
        conferencia "Test no autores", "ejemplo", "2020-5-2" do
            sesion "tarde3", 16, "2020-5-2" do
                #articulo debe tener un ponente
                articulo "articulo1" do
                    autor "autor1", "afil1", "nacion1"
                end
                moderador "autor1"
            end
        end
    rescue ExcepcionLDE => exception
        puts exception
    end
end