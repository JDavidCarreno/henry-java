public class Circulo {
    private static final double PI = 3.141592653589793;

    private double radio;

    public Circulo(double area) {
        this.radio = area;
    }

    public double getArea(){
        return PI * this.radio * this.radio;
    }

    public double getPerimetro() {
        return 2 * PI * this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
}
