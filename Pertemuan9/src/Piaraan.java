// Nama     : Raihan Lazuardi
// NIM      : 24060124140178
// Tanggal  : 09 Mei 2026
// NamaFile : Piaraan.java
import java.util.*;

public class Piaraan{
    /* Atribut */
    private Queue<Anabul> Lanabul;

    /* Konstruktor */
    public Piaraan(){
        Lanabul = new LinkedList<>();
    }

    public int getNbElm(){
        return Lanabul.size();
    }
    
    public void enqueueAnabul(Anabul anabul){
        Lanabul.offer(anabul);
    }

    public boolean isMember(Anabul anabul){
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul(){
        return Lanabul.peek();
    }

    public Anabul dequeAnabul(){
        return Lanabul.poll();
    }

    public void showAnabul(){
        System.out.println(" == Antrian si Anabul");
        for(Anabul a : Lanabul){
            System.out.println("- " + a.getNama());
        }
    }

    public int countKucing(){
        int hitungKucing = 0;
        for(Anabul a : Lanabul){
            if(a instanceof Kucing){
                hitungKucing ++;
            }
        }
        return hitungKucing;
    }

    public double bobotKucing(){
        double totalBobotMeong = 0;
        for(Anabul a: Lanabul){
            if (a instanceof Kucing){
                totalBobotMeong += ((Kucing)a).getBobot();
            }
        }
        return totalBobotMeong;
    }

    public void showJenisAnabul(){
        System.out.println("--Jenis Anabul--");
        for(Anabul a : Lanabul){
            System.out.println("- " + a.getNama() + "-->" + a.getClass().getName());
        }
    }
}