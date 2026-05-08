
package video13;

import java.util.Scanner;


public class Reto_Temperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en °C: ");
        double temp = sc.nextDouble();

        if (temp == 100) {
            System.out.println("El agua ya está hirviendo.");
        } else if (temp < 0) {
            System.out.println("Está bajo cero, hace mucho frío.");
        } else if (temp <= 15) {
            System.out.println("Hace frío, mejor lleve abrigo.");
        } else if (temp <= 25) {
            System.out.println("La temperatura está agradable.");
        } else {
            System.out.println("Hace bastante calor, tome agua.");
        }
    }

}
