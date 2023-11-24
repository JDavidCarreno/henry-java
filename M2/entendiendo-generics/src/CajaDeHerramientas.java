import java.util.ArrayList;
import java.util.List;

public class CajaDeHerramientas <T>{
    private List<T> herraminetas;

    public CajaDeHerramientas(){
        herraminetas = new ArrayList<>();
    }

    public void agregarHerramienta(T herramienta){
        herraminetas.add(herramienta);
    }
}
