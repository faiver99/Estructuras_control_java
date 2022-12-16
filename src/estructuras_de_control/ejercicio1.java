package estructuras_de_control;

import java.util.Scanner;

public class ejercicio1 {
    
    public void sueldo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su sueldo: ");
        int sueldo=scanner.nextInt();
        
        if (sueldo>3000){
            System.out.println("Debe abonar impuestos");              
            } 
        else {
            System.out.println("Usted no debe abonar impuestos");
            }
            
        
        }
    
    }
    

    


