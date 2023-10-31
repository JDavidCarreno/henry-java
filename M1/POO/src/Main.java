public class Main {
    public static void main(String[] args) {

        AutoDeportivo autoDeportivo1 = new AutoDeportivo();

        Programador programador = new Programador("Juan");


        System.out.println("Auto 1, marca: " + autoDeportivo1.getMarca());
        System.out.println("Auto 2, marca: " + autoDeportivo1.getMarca());
    }
}