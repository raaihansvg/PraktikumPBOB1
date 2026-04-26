/* Nama File        :   Titik.java
 * Deskripsi        :   berisi atribut dan method dalam class Titik
 * Pembuat          :   Raihan Lazuardi  - 24060124140178
 * Tanggal          :   2/3/2024
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // Membuat objek titik T1 (0,0)
        Titik T2 = new Titik(3, 5); // Membuat objek titik T2 (3,5)

        T1.setAbsis(3); // Mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); // Mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); // Mencetak koordinat T1 ke layar

        T1.geser(3, 4); // Menggeser T1 sejauh (3,4)
        T1.printTitik(); // Menampilkan koordinat T1 setelah digeser
    }
}