package video15;

import java.util.Scanner;

public class Ejercicio1_Combate {

    /*
        Sistema de combate: el héroe ataca al enemigo. 
        Si el ataque supera la defensa del enemigo, se calcula el daño. 
        Si no, el ataque falla. Si el daño supera la vida del enemigo, este muere.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ataque del heroe: ");
        int ataque = sc.nextInt();

        System.out.print("Defensa del enemigo: ");
        int defensa = sc.nextInt();

        System.out.print("Vida del enemigo: ");
        int vida = sc.nextInt();
        
        if(ataque > defensa){
            int danio = ataque - defensa;
            System.out.println("El heroe causo " + danio + "puntos de danio");
            
            if(danio >= vida){
                System.out.println("El enemigo fue derrotado");
            }else{
                int vidaRestante = vida - danio;
                System.out.println("El enemigo sobrevive con "+ vidaRestante);
            }
        }else{
            System.out.println("Ataque fue bloqueado");
        }

    }

}
