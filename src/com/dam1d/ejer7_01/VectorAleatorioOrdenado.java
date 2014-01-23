package com.dam1d.ejer7_01;

//import java.math.*;

//Carga un vector de dimensión 100 con números enteros aleatorios.
//Después ordena las componentes de dicho vector mediante el método de la burbuja.
//Dicho método ha sido modificado con el flag lógico "cambio" para optimizarlo

public class VectorAleatorioOrdenado {

	public static void main(String[] args) {
		// Carga el vector
		int vector[] = new int[10];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * 50);
			System.out.println(vector[i]);

		}
		System.out.println("");

		// Método de la burbuja para ordenarlo
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
