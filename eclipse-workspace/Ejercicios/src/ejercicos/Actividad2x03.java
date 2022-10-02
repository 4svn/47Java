package ejercicos;
import java.util.Scanner;
public class Actividad2x03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double numero;
		Double cuadrado;
		double raiz;
		System.out.println("Dime un número");
		numero = teclado.nextDouble();
		if (numero < 0) {
			System.out.print("Debe ser positivo");
		}
		else {
			cuadrado = numero * numero;
			raiz = Math.sqrt(numero);
			System.out.printf("Cuadrado de ", numero , " =");
			System.out.println(cuadrado);
			System.out.printf("Raíz Cuadrada de ", numero, " =");
			System.out.println(raiz);
		}
	}

}
