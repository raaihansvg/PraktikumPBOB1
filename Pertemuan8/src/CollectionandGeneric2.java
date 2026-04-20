class Util{
    public static <T> void printArray(T[] array){
        for (T elemen : array){
            System.out.println(elemen + " ");
        }
        System.out.println();
    }
}

public class CollectionandGeneric2{
    public static void main(String[] args){
        Integer[] angka = {1,2,3};
        String[] huruf = {"A", "B", "C"};

        Util.printArray(angka);
        Util.printArray(huruf);
    }
}