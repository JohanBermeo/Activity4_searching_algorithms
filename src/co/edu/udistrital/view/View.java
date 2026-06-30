package co.edu.udistrital.view;

import java.util.Scanner;

public class View {
	private final Scanner sc = new Scanner(System.in);
	
	public void mostrarMenu() {
		String menu = "Bienvenido, estos son los algoritmos de ordenamiento disponbiles:\n"+"1. Bubble Sort.\n"+"2. Shell Sort\n"+"3. Radix Sort\n"+"4. Quick Sort\n"+"5. Salir";
		System.out.println(menu);
		System.out.print("Seleccione el algoritmo de ordenamiento que desea utilizar: ");
	}
	
	public void mostrarTamaños() {
		String menu = "Los tamaños del arreglo a escoger son:\n"+"1. N = 4.000\n"+"2. N = 40.000\n"+"3. N = 400.000\n"+"4. N = 4.000.000\n"+"5. N = 40.000.000";
		System.out.println(menu);
		System.out.print("Seleccione el tamaño de arreglo que desea utilizar: ");
	}
	
	public void mostrarCasos() {
		String menu = "Los casos a escoger son:\n"+"1. Mejor caso (ordenados)\n"+"2. Peor caso (invertido)\n"+"3. Caso promedio (aleatorio)\n";
		System.out.println(menu);
		System.out.print("Seleccione el tamaño de arreglo que desea utilizar: ");
	}
	
	public int leer() {
		return sc.nextInt();
	}
	
	public void mostrarResultados(int n, long tiempo) {
		System.out.println("Resultados de la ejecución:");
		System.out.println("Tamaño del arreglo (N): " + n);
		System.out.println("Tiempo de ejecución: " + tiempo + "ms");
	}
	
}
