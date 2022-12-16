
package estructuras_de_control;

import java.util.Scanner;

public class ejercicio10 {

    public void preguntas() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad total de preguntas:");
        int cantPreguntas = entrada.nextInt();
        System.out.println("Ingrese la cantidad de preguntas contestadas correctamente:");
        int cantCorrectas = entrada.nextInt();
        float porcentaje = (cantCorrectas * 100) / cantPreguntas;
        if (porcentaje >= 90) {
            System.out.println("Nivel máximo");
        } else if (porcentaje >= 75 && porcentaje < 90) {
            System.out.println("Nivel medio");
        } else if (porcentaje >= 50 && porcentaje < 75) {
            System.out.println("Nivel regular");
        } else {
            System.out.println("Fuera de nivel");
        }
    }
}
