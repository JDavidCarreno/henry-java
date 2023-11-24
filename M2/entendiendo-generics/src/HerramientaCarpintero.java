public class HerramientaCarpintero implements Herramienta {
    private String name;

    public HerramientaCarpintero() {
    }

    public HerramientaCarpintero(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HerramientaCarpintero{" +
                "name='" + name + '\'' +
                '}';
    }
}
