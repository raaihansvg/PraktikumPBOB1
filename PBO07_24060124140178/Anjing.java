/*
NIM             : 24060124140178
Nama            : Raihan Lazuardi
File            : Anjing.java
Tanggal         : 26 April 2026
Keterangan      : Polimorfisme Universal Inclusion (Soal 3 (Anjing))
*/
public class Anjing extends Anabul {
    /* Konstruktor */
    public Anjing(String Nama){
        super(Nama);
    }

    /* override */
    @Override
    public void Gerak(){
        System.out.println(getNama() + "Anjing bergerak dengan melata");
    }

    @Override
    public void Bersuara(){
        System.out.println(getNama() + "Anjing berbunyi Guk Guk");
    }
    
}
