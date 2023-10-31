import java.util.*;

public class Main {

    static Scanner key = new Scanner(System.in);

    public static void main(String[] args) {

        //primeraParte();

        //segundaParte();

        terceraParte();

    }

    public static void primeraParte(){
        System.out.print("Inserte el radio de la circunferencia: ");
        double radio = key.nextDouble();

        Circulo circulo = new Circulo(radio);

        System.out.println("El area del circulo es: " + circulo.getArea());
        System.out.println("El perimetro del circulo es: " + circulo.getPerimetro());
    }

    public static void segundaParte(){
        System.out.print("Escribe un string: ");
        String str = key.nextLine();

        System.out.println("La cantidad de caracteres del string es: " + str.length());

        System.out.println("Verificando si tu string tiene la palabra 'hola': " + (str.indexOf("hola") == -1 ? "no esta" : "esta"));

        System.out.println("Convirtiendo tu frase a mayúsculas: " + str.toUpperCase() + ". Ahora en minusculas: " + str.toLowerCase());

        int lastIndexFirstWord = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                lastIndexFirstWord = i;
                break;
            }
        }

        String primeraPalabra = str.substring(0, lastIndexFirstWord);

        System.out.println("La primera palabra de la frase es: " + primeraPalabra);

        System.out.println("Agregando la palabra 'hello': " + str.concat(" hello"));
    }

    public static void terceraParte(){
        Producto producto1 = new Producto("primero", -20.5, "aaa");
        Producto producto2 = new Producto("segundo", 20.51, "bbb");
        Producto producto3 = new Producto("tercero", 25.1, "ccc");

        List<Producto> lista_productos = new ArrayList<>();
        lista_productos.add(producto1);
        lista_productos.add(producto2);
        lista_productos.add(producto3);

        Collections.sort(lista_productos);

        System.out.println("Lista ordenada por precio");
        for (Producto producto : lista_productos) {
            System.out.println(producto.getNombre() + " - Precio: " + producto.getPrecio());
        }

        System.out.println("-----------------------------");

        Filtrable fvendible = new FVendible();

        System.out.println("Lista de productos vendibles usando 'vendible'");
        for (Producto producto : lista_productos) {
            if (fvendible.cumpleFiltro(producto)) System.out.println(producto);
        }

    }

}