package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 8. Programa Java que lea un nombre y muestre por pantalla: 
 *    “Buenos días, {NOMBRE}”.
 *
 ***************************************************************/

public class Ejercicio_08 {

    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    public static void resolverEjercicio_08() {
        scan.reset();

        show.println("  -------------------");
        show.println(" |   Ejercicio 08.   |");
        show.println("  -------------------");
        show.println("\n");

        show.print("Ingresar un nombre: ");
        String nombre = scan.nextLine();

        show.printf("\nBuenos dias, '%s'.",nombre);
    }
}
