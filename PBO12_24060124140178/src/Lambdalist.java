/*
Nama file : Lambdalist.java
Deskripsi : lambda expression dasar untuk menampilkan nama-nama mahasiswa dalam sebuah list
Penulis : Raihan Lazuardi 24060124140178
*/

import java.util.ArrayList;

public class Lambdalist {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // lambda sebagai sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}