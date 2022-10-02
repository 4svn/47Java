package ejemplo;
import java.util.Scanner;
public class AnidamientoCondicionales2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dato;
		System.out.println("Dime un número: ");
		dato = teclado.nextInt();
		if(dato < 0) {
			System.out.println("El número es par");
		}
		else if(dato % 2 == 0) {
			System.out.println("El número es par");
		}
			
		else {
			System.out.println("El número es impar");
		}
		
	}

}
