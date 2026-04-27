package src.s1;

public class RecursividadSimple {

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

    public static void main(String[] args) {
        int n = 10;
        
         factorailIter(n);
        factorialRS(n);
    }
}
