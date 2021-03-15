package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 11. Programa que lee por teclado el valor del radio de una circunferencia, calcula y
 *	   muestra por pantalla la longitud y el área de la circunferencia.
 *
 ***************************************************************/

public class Ejercicio_11 {
    
    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    public static void resolverEjercicio_11() {
        scan.reset();

        show.println("  -------------------");
        show.println(" |   Ejercicio 11.   |");
        show.println("  -------------------");
        show.println("\n");

        show.print("Ingresar el valor del radio de una circunferencia: ");
        double R = scan.nextDouble();

        double L = (2 * R * Math.PI);
        double A = (Math.pow(R,2) * Math.PI);

        show.printf("\nLa longitud de la circunferencia es: %s\n",L);
        show.printf("El area de la circunferencia es: %s\n",A);
    }
}
