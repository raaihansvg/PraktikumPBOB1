/*
NIM             : 24060124140178
Nama            : Raihan Lazuardi
File            : MySQLPersonDAO.java
Tanggal         : 19 may 2026
Keterangan      : Implementasi personDAO untuk mysql databse
*/

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person p) throws Exception {
        // nama
        String name = p.getName();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/pbo?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "300605");
        // mySQL query
        String query = "INSERT INTO person (name) VALUES ('"+name+"')";
        Statement s = con.createStatement();
        s.executeUpdate(query);
        // tutup koneksi
        s.close();
        con.close();
    }
}