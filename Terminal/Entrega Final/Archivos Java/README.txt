Este es la dirección donde se debe encontrar para poder compilar y ejecutar los programas:

Dentro de está dirección se encuentra lo siguiente:

--Archivos .java 

--Archivos .class

--Carpeta Librerías

--Carpeta Instancias

Comandos para compilar y ejecutar:

--Para compilar desde 0 el programa, debe ingresar a la carpeta de "Archivos Java" desde terminal y ejecutar el 
siguiente comando dependiendo de su sistema operativo

Windows
javac -cp ".;./Librerias/opt4j-core-3.1.4.jar;./Librerias/opt4j-operators-3.1.4.jar" *.java

Mac
javac -cp ".:./Librerias/opt4j-core-3.1.4.jar:./Librerias/opt4j-operators-3.1.4.jar" *.java


--Posteriormente, para ejecutar el programa, ejecute el siguiente comando para correrlo junto
con su instancia, cabe destacar que existen 3 carpetas donde se encuentran
diferentes tipos de instancias, ejecutar el que usted quiera probar junto con el test y ejecutar el comando correspondiente
a su sistena operativo.

Windows
java -Xms8192M -cp ".;./Librerias/opt4j-core-3.1.4.jar;./Librerias/opt4j-operators-3.1.4.jar" Grafo < Instancias/GridGraph||PathGraph||CycleGraph/testXX.txt

Mac
java -Xms8192M -cp ".:./Librerias/opt4j-core-3.1.4.jar:./Librerias/opt4j-operators-3.1.4.jar" Grafo < Instancias/GridGraph||PathGraph||CycleGraph/testXX.txt



--Para recuperar la salida de las ejecuciones en un archivo, ejecutar el siguiente comando, la salida se guardará en el archivo resultados.txt

Windows
java -Xms8192M -cp ".;./Librerias/opt4j-core-3.1.4.jar;./Librerias/opt4j-operators-3.1.4.jar" Grafo < Instancias/GridGraph||PathGraph||CycleGraph/testXX.txt > resultados.txt

Mac
java -Xms8192M -cp ".:./Librerias/opt4j-core-3.1.4.jar:./Librerias/opt4j-operators-3.1.4.jar" Grafo < Instancias/GridGraph||PathGraph||CycleGraph/testXX.txt > resultados.txt

