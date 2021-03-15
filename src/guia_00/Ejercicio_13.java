package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 13. Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la
 *     longitud de la hipotenusa según el teorema de Pitágoras.
 *
 ***************************************************************/

public class Ejercicio_13 {
    
    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    public static void resolverEjercicio_13() {
        scan.reset();

        show.println("  -------------------");
        show.println(" |   Ejercicio 13.   |");
        show.println("  -------------------");
        show.println("\n");

        show.print("Ingresar valor del 1er cateto: ");
        double c1 = scan.nextDouble();

        show.print("Ingresar valor del 2do cateto: ");
        double c2 = scan.nextDouble();

        double h = Math.sqrt(Math.pow(c1,2) + Math.pow(c2,2));

        show.printf("\nEl valor del 1er cateto es: %s\n",c1);
        show.printf("El valor del 2do cateto es: %s\n",c2);
        show.printf("La longitud de la hipotenusa es: %s\n",h);
    }
}
