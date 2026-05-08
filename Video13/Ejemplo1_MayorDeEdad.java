package video13;

import java.util.Scanner;

public class Ejemplo1_MayorDeEdad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.print("El usuario es mayor de edad.");
        }
    }
}
