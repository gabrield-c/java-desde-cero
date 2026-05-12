package video15;

import java.util.Scanner;

public class Ejercicio2_DescuentoSupermercado {

    /*
        Cálculo de descuentos en caja:
        Solicita el total de la compra y el tipo de cliente. 
        Aplica, mediante un switch, un descuento según el perfil: 15% para Adulto Mayor, 
        10% para Estudiante, 8% para Frecuente y 0% para Regular. 
        Muestra el desglose final con el ahorro aplicado.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total de la compra: ");
        double total = sc.nextDouble();

        System.out.println("Tipo de cliente:");
        System.out.println("  1. Adulto mayor  (15% descuento)");
        System.out.println("  2. Estudiante    (10% descuento)");
        System.out.println("  3. Frecuente     ( 8% descuento)");
        System.out.println("  4. Regular       ( 0% descuento)");

        int tipo = sc.nextInt();
        double porcentaje;
        String categoria;

        switch (tipo) {
            case 1:
                porcentaje = 0.15;
                categoria = "Adulto mayor";
                break;

            case 2:
                porcentaje = 0.10;
                categoria = "Estudiante";
                break;

            case 3:
                porcentaje = 0.08;
                categoria = "Frecuente";
                break;

            default:
                porcentaje = 0;
                categoria = "Regular";

        }
        
        double descuento = total * porcentaje;
        double totalFinal = total - descuento;
        
        System.out.println("Resumen de compra**************");
        System.out.println("Cliente: " + categoria);
        System.out.println("Subtotal: " + total);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total: " + totalFinal);

    }
}
