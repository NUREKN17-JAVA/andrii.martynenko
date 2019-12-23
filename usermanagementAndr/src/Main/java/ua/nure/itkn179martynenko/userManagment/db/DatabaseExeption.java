package Main.java.ua.nure.itkn179martynenko.userManagment.db;

import java.sql.SQLException;

public class DatabaseExeption extends Exception {
	private static final long serialVersionUID = 5899773385953212700L;

	public DatabaseExeption(SQLException e) {
		super(e);
	}

	public DatabaseExeption(String string) {
		super(string);
	}	
}
