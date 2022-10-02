package ejercicos;
import java.util.Scanner;
public class Actividad2x02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("Número: ");
		num = teclado.nextInt();
		/*
		 * el resto no debe ser igual a cero si es dividido entre 2 para que sea impar
		 */
		if (num < 0) {
			System.out.print("Negativo");
		}
		else if (num == 0) { // if(num%2 == 0)
			System.out.print("Nuetro");
		}
		else {
			System.out.print("Positivo");
		}
	}

}
