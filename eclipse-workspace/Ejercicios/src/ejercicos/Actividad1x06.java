package ejercicos;
import java.util.Scanner;
public class Actividad1x06 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("chicos");
		num1 = teclado.nextInt();
		System.out.println("chicas");
		num2 = teclado.nextInt();
		double porcentajechicos;
		double porcentajechicas;
		porcentajechicos = (num1 * 100) / (num1 + num2);
		porcentajechicas = (num2 * 100) / (num1 + num2);
		System.out.println("Porcentaje de Chicos:"+ porcentajechicos);
		System.out.println("Porcentaje de Chicas:"+ porcentajechicas);
	}
}

/*
ACTIVIDAD 1x06 
Un instituto desea saber qué porcentaje de chicos y qué porcentaje de chicas hay en el curso académico actual. Codifica un programa que lea por teclado el número de chicos y el número de chicas y que calcule y visualice en consola el porcentaje de chicos y el porcentaje de chicas. Cada porcentaje se deberá visualizar con dos dígitos decimales. 
Un ejemplo de ejecución del programa podría ser:
¿Número de Chicos? 20 
¿Número de Chicas? 10 
Porcentaje de Chicos: 66,67% 
Porcentaje de Chicas: 33,33%
*/
