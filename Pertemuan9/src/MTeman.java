// Nama     : Raihan Lazuardi
// NIM      : 24060124140178
// Tanggal  : 09 Mei 2026
// NamaFile : MTeman.java
public class MTeman {
    public static void main(String[] args) {
        Teman t = new Teman();
        /* Tambahkan nama teman */
        t.addNama("Budi");
        t.addNama("Sari");
        t.addNama("Budi");
        t.addNama("Andi");
        /* Melihat teman */
        t.showTeman();
        System.out.println("Jumlah: " + t.getNbElm());
        System.out.println("Index 1: " + t.getNama(1));
        System.out.println("Ada Sari? " + t.isMember("Sari"));
        System.out.println("Budi muncul: " + t.countNama("Budi"));
        /* Ganti nama lama dengan nama baru */
        t.gantiNama("Sari", "Sarah");
        /* Hapus nama */
        t.delNama("Andi");
        t.showTeman();
    }
}