public class HerramientaHerrero implements Herramienta{
    private String name;

    public HerramientaHerrero(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
