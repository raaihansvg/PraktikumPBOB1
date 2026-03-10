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