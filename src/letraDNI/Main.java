package letraDNI;

import java.util.Scanner;


//Curso Programación con Java Standard (2ª edición)
//Módulo 1. Introducción a Java
//Actividad (Calcular letra de un DNI)
//Pro Fco. Javier Hdez.

public class Main {

	public static void main(String[] args) {
		//variables que vamos a necesitar
		Scanner entrada = new Scanner(System.in);
		String entradaUsuario = "";
		char letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
		
		//utilizo un do While para que el usuario introduzca un número válido de DNI
		//En caso contrario nos seguirá preguntando hasta optenerlo.
		do {
			System.out.print("Introduce un número de DNI válido (sólo 8 dígitos numéricos): ");
			
			//Almacenamos la entrada del usuario que en este punto no sabemos aún si es válida
			entradaUsuario = entrada.next();
			System.out.println();
			
			//en la condicion del while usamos una expresión regular que requiere
			//que sean ocho dígitos numéricos y sólo eso (ni letras, ni símbolos)
		} while (!entradaUsuario.matches("\\d{8}"));
		
		//En dni almacenamos el número válido introducido por el usuario y convertido a entero
		int dni = Integer.parseInt(entradaUsuario);
		
		//Tal y como dice el enunciado calculamos el módulo 23 del número de dni que nos dará como
		//resultado un resto que coincide con el índice del array letras el cual almacena el valor
		//de la letra correspondiente al dni introducido
		int indiceArray = dni % 23;
		String nif = entradaUsuario + letras[indiceArray];
		System.out.println("El NIF es: " + nif);

	}

}
