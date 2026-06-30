package co.edu.udistrital.model;

public class QuickSort implements MetodoOrdenamiento {

    @Override
    public void ordenar(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        // Llamamos al método recursivo pasando los límites del arreglo entero
        quicksort(array, 0, array.length - 1);
    }

    // Método recursivo que divide el arreglo
    private void quicksort(int[] array, int inicio, int fin) {
        if (inicio < fin) {
            // 'indicePivote' es el lugar donde el pivote ya quedó en su posición correcta
            int indicePivote = particion(array, inicio, fin);

            // Ordenamos recursivamente la mitad izquierda y la mitad derecha
            quicksort(array, inicio, indicePivote - 1);
            quicksort(array, indicePivote + 1, fin);
        }
    }

    // Método que acomoda los elementos menores a la izquierda y mayores a la derecha
    private int particion(int[] array, int inicio, int fin) {
        // Elegimos el último elemento como pivote
        int pivote = array[fin];
        
        // Índice del elemento más pequeño
        int i = (inicio - 1);

        for (int j = inicio; j < fin; j++) {
            // Si el elemento actual es menor o igual al pivote
            if (array[j] <= pivote) {
                i++;
                // Intercambiamos array[i] y array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Intercambiamos el pivote con el elemento en la posición correcta (i + 1)
        int temp = array[i + 1];
        array[i + 1] = array[fin];
        array[fin] = temp;

        return i + 1; // Retorna la posición del pivote
    }
}