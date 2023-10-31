import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String[][] mapa = new String[10][10];
    static Scanner key = new Scanner(System.in);

    public static void main(String[] args) {
        arranque();

        while (true) {
            System.out.println("Elige la opción que deseas: ");
            System.out.println("1. Ver asientos");
            System.out.println("2. Escoger asientos");
            System.out.println("3. Salir");

            String opcion = key.nextLine();

            if (opcion.equals("1")) {
                mostrarAsientos();
            } else if (opcion.equals("2")) {
                escogerAsientos();
            } else if (opcion.equals("3")) {
                break;
            } else {
                System.out.println("Opción no valida");
            }

        }

    }

    public static void arranque(){
        for(String[] fila : mapa) {
            Arrays.fill(fila, "L");
        }
    }
    public static void mostrarAsientos(){
        for (String[] fila : mapa) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.println(" ");
    }

    public static void escogerAsientos(){
        try {
            System.out.println("Las filas empiezan de arriba hacia abajo, siendo la primera '1'. La última '10'.");
            System.out.println("Digita el número de la fila: ");
            String fila = key.nextLine();
            int fila_num = Integer.parseInt(fila);

            if (fila_num < 1 || fila_num > 10) {
                System.out.println("Valor inválido");
                escogerAsientos();
            } else {
                System.out.println("Los asientos están numerados del 1 al 10, de izquierda a derecha");
                System.out.println("Digite el número del asiento que quiere en la fila " + fila_num);
                String asiento = key.nextLine();
                int asiento_num = Integer.parseInt(asiento);

                if (asiento_num < 1 || asiento_num > 10) {
                    System.out.println("Valor inválido");
                } else {
                    if (mapa[fila_num - 1][asiento_num - 1].equals("X")) {
                        System.out.println("Este asiento ya está ocupado");
                        escogerAsientos();
                    } else {
                        mapa[fila_num - 1][asiento_num - 1] = "X";
                        System.out.println("Asiento reservado exitosamente");
                    }
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: No ingresaste un número válido. Por favor, ingresa un número entero.");
        }

    }
}