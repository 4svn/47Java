package ejercicos;
import java.util.Scanner;
public class Actividad1x08 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double velocI;
		double acel;
		double tiempo;
		double distancia;
		System.out.print("La velocidad inicial: ");
		velocI = teclado.nextDouble();
		System.out.print("La Aceleración: ");
		acel = teclado.nextDouble();
		System.out.print("El tiempo transcurrido: ");
		tiempo = teclado.nextDouble();
		System.out.print("La distancia es :");
		distancia = (velocI * tiempo) + (acel * tiempo * tiempo)/2;
		System.out.printf("%.3f\n", distancia);
	}
}

		