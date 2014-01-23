package com.dam1d.ejer7_01;

//import java.math.*;

//Carga un vector de dimensi�n 100 con n�meros enteros aleatorios.
//Despu�s ordena las componentes de dicho vector mediante el m�todo de la burbuja.
//Dicho m�todo ha sido modificado con el flag l�gico "cambio" para optimizarlo

public class VectorAleatorioOrdenado {

	public static void main(String[] args) {
		// Carga el vector
		int vector[] = new int[10];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * 50);
			System.out.println(vector[i]);

		}
		System.out.println("");

		// M�todo de la burbuja para ordenarlo
		burbuja(vector);

		for (int j = 0; j < vector.length; j++) {
			System.out.print(vector[j]+" ");

		}
		System.out.println("");

	}

	public static void burbuja(int[] vector) {
		int aux;
		boolean cambio = true;
		int i = vector.length;
		do {
			cambio = false;
			for (int j = 0; j < i - 1; j++) {
				if (vector[j] > vector[j + 1]) {
					aux = vector[j + 1];
					vector[j + 1] = vector[j];
					vector[j] = aux;
					cambio = true;

				}
				
			}
			i--;
			/*for (int j = 0; j < vector.length; j++) {
				System.out.print(vector[j]+" ");
				
			}
			System.out.println("");*/

		} while (cambio && (i > 0));

	}

}
