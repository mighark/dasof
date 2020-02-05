require_relative "empresa"
require_relative "pedido"
require_relative "paquete"

#test apartado 1
empresasArray = []
empresa1 = Empresa.new("pepesl", 100)
empresa2 = Empresa.new("pepesl mk2", 101)
empresarepetida1 = Empresa.new("definitelynotpepesl", 100)

insertarEmpresa(empresasArray, empresa1)
insertarEmpresa(empresasArray, empresa2)
insertarEmpresa(empresasArray, empresarepetida1)

empresasArray.each{|x| x.debug}

#test apartado 2
p = Pedido.new()
p.addProducto(Producto.new("ejemplo", 100, "noexixte", "Centro", "fragil"))
p.darAlta

p2 = Pedido.new()
p2.addProducto(Producto.new("ejemplo", 100, "noexixte", "nope", "fragil"))
p2.addProducto(Producto.new("ejemplo2", 1200, "noexixte", "nope", "fragil"))
begin
    p2.darAlta
rescue ProductoInvalido => error
    print "Pedido invalido. Errores: "
    puts error
end