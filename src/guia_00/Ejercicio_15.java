package guia_00;

import java.io.PrintStream;
import java.util.Scanner;


/****************************************************************
 *
 * 15. Programa que calcula el área de un triángulo a partir de la longitud de sus lados.
 *
 ***************************************************************/

public class Ejercicio_15 {

    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    public static void resolverEjercicio_15() {
        scan.reset();

        show.println("  -------------------");
        show.println(" |   Ejercicio 15.   |");
        show.println("  -------------------");
        show.println("\n");

        show.print("Ingresar 1er lado del triangulo: ");
        double l1 = scan.nextDouble();

        show.print("Ingresar 2do lado del triangulo: ");
        double l2 = scan.nextDouble();

        show.print("Ingresar 3er lado del triangulo: ");
        double l3 = scan.nextDouble();

        double sp = (l1 + l2 + l3) / 2;
        double a = Math.sqrt((sp * (sp - l1) * (sp - l2) * (sp - l3)));

        show.printf("\nEl valor del area del triangulo es: %s",a);
    }
}
