// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// package  com.testjdbc;


import java.util.Scanner;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try (Connection con = GetConnection.getConnection();
                Scanner sc = new Scanner(System.in);) {

            System.out.println("Enter your name: ");
            String name = sc.next();

            System.out.println("Enter your Salary: ");
            int salary = sc.nextInt();

            Statement st = con.createStatement();
            String sql = "insert into employee (name, salary) values ('" + name + "'" + salary + ",')";
            int x = st.executeUpdate(sql);
            if (x != 0)
                System.out.println("Value Inserted...");
            else
                System.out.println("Not Inserted... ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}