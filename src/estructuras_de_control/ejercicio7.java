package estructuras_de_control;

import java.util.Scanner;

public class ejercicio7 {

    public void ma() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int numero1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int numero2 = sc.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        int numero3 = sc.nextInt();

        int mayor;

        if (numero1 > numero2 && numero1 > numero3) {
            mayor = numero1;
        } else if (numero2 > numero1 && numero2 > numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }

        System.out.println("El mayor de los tres numeros ingresados es: " + mayor);

    }

}
