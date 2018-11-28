package code;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class writeSQL {

	private final String url = "jdbc:sqlite:C:\\Users\\Gytis\\";


	public writeSQL(String fileName) {
		 
	    try (Connection conn = DriverManager.getConnection(url+fileName+".db")) {
	    	System.out.println("labas");
	        if (conn != null) {
	            DatabaseMetaData meta = conn.getMetaData();
	            System.out.println("The driver name is " + meta.getDriverName());
	            System.out.println("A new database has been created.");
	        }

	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }
	}
	

	}


