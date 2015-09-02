package Basico001;

import java.util.Scanner;



public class SumaNumeros {


	
	public static void main (String arg[]) {
		Scanner entrada = new Scanner( System.in );
		int numero1 = 23;
		int numero2 = 45;
		int numero3 = 43;
		int sumatotal;
		
		System.out.print("Hello World");
		System.out.println("Hello World Primero!!!");
		
		System.out.println("Escriba el primer entero: ");
		numero1 = entrada.nextInt();
		System.out.println("Escriba el Segundo Entero: ");
		numero2 = entrada.nextInt();
		System.out.println("Escriba el Tercer Entero: ");
		numero3 = entrada.nextInt();
		
		sumatotal = numero1 + numero2 + numero3;
		
		System.out.printf("La Suma total de los enteros es: %d\n ", sumatotal );
	
		
	}
}
