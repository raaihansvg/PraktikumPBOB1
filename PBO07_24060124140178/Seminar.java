/* 
NIM             : 24060124140178
Nama            : Raihan Lazuardi
File            : Seminar.java
Tanggal         : 26 April 2026
Keterangan      : Polimorfisme Universal Inclusion(Soal 4)
*/
public class Seminar {
    // Soal 4b
    private Civitasakademika[] pesertas; 
    private int banyakpeserta;
    private static final int KAPASITAS = 100;

    // Soal 4b 
    public Seminar() {
        pesertas      = new Civitasakademika[KAPASITAS];
        banyakpeserta = 0; 
    }

    // Soal 4c 
    public int countPeserta() {
        return banyakpeserta;
    }

    // Soal 4d
    public void registrasi(Civitasakademika peserta) {
        if (banyakpeserta < KAPASITAS) {
            pesertas[banyakpeserta] = peserta;
            banyakpeserta++;
            System.out.println("[Registrasi] " + peserta.getNama() + " berhasil terdaftar. (peserta ke-" + banyakpeserta + ")");
        } else {
            System.out.println("[Registrasi] Kapasitas penuh! "
                    + peserta.getNama() + " tidak bisa mendaftar.");
        }
    }

    // Soal 4g
    public void tampilPeserta() {
        System.out.println("========== DAFTAR PESERTA SEMINAR ==========");
        System.out.printf("%-5s %-20s %-20s %-10s%n", "No", "Nomor (NIP/NIM)", "Nama", "Jenis");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < banyakpeserta; i++) {
            String jenis = (pesertas[i] instanceof Dosen) ? "Dosen" : "Mahasiswa";
            System.out.printf("%-5d %-20s %-20s %-10s%n",
                    (i + 1),
                    pesertas[i].getNomor(),
                    pesertas[i].getNama(),
                    jenis);
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Total peserta: " + banyakpeserta);
    }

    // Soal 4h 
    public int countMahasiswa() {
        int jumlah = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswaseminar) {
                jumlah++;
            }
        }
        return jumlah;
    }
}