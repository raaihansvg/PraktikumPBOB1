// Nama File    : Kembangtelon.java
// NIM          : 24060124140178
// Nama         : Raihan Lazuardi
// Tanggal      : 5 Mei 2026

public class Kembangtelon extends Kucing {
    public Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public String toString() {
        return "Kembangtelon: " + this.getNama() + " (" + this.getBobot() + " kg)";
    }
}
