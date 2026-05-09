// Nama     : Raihan Lazuardi
// NIM      : 24060124140178
// Tanggal  : 09 Mei 2026
// NamaFile : Teman.java
import java.util.*;


public class Teman {
    private int nbElm;
    private List<String> Lnama;

    /* Konstruktor */
    public Teman(){
        Lnama = new ArrayList<>();
        nbElm = 0;
    }

    public int getNbElm(){
        return Lnama.size();
    }

    public String getNama(int index){
        return Lnama.get(index);
    }

    public void setNama(int index, String nama){
        Lnama.set(index,nama);
    }

    public void addNama(String nama){
        Lnama.add(nama);
    }

    public void delNama(String nama){
        Lnama.remove(nama);
    }

    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namaBaru){
        int index = Lnama.indexOf(nama);
        if(index != -1){
            Lnama.set(index,namaBaru);
        }
    }

    public int countNama(String nama){
        int hitung = 0;
        for (String n : Lnama){
            if(n.equals(nama)){
                hitung ++;
            }
        }
        return hitung;
    }

    public void showTeman(){
        System.out.println("Daftar teman teman kuh");
        for(String n : Lnama){
            System.out.println("- " + n);
        }
    }
}