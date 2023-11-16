import java.util.Collection;
import java.util.List;

public class Utilidades{
    public static <T> void imprimirElementos(List<T> lista){
        lista.forEach(System.out::println);
    }

    public static <T, U extends T> void copiarElementos(List<? extends T> origen, Collection<? super T> destino) {
        destino.addAll(origen);
    }
}
