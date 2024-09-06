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
        }
        
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
        
        //Using text field values as input to the database by using inset into SQL statement.
        
        String id = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        double salary = Double.parseDouble(txtSalary.getText());
        String SQL = "INSERT INTO Customer VALUES('"+id+"','"+name+"','"+address+"','"+salary+"')";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/ThogaKade", "root", "2003");
            Statement stm = connection.createStatement();
            int res = stm.executeUpdate(SQL);
            if(res > 0){
                JOptionPane.showMessageDialog(this, "Added succesfully");
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Driver Not Found");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
        //Like these we can see that values in the textFields are taken into variables and they are assigned to
        //variables, to use in SQL statement.
        
        // Alternate method to do above scenario.
        
        String id = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        double salary = Double.parseDouble(txtSalary.getText());
        //String SQL = "INSERT INTO Customer VALUES('"+id+"','"+name+"','"+address+"','"+salary+"')";
        String SQL = "INSERT INTO Customer VALUES(?,?,?,?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/ThogaKade", "root", "2003");
            //Statement stm = connection.createStatement();
            PreparedStatement stm = connection.prepareStatement(SQL);
            stm.setObject(1, id);
            stm.setObject(2, name);
            stm.setObject(3, address);
            stm.setObject(4, salary);
            int res = stm.executeUpdate();
            if(res > 0){
                JOptionPane.showMessageDialog(this, "Added succesfully");
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Driver Not Found");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
        //This method called Prepared Statement method, where we do not mention the content
        //in the SQL, but we are taking a prepared statement, so we can set values to the given
        //prepared statement as we decide, where numbering begin from 1 to expected columns.*/
    }
    
}
