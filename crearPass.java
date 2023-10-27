
/*
 * Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
 * Podrás configurar generar contraseñas con los siguientes parámetros:
 * - Longitud: Entre 8 y 16.
 * - Con o sin letras mayúsculas.
 * - Con o sin números.
 * - Con o sin símbolos.
 * (Pudiendo combinar todos estos parámetros entre ellos)
 */

import java.util.Random;

public class crearPass {

    public static void main(String[] args) {

        System.out.println(" ***************************** ");
        System.out.println(" ** Generador de contraseña ** ");
        System.out.println(" ***************************** ");
        String pass = generarPass();

        System.out.println("tu nueva contraseña es: " + pass);
    }

    public static String generarPass() {
        String nuevaPass = "";
        String characterSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // longitud aleatoria de la contraseña
        Random random = new Random();
        StringBuilder randomChars = new StringBuilder();

        int min = 8;
        int max = 16;
        int longitud = random.nextInt(max - min + 1) + min;

        for (int i = 0; i < longitud; i++) {
            int randomIndex = random.nextInt(characterSet.length());
            char randomChar = characterSet.charAt(randomIndex);
            randomChars.append(randomChar);
        }
        nuevaPass = randomChars.toString();
        return nuevaPass;
    }

}