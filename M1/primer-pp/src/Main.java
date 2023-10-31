import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner key = new Scanner(System.in);
    static List<Libro> stock_libros = new ArrayList<>();

    public static void main(String[] args) {

        Libro libro1 = new Libro("uno", 25, 1);
        Libro libro2 = new Libro("dos", 20, 2);
        Libro libro3 = new Libro("tres", 18, 2);

        stock_libros.add(libro1);
        stock_libros.add(libro2);
        stock_libros.add(libro3);

        System.out.println(stock_libros);

        pedirLibro();

        System.out.println(stock_libros);

    }

    public static void pedirLibro() {
        System.out.println("Que libro desea encontrar? escriba el nombre");
        String searchedBook = key.nextLine();

        int count = 0;
        for (Libro libro : stock_libros) {
            if (libro.getTitulo().equals(searchedBook)) {
                count++;
                if (libro.getStock() > 0) {
                    Pedido pedido = new Pedido(libro.getTitulo(), libro.getStock() - 1);
                    libro.setStock(libro.getStock() - 1);
                    System.out.println("Pedido realizado con exito");
                    System.out.println(pedido);
                } else {
                    System.out.println("No hay stock de este libro");
                }
                break;
            }
        }
        if (count == 0) {
            System.out.println("No tenemos ese libro");
        }
    }
}