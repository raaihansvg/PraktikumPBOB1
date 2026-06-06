/*
NIM             : 24060124140178
Nama            : Raihan Lazuardi
File            : Person.java
Tanggal         : 19 may 2026
Keterangan      : person database model
*/

public class Person {
    // Atribut
    private int id;
    private String name;

    // Konstruktor
    public Person(String n) {
        this.name = n;
    }  

    // Konstruktor Person 
    public Person (int id, String n) {
        this.id = id;
        this.name = n;
    }   

    //  getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}