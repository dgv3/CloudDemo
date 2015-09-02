package Basico001;

import java.util.Scanner;

public class PruebaLibroCalificaciones {
	public static void main ( String [] arg ) {
		
		Scanner entrada = new Scanner( System.in );
		LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();
		System.out.printf("El nombre inicial del Curso es: %s\n\n",
				miLibroCalificaciones.obtenerNombreDelCurso());
		System.out.println("Escriba el nombre del Curso:  ");
		String elNombre = entrada.nextLine();
		miLibroCalificaciones.establecerNombreDelCurso(elNombre);
		System.out.println();
		miLibroCalificaciones.mostrarMensaje();
		
	}
}
