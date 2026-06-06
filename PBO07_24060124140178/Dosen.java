/* 
NIM             : 24060124140178
Nama            : Raihan Lazuardi
File            : Dosen.java
Tanggal         : 26 April 2026
Keterangan      : Polimorfisme Universal Inclusion(Soal 4)
*/
public class Dosen extends Civitasakademika{
    /* Atribut */
    private String NIP;

    /* Konstruktor */
    public Dosen(String Nama, String NIP){
        super(Nama);
        this.NIP = NIP;
    }

    /* Getter */
    public String getNIP(){
        return NIP;
    }

    /* Setter */
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    @Override
    public String getNomor(){
        return NIP;
    }
}
