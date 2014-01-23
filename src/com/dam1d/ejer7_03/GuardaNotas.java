package com.dam1d.ejer7_03;

import java.util.*;

public class GuardaNotas {
	
	public static void main (String[] args) {
		StringTokenizer notas;
		notas = new StringTokenizer("Juan Carlos\n8.5\nAndrés\n4.9\n Pedro\n3.8\nJuan\n6.3","\n");
		while (notas.hasMoreTokens())
			System.out.println("El alumno "+notas.nextToken()+" ha sacado un "+notas.nextToken());
		double[] vectornotas = new double[4];
		String notitas = "Juan Carlos\n8.5\nAndrés\n4.9\n Pedro\n3.8\nJuan\n6.3"+"\n";
		vectornotas = sumanotas(notitas);
		muestravector(vectornotas);
		
	}
	
	private static void muestravector(double[] vectornotas) {
		for (int i = 0; i < vectornotas.length; i++) {
			System.out.print(vectornotas[i]);
			
		}
		System.out.println("");
		
	}

	public static double[] sumanotas (String cadena) {
		double[] vector = new double[4];
		for (int j = 1; j < vector.length; j++) {
			vector[j] = Double.parseDouble(cadena);
			
		}
		return vector;
		
	}

}
