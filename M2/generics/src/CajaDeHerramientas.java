import java.util.ArrayList;
import java.util.List;

public class CajaDeHerramientas <T>{
    private List<T> herramientas;

    public CajaDeHerramientas(){
        herramientas = new ArrayList<>();
    }

    public void agregarHerramienta(T herramienta){
        herramientas.add(herramienta);
    }

}
