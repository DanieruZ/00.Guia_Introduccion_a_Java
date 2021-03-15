package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 5. Programa Java que declare una variable A de tipo entero, asignarle un valor. A
 *	  continuación show un mensaje indicando si A es par o impar.
 *
 ***************************************************************/

public class Ejercicio_05 {

    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    public static void resolverEjercicio_05() {
        scan.reset();

        int A = (int) (Math.random() * 500);

        String estado = (A % 2 == 0) ? "par" : "impar";

        show.println("  -------------------");
        show.println(" |   Ejercicio 05.   |");
        show.println("  -------------------");
        show.println("\n");

        show.printf("El valor de 'A' es %s y es un numero %s.\n",A,estado);
    }
}
