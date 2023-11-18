package TugasBesarPerbaikan;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Java Source Code
 */
public class koneksiMySQL {
    public static Connection con(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/daftarbiasa", "root", "");}

        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            System.out.println("Connection failed !\n" + e.getMessage());}
        return con;}
}