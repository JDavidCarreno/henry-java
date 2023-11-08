import java.util.Map;
import java.util.TreeMap;

public class EjemploMap {
    public static void gestionarDiccionario(Map<String, String> diccionario){
        diccionario.put("Manzana", "fruta roja muy conocida");
        diccionario.put("Banana", "fruta amarilla");
        diccionario.put("Naranja", "fruta color naranja");
    }

    public static void mostrarDiccionario(Map<String, String > diccionario) {

        Map<String, String> diccionario_ordenado = new TreeMap<>(diccionario);

        System.out.println("Diccionario: ");
        for (Map.Entry<String, String> entry : diccionario_ordenado.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
