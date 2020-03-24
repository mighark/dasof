#@file conferencia.rb
#@author Miguel García Moya

require("date")

class Conferencia
    def initialize(nombre, fechaIni, fechaFin, lugar)
        #fechaFin >= fechaIni
        fechaIniParsed = Date.parse(fechaIni)
        fechaFinParsed = Date.parse(fechaFin)
        if fechaIniParsed > fechaFinParsed
            raise ExcepcionLDE.new(), "Fecha de fin no puede ser anterior a fecha de inicio."
        end
        @nombre = nombre;
        @fechaIni = fechaIniParsed
        @fechaFin = fechaFinParsed
        @lugar = lugar
        @sesiones = Array.new
        @actividades_sociales = Array.new
    end

    attr_reader :nombre, :fechaIni, :fechaFin, :lugar

    def crearSesion(nombre, fecha, hora)
        #nombre debe ser unico
        if @sesiones.find{|x| x.nombre == nombre} != nil
            raise ExcepcionLDE.new, "Nombre de sesión debe ser único."
        end

        if fecha < self.fechaIni || fecha > self.fechaFin
            raise ExcepcionLDE.new, "Fecha de sesión debe estar entre fecha de inicio y fin de conferencia."
        end
        #hora en intervalos pedidos
        if hora < 8 || (hora > 12 && hora < 14) || hora > 18
            raise ExcepcionLDE.new, "Sesiones deben ser entre 8h y 12h (mañana) o entre 14h y 18h (tarde)."
        end

        sesionesFecha = @sesiones.select{|x| x.fecha == fecha}
        #mismo dia y hora no se puede dos
        if sesionesFecha.find{|x| x.hora == hora} != nil
            raise ExcepcionLDE.new, "No se permiten dos sesiones en la misma fecha y hora."
        end

        #no empieza menos de 2h antes de una actividad social
        actividadFecha = @actividades_sociales.find{|x| x.fecha == fecha}
        if actividadFecha != nil && actividadFecha.hora < hora + 2
            raise ExcepcionLDE.new, "Una sesión no puede empezar menos de 2h antes que una actividad social."
        end

        #comprobar mañana o tarde
        if hora <= 12
            #mañana: 8 a 12
            sesionesManana = sesionesFecha.select{|x| x.hora <= 12}
            #maximo 2 mañana
            if sesionesManana.length > 1
                raise ExcepcionLDE.new, "No se permiten más de dos sesiones diarias por la mañana."
            end
        else
            #tarde: 14 a 18
            sesionesTarde = sesionesFecha.select{|x| x.hora >= 14}
            #maximo 2 tarde
            if sesionesTarde.length > 1
                raise ExcepcionLDE.new, "No se permiten más de dos sesiones diarias por la tarde."
            end
            
        end

        @sesiones.push(Sesion.new(nombre, fecha, hora))

    end

    def crearActividadSocial(desc, fecha, hora)
        if fecha < self.fechaIni || fecha > self.fechaFin
            raise ExcepcionLDE.new, "Fecha de actividad debe estar entre fecha de inicio y fecha de fin de la conferencia."
        end
        #maximo 1 al dia
        actividadFecha = @actividades_sociales.find{|x| x.fecha == fecha}
        if actividadFecha != nil
            raise ExcepcionLDE.new, "No se permiten dos actividades sociales el mismo día."
        end
        #empieza min 2 horas tras el comienzo de ultima sesion
        ultimaSesion = @sesiones.select{|x| x.fecha == fecha}.sort{|a, b| b.hora <=> a.hora}.first
        if ultimaSesion != nil && hora < ultimaSesion.hora + 2
            raise ExcepcionLDE.new, "Las actividades sociales deben comenzar como mínimo 2 horas después de la última sesión."
        end

        @actividades_sociales.push(ActividadSocial.new(desc, fecha, hora))
        
    end

    def crearArticulo(titulo)
        if(@sesiones.empty?)
            raise ExcepcionLDE.new, "Los artículos deben presentarse en una sesión."
        end
        @sesiones[@sesiones.length - 1].crearArticulo(titulo)
    end

    def crearAutor(nombre, afil, nacion)
        if(@sesiones.empty?)
            raise ExcepcionLDE.new, "Los autores deben añadirse a un artículo."
        end
        @sesiones[@sesiones.length - 1].crearAutor(nombre, afil, nacion)
    end

    def asignarPonente(nombre)
        if(@sesiones.empty?)
            raise ExcepcionLDE.new, "El ponente debe ser un autor de un artículo."
        end
        @sesiones[@sesiones.length - 1].asignarPonente(nombre)
    end

    def asignarModerador(nombre)
        if(@sesiones.empty?)
            raise ExcepcionLDE.new, "El moderador debe ser un autor de un artículo de la sesión."
        end
        @sesiones[@sesiones.length - 1].asignarModerador(nombre)
    end

    def cerrar
        (@fechaIni..@fechaFin).each{|fecha|
            if @sesiones.find{|x| x.fecha == fecha} == nil
                raise ExcepcionLDE.new, "Debe haber al menos una sesión diaria."
            end
        }
        @sesiones.each{|x| x.cerrar}
    end

    def imprimir_html
        #lista de autores: se rellena al imprimir el fichero de conferencia
        autores = Array.new()
        File.open(@nombre + " Sesiones.html", "w") do |file|
            file.puts "#{@nombre}: de #{@fechaIni} a #{@fechaFin} en #{@lugar}."
            file.puts "Sesiones:"
            @sesiones.sort{|e1,e2|
                #ordenar por fecha y hora
                if e1.fecha == e2.fecha
                    e1.hora <=> e2.hora
                else
                    e1.fecha <=> e2.fecha
                end
            }.each{|x| x.imprimir_html(file, autores)}
        end
        #lista de autores se imprime en fichero
        File.open(@nombre + " Autores.html", "w") do |file|
            autores.sort{|e1, e2| e1[0].nombre <=> e2[0].nombre}.each{|x|
                #elementos de la lista de autores: autor, lista de articulos que presenta, lista de sesiones que modera
                autor = x[0]
                articulos = x[1]
                sesiones_modera = x[2]
                file.puts "#{autor.nombre}. Afiliación: #{autor.afil}. Nacionalidad: #{autor.nacion}."
                file.puts "Articulos que presenta:"
                articulos.each{|x| file.puts "\t#{x.titulo}."}
                #imprime las sesiones que modera solo si modera alguna para reducir ruido
                if sesiones_modera.length > 0
                    file.puts "Sesiones que modera:"
                    sesiones_modera.each{|x| file.puts "\t#{x.nombre}."}
                end
                file.puts
            }
        end
    end

    def debug
        puts "Nombre: #{@nombre}. Lugar: #{@lugar}. Fecha de inicio: #{@fechaIni}. Fecha de fin: #{@fechaFin}."
        puts "Sesiones:"
        @sesiones.each{|x| x.debug}
        @actividades_sociales.each{|x| x.debug}
    end
end

class Sesion
    def initialize(nombre, fecha, hora)
        @nombre = nombre
        @fecha = fecha
        @hora = hora
        @articulos = Array.new
        @moderador = nil
    end

    attr_reader :nombre, :fecha, :hora

    def crearArticulo(titulo)
        @articulos.push(Articulo.new(titulo))
    end

    def crearAutor(nombre, afil, nacion)
        if(@articulos.empty?)
            raise ExcepcionLDE.new, "Los autores deben añadirse a un artículo."
        end
        @articulos[@articulos.length - 1].crearAutor(nombre, afil, nacion)
    end

    def asignarPonente(nombre)
        if(@articulos.empty?)
            raise ExcepcionLDE.new, "El ponente debe ser un autor de un artículo."
        end
        @articulos[@articulos.length - 1].asignarPonente(nombre)
    end

    def asignarModerador(nombre)
        @moderador = @articulos.collect{|x| x.getAutor(nombre)}.find{|x| x != nil}
        if @moderador == nil
            raise ExcepcionLDE.new, "El moderador debe ser un autor de un artículo de la sesión."
        end
    end

    def cerrar
        if @articulos.empty?
            raise ExcepcionLDE.new, "Cada sesión debe tener al menos un artículo."
        elsif @moderador == nil
            raise ExcepcionLDE.new, "Cada sesión debe tener un moderador."
        end
        @articulos.each{|x| x.cerrar}
    end

    def imprimir_html(file, autores)
        file.puts "\tNombre de sesión: #{@nombre}. Fecha: #{@fecha}. Hora de comienzo: #{@hora}. Moderador: #{@moderador.nombre}."
        file.puts "\tArticulos presentados:"
        @articulos.each{|x| x.imprimir_html(file, autores)}
        #rellena lista de autores: sesiones moderadas
        moderadores_a_html(autores)
        file.puts
    end

    def moderadores_a_html(lista)
        autor_en_lista = lista.find{|x| x[0].nombre == @moderador.nombre}
        if(autor_en_lista != nil)
            autor_en_lista[2].push(self)
        end
    end

    def debug
        puts "\tNombre: #{@nombre}. Fecha: #{@fecha}. Hora de comienzo: #{@hora}."
        puts "\tArtículos:"
        @articulos.each{|x| x.debug}
    end
end

class ActividadSocial
    def initialize(desc, fecha, hora)
        @desc = desc
        @fecha = fecha
        @hora = hora
    end

    attr_reader :desc, :fecha, :hora

    def debug
        puts "\tDescripción: #{@desc}. Fecha: #{@fecha}. Hora de comienzo: #{@hora}."
    end
end

class Articulo
    def initialize(titulo)
        @titulo = titulo
        @autores = Array.new
        @ponente = nil
    end

    attr_reader :titulo

    def crearAutor(nombre, afil, nacion)
        @autores.push(Autor.new(nombre, afil, nacion))
    end

    def getAutor(nombre)
        return @autores.find{|x| x.nombre == nombre}
    end

    def asignarPonente(nombre)
        @ponente = getAutor(nombre)
        if @ponente == nil
            raise ExcepcionLDE.new, "El ponente debe ser un autor del artículo."
        end
    end

    def cerrar
        if @autores.empty?
            raise ExcepcionLDE.new, "Todo artículo debe tener al menos un autor."
        elsif @ponente == nil
            raise ExcepcionLDE.new, "Todo artículo debe tener un ponente."
        end

    end

    def imprimir_html(file, autores)
        file.print "\t\t*#{@titulo}. Autores: "
        @autores.each{|x| file.print "#{x.nombre}, "}
        file.puts "\tPonente: #{@ponente.nombre}"
        #rellena lista de autores: autores y articulos presentados
        @autores.each{|x| x.autor_a_html(autores)}
        autores_a_html(autores)
    end

    def autores_a_html(lista)
        @autores.each{|autor|
            autor_en_lista = lista.find{|x| x[0].nombre == autor.nombre}
            if(autor_en_lista != nil)
                autor_en_lista[1].push(self)
            end
        }
    end

    def debug
        puts "\t\tTitulo: #{@titulo}."
        puts "\t\tAutores:"
        @autores.each{|x| x.debug}
    end
end

class Autor
    def initialize(nombre, afil, nacion)
        @nombre = nombre
        @afil = afil
        @nacion = nacion
    end

    attr_reader :nombre, :afil, :nacion

    def autor_a_html(lista)
        #si aun no esta en la lista de autores se inserta
        autor = lista.find{|x| x[0].nombre == @nombre}
        if(autor == nil)
            lista.push([self, Array.new, Array.new])
        end
    end

    def debug
        puts "\t\t\tNombre: #{@nombre}. Afiliación: #{@afil}. Nacionalidad: #{@nacion}."
    end
end

class ExcepcionLDE < RuntimeError

end

class ConferenciaLDE
    def self.conferencia(nombre, lugar, fechaIni, fechaFin=nil)
        if fechaFin == nil
            fechaFin = fechaIni
        end
        @conferencia = Conferencia.new(nombre, fechaIni, fechaFin, lugar)
        yield if block_given?
        #minimo 1 sesion cada dia
        @conferencia.cerrar
    end

    def self.sesion(nombre, hora, fecha=nil)
        if fecha == nil
            #si fechaIni = fechaFin no se especifica fecha
            if @conferencia.fechaIni != @conferencia.fechaFin
                raise ExcepcionLDE.new, "Conferencia dura más de un día: debe especificar fecha de la sesión."
            end
            fecha = @conferencia.fechaIni
        else
            fecha = Date.parse(fecha)
        end
        @conferencia.crearSesion(nombre, fecha, hora)
        yield if block_given?
    end

    def self.actividad_social(desc, hora, fecha=nil)
        if fecha == nil
            #si fechaIni = fechaFin no se especifica fecha
            if @conferencia.fechaIni != @conferencia.fechaFin
                raise ExcepcionLDE.new, "Conferencia dura más de un día: debe especificar fecha de la actividad social."
            end
            fecha = @conferencia.fechaIni
        else
            fecha = Date.parse(fecha)
        end
        @conferencia.crearActividadSocial(desc, fecha, hora)
    end

    def self.articulo(titulo)
        @conferencia.crearArticulo(titulo)
        yield if block_given?
    end

    def self.autor(nombre, afil, nacion)
        @conferencia.crearAutor(nombre, afil, nacion)
    end

    def self.ponente(nombre)
        @conferencia.asignarPonente(nombre)
    end

    def self.moderador(nombre)
        @conferencia.asignarModerador(nombre)
    end

    def self.ver
        @conferencia.debug
    end

    def self.imprimir_html
        @conferencia.imprimir_html
    end
end