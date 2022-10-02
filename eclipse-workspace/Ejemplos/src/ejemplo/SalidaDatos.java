package ejemplo;

public class SalidaDatos {
	
	public static void main(String[] args) {
		// DEFINIR LAS VARIABLES COMO ENTERO
		int numeroEnteroA;
		int numeroEnteroB;
		// ASIGNAR A LAS VARIABLES SUS VALORES
		numeroEnteroA = 5;
		numeroEnteroB = 7;
		// NOS SACA EL TITULO DE LA PRIMERA PARTE
		System.out.println("NÚMEROS ENTEROS");
		// NUM 1
		System.out.printf("%d\n", numeroEnteroA);
		// NUM 2
		System.out.printf("%d %d\n", numeroEnteroA, numeroEnteroB);
		// saca por pantalla tres posiciones de acncho
		System.out.printf("%3d\n ",numeroEnteroA);
		System.out.printf("%03d\n",numeroEnteroA);	
		
		double numeroReal = 6.27;
		System.out.println("\nNÚMERO REALES");
		// SIN DECIR LA CANTIDAD DE DECIMALES
		System.out.printf("%f\n", numeroReal);
		// 2 DECIMALES
		System.out.printf("%.2f\n", numeroReal);
		// 5 posiciones de ancho y dos decimales
		System.out.printf("%5.2f\n", numeroReal);
		// 5 posiciones de ancho y dos decimales y completado con ceros
		System.out.printf("%05.2f\n", numeroReal);
		
	}

}
