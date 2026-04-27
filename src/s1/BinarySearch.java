package src.s1;

public class BinarySearch {

    public static int busquedaBinaria(int[] array, int objetivo, int izquierda, int derecha) {

        // Caso base: no se encuentra el elemento
        if (izquierda > derecha) {
            return -1;
        }

        int medio = izquierda + (derecha - izquierda) / 2;

        // Caso base: elemento encontrado
        if (array[medio] == objetivo) {
            return medio;
        }

        // Si el objetivo es menor, buscamos en la parte izquierda
        if (objetivo < array[medio]) {
            return busquedaBinaria(array, objetivo, izquierda, medio - 1);
        }

        // Si el objetivo es mayor, buscamos en la parte derecha
        return busquedaBinaria(array, objetivo, medio + 1, derecha);
    }
}