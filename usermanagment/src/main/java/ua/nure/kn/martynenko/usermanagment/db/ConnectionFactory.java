package ua.nure.kn.martynenko.usermanagment.db;

import java.sql.Connection;

public interface ConnectionFactory {
    Connection createConnection() throws DatabaseException;
}
