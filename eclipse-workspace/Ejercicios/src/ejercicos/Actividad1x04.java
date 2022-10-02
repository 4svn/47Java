package ejercicos;
import java.util.Scanner;
public class Actividad1x04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		int suma;
		int resta;
		int multi;
		int div;
		System.out.println("num1");
		num1 = teclado.nextInt();
		System.out.println("num2");
		num2 = teclado.nextInt();
		suma = num1 + num2;
		resta = num1 - num2;
		multi = num1 * num2;
		div = num1 / num2;
		System.out.println("suma "+suma);
		System.out.println("resta "+resta);
		System.out.println("multi "+multi);
		System.out.println("div "+div);
	}
}
/*
ACTIVIDAD 1x04 [repaso]
Codifica un programa que lea por teclado dos números reales y que calcule y visualice en consola:
• La suma de los dos números y la resta (el primero menos el segundo).
• La multiplicación de los dos números y la división (el primero dividido por el segundo). 
Un ejemplo de ejecución del programa podría ser: 
¿Número Real A? 7,2 
¿Número Real B? 3,1 
7.2 + 3.1 = 10.3 
7.2 - 3.1 = 4.1 
7.2 * 3.1 = 22.32 
7.2 / 3.1 = 2.3225806451612905
*/

