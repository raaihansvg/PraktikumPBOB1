/*
NIM             : 24060124140178
Nama            : Raihan Lazuardi
File            : DAOManager.java
Tanggal         : 19 may 2026
Keterangan      : Pengelola DAO
*/

public class DAOManager {
    // atribut
    private PersonDAO personDAO;

    // Method setter 
    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    // Method getter
    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}