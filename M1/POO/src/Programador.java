public class Programador extends Persona{
    private boolean sabeJava;

    public Programador() {
    }

    public Programador(String nombre){
        super(nombre);
    }

    public Programador(String nombre, String apellido, String dni, boolean sabeJava) {
        super(nombre, apellido, dni);
        this.sabeJava = sabeJava;
    }

    @Override
    public String trabaja() {
        return "Trabaja el programador";
    }

    public boolean isSabeJava() {
        return sabeJava;
    }

    public void setSabeJava(boolean sabeJava) {
        this.sabeJava = sabeJava;
    }
}
