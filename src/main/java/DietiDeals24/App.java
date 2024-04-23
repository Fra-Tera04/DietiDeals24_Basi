package DietiDeals24;

import java.sql.SQLException;

import DBConnection.MySqlJDBC;

public class App 
{
    public static void main( String[] args ) throws SQLException {
                
        MySqlJDBC db = new MySqlJDBC();
        db.getAllUtenti();
    }
}
