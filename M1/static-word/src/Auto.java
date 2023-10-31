public class Auto {
    private String patente;
    private String marca;
    private String color;
    private double precio;
    private static double dcto;

    public Auto(String patente, String marca, String color, double precio) {
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        Auto.dcto = 10;
    }

    public double precioPromocional() {
        return this.precio - this.precio * Auto.dcto / 100;
    }

    public static void anularDescuento() {
        Auto.dcto = 0;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }
}
