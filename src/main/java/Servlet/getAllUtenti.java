package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import DBConnection.MySqlJDBC;


@WebServlet("/getAllUtenti")
public class getAllUtenti extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private MySqlJDBC db = new MySqlJDBC();
	public ArrayList<String> ElencoUtenti = new ArrayList<String>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = null;
		
		pw = response.getWriter();
		pw.println("Ora stampo tutta la lista degli utenti nel DB:");
		
		try {
			ElencoUtenti = db.getAllUtenti();
			pw.println(ElencoUtenti.toString());
			
			//Vedo_in_Console
			System.out.println(ElencoUtenti.toString());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}


}
