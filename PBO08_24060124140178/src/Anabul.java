// Nama File    : Anabul.java
// NIM          : 24060124140178
// Nama         : Raihan Lazuardi
// Tanggal      : 5 Mei 2026

public abstract class Anabul {
    private String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract void gerak();

    public abstract void bersuara();
}