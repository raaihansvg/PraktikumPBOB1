// NIM          : 24060124140178
// Nama         : Raihan Lazuardi
// Tanggal      : 5 Mei 2026
// NAMA FILE    : Burung.java


// 3. Realisasi subkelas Burung
public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("terbang");
    }

    @Override
    public void bersuara() {
        System.out.println("cuit");
    }
}
