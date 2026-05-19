/*
NIM             : 24060124140178
Nama            : Raihan Lazuardi
File            : MainDao.java
Tanggal         : 19 may 2026
Keterangan      : Main class untuk menguji DAO
*/

public class MainDao {
    public static void main(String[] args) {
        Person person = new Person("Indra");
        DAOManager manager = new DAOManager();
        manager.setPersonDAO(new MySQLPersonDAO());

        try {
            manager.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}