import java.util.Comparator;
import java.util.List;

public class ElementoUtil<T extends Comparable<T>> {
    public void mostrarListado(List<T> lista){
        lista.forEach(System.out::println);
    }

    public T encontrarMaximo(List<T> lista){
        T maximo = lista.get(0);
        for (int i = 1; i < lista.size(); i++){
            T elemento = lista.get(i);
            if (elemento.compareTo(maximo) > 0) {
                maximo = elemento;
            }
        }

        return maximo;
    }
}
