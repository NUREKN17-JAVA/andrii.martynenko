package Main.java.ua.nure.itkn179martynenko.userManagment.db;

import java.sql.Connection;

public interface ConnectionFactory {
	Connection createConnection() throws DatabaseExeption;
}
