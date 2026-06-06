/*
NIM             : 24060124140178
Nama            : Raihan Lazuardi
File            : Anabul.java
Tanggal         : 26 April 2026
Keterangan      : Polimorfisme Universal Inclusion (Soal 3 (Anabul))
*/
public class Anabul{
    /* Atribut */
    private String Nama;

    /* Konstruktor */
    public Anabul(String Nama){
        this.Nama = Nama;
    }

    /*  Getter */
    public String getNama(){
        return Nama;
    }

    /* Setter */
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    /* method override */
    public void Gerak(){
        System.out.println(Nama + " bergerak");
    }

    public void Bersuara(){
        System.out.println(Nama + " bersuara");
    }
}