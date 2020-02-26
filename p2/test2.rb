require_relative("monitorizar")

# clase de ejemplo
class ServicioBancario
    def login (usuario, password);
        puts "login..."
    end

    def logout;
    end
        
    def ingreso (cantidad, cuenta);
    end

    def reintegro (cantidad, cuenta);
    end 
    
    def consulta (cuenta); 
    end 
end

sb = ServicioBancario.new
monitorizar(sb) # <-----------------método a implementar
sb.login('esther', 'resthe')
sb.consulta(123456)
sb.consulta(654321)
sb.reintegro(1000, 123456)
sb.logout()
sb.monitorizar # método añadido al objeto sb dinámicamente
puts "------------------------------------------------"
sb2 = ServicioBancario.new
monitorizar(sb2)
sb2.login('esther', 'resthe')
sb2.logout()
sb2.monitorizar(1) # filtramos para mostrar los métodos que se han llamado al menos 1 vez
puts "------------------------------------------------"
sb3 = ServicioBancario.new
sb3.login('esther', 'resthe')
ServicioBancario.monitorizar # método añadido a la clase de sb dinámicamente