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