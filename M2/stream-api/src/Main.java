import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Juan", "David", "Sebastian", "Camilo");
        //en List no es necesario usar .stream() porque list ya tiene el metodo forEach. System.out::println (?)
        names.forEach(System.out::println);

        List<String> changed_names = names.stream()
                                        .map(name -> name + " usando map")
                                        .toList();

        changed_names.forEach(System.out::println);

        //----------------------------------------------------------------------------------

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Juan", 1);
        mapa.put("David", 2);

        mapa.entrySet().forEach(entry -> {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        });

        mapa.forEach((key, value) -> System.out.println(key + " : " + value));

        //-------------------------------------------------------------------------------------

        List<String> filtered = changed_names.stream().filter(name -> name.contains("map")).toList();
        System.out.println(filtered);

    }
}