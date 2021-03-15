package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 18. Programa que lea tres números enteros H, M, S que contienen hora, minutos y
 *     segundos respectivamente, y comprueba si la hora que indican es una hora válida. 
 *
 ***************************************************************/

public class Ejercicio_18 {

    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    public static void resolverEjercicio_18() {
        scan.reset();

        show.println("  -------------------");
        show.println(" |   Ejercicio 18.   |");
        show.println("  -------------------");
        show.println("\n");

        show.print("Ingresar hora: ");
        int h = scan.nextInt();

        show.print("Ingresar minutos: ");
        int m = scan.nextInt();

        show.print("Ingresar segundos: ");
        int s = scan.nextInt();

        boolean hVal = h > (-1) && h < 25;
        boolean mVal = m > (-1) && m < 61;
        boolean sVal = s > (-1) && s < 61;

        boolean valida = hVal && mVal && sVal;

        if(valida) show.printf("\nLa hora es: %s:%s:%s\n",h,m,s);
        if(!valida) show.println("\n¡¡¡Formato de hora invalido.!!!");
    }
}
