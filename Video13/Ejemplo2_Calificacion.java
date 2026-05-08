
package video13;

import java.util.Scanner;


public class Ejemplo2_Calificacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nota: ");
        int nota = sc.nextInt();

        if (nota >= 90) {
            System.out.println("Excelente.");
        } else if (nota >= 80) {
            System.out.println("Muy bien.");
        } else if (nota >= 70) {
            System.out.println("Bien.");
        } else {
            System.out.println("Reprobado.");
        }
    }
}
