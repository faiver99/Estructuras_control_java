package estructuras_de_control;

import java.util.Scanner;

public class ejercicio2 {
    
    
    public void mayor(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int num1=scanner.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int num2=scanner.nextInt();
        
        if (num1>num2){
            System.out.println("El mayor es: "+ num1);
            
        }
        else{
            System.out.println("El mayor es: " +num2);
        }
    
    }
    
}
