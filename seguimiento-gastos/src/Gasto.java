public class Gasto {
    private static int count_id = 0;
    private final int id;
    private String description;

    public Gasto(String description){
        Gasto.count_id++;
        this.id = count_id;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Gasto{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
