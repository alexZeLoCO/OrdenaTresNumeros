import java.util.Scanner;		//IMPORTAR SCANNER PARA teclado
public class OrdenaTresN�meros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO teclado DE TIPO SCANNER
		
		System.out.print("Introduzca un n�mero: ");		//SOLICITAR VALOR
		double a = teclado.nextDouble();		//ALMACENAR VALOR EN a
		System.out.print("Introduzca un n�mero: ");		//SOLICITAR VALOR
		double b = teclado.nextDouble();		//ALMACENAR VALOR EN a
		System.out.print("Introduzca un n�mero: ");		//SOLICITAR VALOR
		double c = teclado.nextDouble();		//ALMACENAR VALOR EN a
		
		/*
		 * 3 variables ==> n�mero de posibilidades = 3! = 6.
		 * a < b < c
		 * a < c < b
		 * b < a < c
		 * b < c < a
		 * c < a < b
		 * c < b < a
		 * 
		 * El programa no est� a prueba de evaluar n�meros que sean iguales.
		 */
		
		if (a<b&&b<c) {		//CONDICI�N: SI a < b < c
			System.out.printf("%f < %f < %f", a,b,c);
		}
		if (a<c&&c<b) {		//CONDICI�N: SI a < c < b
			System.out.printf("%f < %f < %f", a,c,b);
		}
		if (b<a&&a<c) {		//CONDICI�N: SI b < a < c
			System.out.printf("%f < %f < %f", b,a,c);
		}
		if (b<c&&c<a) {		//CONDICI�N: SI b < c < a
			System.out.printf("%f < %f < %f", b,c,a);
		}
		if (c<a&&a<b) {		//CONDICI�N: SI c < a < b
			System.out.printf("%f < %f < %f", c,a,b);
		}
		if (c<b&&b<a) {		//CONDICI�N: SI c < b < a
			System.out.printf("%f < %f < %f", c,b,a);
		}
	}

}
