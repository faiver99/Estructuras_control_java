
package estructuras_de_control;

import java.util.Scanner;

public class ejercicio4 {
    
    
    public void prom(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la nota 1: ");
        int num1=scanner.nextInt();
        
        System.out.println("Ingrese la nota 2: ");
        int num2=scanner.nextInt();
        
        System.out.println("Ingrese la nota 3: ");
        int num3=scanner.nextInt();
        
        double prom=(num1+num2+num3)/3;
        
        
        if (prom>=7){
            System.out.println("Promicionado");
        }
        else{
            
            System.out.println("No promocionado");
        }
    
    }
    
}
