package co.edu.udistrital.model;

import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class GenerarArreglo {
	public static int[] generarArregloAleatorio(int n) {
		Random rand = new Random();
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = rand.nextInt(100_00);
		}
		
		return array;
	}
	
	public static int[] generarArregloOrdenado(int n) {
		int[] array = generarArregloAleatorio(n);
		Arrays.sort(array);
		return array;
	}
	
	public static int[] generarArregloInvertido(int n) {
		int[] arrayTemp = generarArregloAleatorio(n);
		
		int[] array = Arrays.stream(arrayTemp)
					  		.boxed()
					  		.sorted(Collections.reverseOrder())
					  		.mapToInt(Integer::intValue)
					  		.toArray();
		
		return array;
	}
}
