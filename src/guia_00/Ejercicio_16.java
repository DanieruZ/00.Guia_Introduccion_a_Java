package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 16. Programa que lee un número de 3 cifras y muestra sus cifras por separado.
 *
 ***************************************************************/

public class Ejercicio_16 {
    
    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    public static void resolverEjercicio_16() {
        scan.reset();

        show.println("  -------------------");
        show.println(" |   Ejercicio 16.   |");
        show.println("  -------------------");
        show.println("\n");

        show.print("Ingresar un numero de 3 cifras: ");
        int num = scan.nextInt();

        String cifra = String.valueOf(num);
        char[] digitos = cifra.toCharArray();

        show.println("\n   1er digito 2do digito 3er digito");
        show.println("\t\t" + digitos[0] + "\t\t" + "  " + digitos[1] + "\t\t" + "     " + digitos[2]);

        show.printf("\nPrimer digito:  %s\n",(num / 100));
        show.printf("Segundo digito: %s\n",((num / 10) % 10));
        show.printf("Tercer digito:  %s\n",(num % 10));
    }
}
