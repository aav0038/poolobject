[![Build Status](https://www.travis-ci.com/aav0038/poolobject.svg?branch=master)](https://www.travis-ci.com/aav0038/poolobject)



[![codecov](https://codecov.io/gh/aav0038/poolobject/branch/master/graph/badge.svg?token=0CNGOV3UUL)](https://codecov.io/gh/aav0038/poolobject)

## **Autor**  
Alfredo Asensio Vázquez

### **Repositorio**    
https://github.com/aav0038/poolobject


### **Objetivos específicos**  

- Comprender los objetivos de medición relacionados con la caracterización y la evaluación de
productos, procesos y recursos software  
- Comprender, aplicar y analizar técnicas de medición sobre entidades de productos software
relacionados con conjuntos de pruebas de software  
- Comprender, aplicar y analizar medidas relacionadas sobre entidades de proceso y recursos de
prueba del software

### **Enunciado**  

En la práctica se va simular un pequeño desarrollo de un producto software para realizar mediciones sobre él.
El objetivo es establecer un caso de estudio que sirva para caracterizar y evaluar tanto el producto
desarrollado como el proceso seguido.


### **Preguntas**  

**¿Se ha realizado trabajo en equipo?**  
No, lo he realizado de manera individual.  

**¿Tiene calidad el conjunto de pruebas disponibles?**  
El proyecto supera las pruebas de integración continua en el pipeline.  
*Enlace a Travis:* https://www.travis-ci.com/github/aav0038/poolobject  

Además, se ha realizado un proceso incremental en el que se ha ido cubriendo un mayor número de pruebas sobre las distintas partes del programa, alcanzando una cobertura final del 75%. Las pruebas restantes son las referidas a la clase main (Cliente), que queda fuera de las pruebas.  
*Enlace a Codecov:* https://codecov.io/gh/aav0038/poolobject/  

**¿Cuál es el esfuerzo invertido en realizar la actividad?**  
Aproximadamente unas 5 horas de trabajo. El 80% del trabajo ha sido la documentación sobre las herramientas a utilizar, los conceptos teóricos y las características de la práctica. Un 10% del esfuerzo ha sido el relativo a la implementación de las pruebas. Y el 10% a otras tareas como las de redactar el readme en Markdown, dar de alta en las distintas aplicaciones e instalar las herramientas requeridas.  

**¿Cuál es el número de fallos encontrados en el código?**  
Los fallos encontrados han sido dos. En primer lugar, la web de Travis estaba obsoleta, ya que ha cambiado a otro dominio.  
En segundo lugar, el JDK utilizado colisionaba con la versión del JAR de jacocoant que se nos suministraba en el repositorio original.
