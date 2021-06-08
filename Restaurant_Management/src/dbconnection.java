import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class dbconnection {
	
	public static Connection dbconn() {
				
			try {
				Class.forName("org.sqlite.JDBC");
				Connection conn = DriverManager.getConnection("jdbc:sqlite:restaudb.db");
				//JOptionPane.showMessageDialog(null, "Database connected successfully");
				return conn;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		
		
		
		
	}

}
