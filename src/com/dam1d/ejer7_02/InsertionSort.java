package com.dam1d.ejer7_02;

public class InsertionSort {
	private static int POS = 50;
	private static int RAN = 100;
	private static boolean flag;
	
	public static void main(String[] args) {
		
		int[] vector = new int[POS];
		int[] ordenado = new int[POS];
		//muestravector(ordenado);
		llenavector(vector, RAN);
		muestravector(vector);
		ordenavector(vector, ordenado);
		muestravector(ordenado);

	}
	
	public static void llenavector(int[] vector, int n) { 
//		Esto es un método para poner números aleatorios
//		(dentro de un rango definido por el segundo argumento)
//		, dentro de un vector
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * n);
			
		}
		
	}
	
	
	public static void muestravector(int[] vector) {
//		Este método muestra por pantalla un vector ordenado
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+ " ");
			
		}
		System.out.println("");
		
	}
	
	
	public static void ordenavector(int[] vector, int[] ordenado) {
//		Implementa el método de inserción directa
//		para ordenar un vector y guardarlo en otro		
		
		for (int i = 0; i < vector.length; i++) {
			flag = true;
			// Compara con los que ha ordenado
			int j = 0;
			while (flag && j < i) {
				// Si encuentra uno mayor desplaza todos una posición atrás
				// desde el que encontró e inserta el nuevo valor
				if (vector[i] < ordenado[j]) {
					for (int k = i-1; k >= j; k-- ){
						ordenado[k+1] = ordenado[k];
					}
					ordenado[j] = vector[i];
					flag = false;
				}
				j++;
			}
			if (flag) ordenado[i] = vector[i];
			
		}
	}
	
}
