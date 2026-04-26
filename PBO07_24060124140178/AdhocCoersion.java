/*
NIM             : 24060124140178
Nama            : Raihan Lazuardi
File            : AdhocCoersion.java
Tanggal         : 26 April 2026
Keterangan      : Polimorfisme AdhocCoersion (Soal 1a - 1f)
*/
package PBO07_24060124140178;

public class AdhocCoersion{
    public static void main(String[] args){
        /* Soal 1a */
        System.out.prinln("== Soal 1a ==");

        int nilaiInt = 65;
        System.out.println("Nilai Integer : " + nilaiInt);

        char nilaiChar = (char)nilaiInt;
        System.out.println("Nilai int 65 sebagai karakter menjadi : " + nilaiChar);

        double nilaiDouble = nilaiInt;
        System.out.println("Nilai int 65 sebagai float menjadi : " + nilaiDouble);


        /* Soal 1b */
        System.out.println("== Soal 1b ==");

        double nilaiReal = 98.76;
        System.out.println("Nilai real awal adalah = " + nilaiReal);

        int ubahInt = (int)nilaiReal;
        System.out.println("Nilai real 98.76 diubah menjadi int = " + ubahInt);

        /* Soal 1c */
        System.out.println("== Soal 1c ==");
        
        String X = "1234";
        String Y = "5678";

        String hasilKonkat = X + Y;
        Integer hasilJumlahString = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("X = " + X + ", Y = " + Y);
        System.out.println("S (konkatenasi)      : " + hasilKonkat);
        System.out.println("Z (penjumlahan angka): " + hasilJumlahString);

    }
}
