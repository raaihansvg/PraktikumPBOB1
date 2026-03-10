/* Nama File        :   MataKuliah.java
 * Deskripsi        :   Class MataKuliah yang berisi atribut dan method
 *                      untuk menyimpan data mata kuliah seperti id,
 *                      nama mata kuliah, dan jumlah SKS
 * Pembuat          :   Raihan Lazuardi - 24060124140178
 * Tanggal          :   10/03/2026
 */

public class MataKuliah {

    /**************** ATRIBUT ******************/
    private String idMatkul, nama;
    private int sks;


    /**************** KONSTRUKTOR ******************/

    // Konstruktor untuk membuat objek mata kuliah
    public MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    // Konstruktor default
    public MataKuliah() {
        this("", "", 0);
    }


    /**************** SELEKTOR ******************/

    // Mengembalikan id mata kuliah
    public String getIdMatkul() {
        return this.idMatkul;
    }

    // Mengembalikan nama mata kuliah
    public String getNama() {
        return this.nama;
    }

    // Mengembalikan jumlah SKS mata kuliah
    public int getSks() {
        return this.sks;
    }


    /********************************/

    // Mengubah id mata kuliah
    public void setIdMatkul(String newIdMatkul) {
        this.idMatkul = newIdMatkul;
    }

    // Mengubah nama mata kuliah
    public void setNama(String newNama) {
        this.nama = newNama;
    }

    // Mengubah jumlah SKS mata kuliah
    public void setSks(int newSks) {
        this.sks = newSks;
    }
}