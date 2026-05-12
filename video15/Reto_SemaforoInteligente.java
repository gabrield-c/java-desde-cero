
package video15;

import java.util.Scanner;


public class Reto_SemaforoInteligente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hora actual (0-23): ");  
        int hora = sc.nextInt();
        System.out.print("¿Hay emergencia? (1=si, 0=no): "); 
        int emergencia = sc.nextInt();

        String color; 
        int segundos;

        if (emergencia == 1) {
            color = "VERDE"; 
            segundos = 999;
            System.out.println("Emergencia detectada.");
        } else if (hora == 0) {
            color = "AMARILLO"; 
            segundos = 60;
            System.out.println("Medianoche: tráfico mínimo.");
        } else if (hora >= 22 || hora < 6) {
            color = "AMARILLO"; 
            segundos = 60;
        } else if ((hora >= 7 && hora <= 9) || (hora >= 17 && hora <= 19)) {
            color = "ROJO"; 
            segundos = 90;
            System.out.println("Hora pico: semaforo extendido.");
        } else {
            color = "VERDE"; 
            segundos = 45;
        }

        System.out.println("Señal: " + color + " - " + segundos + " segundos.");
    }

 }