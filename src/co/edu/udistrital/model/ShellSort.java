package co.edu.udistrital.model;

public class ShellSort implements MetodoOrdenamiento {

    @Override
    public void ordenar(int[] array) {
        int n = array.length;

        // 1. Empezamos con una brecha (gap) grande y la reducimos a la mitad en cada ciclo
        for (int gap = n / 2; gap > 0; gap /= 2) {
            
            // 2. Hacemos un ordenamiento por inserción modificado para este 'gap'
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                
                // 3. Desplazar los elementos anteriores que son mayores que 'temp'
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                
                // 4. Poner el elemento original en su posición correcta
                array[j] = temp;
            }
        }
    }
}