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


    public static void main(String[] args){
        Integer bilangan = 10;

        int hasilKuadrat = kuadrat(bilangan);

        System.out.printf("Hasil kuadrat %d adalah %d\n", bilangan, hasilKuadrat);

        int x = 10;
        int y = 5;

        double hasil = bagi(x,y);

        System.out.printf("Hasil bagi %d dengan %d adalah %f\n", x,y,hasil);
    }
}