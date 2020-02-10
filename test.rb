require_relative "empresa"
require_relative "pedido"
require_relative "paquete"
require_relative "reparto"

#test apartado 1
puts "Test apartado 1"

empresasArray = Array.new()
empresa1 = Empresa.new("pepesl", 100)
empresa2 = Empresa.new("pepesl mk2", 101)
empresarepetida1 = Empresa.new("definitelynotpepesl", 100)

insertarEmpresa(empresasArray, empresa1)
insertarEmpresa(empresasArray, empresa2)
insertarEmpresa(empresasArray, empresarepetida1)

empresasArray.each{|x| puts x}

#test apartado 2
puts "Test apartado 2"

p = Pedido.new()
p.addProducto(Producto.new("ejemplo", 100, "noexixte", "Centro", "fragil"))
p.darAlta

p2 = Pedido.new()
p2.addProducto(Producto.new("ejemplo", 100, "noexixte", "nope", "fragil"))
p2.addProducto(Producto.new("ejemplo2", 1200, "noexixte", "nope", "fragil"))
begin
    p2.darAlta
rescue ProductoInvalido => error
    puts "Pedido invalido. Errores: "
    puts error
end

#test apartado 3
puts "Test apartado 3"

paquetes = Array.new()

pr1 = Producto.new("ejemplo1", 100, "noexixte", "Centro", "fragil")
pr2 = Producto.new("ejemplo2", 100, "noexixte", "Centro", "alimentacion")
pr3 = Producto.new("ejemplo3", 100, "noexixte", "Centro", "alimentacion_refr")
pr4 = Producto.new("ejemplo4", 100, "noexixte", "Centro", "normal")
pr5 = Producto.new("ejemplo5", 100, "otracosa", "Centro", "normal")
pr6 = Producto.new("ejemplo6", 100, "otracosa", "Centro", "normal")
pr7 = Producto.new("ejemplo7", 100, "noexixte", "Centro", "alimentacion_refr")
pr8 = Producto.new("ejemplo8", 4999, "noexixte", "Centro", "normal")
pTest = Pedido.new()

pTest.addProducto(pr1)
pTest.addProducto(pr2)
pTest.addProducto(pr3)
pTest.addProducto(pr4)
pTest.addProducto(pr5)
pTest.addProducto(pr6)
pTest.addProducto(pr7)
pTest.addProducto(pr8)
#anadirAPaquetes(paquetes, pr1)
#anadirAPaquetes(paquetes, pr2)
#anadirAPaquetes(paquetes, pr3)
#anadirAPaquetes(paquetes, pr4)
#anadirAPaquetes(paquetes, pr5)
#anadirAPaquetes(paquetes, pr6)
#anadirAPaquetes(paquetes, pr7)
#anadirAPaquetes(paquetes, pr8)
pTest.empaquetarPedido(paquetes)

puts paquetes

#test apartado 4
puts "Test apartado 4"

camiones = Array.new()
camiones.push(Camion.new("1234-BCD", 20, 300))
camiones.push(Camion.new("9876-ZYX", 2, 1000))
paquetesSinEntregar = Array.new(paquetes)

planificarReparto("1-1-1", "mañana", "Centro", paquetesSinEntregar, camiones)
planificarReparto("1-1-1", "mañana", "Centro", paquetesSinEntregar, camiones)
camiones.each{|x| puts x.repartos}