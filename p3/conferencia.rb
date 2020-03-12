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
        fecha = Date.parse(fecha)
        if fecha < self.fechaIni || fecha > self.fechaFin
            raise ExcepcionLDE.new, "Fecha de sesion debe estar entre fecha de inicio y fin de conferencia."
        end
        #hora en intervalos pedidos
        if hora < 8 || (hora > 12 && hora < 14) || hora > 18
            raise ExcepcionLDE.new, "Sesiones deben ser entre 8h y 12h (mañana) o entre 14h y 18h (tarde)"
        end

        sesionesFecha = @sesiones.select{|x| x.fecha ==fecha}
        #mismo dia y hora no se puede dos
        if sesionesFecha.find{|x| x.hora == hora} != nil
            raise ExcepcionLDE.new, "No se permiten dos sesiones en la misma fecha y hora"
        end

        #comprobar mañana o tarde
        if hora <= 12
            #mañana: 8 a 12
            sesionesManana = sesionesFecha.select{|x| x.hora <= 12}
            #maximo 2 mañana
            if sesionesManana.length > 1
                raise ExcepcionLDE.new, "No se permiten más de dos sesiones diarias por la mañana"
            end
        else
            #tarde: 14 a 18
            sesionesTarde = sesionesFecha.select{|x| x.hora >= 14}
            #maximo 2 tarde
            if sesionesTarde.length > 1
                raise ExcepcionLDE.new, "No se permiten más de dos sesiones diarias por la tarde"
            end
            
        end

        @sesiones.push(Sesion.new(nombre, fecha, hora))

    end

    def crearActividadSocial(desc, fecha, hora)
        fecha = Date.parse(fecha)
        if fecha < self.fechaIni || fecha > self.fechaFin
            raise ExcepcionLDE.new, "Fecha de actividad debe estar entre fecha de inicio y fin de conferencia."
        end
        #maximo 1 al dia
        actividadesFecha = @actividades_sociales.select{|x| x.fecha == fecha}
        if actividadesFecha.length > 0
            raise ExcepcionLDE.new, "No se permiten dos actividades sociales el mismo dia"
        end
        #empieza min 2 horas tras el comienzo de ultima sesion
        ultimaSesion = @sesiones.select{|x| x.fecha == fecha}.sort{|a, b| b.hora <=> a.hora}.first
        if ultimaSesion != nil && hora <= ultimaSesion.hora + 2
            raise ExcepcionLDE.new, "Las actividades sociales deben comenzar como minimo 2 horas despues de la ultima sesion"
        end

        @actividades_sociales.push(ActividadSocial.new(desc, fecha, hora))
        
    end

    def debug
        @sesiones.each{|x| puts "Nombre: #{x.nombre}. Fecha: #{x.fecha}. Hora: #{x.hora}"}
        @actividades_sociales.each{|x| puts "Desc: #{x.desc}. Fecha: #{x.fecha}. Hora: #{x.hora}"}
    end
end

class Sesion
    def initialize(nombre, fecha, hora)
        @nombre = nombre
        @fecha = fecha
        @hora = hora
        @articulos = Array.new
    end

    attr_reader :nombre, :fecha, :hora

    def articulo(titulo)
        @articulos.push(Articulo.new(titulo))
    end

    def moderador(nombre)

    end
end

class ActividadSocial
    def initialize(desc, fecha, hora)
        @desc = desc
        @fecha = fecha
        @hora = hora
    end

    attr_reader :desc, :fecha, :hora
end

class Articulo
    def initialize(titulo)

    end

    def autor(nombre, afil, nacion)

    end

    def ponente(nombre)

    end
end

class Autor
    def initialize(nombre, afil, nacion)

    end
end

class ExcepcionLDE < RuntimeError

end

class ConferenciaLDE
    def self.conferencia(nombre, lugar, fechaIni, fechaFin)
        @conferencia = Conferencia.new(nombre, fechaIni, fechaFin, lugar)
        yield if block_given?
        #minimo 1 sesion

        @conferencia.debug
    end

    def self.sesion(nombre, hora, fecha=nil)
        if fecha == nil
            #si fechaIni = fechaFin no se especifica fecha
            if @conferencia.fechaIni != @conferencia.fechaFin
                raise ExcepcionLDE.new, "Debe especificar fecha de la sesion"
            end
            fecha = @conferencia.fechaIni
        end
        @conferencia.crearSesion(nombre, fecha, hora)
    end

    def self.actividad_social(desc, hora, fecha=nil)
        if fecha == nil
            #si fechaIni = fechaFin no se especifica fecha
            if @conferencia.fechaIni != @conferencia.fechaFin
                raise ExcepcionLDE.new, "Debe especificar fecha de la sesion"
            end
            fecha = @conferencia.fechaIni
        end
        @conferencia.crearActividadSocial(desc, fecha, hora)
    end

    def self.articulo(nombre)

    end

    def self.autor(nombre, asoc, nacion)

    end

    def self.ponente(nombre)

    end

    def self.moderador(nombre)

    end
end