
package iibit.student.information.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
    //Varaible key for connection to database
 private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String CONN = "jdbc:mysql://localhost/schoolsystem?serverTimezone=UTC";

    public static Connection getConnection() throws SQLException {
        return  DriverManager.getConnection(CONN, USERNAME, PASSWORD);      
    }
}
