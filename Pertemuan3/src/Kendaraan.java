/* Nama File        :   Kendaraan.java
 * Deskripsi        :   Class Kendaraan yang berisi atribut dan method
 *                      untuk menyimpan data kendaraan mahasiswa
 * Pembuat          :   Raihan Lazuardi - 24060124140178
 * Tanggal          :   10/03/2026
 */

public class Kendaraan {

    /**************** ATRIBUT ******************/
    private String noPlat, jenis;


    /**************** KONSTRUKTOR ******************/

    // Konstruktor untuk membuat objek kendaraan
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;

        if (jenis == "motor" || jenis == "mobil" || jenis == "") {
            this.jenis = jenis;
        }
    }

    // Konstruktor default
    public Kendaraan() {
        this("", "");
    }


    /**************** SELEKTOR ******************/

    // Mengembalikan nomor plat kendaraan
    public String getNoPlat() {
        return this.noPlat;
    }

    // Mengembalikan jenis kendaraan
    public String getJenis() {
        return this.jenis;
    }


    /**********************************/

    // Mengubah nomor plat kendaraan
    public void setNoPlat(String newNoPlat) {
        this.noPlat = newNoPlat;
    }

    // Mengubah jenis kendaraan
    public void setJenis(String newJenis) {
        if (newJenis == "motor" || newJenis == "mobil") {
            this.jenis = newJenis;
        }
    }
}