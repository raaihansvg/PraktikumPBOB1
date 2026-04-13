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

    public static void main(String[] args){
        Integer bilangan = 10;

        int hasilKuadrat = kuadrat(bilangan);

        System.out.printf("Hasil kuadrat %d adalah %d\n", bilangan, hasilKuadrat);
    }
}