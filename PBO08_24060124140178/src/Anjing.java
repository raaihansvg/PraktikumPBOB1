// NAMA FILE    : Anjing.java
// NIM          : 24060124140178
// Nama         : Raihan Lazuardi
// Tanggal      : 5 Mei 2026

// 3. Realisasi subkelas Anjing
public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("berlari");
    }

    @Override
    public void bersuara() {
        System.out.println("guk-guk");
    }
}
