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
    end

    def sesion(nombre, fecha, hora)
        if fecha < self.fechaIni || fecha > self.fechaFin
            raise ExcepcionLDE.new(), "Fecha de sesion debe estar entre fecha de inicio y fin de conferencia."
        end
        if hora < 8 || (hora < 12 && hora < 14) || hora > 18
            raise ExcepcionLDE.new(), "Sesiones deben ser entre 8h y 12h (mañana) o entre 14h y 18h (tarde)"
        elsif hora <= 12
            #mañana: 8 a 12
            #whatever
            #maximo 2 mañana 2 tarde
        else
            #tarde: 14 a 18
            #whatever
        end
        #minimo 1
        #mismo dia y hora no se puede dos
        #si fechaIni = fechaFin no se especifica fecha
    end

    def actividadSocial(desc, fecha, hora)
        if fecha < self.fechaIni || fecha > self.fechaFin
            raise ExcepcionLDE.new(), "Fecha de actividad debe estar entre fecha de inicio y fin de conferencia."
        end
        #maximo 1 al dia
        #empieza min 2 horas tras el comienzo de ultima sesion
        #si fechaIni = fechaFin no se especifica fecha
    end

end

class Sesion
    def initialize(nombre, hora, fecha)
        @nombre = nombre
        @hora = hora
        @fecha = fecha
    end

    def articulo(titulo)

    end

    def moderador(nombre)

    end
end

def ActividadSocial
    def initialize(desc, fecha, hora)

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
    end

    def self.sesion

    end

    def self.actividad_social

    end

    def self.articulo

    end

    def self.autor

    end

    def self.ponente

    end

    def self.moderador

    end
end