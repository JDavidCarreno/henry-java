public class Pedido {
    private String nombre_libro;
    private int stock;

    public Pedido(String nombre_libro, int stock) {
        this.nombre_libro = nombre_libro;
        this.stock = stock;
    }

    public String getNombre_libro() {
        return nombre_libro;
    }

    public void setNombre_libro(String nombre_libro) {
        this.nombre_libro = nombre_libro;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "nombre_libro='" + nombre_libro + '\'' +
                ", stock=" + stock +
                '}';
    }
}
