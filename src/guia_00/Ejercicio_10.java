package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 10. Programa que lea una cantidad de grados Fahrenheit y lo convierta a grados
 *     centígrados.
 *
 ***************************************************************/

public class Ejercicio_10 {
    
    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    public static void resolverEjercicio_10() {
        scan.reset();

        show.println("  -------------------");
        show.println(" |   Ejercicio 10.   |");
        show.println("  -------------------");
        show.println("\n");

        show.print("Ingresar temperatura en Farenheit: ");
        int F = scan.nextInt();

        double C = ((F - 32) / 1.8);

        show.printf("\nLa temperatura 'Farenheit' ingresada es: %sº\n",F);
        show.printf("%sº 'Farenheit' equivalen a %sº 'Centigrados'.\n",F,C);
    }
}