package ejercicos;
import java.util.Scanner;
public class Actividad2x01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("Número: ");
		num = teclado.nextInt();
		/*
		 * el resto no debe ser igual a cero si es dividido entre 2 para que sea impar
		 */
		if (num%2 != 0) {
			System.out.print("impar");
		}
		else { // if(num%2 == 0)
			System.out.print("par");
		}
	}

}
