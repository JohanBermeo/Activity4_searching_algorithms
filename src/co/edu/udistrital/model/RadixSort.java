package co.edu.udistrital.model;

import java.util.Arrays;

public class RadixSort implements MetodoOrdenamiento {

    @Override
    public void ordenar(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        // 1. Encontrar el número máximo para saber cuántos dígitos tiene
        int max = obtenerMaximo(array);

        // 2. Hacer Counting Sort para cada dígito.
        // El parámetro 'exp' es 10^i (donde i es el dígito actual: 1, 10, 100...)
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortPorDigito(array, exp);
        }
    }

    // Método auxiliar para encontrar el valor máximo en el arreglo
    private int obtenerMaximo(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Un Counting Sort modificado para ordenar el arreglo según el dígito representado por 'exp'
    private void countingSortPorDigito(int[] array, int exp) {
        int n = array.length;
        int[] salida = new int[n]; // Arreglo de salida ordenado temporalmente
        int[] conteo = new int[10]; // Base 10 para los dígitos del 0 al 9
        Arrays.fill(conteo, 0);

        // Almacenar el conteo de ocurrencias de cada dígito
        for (int i = 0; i < n; i++) {
            int digito = (array[i] / exp) % 10;
            conteo[digito]++;
        }

        // Cambiar conteo[i] para que contenga la posición real de este dígito en 'salida'
        for (int i = 1; i < 10; i++) {
            conteo[i] += conteo[i - 1];
        }

        // Construir el arreglo de salida (se recorre al revés para mantener la estabilidad)
        for (int i = n - 1; i >= 0; i--) {
            int digito = (array[i] / exp) % 10;
            salida[conteo[digito] - 1] = array[i];
            conteo[digito]--;
        }

        // Copiar el arreglo de salida al arreglo original
        System.arraycopy(salida, 0, array, 0, n);
    }
}