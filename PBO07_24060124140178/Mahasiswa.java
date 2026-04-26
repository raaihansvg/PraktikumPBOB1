/*
NIM             : 24060124140178
Nama            : Raihan Lazuardi
File            : Mahasiswa.java
Tanggal         : 26 April 2026
Keterangan      : Polimorfisme Adhoc Overloading (Soal 2a - 2e)
*/
public class Mahasiswa {
    /* Atribut */
    private String NIM;
    private String Nama;
    private String programStudi;

    /* Soal 2c */
    public Mahasiswa(){
        this.NIM = "-999";
        this.Nama = "n/a";
        this.programStudi = "n/a";
    }

    /* Soal 2d */
    public Mahasiswa(String NIM, String Nama, String programStudi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.programStudi = programStudi;
    }

    /* Soal 2e */
    public Mahasiswa(Mahasiswa lain){
        this.NIM = lain.NIM;
        this.Nama = lain.Nama;
        this.programStudi = lain.programStudi;
    }

    /* Soal 2a */
    public void setProgramStudi(){
        this.programStudi = "Kosong";
    }

    public void setProgramStudi(String programStudi){
        this.programStudi = programStudi;
    }

    public void setProgramStudi(Mahasiswa lain){
        this.programStudi = lain.programStudi;
    }

    /* SETTER dan GETTER */

    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public String getNIM(){
        return NIM;
    }

    public String getNama(){
        return Nama;
    }

    public String getProgramStudi(){
        return programStudi;
    }

    /* Display */
    public void tampil(){
        System.out.println("  NIM          : " + NIM);
        System.out.println("  Nama         : " + Nama);
        System.out.println("  Program Studi: " + programStudi);
    }
}
