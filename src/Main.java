//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        //Estructura de contro: Iterativo (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';

        }
        // Estructura de control: Iterativa
        while (!palabraAdivinada && intentos < intentosMaximos){
                                    //Esto se usa cuando tenemos una palabra de chars
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " " + palabraSecreta.length() + " letras");

            System.out.println("Introduce una letra, por favor");

            // Usamos la clase scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra){
                        letrasAdivinadas[i] = letra;
                        letraCorrecta = true;
                }

            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("Incorrecto! Te quedan " + (intentosMaximos - intentos) + " intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades!, adivinaste la palabra secreta: " + palabraSecreta);
            }

        }

        if (!palabraAdivinada){
            System.out.println("Que pena! te has quedado sin intentos. GAME OVER PA");
        }
             scanner.close();

    }
}