package src;
import java.util.function.Supplier;

public class MedirTiempo {

    public static <T> void medir(Supplier<T> supplier, String name) {
        long inicio = System.nanoTime();
        supplier.get();
        long fin = System.nanoTime();

        System.out.println("La función " + name + " ha tardado " + (fin - inicio) + " ms");
    }
    
}
