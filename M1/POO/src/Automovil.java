public abstract class Automovil implements IRueda {
    private String marca;
    private String modelo;
    private int anioFabricacion;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    public void avanzar(){
        System.out.println("avanzar");
    }

    public void detenerse(){
        System.out.println("detenerse");
    }

    public abstract void acelerar();

    public String frenar() {
        return "Frenando";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
}
