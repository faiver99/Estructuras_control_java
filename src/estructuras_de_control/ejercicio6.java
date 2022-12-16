
package estructuras_de_control;



import java.util.Scanner;

public class ejercicio6 {

	public void nota() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la primera nota: ");
		int nota1 = sc.nextInt();
		
		System.out.println("Ingrese la segunda nota: ");
		int nota2 = sc.nextInt();
		
		System.out.println("Ingrese la tercera nota: ");
		int nota3 = sc.nextInt();
		
		float promedio = (nota1 + nota2 + nota3) / 3;
		
		if(promedio >= 7) {
			System.out.println("Promocionado");
		} else if (promedio >= 4 && promedio < 7) {
			System.out.println("Regular");
		} else {
			System.out.println("Reprobado");
		}
		
		sc.close();
	}
	
}