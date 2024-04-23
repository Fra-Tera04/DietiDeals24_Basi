package DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MySqlJDBC {

	private ConnessioneDB connessioneDB;
	private Connection connection;
	private PreparedStatement ps;
	public ArrayList<String> ElencoUtenti = new ArrayList<String>();
	
	public ArrayList<String> getAllUtenti() throws SQLException {
		
		try {
			connessioneDB = ConnessioneDB.getIstanza();
			connection = connessioneDB.getConnessione();
			ps = connection.prepareStatement("SELECT * FROM Utente");
			ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			//Come_Prova_mi_faccio_passare_solo_i_nomi_non_tutto_oggetto_utente
			
			ElencoUtenti.add(rs.getString(1));
			
		}
		connection.close();
		} catch(SQLException e) {
			System.out.println("Error: " + e);
		}
		
	return ElencoUtenti;
	}
}
