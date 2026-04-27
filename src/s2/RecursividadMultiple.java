package src.s2;

import java.util.HashMap;
import java.util.Map;

import src.SimpleBenchmark;

public class RecursividadMultiple {
    
    // Fibonacci con Recursividad Múltiple
    public static int fibonacciRM(int n) {
        if(n == 0 || n == 1)
            return 1;
        else
            return fibonacciRM(n-1) + fibonacciRM(n-2);
    }

    // Almacenamiento de Memoización
    private static Map<Integer, Integer> memo = new HashMap<>();

    // Fibonacci con Recursividad Múltiple con Memoización
    public static int fibonacciMemo(int n) {

        if (n == 0 || n == 1)
            return 1;

        // Si ya está calculado, lo devolvemos
        if (memo.containsKey(n))
            return memo.get(n);

        // Cálculo recursivo
        int result = fibonacciMemo(n - 1) + fibonacciMemo(n - 2);

        // Almacenamiento
        memo.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        int n = 30;
        memo.clear();

        SimpleBenchmark.benchmark(() -> fibonacciRM(n), "fibonacciRM", 1_000);
        SimpleBenchmark.benchmark(() -> fibonacciMemo(n), "fibonacciMemo", 1_000);
    }
}
