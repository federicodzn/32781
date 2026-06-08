Para ejecutar en forma correcta el Analizador Sintáctico, se debe clonar el proyecto y guardarlo en una carpeta designada. Desde la consola de comandos CMD o Powershell, o la terminal en GNU/Linux, desplazarse hasta la dirección donde fue clonado el proyecto. Para abrirlo con el Visual Studio Code, el comando es code .
 Una vez abierto el proyecto, para analizar los distintos inputs.txt, abrir index.js (se encuentra al abrir el proyecto), desplazarse hasta la línea 14 que figura como  input = fs.readFileSync('input_correcto1.txt', 'utf8'); cambiar en forma manual el input que se encuentra entre comillas simples, los 4 distintos input son:
 
 -  input_correcto1.txt, 
 -  input_correcto2.txt, 
 -  input_incorrecto1.txt,
 -  input_incorrecto2.txt

Una vez elegido el input a evalaur, guardar (control + s).
 Hacer este mismo procedimiento realizado previamente en index.js, pero ahora en launch.json (se encuentra dentro de la carpeta .vscode) en la línea 8 ("input": "input_correcto1.txt",), elegir el input a evaluar y guardar.
 Abrir otra consola, acceder a la ruta donde fue clonado el proyecto y escribir npm start, automáticamente se generará la gramática con el input evaluado.
 
