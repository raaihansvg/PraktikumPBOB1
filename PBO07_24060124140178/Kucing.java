/*
NIM             : 24060124140178
Nama            : Raihan Lazuardi
File            : Kucing.java
Tanggal         : 26 April 2026
Keterangan      : Polimorfisme Universal Inclusion (Soal 3 (Kucing))
*/
public class Kucing extends Anabul {
    /* Konstruktor */    
    public Kucing(String Nama){
        super(Nama);
    }

    /* override */
    @Override
    public void Gerak(){
        System.out.println(getNama() + "Kucing bergerak dengan melata");
    }

    @Override
    public void Bersuara(){
        System.out.println(getNama() + "Kucing berbunyi Meong");
    }
}
