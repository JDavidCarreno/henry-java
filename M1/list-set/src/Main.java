import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //EjemploList.ejecutarEjemploArrayList();
        //EjemploList.ejecutarEjemploLinkedList();

        Set<String> hashSet = new HashSet<>();
        EjemploSet.ejecutarAgregacionSet(hashSet);
        System.out.println("----------------------");
        EjemploSet.mostrarPaises(hashSet);
    }
}