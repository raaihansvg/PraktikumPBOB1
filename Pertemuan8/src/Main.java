class Box<T> {
    private T isi;

    public void setIsi(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<String> boxString = new Box<>();
        boxString.setIsi("Halo");
        System.out.println(boxString.getIsi());

        Box<Integer> boxInt = new Box<>();
        boxInt.setIsi(10);
        System.out.println(boxInt.getIsi());
    }
}