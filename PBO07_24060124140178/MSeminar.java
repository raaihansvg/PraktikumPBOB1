/* 
NIM             : 24060124140178
Nama            : Raihan Lazuardi
File            : MSeminar.java
Tanggal         : 26 April 2026
Keterangan      : Polimorfisme Universal Inclusion(Soal 4(main))
*/
public class MSeminar {
        public static void main(String[] args) {
 
        System.out.println("========== SOAL 4e: Membuat Objek ==========");
 
        Dosen d1 = new Dosen("Dr. Budi Hartono",    "198501012010011001");
        Dosen d2 = new Dosen("Prof. Sari Dewi",    "197803152005012002");
 
        Mahasiswaseminar m1 = new Mahasiswaseminar("Andi Pratama",    "22001001");
        Mahasiswaseminar m2 = new Mahasiswaseminar("Bella Kurnia",    "22001002");
        Mahasiswaseminar m3 = new Mahasiswaseminar("Candra Wijaya",   "22001003");
        Mahasiswaseminar m4 = new Mahasiswaseminar("Dina Maharani",   "22001004");
        Mahasiswaseminar m5 = new Mahasiswaseminar("Eko Saputra",     "22001005");
 
        System.out.println("2 Dosen dan 5 Mahasiswa berhasil dibuat.");
 
       
        Seminar seminar = new Seminar();
 
        System.out.println("\n========== SOAL 4c: countPeserta (sebelum registrasi) ==========");
        System.out.println("Jumlah peserta saat ini: " + seminar.countPeserta());
 
        System.out.println("\n========== SOAL 4f: Registrasi 7 Peserta ==========");
        seminar.registrasi(d1); 
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);
 
        System.out.println("\n========== SOAL 4c: countPeserta (setelah registrasi) ==========");
        System.out.println("Jumlah peserta seminar: " + seminar.countPeserta());
 
        System.out.println("\n========== SOAL 4g: tampilPeserta ==========");
        seminar.tampilPeserta();
 
        System.out.println("\n========== SOAL 4h: countMahasiswa (instanceof) ==========");
        int jmlDosen      = seminar.countPeserta() - seminar.countMahasiswa();
        int jmlMahasiswa  = seminar.countMahasiswa();
        System.out.println("Jumlah peserta dosen    : " + jmlDosen);
        System.out.println("Jumlah peserta mahasiswa: " + jmlMahasiswa);
 
        System.out.println("\n========== SOAL 4i: setWali ==========");
 
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d1);
        m4.setWali(d2);
        m5.setWali(d2);
 
        System.out.println("Dosen wali berhasil diatur untuk semua mahasiswa.");
        System.out.println("\n========== SOAL 4j: tampilDataMahasiswa ==========");
 
        Mahasiswaseminar[] semuaMhs = {m1, m2, m3, m4, m5};
        for (Mahasiswaseminar mhs : semuaMhs) {
            System.out.println("---");
            mhs.tampilDataMahasiswa();
        }
    }
}
