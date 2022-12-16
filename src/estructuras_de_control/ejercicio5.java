
package estructuras_de_control;


import java.util.Scanner;
public class ejercicio5 {
	public void numer() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese un número entero positivo de uno o dos dígitos: ");
		int num = sc.nextInt();
		
		if((num >= 0) && (num <= 9)) {
			System.out.println("El número ingresado tiene un dígito.");
		} else if((num >= 10) && (num <= 99)) {
			System.out.println("El número ingresado tiene dos dígitos.");
		} else {
			System.out.println("El número no está dentro del rango.");
		}
	}
}