/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package instrumentos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Instrumentos
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
   Scanner porcentaje = new Scanner(source:System.in);
   System.out.println("Ingresa el primer instrumento");
   String ins1 = porcentaje.nextLine();
   
   System.out.println("Ingresa el segundo instrumento");
   String ins2 = porcentaje.nextLine();
   
   System.out.println("Ingresa el tercer instrumento");
   String ins3 = porcentaje.nextLine();
   
   System.out.println("ingresa el precio compra del instrumento uno");
   Double i1 = porcentaje.nextDouble();
   
   System.out.println("Ingresa el precio compra del instrumento dos");
   Double i2 = porcentaje.nextDouble();
   
   System.out.println("Ingresa el precio compra del instrumento tres");
   Double i3 = porcentaje.nextDouble();
   porcentaje.close();
   
   double ganancia1 = 1250.45 - i1;
   double ganancia2 = 3743.00 - i2;
   double ganancia3 = 2683.78 - i3;
   
   double tota1 = (ganancia1 / i1) * 100;
   double tota2 = (ganancia2 / i2) * 100;
   double tota3 = (ganancia3 / i3) * 100;
   
   System.out.println("La ganancia de " + ins1 + "es" + tota1);
   System.out.println("La ganancia de " + ins2 + "es" + tota2);
   System.out.println("La ganancia de " + ins3 + "es" + tota3);
   
   
    }
    
    
}
