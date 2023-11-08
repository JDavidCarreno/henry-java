import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> mi_mapa = new HashMap<>();
        System.out.println("Gestion del diccionario");
        EjemploMap.gestionarDiccionario(mi_mapa);
        EjemploMap.mostrarDiccionario(mi_mapa);
    }
}