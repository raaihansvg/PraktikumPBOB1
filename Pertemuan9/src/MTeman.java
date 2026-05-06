public class MTeman {
    public static void main(String[] args) {
        Teman t = new Teman();

        t.addNama("Budi");
        t.addNama("Sari");
        t.addNama("Budi");
        t.addNama("Andi");

        t.showTeman();
        System.out.println("Jumlah: " + t.getNbElm());
        System.out.println("Index 1: " + t.getNama(1));
        System.out.println("Ada Sari? " + t.isMember("Sari"));
        System.out.println("Budi muncul: " + t.countNama("Budi"));

        t.gantiNama("Sari", "Sarah");
        t.delNama("Andi");
        t.showTeman();
    }
}