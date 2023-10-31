public class Main {
    public static void main(String[] args) {
        Auto a1 = new Auto("XYZ123", "FIAT", "ROJO", 3500);
        Auto a2 = new Auto("XYZ321", "RENAULT", "AZUL", 2500);
        Auto a3 = new Auto("XYZ456", "VOLKSWAGEN", "VERDE", 4500);
        Auto a4 = new Auto("XYZ654", "CHEVROLET", "NEGRO", 4200);

        System.out.println(a1.precioPromocional());
        System.out.println(a2.precioPromocional());
        System.out.println(a3.precioPromocional());
        System.out.println(a4.precioPromocional());

        System.out.println("");

        Auto.anularDescuento();

        System.out.println(a1.precioPromocional());
        System.out.println(a2.precioPromocional());
        System.out.println(a3.precioPromocional());
        System.out.println(a4.precioPromocional());

        hacerAlgo();

        System.out.println("");

        Contador c1 = new Contador();
        Contador c2 = new Contador();

        System.out.println("Contador: " + Contador.getCount());
    }

    public static void hacerAlgo() {
        System.out.println("ejemplo de static por ejemplo metodo main");
    }
}