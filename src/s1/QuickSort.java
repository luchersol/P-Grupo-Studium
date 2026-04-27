package src.s1;

public class QuickSort {

    public static void ordenar(int[] array) {
        ordenar(array, 0, array.length - 1);
    }

    // Ordena el array entre las posiciones "desde" y "hasta" usando el algoritmo de QuickSort (recursivo)
    public static void ordenar(int[] array, int desde, int hasta) {

        // Caso base:
        // Si hay 1 o 0 elementos, ya está ordenado
        if (desde < hasta) {

            // 1. Se elige un pivote y se reorganiza el array de forma que:
            //    - a la izquierda del pivote: valores menores
            //    - a la derecha del pivote: valores mayores
            int pivote = particionar(array, desde, hasta);

            // 2. Se ordena recursivamente la parte izquierda
            ordenar(array, desde, pivote - 1);

            // 3. Se ordena recursivamente la parte derecha
            ordenar(array, pivote + 1, hasta);
        }
    }

    // Reordena el array respecto a un pivote y devuelve la posición final del pivote
    public static int particionar(int[] array, int desde, int hasta) {

        // Se elige como pivote el primer elemento del subarray
        int pivote = desde;

        // Valor del pivote (se usa como referencia de comparación)
        int valor_pivote = array[pivote];

        // Recorremos el array desde "desde + 1" hasta "hasta"
        for (int i = desde + 1; i <= hasta; i++) {

            // Si el elemento actual es menor que el pivote:
            if (array[i] < valor_pivote) {

                // Se amplía la zona de elementos menores al pivote
                pivote++;

                // Se intercambia el elemento actual con el de la zona izquierda
                swap(array, i, pivote);
            }
        }

        // Finalmente colocamos el pivote en su posición correcta
        // (se intercambia con el último elemento menor encontrado)
        swap(array, desde, pivote);

        // Devolvemos la posición final del pivote
        return pivote;
    }

    // Intercambia dos elementos del array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        
    }
}
