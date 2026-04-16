public class PruebaDeFalloPorStack {

    private static int depth = 0;

    public static void f1() {
        depth++;
        f1();
    }

    public static void f2(int a, int b, int c, int d) {
        depth++;
        f2(a, b, c, d);
    }

    public static void main(String[] args) {
        System.out.println("FUNCIÓN RECURSIVIDAD INFINITA");
        try {
            f1();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflow en f1 con profundidad aprox: " + depth);
        }
        
        depth = 0;

        try {
            f2(0,0,0,0);
        } catch (StackOverflowError e) {
            System.out.println("StackOverflow en f2 con profundidad aprox: " + depth);
        }

    }

}