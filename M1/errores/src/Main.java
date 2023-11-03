public class Main {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[5] = 10;  // Esto lanzará ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.err.println("Excepción atrapada: " + e.getMessage());
        } finally {
            System.out.println("Este bloque se ejecuta siempre.");
        }
    }
}