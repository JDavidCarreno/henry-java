import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploList {
    public static void ejecutarEjemploArrayList(){
        List<String>  arrayList = new ArrayList<>();

        arrayList.add("manzana");
        arrayList.add("banana");
        arrayList.add(2, "naranja");

        String primer_elemento = arrayList.get(0);
        System.out.println(primer_elemento);


    }

    public static void ejecutarEjemploLinkedList(){
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        linkedList.remove(1);
        linkedList.remove(Integer.valueOf(1));

        System.out.println(linkedList);
    }
}
