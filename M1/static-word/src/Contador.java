public class Contador {
    private static int count = 0;

    public Contador() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
