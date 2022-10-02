package ejercicos;
import java.util.Scanner;
public class Actividad1x03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// definir 
		int numero1;
		int numero2;
		int t;
		int z;
		/*
		 * un programa que lea por teclado dos números enteros
		 *  los almacene en dos variables
		 *  que visualice en consola estas dos variables
		 *  que intercambie los valores de ambas variables entre ellas 
		 *  que visualice en consola las dos variables después del intercambio.
		 
			Un ejemplo:
			¿Número Entero A? 19
			¿Número Entero B? 37
			ANTES DEL INTERCAMBIO:
			A = 19 y B = 37
			DESPUÉS DEL INTERCAMBIO:
			A = 37 y B = 19
		 */
		System.out.println("Escriba el primer numero");
		numero1 = t = teclado.nextInt();
		System.out.println("Escriba el segundo numero");
		numero2 = z = teclado.nextInt();
		System.out.println("Tu primer numero es: "+ numero1 + " y tu segundo numero es: "+ numero2);
		numero1 = z ;
		numero2 = t ;
		System.out.println("Swap!");
		System.out.println("Tu primer numero es: "+ numero1 + " y tu segundo numero es: "+ numero2);
	}

}
