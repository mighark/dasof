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

planificarReparto(Date.new(2001,1,1), "mañana", "Centro", paquetesSinEntregar, camiones)
planificarReparto(Date.new(2001,1,1), "mañana", "Centro", paquetesSinEntregar, camiones)
camiones.each{|x| puts x.repartos}

#test apartado 5
puts "Test apartado 5"

camion = nil
while(camion == nil)
    puts "Introduce matricula: "
    matricula = gets
    camion = camiones.find{|x| x.matricula == matricula.chomp}
    if(!camion)
        puts "No se ha encontrado el camión. Inténtelo de nuevo."
    end
end

repartos = Array.new()
while(repartos.length <= 0) 
    puts "Introduce fecha (formato: D-M-A): "
    fecha = Date.strptime(gets, "%d-%m-%y")
    repartos = camion.repartos.select{|x| x.fecha == fecha}
    if(repartos.length <= 0)
        puts "No se han encontrado repartos en esa fecha. Inténtelo de nuevo."
    end
end

reparto = nil
while(reparto == nil) 
    puts "Introduce turno: "
    turno = gets
    reparto = camion.repartos.find{|x| x.turno == turno.chomp}
    if(!reparto) 
        puts "No se ha encontrado un reparto en esa fecha y turno. Inténtelo de nuevo."
    end
end

entregados = reparto.verEntregados.collect{|x| x.id}
noEntregados = reparto.verNoEntregados.collect{|x| x.id}
puts "Paquetes entregados: #{entregados}"
puts "Paquetes no entregados: #{noEntregados}"

puts "Introduce id del paquete entregado (\"salir\" para salir):"
entregado = gets
if(entregado != "salir")
    id = Integer(entregado)
    if (!reparto.entregado(id))
        puts "Id de paquete no encontrado"
    end
end

puts "Entregados: "
puts reparto.verEntregados
puts "No entregados: "
puts reparto.verNoEntregados
