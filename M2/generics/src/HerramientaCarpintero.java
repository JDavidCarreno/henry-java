public class HerramientaCarpintero {
    private String name;

    public HerramientaCarpintero(String name) {
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
        return "HerramientaCarpintero{" +
                "name='" + name + '\'' +
                '}';
    }
}
