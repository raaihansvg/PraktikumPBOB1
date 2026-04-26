/*
NIM             : 24060124140178
Nama            : Raihan Lazuardi
File            : MMahasiswa.java
Tanggal         : 26 April 2026
Keterangan      : Polimorfisme Adhoc Overloading (Main Soal 2)
*/
public class MMahasiswa {
        public static void main(String[] args) {
 
        // =========================================================
        // SOAL 2c — Konstruktor tanpa parameter (default)
        // =========================================================
        System.out.println("========== SOAL 2c: Konstruktor Default ==========");
 
        Mahasiswa mhsDefault = new Mahasiswa();
        System.out.println("Objek dibuat dengan konstruktor tanpa parameter:");
        mhsDefault.tampil();
 
        // =========================================================
        // SOAL 2d — Konstruktor dengan 3 parameter
        // =========================================================
        System.out.println("\n========== SOAL 2d: Konstruktor 3 Parameter ==========");
 
        Mahasiswa mhs1 = new Mahasiswa("12345001", "Raihan Lazuardi", "Masak MBG");
        Mahasiswa mhs2 = new Mahasiswa("12345002", "Raihan Jefri Nichol Raffi Ahmad", "Sistem Informasi Nuklir");
 
        System.out.println("Objek mhs1:");
        mhs1.tampil();
        System.out.println("Objek mhs2:");
        mhs2.tampil();
 
        // =========================================================
        // SOAL 2e — Konstruktor copy (kloning objek)
        // =========================================================
        System.out.println("\n========== SOAL 2e: Konstruktor Copy (Kloning) ==========");
 
        Mahasiswa mhsKloning = new Mahasiswa(mhs1);  // kloning dari mhs1
        System.out.println("mhsKloning (hasil kloning dari mhs1):");
        mhsKloning.tampil();
 
        // Pembuktian objek beda bukan kloning
        mhsKloning.setNama("Budi Santoso KLON");
        System.out.println("\nSetelah nama kloning diubah:");
        System.out.println("mhs1 (asli)     : " + mhs1.getNama());
        System.out.println("mhsKloning      : " + mhsKloning.getNama());
        // JIka benar mhs1 tidak ikut berubah
 
        // =========================================================
        // SOAL 2b — Aplikasi semua varian setProgramStudi
        // =========================================================
        System.out.println("\n========== SOAL 2b: Semua Varian setProgramStudi ==========");
 
        Mahasiswa objA = new Mahasiswa("22001", "Yono",  "Teknik Elektro");
        Mahasiswa objB = new Mahasiswa("22002", "Alvin The Goat", "Matematika");
        Mahasiswa objC = new Mahasiswa("22003", "Michael Jordi", "Fisika");
 
        System.out.println("=== Sebelum setProgramStudi ===");
        System.out.println("objA prodi: " + objA.getProgramStudi());
        System.out.println("objB prodi: " + objB.getProgramStudi());
        System.out.println("objC prodi: " + objC.getProgramStudi());
 
        objA.setProgramStudi();
        System.out.println("\n[Varian 1] objA.setProgramStudi() -> tanpa parameter");
        System.out.println("objA prodi sekarang: " + objA.getProgramStudi());
 
        objB.setProgramStudi("Teknik Informatika");
        System.out.println("\n[Varian 2] objB.setProgramStudi(\"Teknik Informatika\") → satu String");
        System.out.println("objB prodi sekarang: " + objB.getProgramStudi());

        objC.setProgramStudi(objB);
        System.out.println("\n[Varian 3] objC.setProgramStudi(objB) ->  salin dari objek lain");
        System.out.println("objC prodi sekarang: " + objC.getProgramStudi());
        System.out.println("(sama dengan objB: " + objB.getProgramStudi() + ")");
 
        System.out.println("\n=== Data akhir semua objek ===");
        System.out.println("objA:"); objA.tampil();
        System.out.println("objB:"); objB.tampil();
        System.out.println("objC:"); objC.tampil();
    }

}
