public class HerramientaHerrero {
    private String name;

    public HerramientaHerrero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HerramientaHerrero{" +
                "name='" + name + '\'' +
                '}';
    }
}
