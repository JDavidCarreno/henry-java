public class AutoFamiliar extends Automovil{
    private int cantAsientos;

    public AutoFamiliar() {
    }

    @Override
    public void acelerar() {
        System.out.println("Acelera el familiar");
    }

    public AutoFamiliar(String marca, String modelo, int anioFabricacion, int cantAsientos) {
        super(marca, modelo, anioFabricacion);
        this.cantAsientos = cantAsientos;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }
}
