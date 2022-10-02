package ejercicos;
import java.util.Scanner;
import java.lang.Math.*;
public class Actividad1x07 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double radio;
		double altura;
		double volu;
		System.out.println("Radio (en metros)");
		radio = teclado.nextDouble();
		System.out.println("Altura (en metros)");
		altura = teclado.nextDouble();
		volu = Math.PI *radio*radio*altura;
		System.out.printf("El volumen es: ");
		System.out.printf("%.3f\n", volu , "metros cúbicos");
		
	}
}

/*
 * ACTIVIDAD 1x07 [ampliación]
Codifica un programa que lea por teclado el radio y la altura de un cilindro y que calcule y visualice en
consola (con tres dígitos decimales) el volumen de dicho cilindro.
El volumen V de un cilindro de radio r y altura 𝒉 viene dado por la fórmula:
𝑽 = 𝝅𝒓
𝟐𝒉
siendo 𝝅 una constante que tiene un valor de 3,14159265359.
Un ejemplo de ejecución del programa podría ser:
¿Radio (en metros)? 1,5
¿Altura (en metros)? 4,3
Volumen: 30,395 metros cúbicos
 */
