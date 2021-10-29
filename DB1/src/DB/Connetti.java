package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connetti {

	public static void main(String[] args) {
		Connection connessione = null;
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/scuola";
		String user="root";
		String pw="";
		try {
			Class.forName(driver);
			connessione=DriverManager.getConnection(url, user, pw);
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("DATABASE OFF");
		}

	}

}
