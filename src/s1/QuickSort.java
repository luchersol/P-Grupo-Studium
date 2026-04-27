package src.s1;

public class QuickSort {

    // PROCEDIMIENTO ordenar
    public static void ordenar(int[] array, int desde, int hasta) {

        if (desde < hasta) {
            int pivote = colocar(array, desde, hasta);

            ordenar(array, desde, pivote - 1);
            ordenar(array, pivote + 1, hasta);
        }
    }

    // FUNCION colocar
    public static int colocar(int[] array, int desde, int hasta) {

        int pivote = desde;
        int valor_pivote = array[pivote];

        for (int i = desde + 1; i <= hasta; i++) {

            if (array[i] < valor_pivote) {

                pivote++;

                // swap array[i] con array[pivote]´
                swap(array, i, pivote);
            }
        }

        // colocar pivote en su posición final
        swap(array, desde, pivote);

        return pivote;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        
    }
}
