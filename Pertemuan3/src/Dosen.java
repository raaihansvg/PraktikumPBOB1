/* Nama File        :   Dosen.java
 * Deskripsi        :   Class Dosen yang berisi atribut dan method untuk menyimpan
 *                      data dosen seperti NIP, nama, dan program studi
 * Pembuat          :   Raihan Lazuardi - 24060124140178
 * Tanggal          :   10/03/2026
 */

public class Dosen {

    /**************** ATRIBUT ******************/
    private String nip, nama, prodi;


    /**************** KONSTRUKTOR ******************/

    // Konstruktor untuk membuat objek dosen dengan NIP, nama, dan prodi
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Konstruktor default
    public Dosen() {
        this("", "", "");
    }


    /**************** SELEKTOR ******************/

    // Mengembalikan nilai NIP dosen
    public String getNIP() {
        return this.nip;
    }

    // Mengembalikan nama dosen
    public String getNama() {
        return this.nama;
    }

    // Mengembalikan program studi dosen
    public String getProdi() {
        return this.prodi;
    }
    /**********************************/
    // Mengubah nilai NIP dosen
    public void setNIP(String newNIP) {
        this.nip = newNIP;
    }

    // Mengubah nama dosen
    public void setNama(String newNama) {
        this.nama = newNama;
    }

    // Mengubah program studi dosen
    public void setProdi(String newProdi) {
        this.prodi = newProdi;
    }
}