
package estructuras_de_control;

import java.util.Scanner;

public class ejercicio9 {

	public void cifras() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese un número entero positivo: ");
		int numero = sc.nextInt();
		
		if(numero >= 0 && numero < 10) {
			System.out.println("El número tiene 1 cifra");
		} else if(numero >= 10 && numero < 100) {
			System.out.println("El número tiene 2 cifras");
		} else if(numero >= 100 && numero < 1000) {
			System.out.println("El número tiene 3 cifras");
		} else {
			System.out.println("Error, el número tiene más de 3 cifras");
		}

	}

}