class Kalkulator<T extends Number> {
    public double tambah(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}

public class Materi3 {
    public static void main(String[] args) {
        Kalkulator<Integer> k1 = new Kalkulator<>();
        System.out.println(k1.tambah(5, 10));

        Kalkulator<Double> k2 = new Kalkulator<>();
        System.out.println(k2.tambah(2.5, 3.5));
    }
}