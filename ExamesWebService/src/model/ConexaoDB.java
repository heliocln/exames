package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

abstract class ConexaoDB {
	
	protected Connection connection = null;
	
	public ConexaoDB() {
		  
	    try {  
	        // Load the JDBC driver  
	        String driverName = "org.gjt.mm.mysql.Driver"; // MySQL MM JDBC driver  
	        Class.forName(driverName);  
	       
	        // Create a connection to the database  
	        String serverName = "localhost:3306";  
	        String mydatabase = "exames";  
	        String url = "jdbc:mysql://" + serverName +  "/" + mydatabase; // a JDBC url  
	        String username = "root";  
	        String password = "helio123"; 
	        
	        connection = DriverManager.getConnection(url, username, password);  
	        
	    } catch (ClassNotFoundException e) {  
	        // Could not find the database driver  
	    } catch (SQLException e) {  
	        // Could not connect to the database  
	    } 
	}
}

