package model;

public class Medic {
    private int id;
    private String name;

    public Medic() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "model.Medic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
