package thogakade;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ThogaKade {
    public static void main(String[] args) {
        String SQL="Insert into Customer values('C011','Don','Galle',45000)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/ThogaKade", "root", "2003");
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
   
    }
    
}
