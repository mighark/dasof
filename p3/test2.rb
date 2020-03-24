#@file test2.rb
#@author Miguel García Moya

require_relative("sistema")

test = SistemaLDE.sistema {
    regla :inicializar do
        patron_entrada 
        patron_salida do
            variable "p", "Persona" do |p| p.hambre=5, p.dinero=10 end
        end
    end

    bloque do
        regla :comer do
            patron_entrada do
                variable "p", :Persona do |p| p.hambre>0 && p.dinero>0 end
                variable "c", :Comida do |c| c.cantidad>0 end
            end
            patron_salida do
                variable "p", :Persona do |p| p.hambre -= 1; p.dinero -= 1 end
                variable "c", :Comida do |c| c.cantidad -= 1 end
            end
        end
        regla :reciclar do
            patron_entrada do
                variable "c", :Comida do |c| c.cantidad==0 end
            end
            patron_salida
        end
    end
}

test.debug

puts
puts "Comprobar situaciones de error:"

test2 = SistemaLDE.sistema {
    regla :ejemplo do
        patron_entrada 
        patron_salida
    end

    begin
        #nombre de regla unico
        regla :ejemplo do
            patron_entrada 
            patron_salida
        end
    rescue SistemaLDE::ExcepcionLDE => exception
        puts exception
    end

    begin 
        regla :ejemplo2 do
            #regla debe tener un patron de salida
            patron_entrada
        end
    rescue SistemaLDE::ExcepcionLDE => exception
        puts exception
    end

    begin 
        regla :ejemplo2 do
            #regla debe tener un patron de entrada
            patron_salida
        end
    rescue SistemaLDE::ExcepcionLDE => exception
        puts exception
    end

    regla :ejemplo2 do
        patron_entrada do
            variable "1", :Persona
            #nombre de variable unico por patron
            begin
                variable "1", :Animal
            rescue SistemaLDE::ExcepcionLDE => exception
                puts exception
            end
        end
        patron_salida
    end
}

begin
    test3 = SistemaLDE.sistema {
        regla :ejemplo do
            patron_entrada do
                variable "1", :Persona
            end
            #si patron de entrada y de salida tienen variable con mismo nombre, debe tener mismo tipo
            patron_salida do
                variable "1", :Animal
            end
        end
    }
rescue SistemaLDE::ExcepcionLDE => exception
    puts exception
end


begin
    test4 = SistemaLDE.sistema {
        #bloque no puede estar vacio
        bloque
    }
rescue SistemaLDE::ExcepcionLDE => exception
    puts exception
end


begin
    test5 = SistemaLDE.sistema {
        #bloque no puede contener solo otro bloque
        bloque do
            bloque do
                regla :ejemplo do
                    patron_entrada
                    patron_salida
                end
            end
        end
    }
rescue SistemaLDE::ExcepcionLDE => exception
    puts exception
end