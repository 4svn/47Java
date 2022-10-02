package ejercicos;
import java.util.Scanner;
public class Actividad1x05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num1;
		double num2;
		System.out.println("NÚMEROS 1");
		num1 = teclado.nextDouble();
		System.out.println("NÚMERO 2");
		num2 = teclado.nextDouble();
		System.out.println("NÚMEROS CON 2 DÍGITOS DECIMALES: ");
		System.out.printf("%.2f\n", num1);
		System.out.printf("%.2f\n", num2);
		System.out.println("NÚMEROS CON 1 DÍGITO DECIMAL: ");
		System.out.printf("%.1f\n", num1);
		System.out.printf("%.1f\n", num2);
		System.out.println("NÚMEROS CON NINGÚN DÍGITO DECIMAL: ");
		System.out.printf("%.0f\n", num1);
		System.out.printf("%.0f\n", num2);
	
	}
}

/*
ACTIVIDAD 1x05 
Codifica un programa que lea por teclado dos números reales y que los visualice en consola en distintas líneas de texto, alineados por la coma decimal, de diferentes maneras: • Con dos dígitos decimales. • Con un dígito decimal. • Con ningún dígito decimal. Un ejemplo de ejecución del programa podría ser: 
¿Número Real A? 12,345 
¿Número Real B? 98,765 
NÚMEROS CON 2 DÍGITOS DECIMALES: 
A = 12,35 
B = 98,77 
NÚMEROS CON 1 DÍGITO DECIMAL: 
A = 12,3 
B = 98,8 
NÚMEROS CON NINGÚN DÍGITO DECIMAL: 
A = 12 
B = 99 
*/

