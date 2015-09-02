package Basico001;

import java.util.Scanner;

public class Comparaciones {
	
	public static void main ( String [] arg ) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Escriba el primer entero:  ");
		numero1 = entrada.nextInt();
		System.out.println("Escriba el segundo entero: ");
		numero2 = entrada.nextInt();
		
		if ( numero1 == numero2 ) {
			System.out.printf("%d == %d\n", numero1, numero2);
		}
		
		if ( numero1 != numero2 ) {
			System.out.printf("%d != %d\n", numero1, numero2);
		}
		
		if ( numero1 > numero2 ) {
			System.out.printf("%d > %d\n", numero1, numero2);
		}
		
		if ( numero1 < numero2 ) {
			System.out.printf("%d < %d\n", numero1, numero2);
		}
		
		if ( numero1 >= numero2 ) {
			System.out.printf("%d >= %d\n", numero1, numero2);
		}
		
		if ( numero1 <= numero2 ) {
			System.out.printf("%d <= %d\n", numero1, numero2);
		}
		
	}

}
