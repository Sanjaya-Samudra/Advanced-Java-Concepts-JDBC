package thogakade;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ThogaKade {
    public static void main(String[] args) {
        /*String SQL="Insert into Customer values('C011','Don','Galle',45000)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/ThogaKade", "root", "password");
            Statement stm= connection.createStatement();
            int res=stm.executeUpdate(SQL);
            if(res>0){
                System.out.println("Added Success");
            }            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver s/w not found");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        String SQL="Update Customer set salary=salary*1.15";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/ThogaKade", "root", "password");
            Statement stm= connection.createStatement();
            int res=stm.executeUpdate(SQL);
            if(res>0){
                System.out.println("Update Success");
                System.out.println("No of rows : "+res);
            }            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver s/w not found");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        String SQL="Delete from Customer where name='Danapala'";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/ThogaKade", "root", "password");
            Statement stm= connection.createStatement();
            int res=stm.executeUpdate(SQL);
            if(res>0){
                System.out.println("Update Success");
                System.out.println("No of rows : "+res);
            }            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver s/w not found");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        // Shows Error - Select Queries Cannot Execute Using This Method. 
        
        String SQL="Select * From Customer";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/ThogaKade", "root", "password");
            Statement stm= connection.createStatement();
            int res=stm.executeUpdate(SQL);
            if(res>0){
                System.out.println("Update Success");
                System.out.println("No of rows : "+res);
            }            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver s/w not found");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        // Correct way to execute "Select" Query.
        
        String SQL="Select * From Customer";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/ThogaKade", "root", "password");
            Statement stm= connection.createStatement();
            ResultSet rst = stm.executeQuery(SQL);
            rst.next(); 
            String id=rst.getString("id");
            String name=rst.getString("name"); //2
            String address=rst.getString("address");
            double salary=rst.getDouble("salary");
            System.out.println(id+"\t"+name+"\t"+address+"\t"+salary);
            

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver s/w not found");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }*/
        
        // But above way only display us with a single record only. If we want to see all, need to iterate.
        
        String SQL="Select * From Customer";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/ThogaKade", "root", "password");
            Statement stm= connection.createStatement();
            ResultSet rst = stm.executeQuery(SQL);
            while(rst.next()){ 
                String id=rst.getString("id");
                String name=rst.getString("name"); //2
                String address=rst.getString("address");
                double salary=rst.getDouble("salary");
                System.out.println(id+"\t"+name+"\t"+address+"\t"+salary);
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver s/w not found");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
