/**
 * File : Main.java
 * Deskripsi : Class utama/main untuk menjalankan semua class
 * Nama : Raihan Lazuardi
 * Tanggal : 15 Maret 2026
 */

public class Main {
    public static void main(String[] args) {
        //Persegi
        Persegi p = new Persegi(5, "Merah", "Hitam");
        System.out.println("\n--- PERSEGI ---");
        p.printInfo();
        System.out.println("Diagonal: " + p.getDiagonal());

        //Lingkaran
        Lingkaran l = new Lingkaran(10, "Biru", "Putih");
        System.out.println("\n--- LINGKARAN ---");
        l.printInfo();

        //Counter
        System.out.println("\n========================================");
        BangunDatar.printCounterBangunDatar();
        System.out.println("========================================");

        DosenTetap dosenTetap = new DosenTetap("9545647548", "Andi",
                "1990-05-05", "2015-01-01", 5000000, "Sains dan Matematika",
                "78647324");

        dosenTetap.printInfo();
    }
}