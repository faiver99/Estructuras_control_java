package estructuras_de_control;

import java.util.Scanner;

public class ejercicio8 {

    public void signo() {

        Scanner sbc = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int numero = sbc.nextInt();

        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero == 0) {
            System.out.println("El numero es nulo");
        } else {
            System.out.println("El numero es negativo");
        }

    }
}
