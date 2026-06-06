/* Nama File        :   Mahasiswa.java
 * Deskripsi        :   Class Mahasiswa yang berisi atribut dan method
 *                      untuk menyimpan data mahasiswa beserta mata kuliah,
 *                      dosen wali, dan kendaraan
 * Pembuat          :   Raihan Lazuardi - 24060124140178
 * Tanggal          :   10/03/2026
 */

import java.util.ArrayList;

public class Mahasiswa {

    /**************** ATRIBUT ******************/
    private String nim, nama, prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;


    /**************** KONSTRUKTOR ******************/

    // Konstruktor untuk membuat objek mahasiswa
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    // Konstruktor default
    public Mahasiswa() {
        this("", "", "");
    }


    /**************** SELEKTOR*****************/

    // Mengembalikan NIM mahasiswa
    public String getNIM() {
        return this.nim;
    }

    // Mengembalikan nama mahasiswa
    public String getNama() {
        return this.nama;
    }

    // Mengembalikan program studi mahasiswa
    public String getProdi() {
        return this.prodi;
    }


    /*********************************/

    // Mengubah NIM mahasiswa
    public void setNIM(String newNIM) {
        this.nim = newNIM;
    }

    // Mengubah nama mahasiswa
    public void setNama(String newNama) {
        this.nama = newNama;
    }

    // Mengubah program studi mahasiswa
    public void setProdi(String newProdi) {
        this.prodi = newProdi;
    }


    /**************** METHOD TAMBAHAN ******************/

    // Menambahkan mata kuliah ke dalam daftar mata kuliah
    public void addMatkul(MataKuliah newMatkul) {
        listMatkul.add(newMatkul);
    }

    // Menghitung jumlah total SKS yang diambil mahasiswa
    public int getJumlahSKS() {
        int i;
        int jumlahSks = 0;

        for (i = 0; i < listMatkul.size(); i++) {
            jumlahSks += listMatkul.get(i).getSks();
        }

        return jumlahSks;
    }

    // Mengembalikan jumlah mata kuliah yang diambil
    public int getJumlahMatkul() {
        return listMatkul.size();
    }
/* Nama File        :   MMahasiswa.java
 * Deskripsi        :   Class utama untuk menjalankan program
 *                      dan melakukan pengujian terhadap class Mahasiswa
 * Pembuat          :   Raihan Lazuardi - 24060124140178
 * Tanggal          :   10/03/2026
 */

public class MMahasiswa {

    /**********************************/

    public static void main(String[] args) {

        // Membuat objek mata kuliah
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);

        // Membuat objek mahasiswa
        Mahasiswa M1 = new Mahasiswa("032", "Citra", "Informatika");

        // Membuat objek dosen
        Dosen D1 = new Dosen("123", "Andi", "Informatika");

        // Membuat objek kendaraan
        Kendaraan K1 = new Kendaraan("123", "Honda");

        // Mengatur dosen wali
        M1.setDosenWali(D1);

        // Mengatur kendaraan mahasiswa
        M1.setKendaraan(K1);

        // Menambahkan mata kuliah
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);

        // Menampilkan detail mahasiswa
        M1.printDetailMhs();

        // Menampilkan jumlah mata kuliah
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());

        // Menampilkan jumlah SKS
        System.out.println("Jumlah SKS = " + M1.getJumlahSKS());
    }
}
    // Mengatur dosen wali mahasiswa
    public void setDosenWali(Dosen newDosenWali) {
        this.dosenWali = newDosenWali;
    }

    // Mengatur kendaraan mahasiswa
    public void setKendaraan(Kendaraan newKendaraan) {
        this.kendaraan = newKendaraan;
    }


    /**************** OUTPUT ******************/

    // Menampilkan data dasar mahasiswa
    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // Menampilkan detail lengkap mahasiswa
    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Nama Dosen Wali: " + dosenWali.getNama());

        int i;

        for (i = 0; i < listMatkul.size(); i++) {
            System.out.println("Nama Mata Kuliah ke-" + (i + 1) + ": " + listMatkul.get(i).getNama());
        }

        System.out.println("No Plat: " + kendaraan.getNoPlat());
    }
}