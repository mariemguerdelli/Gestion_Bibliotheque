package biblio;
import java.sql.*;
import javax.swing.*;

public class Connect {
	public static Connection ConnectDb() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
  			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblio","root","");
  			JOptionPane.showMessageDialog(null,"Database Connected");
  			return conn;
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(null, "lala");
			return null;
			
		}
	}
}
