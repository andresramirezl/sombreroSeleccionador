/*
 * Crea un programa que simule el comportamiento del sombrero seleccionador del
 * universo mágico de Harry Potter.
 * - De ser posible realizará 5 preguntas (como mínimo) a través de la terminal.
 * - Cada pregunta tendrá 4 respuestas posibles (también a selecciona una a través de terminal).
 * - En función de las respuestas a las 5 preguntas deberás diseñar un algoritmo que
 *   coloque al alumno en una de las 4 casas de Hogwarts (Gryffindor, Slytherin , Hufflepuff y Ravenclaw)
 * - Ten en cuenta los rasgos de cada casa para hacer las preguntas y crear el algoritmo seleccionador.
 *   Por ejemplo, en Slytherin se premia la ambición y la astucia.
 */

import java.util.Scanner;

public class sombreroSeleccionador {

    public static void main(String[] args) {

        String griff = "Gryffindor";
        String haffl = "Hufflepuff";
        String raven = "Ravenclaw";
        String slyth = "Slytherin";

        String primeraPregunta = "¿Qué cualidad valoras más en ti mismo?\n" +
                "A) Valentía y coraje.\n" +
                "B) Lealtad y honestidad.\n" +
                "C) Inteligencia y sabiduría.\n" +
                "D) Astucia y determinación.  ";
        String segundaPregunta = "¿En qué tipo de actividades sobresales?\n" +
                "A) Deportes y desafíos físicos.\n" +
                "B) Ayudando a los demás y construyendo amistades.\n" +
                "C) Resolviendo acertijos y enigmas.\n" +
                "D) Alcanzando tus metas y ambiciones a cualquier costo.  ";

        String terceraPregunta = "Si te enfrentas a un enigma mágico, ¿qué enfoque prefieres?\n" +
                "A) Actuar de inmediato, incluso si es arriesgado.\n" +
                "B) Colaborar con otros para resolverlo juntos.\n" +
                "C) Tomarte tu tiempo para analizar y reflexionar.\n" +
                "D) Usar tu astucia para encontrar la solución más ventajosa.  ";
        String cuartaPregunta = "¿Qué tipo de animal mágico te atrae más?\n" +
                "A) León.\n" +
                "B) Tejón.\n" +
                "C) Águila.\n" +
                "D) Serpiente.  ";
        String quintaPregunta = "¿Qué cualidad consideras más importante en un amigo?\n" +
                "A) Valentía y coraje.\n" +
                "B) Lealtad y honestidad.\n" +
                "C) Inteligencia y sabiduría.\n" +
                "D) Astucia y determinación.  ";

        String primeraRespuesta = preguntar(primeraPregunta);
        String segundaRespuesta = preguntar(segundaPregunta);
        String terceraRespuesta = preguntar(terceraPregunta);
        String cuartaRespuesta = preguntar(cuartaPregunta);
        String quintaRespuesta = preguntar(quintaPregunta);

        int contA = 0;
        int contB = 0;
        int contC = 0;
        int contD = 0;

        String respFinal = primeraRespuesta + segundaRespuesta + terceraRespuesta + cuartaRespuesta + quintaRespuesta;
        String resultadoFinal = "";
        System.out.println("Resultado final respuestas: " + respFinal);

        for (int i = 0; i < respFinal.length(); i++) {
            char letra = respFinal.charAt(i);
            if (letra == 'A') {
                contA++;
            } else if (letra == 'B') {
                contB++;
            } else if (letra == 'C') {
                contC++;
            } else if (letra == 'D') {
                contD++;
            }
        }

        if (contA > contB && contA > contC && contA > contD) {
            resultadoFinal = griff;
        } else if (contB > contA && contB > contC && contB > contD) {
            resultadoFinal = haffl;
        } else if (contC > contA && contC > contB && contC > contD) {
            resultadoFinal = raven;
        } else if (contD > contA && contD > contB && contD > contC) {
            resultadoFinal = slyth;
        }
        if (resultadoFinal.isEmpty()) {
            System.out.println("dejame pensar: que raro");
        } else {
            System.out.println("eres de : " + resultadoFinal);
        }

    }

    public static String preguntar(String pregunta) {
        String respuesta = "";
        Scanner scanner = new Scanner(System.in);
        boolean control = true;

        do {
            System.out.println(pregunta);
            respuesta = scanner.nextLine();

            if (respuesta.equals("A")
                    || respuesta.equals("B")
                    || respuesta.equals("C")
                    || respuesta.equals("D")
                    || respuesta.equals("a")
                    || respuesta.equals("b")
                    || respuesta.equals("c")
                    || respuesta.equals("d")) {

                respuesta = respuesta.toUpperCase();
                System.out.println("respuesta: " + respuesta);
                control = false;
            } else {
                System.out.println("escribe una de las opciones");
            }

        } while (control);
        return respuesta;
    }

}