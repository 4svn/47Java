package ejercicos;
import java.util.Scanner;
public class NotaMedia {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// definir 
		double nota1;
		double nota2;
		double nota3;
		double media;
		//TODO pedir tres notas
		System.out.println("Dime Tus tres notas para saber tu nota media");
		System.out.println("Escriba la primera nota");
		nota1 = teclado.nextInt();
		System.out.println("Escriba la segunda nota");
		nota2 = teclado.nextInt();
		System.out.println("Escriba la tercera nota");
		nota3 = teclado.nextInt();
		// calcular la media
		media = (nota1+nota2+nota3)/3;
		// sacar la media por pantalla
		System.out.printf("Tu nota media es %.2f", media);
		
	}
}
