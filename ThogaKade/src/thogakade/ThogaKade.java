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
        }*/
        
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

    }
    
}
