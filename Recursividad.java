import java.util.HashMap;
import java.util.Map;

public class Recursividad {

    // Página visualización --> https://recursion.vercel.app/

    // Factorial con Iterativa
    public static int factorailIter(int n){
        int res = 1;

        for (int i = 2; i <= n; i++) {
            res *= i;
        }

        return res;
    }

    // Factorial con Recursividad Simple
    public static int factorialRS(int n) {
        if(n == 1)
            return n;
        else
            return n * factorialRS(n-1);
    }

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
        
    }
}
