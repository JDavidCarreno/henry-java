import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //ejemploVideo();


    }

    public static void ejemploVideo(){
        List<Integer> lista_enteros = Arrays.asList(1, 2, 3, 4, 5);

        ElementoUtil<Integer> lista_con_generico = new ElementoUtil<>();
        lista_con_generico.mostrarListado(lista_enteros);

        List<String> lista_strings = Arrays.asList("Juan", "David");
        ElementoUtil<String > lista_con_strings = new ElementoUtil<>();
        lista_con_strings.mostrarListado(lista_strings);
    }

    public static void ejemploPairPrograming(){
        CajaDeHerramientas<HerramientaHerrero> cajaHerramientaHerrero = new CajaDeHerramientas<>();
        cajaHerramientaHerrero.agregarHerramienta(new HerramientaHerrero("martillo"));

        CajaDeHerramientas<HerramientaCarpintero> cajaDeHerramientasCarpintero = new CajaDeHerramientas<>();
        cajaDeHerramientasCarpintero.agregarHerramienta(new HerramientaCarpintero("serrucho"));

    }
}