Para ejecutar en forma correcta el Analizador Sintáctico, se debe clonar el proyecto y guardarlo en una carpeta designada. Desde la consola de comandos CMD o Powershell, o la terminal en GNU/Linux, desplazarse hasta la dirección donde fue clonado el proyecto. Para abrirlo con el Visual Studio Code, el comando es code .
 Una vez abierto el proyecto, para analizar los distintos inputs.txt, abrir index.js, desplazarse hasta la línea 14 y cambiar en forma manual el input único al que se desea acceder (input_correcto1.txt, input_correcto2.txt, input_incorrecto1.txt, input_incorrecto2.txt) y guardar (control + s).
 Hacer este mismo procedimiento en launch.json en la línea 8, elegir el input a evaluar y guardar.
 Abrir otra consola, acceder a la ruta donde fue clonado el proyecto y escribir npm start, automáticamente se generará la gramática con el input evaluado.
 
