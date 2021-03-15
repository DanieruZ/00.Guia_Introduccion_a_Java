package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 9. Programa Java que lea un número entero por teclado y calcule el doble y el triple de
 *	  ese número y lo muestre por pantalla.
 *
 ***************************************************************/

public class Ejercicio_09 {
    
    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    public static void resolverEjercicio_09() {
        scan.reset();

        show.println("  -------------------");
        show.println(" |   Ejercicio 09.   |");
        show.println("  -------------------");
        show.println("\n");

        show.print("Ingresar un numero entero: ");
        int N = scan.nextInt();

        show.printf("\nEl valor de 'N' es: %s\n",N);
        show.printf("El doble del valor de 'N' es: %s\n",N * 2);
        show.printf("El triple del valor de 'N' es: %s\n",N * 3);
    }
}
