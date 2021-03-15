package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 17. Programa que lea un número entero N de 5 cifras y muestre las cifras que ocupan
 *     posiciones impares.
 *
 ***************************************************************/

public class Ejercicio_17 {

    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    public static void resolverEjercicio_17() {
        scan.reset();

        show.println("  -------------------");
        show.println(" |   Ejercicio 17.   |");
        show.println("  -------------------");
        show.println("\n");

        show.print("Ingresar un numero entero de 5 cifras: ");
        int num = scan.nextInt();

        int[] digitos = new int[5];
        int total = 0;

        while(num > 0) {
            digitos[total] = num % 10;
            num /= 10;
            total++;
        }

        show.print("Los digitos impares son: ");

        int i = digitos.length - 1;

        while(i > (-1)) {
            if(digitos[i] % 2 != 0) {
                show.print(digitos[i]);
            }
            i--;
        }
    }
}
