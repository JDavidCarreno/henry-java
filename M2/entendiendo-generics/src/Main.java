public class Main {
    public static void main(String[] args) {
        CajaDeHerramientas<HerramientaHerrero> cajaHerrero = new CajaDeHerramientas<>();
        Herramienta herramientaHerrero = new HerramientaHerrero("soplete");
        cajaHerrero.agregarHerramienta(herramientaHerrero);

        CajaDeHerramientas<HerramientaCarpintero> cajaCarpintero = new CajaDeHerramientas<>();
        cajaCarpintero.agregarHerramienta(new HerramientaCarpintero("martillo"));


    }
}