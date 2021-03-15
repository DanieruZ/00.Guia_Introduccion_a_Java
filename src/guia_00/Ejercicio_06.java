package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 6. Programa Java que declare una variable B de tipo entero y asignarle un valor. A
 *	  continuación show un mensaje indicando si el valor de B es positivo o negativo.
 *
 ***************************************************************/

public class Ejercicio_06 {

    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    public static void resolverEjercicio_06() {
        scan.reset();

        int B = (int) (Math.random() * 500 - 250);
        String estado = "neutro, no es positivo, ni negativo";

        if(B > 0) estado = "positivo";
        if(B < 0) estado = "negativo";

        show.println("  -------------------");
        show.println(" |   Ejercicio 06.   |");
        show.println("  -------------------");
        show.println("\n");

        show.printf("El valor de 'B' es %s y es un numero %s.\n",B,estado);
    }
}
