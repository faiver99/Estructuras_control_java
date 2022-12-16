
package estructuras_de_control;

import java.util.Scanner;

public class ejercicio3 {
    
    
    public void cong(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int num1=scanner.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int num2=scanner.nextInt();
        
        if (num1>num2){
            int suma= num1+num2;
            int dif=num1-num2;
            System.out.println("La suma es: "+ suma);
            System.out.println("La diferencia es: "+ dif);
        }
        else{
            int prod=num1*num2;
            double div=num1/num2;
            System.out.println("El producto es: " + prod);
            System.out.println("La divicion es: "+ div);
        }
    
    }
    
}
