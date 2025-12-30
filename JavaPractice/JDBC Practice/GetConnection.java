// package  com.testjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
    private static Connection con;

    public static Connection getConnection() {

        try {
          Class.forName("com.mysql.cj.jdbc.Driver");  // Correct lowercase 'mysql'
    con = DriverManager.getConnection("jdbc:mysql://localhost:3307/empdb", "root", "root");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
