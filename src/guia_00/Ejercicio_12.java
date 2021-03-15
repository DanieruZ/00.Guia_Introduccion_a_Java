package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 12. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
 *
 ***************************************************************/

public class Ejercicio_12 {

    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    public static void resolverEjercicio_12() {
        scan.reset();

        show.println("  -------------------");
        show.println(" |   Ejercicio 12.   |");
        show.println("  -------------------");
        show.println("\n");

        show.print("Ingresar velocidad en Km/h: ");
        int K = scan.nextInt();

        double M = (K / 3.6);

        show.printf("%s Km/h equivalen a %s m/s.\n",K,M);
    }
}