// Nama     : Raihan Lazuardi
// NIM      : 24060124140178
// Tanggal  : 09 Mei 2026
// NamaFile : MPiaraan.java

public class MPiaraan {
    public static void main(String[] args) {

        /* Buat objek piaraan */
        Piaraan klinik = new Piaraan();

        /* Buat beberapa jenis hewan */
        Kucing k1 = new Kucing("Mochi", 3.5);
        Kucing k2 = new Kucing("Oreo", 4.2);
        Kucing k3 = new Kucing("Gembul", 5.0);

        /* Daftar ke antrian */
        klinik.enqueueAnabul(k1);
        klinik.enqueueAnabul(k2);
        klinik.enqueueAnabul(k3);

        /* Tampilkan semua nama anabul yg ada di antrian*/
        klinik.showAnabul();

        /* Jumlah hewat yang ada di antrian */
        System.out.println("Jumlah anabul  : " + klinik.getNbElm());

        /* mengecek apakah ada objek di antrian */
        System.out.println("Ada Mochi?     : " + klinik.isMember(k1));
        System.out.println("Ada Oreo?      : " + klinik.isMember(k2));

        /* Liat anabul pertama */
        System.out.println("Anabul pertama : " + klinik.getAnabul().getNama());

        /* hitung ada brp kucing */
        System.out.println("Jumlah kucing  : " + klinik.countKucing());

        /* total bobot semua kucing */
        System.out.println("Total bobot kucing: " + klinik.bobotKucing() + " kg");

        /* tampilkan nama + jenis kelas */
        klinik.showJenisAnabul();

        /* keluarkan anabul pertama dari antrian */
        Anabul dilayani = klinik.dequeAnabul();
        System.out.println("\nSedang dilayani: " + dilayani.getNama());
        dilayani.bersuara();
        dilayani.gerak();

        /* sisa antrian */
        System.out.println("\nSisa antrian setelah dilayani:");
        klinik.showAnabul();
        System.out.println("Jumlah tersisa : " + klinik.getNbElm());
    }
}