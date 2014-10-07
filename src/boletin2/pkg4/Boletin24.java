
package boletin2.pkg4;

import java.util.Scanner;

public class Boletin24 {
    
   
    public static void main(String[] args) {
       double x,y,suma,resta,mult,div;
       System.out.println("Introduzca dos numeros");
       Scanner dato= new Scanner(System.in);
       x=dato.nextDouble();
       y=dato.nextDouble();
       suma=x+y;
       resta=x-y;
       mult=x*y;
       div= x/y;
       
       System.out.println("Los resultados son:\nSuma=" +suma+ "\nResta:" +resta+"\nMultiplicacion="+mult+"\nDivision=" +div);
       
       
        
        
    }
    
}
