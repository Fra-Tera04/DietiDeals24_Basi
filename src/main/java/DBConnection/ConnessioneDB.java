package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnessioneDB {

	private static ConnessioneDB istanza;
    private Connection connessione = null;
    private final String USERNAME = "root";
    private final String PASSWORD = "root";
    private String url = "jdbc:mysql://localhost:3306/auctionlinedb";
    
    private ConnessioneDB() throws SQLException{
    	
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		connessione = DriverManager.getConnection(url, USERNAME, PASSWORD);   		
    	}
    	catch(ClassNotFoundException e){
    		System.out.println("Creazione di una Connessione al database fallita: \n"+ e.getMessage());
    	}
    }

    public Connection getConnessione() {
    	return connessione;
    }
    
    public static ConnessioneDB getIstanza() throws SQLException {
    	if(istanza == null) {
    		istanza = new ConnessioneDB();
    	}
    	else if(istanza.getConnessione().isClosed()){
    		istanza = new ConnessioneDB();
    		
    	}
    	return istanza;
    }
    
}
