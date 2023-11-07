import java.util.Set;
import java.util.TreeSet;

public class EjemploSet {
    public static void ejecutarAgregacionSet(Set<String> setPaises){
        setPaises.add("Aregentina");
        setPaises.add("Colombia");
        setPaises.add("Brasil");

        boolean seAgrego = setPaises.add("Colombia");
        System.out.println("Se agrego? " + seAgrego);

        System.out.println("MOSTRANDO LISTADO");
        for (String pais : setPaises) {
            System.out.println(pais);
        }
    }

    public static void mostrarPaises(Set<String > setPaises) {
        Set<String> setPaisesOrdenados = new TreeSet<>(setPaises);
        for (String pais : setPaisesOrdenados) {
            System.out.println(pais);
        }
    }
}
