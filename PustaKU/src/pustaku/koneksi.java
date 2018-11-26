/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pustaku;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class koneksi {
private static Connection con;
    public static Connection getConnection() throws SQLException{
      if (con == null) {
            // panggil Driver MySQL
          new Driver();
            // buat koneksi
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perpustakaandb", "root", "");
        }
        return con;
    }
}
