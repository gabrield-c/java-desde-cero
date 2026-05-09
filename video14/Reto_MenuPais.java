
package video14;

import java.util.Scanner;


public class Reto_MenuPais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Costa Rica");
        System.out.println("2. México");
        System.out.println("3. Colombia");
        System.out.println("4. Argentina");
        System.out.print("Elija una opción: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1: 
                System.out.println("Capital: San José");           
                break;
            case 2: 
                System.out.println("Capital: Ciudad de México");   
                break;
            case 3: 
                System.out.println("Capital: Bogotá");             
                break;
            case 4: 
                System.out.println("Capital: Buenos Aires");       
                break;
            default: 
                System.out.println("Opción no válida.");
        }
    }

}
