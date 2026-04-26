/* 
NIM             : 24060124140178
Nama            : Raihan Lazuardi
File            : Mahasiswaseminar.java
Tanggal         : 26 April 2026
Keterangan      : Polimorfisme Universal Inclusion(Soal 4)
*/
public class Mahasiswaseminar extends Civitasakademika {
    /* Atribut */
    private String NIM;
    private Dosen Dosenwali;

    /* Konstruktor */

    public Mahasiswaseminar(String Nama, String NIM){
        super(Nama);
        this.NIM = NIM;
        this.Dosenwali  = null;
    }

    /* Getter */
    public String getNIM(){
        return NIM;
    }

    public Dosen getDosenWali(){
        return Dosenwali;
    }

    /* Setter */
    public void  setNIM(String NIM){
        this.NIM = NIM;
    }

    @Override 
    public String getNomor(){
        return NIM;
    }

    /* Soal 4i */
    public void setWali(Dosen dosen){
        this.Dosenwali = dosen;
    }

    /* Soal 4j */
    public void tampilDataMahasiswa(){
        System.out.println(" NIM    : " + NIM);
        System.out.println(" Nama   : " + getNama());

        if(Dosenwali != null){
            System.out.println(" Dosen Wali : " + Dosenwali.getNama());
        }else{
            System.out.println("Dosen Wali : (Belum ada)");
        }
    }



}
