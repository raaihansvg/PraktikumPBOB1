// Nama File    : Anggora.java
// NIM          : 24060124140178
// Nama         : Raihan Lazuardi
// Tanggal      : 5 Mei 2026

public class Anggora extends Kucing {
    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public String toString() {
        return "Anggora: " + this.getNama() + " (" + this.getBobot() + " kg)";
    }
}
