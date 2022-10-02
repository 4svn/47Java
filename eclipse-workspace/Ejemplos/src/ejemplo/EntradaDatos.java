package ejemplo;
import java.util.Scanner;
public class EntradaDatos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dato;
		System.out.println("Dime un número");
		dato = teclado.nextInt();
		System.out.printf("El dato es %d", dato);
		System.out.println("El dato es"+ dato);
	}
}
