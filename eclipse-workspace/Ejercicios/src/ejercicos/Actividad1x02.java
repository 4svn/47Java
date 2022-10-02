package ejercicos;
import java.util.Scanner;
public class Actividad1x02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		System.out.println("Números 1");
		num1 = teclado.nextInt();
		System.out.println("Números 2");
		num2 = teclado.nextInt();
		System.out.println("Números 3");
		num3 = teclado.nextInt();
		System.out.println("Números alineados por la derecha:");
		System.out.printf("%d\n",num1);
		System.out.printf("%d\n",num2);
		System.out.printf("%d\n",num3);
		System.out.println("Números alinado por la izquierda: ");
		System.out.printf("%3d\n",num1);
		System.out.printf("%3d\n",num2);
		System.out.printf("%3d\n",num3);
	}
}

/*
ACTIVIDAD 1x02
Codifica un programa que lea por teclado tres números enteros y que los visualice en consola en diferentes
líneas de texto dos veces. Cada número se deberá visualizar con cinco dígitos numéricos.
En la primera vez, todos los números deberán quedar alineados por la derecha. En la segunda vez, estos
mismos números deberán quedar alineados por la izquierda.
Un ejemplo de ejecución del programa podría ser:
¿Número Entero A? 1
¿Número Entero B? 840
¿Número Entero C? 65536
NÚMEROS ALINEADOS POR LA DERECHA:
A = 1
B = 840
C = 65536
NÚMEROS ALINEADOS POR LA IZQUIERDA:
A = 1
B = 840
C = 65536
*/

