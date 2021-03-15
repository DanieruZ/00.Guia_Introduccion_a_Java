package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 4. Programa java que declare cuatro variables enteras A, B, C y D y asignarle un valor a
 *    cada una. A continuación realiza las instrucciones necesarias para que: B tome el
 *    valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.
 *
 ***************************************************************/

public class Ejercicio_04 {
    
    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    public static void resolverEjercicio_04() {
        scan.reset();

        int A = 28;
        int B = 46;
        int C = 12;
        int D = 37;
        int aux = 0;
        int aux2 = 0;

        show.println("  -------------------");
        show.println(" |   Ejercicio 04.   |");
        show.println("  -------------------");
        show.println("\n");

        show.printf("El valor de 'A' es: %s\n",A);
        show.printf("El valor de 'B' es: %s\n",B);
        show.printf("El valor de 'C' es: %s\n",C);
        show.printf("El valor de 'D' es: %s\n",D);
        show.println("\n");

        aux = A;
        aux2 = B;
        A = D;
        B = C;
        C = aux;
        D = aux2;

        show.printf("El valor de 'A' ahora es: %s\n",A);
        show.printf("El valor de 'B' ahora es: %s\n",B);
        show.printf("El valor de 'C' ahora es: %s\n",C);
        show.printf("El valor de 'D' ahora es: %s\n",D);
    }
}
