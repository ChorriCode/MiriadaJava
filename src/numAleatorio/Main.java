package numAleatorio;

import java.util.Random;

//Curso Programación con Java Standard (2ª edición)
//Módulo 1. Introducción a Java
//Actividad (Repetir un Numero)
//Pro Fco. Javier Hdez.

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int minNumber = 18;
		int maxNumber = 65;
		Random randomNumber = new Random();
		
		//obtenemos un número aleatorio entre 1 y 19 inclusives
		//Este número será la cantidad de veces que generemos un número aleatorio
		//comprendido entre 18 y 65 inclusives
		int sizeRandom = randomNumber.nextInt(19)+1;
		
		for (int i = 0; i < sizeRandom; i++) {
			
			//con esta formula los numeros están estrictamente acotados entre el valor máximo que es 65 y el mínimo
			//que es 18 ambos incluidos.
			//no era necesario ponerlos en variables ya que el ejercicio no lo requiere.
			int finalValue = randomNumber.nextInt(maxNumber + 1 - minNumber) + minNumber ;
			System.out.println(i + ")\t" + finalValue);
		
		}
		String cadena1 = "abc";
		String cadena2 = "abc";
		System.out.println(cadena1 == cadena2); // TRUE
		
		cadena1 = cadena1+ "d";
		cadena2 = cadena2 + "d";
		System.out.println(cadena1 == cadena2); // FALSE
		
		
	}
}
