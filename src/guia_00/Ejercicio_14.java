package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 14. Programa que calcula el volumen de una esfera.
 *
 ***************************************************************/

public class Ejercicio_14 {

    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    public static void resolverEjercicio_14() {
        scan.reset();

        show.println("  -------------------");
        show.println(" |   Ejercicio 14.   |");
        show.println("  -------------------");
        show.println("\n");

        show.print("Ingresar el valor del radio de una esfera: ");
        double r = scan.nextDouble();

        double v = (4.0 / 3) * Math.PI * Math.pow(r,3);

        show.printf("El volumen de la esfera es: %s\n",v);
    }
}
