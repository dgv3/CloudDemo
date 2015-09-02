package Basico001;

import java.util.Scanner;

public class producto {
	public static void main ( String [] arg ) {
		
		Scanner entrada = new Scanner(System.in);
		int x;
		int y;
		int z;
		int resultado;
		
		System.out.print("Escriba el primer entero: ");
		x = entrada.nextInt();
		
		System.out.print("Escriba el segundo entero:  ");
		y = entrada.nextInt();
		
		System.out.print("Escriba el tercer entero: ");
		z = entrada.nextInt();
		
		resultado = x * y * z;
		
		System.out.printf("El reultado es %d\n", resultado);
		
	}

}
