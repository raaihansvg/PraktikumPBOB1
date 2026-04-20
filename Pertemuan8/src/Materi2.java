class Util {
    public static <T> void printArray(T[] array) {
        for (T elemen : array) {
            System.out.print(elemen + " ");
        }
        System.out.println();
    }
}

public class Materi2 {
    public static void main(String[] args) {
        Integer[] angka = {1, 2, 3};
        String[] kata = {"A", "B", "C"};

        Util.printArray(angka);
        Util.printArray(kata);
    }
}