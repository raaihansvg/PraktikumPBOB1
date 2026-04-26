/*
NIM             : 24060124140178
Nama            : Raihan Lazuardi
File            : MAnabul.java
Tanggal         : 26 April 2026
Keterangan      : Polimorfisme Universal Inclusion (Main Soal 3)
*/
public class MAnabul {
        public static void main(String[] args) {

        Kucing  k1 = new Kucing("Milo");
        Kucing  k2 = new Kucing("Luna");
        Anjing  a1 = new Anjing("Rocky");
        Anjing  a2 = new Anjing("Buddy");
        Burung  b1 = new Burung("Kiwi");
        Burung  b2 = new Burung("Tweety");
 
        System.out.println("========== Simulasi Per Hewan ==========");
 
        System.out.println("\n Kucing ");
        k1.Gerak();    k1.Bersuara();
        k2.Gerak();    k2.Bersuara();
 
        System.out.println("\n Anjing ");
        a1.Gerak();    a1.Bersuara();
        a2.Gerak();    a2.Bersuara();
 
        System.out.println("\n Burung ");
        b1.Gerak();    b1.Bersuara();
        b2.Gerak();    b2.Bersuara();
 
   
        System.out.println("\n========== SIMULASI POLIMORFIK (array Anabul[]) ==========");
        System.out.println("Semua anabul dipanggil lewat referensi Anabul — method menyesuaikan otomatis:\n");
 
        Anabul[] semuaAnabul = { k1, k2, a1, a2, b1, b2 };
 
        for (Anabul hewan : semuaAnabul) {
            hewan.Gerak();      
            hewan.Bersuara();  
            System.out.println();
        }
    }
}
