package src;
import java.util.function.Supplier;

public class SimpleBenchmark {

    public static <T> void benchmark(Supplier<T> supplier, String name, int iterations) {

        // 🔥 Warm-up (opcional pero muy recomendable en Java)
        for (int i = 0; i < 1000; i++) {
            supplier.get();
        }

        long total = 0;

        for (int i = 0; i < iterations; i++) {
            long inicio = System.nanoTime();

            supplier.get();

            long fin = System.nanoTime();

            total += (fin - inicio);
        }

        double promedioMs = (total / (double) iterations) / 1_000_000.0;

        System.out.println(
            "La función " + name +
            " ha tardado en promedio " +
            String.format("%.8f", promedioMs) + " ms en " +
            iterations + " iteraciones"
        );
    }
    
}
