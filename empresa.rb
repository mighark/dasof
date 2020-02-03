class Empresa
    
    def initialize(nombre, cif)
        @nombre = nombre
        @cif = cif
    end

    attr_accessor :nombre
    attr_accessor :cif


    def debug
        print "Nombre: " + @nombre + " CIF: "
        print @cif
        puts ""
    end

end

def insertarEmpresa(empresas, empresa)
    cif = empresa

    unless empresas.find{|x| (x.cif == empresa.cif)}
        empresas.push(empresa)
    end
end

empresasArray = []
empresa1 = Empresa.new("pepesl", 100)
empresa2 = Empresa.new("pepesl mk2", 101)
empresarepetida1 = Empresa.new("definitelynotpepesl", 100)

insertarEmpresa(empresasArray, empresa1)
insertarEmpresa(empresasArray, empresa2)
insertarEmpresa(empresasArray, empresarepetida1)

empresasArray.each{|x| x.debug}
