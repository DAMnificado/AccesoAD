package Bol1Ficheros;

//Codificar un programa en Java que muestre un menú con 3 opciones:
//En la primera deberá crear un fichero (con el nombre que se quiera) en el que
//indicaremos en líneas diferentes tu nombre, tus apellidos, tu ciudad de nacimiento.
//En la segunda opción deberá mostrar por pantalla el contenido del fichero creado.
//En la tercera opción crearemos un fichero cuyo nombre y contenido introducimos por
//teclado. Después de crear el fichero con la información introducida, se deberá mostrar
//por pantalla el texto del fichero variando entre mayúsculas y minúsculas. Por ejemplo, si
//escribo Bienvenidos a Vigo deberá mostrar bIENVENIDOS A vIGO.

public class AlternarMayusculasMinisculas {
    public static void main(String[] args) {
    	
        String frase = "Hola Mundo";
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            if (Character.isUpperCase(letra)) {
                resultado.append(Character.toLowerCase(letra));
            } else if (Character.isLowerCase(letra)) {
                resultado.append(Character.toUpperCase(letra));
            } else {
                resultado.append(letra);
            }
        }

        System.out.println("Original: " + frase);
        System.out.println("Alternada: " + resultado.toString());
    }
}
