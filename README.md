# Prácticas de Desarrollo Automatizado de Software
Asignatura Optativa de 4º de Ingeniería Informática / 5º de Doble Grado de Ingeniería Informática y Matemáticas en la UAM

Este material sirve únicamente como apoyo para el caso de estar atascado. Por la normativa de la escuela, no está permitida la copia: no me hago responsable si algún alumno de la escuela entrega este material como suyo.

## Información sobre calificaciones de cada práctica:

Práctica 1:
- Calificación: 8
- Fallos: 
  1. no se han creado subclases para cada tipo de producto
  2. falla la prueba cam1(paq=10,peso=1000),p500,p500,p500 >> repartoencam1(paq=2,peso=1000)
  3. falla la prueba cam1(paq=10,peso=10000),p500 >> nohayreparto
  4. falla la prueba cam1(paq=1,peso=550),cam2(paq=10,peso=10000),paq500 >> repartoencam1(paq=1,peso=500)
  5. no se puede indicar que un paquete no se ha podido entregar
  
Práctica 2:
- Calificación: 9,4
- Fallos:
  1. no se lanza una excepción cuando se llama dos veces a monitorizar sobre el mismo objeto
  2. no permite añadir condiciones a una posición, fila o columna concretas (apartado 4)
  
Práctica 3:
- Calificación: 8,8
- Fallos:
  1. no se muestran los artículos que presenta un autor (no confundir con los que autoriza)
  2. los ficheros que se generan no tienen formato html
  3. se pueden definir reglas con el mismo nombre
  4. puede haber variables con igual nombre y distinto tipo en los patrones de entrada y salida
  5. no se aplican las asignaciones de la regla :inicializar

Práctica 4:
- Calificación: 10
- Fallos: ninguno indicado

Práctica 5:
- Calificación: 8,3
- Fallos:
  1. no se valida correctamente que las escaleras, ascensores y aseos colindan con algún espacio abierto
  2. no se valida correctamente que los elementos colindantes están en la misma planta
  3. no se valida correctamente que todos los elementos colindan al menos con un elemento
  4. no se valida correctamente que las escaleras y ascensores no tienen dos destinos en la planta inferior, o dos en la planta superior
  5. no se valida correctamente que un elemento no colinda consigo mismo
  6. (no indicado) no se ha implementado moverse del destino de una escalera a la escalera
  
Práctica 6:
- Calificación: 9,5
- Fallos:
  1. si un botón de navegación tiene varios destinos dependientes de casilla, sólo "funciona" uno de ellos
  2. la primera página que muestra el wizard no es la página marcada como inicial
