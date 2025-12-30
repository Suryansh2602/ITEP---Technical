/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;
import java.util.Scanner;
import java.sql.*;

/**
 *
 * @author Suryansh
 */
public class Jdbc {
    
    public static void insert(){
            try(Connection con = GetConnection.getConnection();
                Scanner sc = new Scanner(System.in);){
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            
            System.out.println("Enter salary: ");
            int salary = sc.nextInt();
            
            Statement st = con.createStatement();
            String sql = "INSERT INTO employee (name, salary) VALUES ('" + name.replace("'", "''") + "', " + salary + ")";
            int x = st.executeUpdate(sql);
            if(x!=0)
                System.out.println("Record inserted....");
            else
                System.out.println("not inserted!...");
            
        } catch (Exception ex) {
            System.getLogger(jdbc.Jdbc.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    
    }
    
    public static void delete(){
         try(Connection con = GetConnection.getConnection();
                Scanner sc = new Scanner(System.in);){
            System.out.println("Enter name to Remove: ");
            String name = sc.nextLine();
            
   
            Statement st = con.createStatement();
            String sql = "DELETE FROM employee WHERE name = '" + name.replace("'", "''") + "';";
            int x = st.executeUpdate(sql);
            if(x!=0)
                System.out.println("Record Deleted....");

            
        } catch (Exception ex) {
            System.getLogger(jdbc.Jdbc.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    public static void seeDetails(){
         try(Connection con = GetConnection.getConnection();
                Scanner sc = new Scanner(System.in);){
            System.out.println("Enter name to see details: ");
            String name = sc.nextLine();
            
   
            Statement st = con.createStatement();
            String sql = "SELECT * FROM employee WHERE name = '" + name.replace("'", "''") + "';";
            int x = st.executeUpdate(sql);
            if(x!=0)
                System.out.println("Record Fetched....");

            
        } catch (Exception ex) {
            System.getLogger(jdbc.Jdbc.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    public static void show(){
         Scanner sc = new Scanner(System.in);
    try (Connection con = GetConnection.getConnection();
         Statement st = con.createStatement()) {
        
        System.out.print("Enter name to see details: ");
        String name = sc.nextLine();  // Basic escape for quotes
        
        String sql = "SELECT * FROM employee WHERE name = '" + name + "';";
        
        try (ResultSet rs = st.executeQuery(sql)) {
            boolean found = false;
            while (rs.next()) {
                found = true;
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Salary: " + rs.getInt("salary"));
                System.out.println("---");
            }
            if (!found) {
                System.out.println("No employee found with name: " + name);
            } else {
                System.out.println("Record fetched.");
            }
        }
    } catch (SQLException e) {
        System.err.println("Error: " + e.getMessage());
    }
    sc.close();
    }

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Press  Enter a value: ");
   System.out.println("Press 1 to insert: ");
   System.out.println("Enter 2 to delete: ");
   System.out.println("Enter 3 to see detail: ");
   System.out.println("Enter 4 to see table: ");
   System.out.println("Enter 0 to quit: ");
        int x = sc.nextInt();
//       while(x!=0){
        switch(x){
            case 1 -> insert();
            case 2 -> delete();
            case 3 -> seeDetails();
            case 4 -> show();
            default -> System.out.println("Something went wrong!");
        }
       
//       }
                
   
   
   
    }   
}
