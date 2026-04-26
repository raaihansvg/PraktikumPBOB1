/*
NIM             : 24060124140178
Nama            : Raihan Lazuardi
File            : Burung.java
Tanggal         : 26 April 2026
Keterangan      : Polimorfisme Universal Inclusion (Soal 3 (Burung))
*/
public class Burung extends Anabul{
    /* Konstruktor*/
    public Burung(String Nama){
        super(Nama);
    }

    /* override */
    @Override
    public void Gerak(){
        System.out.println(getNama() + "Burung bergerak dengan terbang");
    }

    @Override
    public void Bersuara(){
        System.out.println(getNama() + "Burung berbunyi Cuit");
    }
}
