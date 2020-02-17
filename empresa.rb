class Empresa
    
    def initialize(nombre, cif)
        @nombre = nombre
        @cif = cif
    end

    attr_accessor :nombre
    attr_reader :cif


    def to_s
        return "Nombre: #{@nombre}. CIF: #{@cif} "
    end

end

def insertarEmpresa(empresas, empresa)
    unless empresas.find{|x| (x.cif == empresa.cif)}
        empresas.push(empresa)
    end
end
