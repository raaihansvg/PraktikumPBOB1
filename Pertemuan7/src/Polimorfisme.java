//Polimorfisme
//Pertemuan 8 di kelas dan Pertemuan 7 di pratikum
//13 April 2026 (kelas)


/* POLIMORFISME COERCION */
/* Sebuah metode yang dimana bekerja untuk mengubah(memaksa) sebuah tipe data lama ke tipe data baru */
/* CONTOH CODE */

public class Polimorfisme{
    public static int kuadrat(int bilangan){
        return bilangan * bilangan;
    }

    public static double bagi(double a, double b){
        return a/b;
    }

    public static double tambahKoma(double x, double y){
        return x + y;
    }


    public static void main(String[] args){
        /* ------------------------------------------------------------------------- */
        /* ---------------------------FUNCTION 1------------------------------------ */
        /* ------------------------------------------------------------------------- */
        Integer bilangan = 10;

        int hasilKuadrat = kuadrat(bilangan);

        System.out.printf("Hasil kuadrat %d adalah %d\n", bilangan, hasilKuadrat);
        /* ------------------------------------------------------------------------ */
        /* ---------------------------FUNCTION 2---------------------------------- */
        /* ------------------------------------------------------------------------ */
        int x = 10;
        int y = 5;

        double hasil = bagi(x,y);

        System.out.printf("Hasil bagi %d dengan %d adalah %f\n", x,y,hasil);
        /* -------------------------------------------------------------------------- */
        /* ---------------------------FUNCTION 3------------------------------------ */
        /* -------------------------------------------------------------------------- */
        int b = 4;
        int c = 7;

        double hasilTambahKoma = tambahKoma(b, c);
        System.out.printf("Hasil tambah koma dari %d dan %d adalah %f\n", b,c,hasilTambahKoma);
          /* -------------------------------------------------------------------------- */
        /* ---------------------------FUNCTION 4------------------------------------ */
        /* -------------------------------------------------------------------------- */
        char huruf = 'A';
        int angka = huruf;
        System.out.println("ASCII: " + angka);
    }
}