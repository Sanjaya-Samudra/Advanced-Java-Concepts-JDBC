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

//----------------------------------------------------------------------------------------------------------------------------------
        
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

//----------------------------------------------------------------------------------------------------------------------------------

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

//----------------------------------------------------------------------------------------------------------------------------------
        
        // Shows Error - Select Queries Cannot Execute Using below Method. 
        
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

//----------------------------------------------------------------------------------------------------------------------------------

        // Correct way to execute "Select" Query.
        
        String SQL="Select * From Customer";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/ThogaKade", "root", "password");
            Statement stm= connection.createStatement();
            ResultSet rst = stm.executeQuery(SQL); // Instead of executeUpdate(SQL), this case we use executeQuery(SQL).
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

//----------------------------------------------------------------------------------------------------------------------------------
        
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

//----------------------------------------------------------------------------------------------------------------------------------
        
        //Using text field values as input to the database by using inset into SQL statement.
        
        String id = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        double salary = Double.parseDouble(txtSalary.getText());
        String SQL = "INSERT INTO Customer VALUES('"+id+"','"+name+"','"+address+"','"+salary+"')";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/ThogaKade", "root", "password");
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

//----------------------------------------------------------------------------------------------------------------------------------
        
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

//----------------------------------------------------------------------------------------------------------------------------------
        
        //Singleton Design Pattern
        /*
        1. Make the constructor private.
        2. Make instance method(getInstance()). Within it, returning of DBconnection object is happens.
        3. Make a connection method(getConnection()). Within it, returning of connection object is happens there.
        4. In there we know that, we don't handle exceptions, we only just throw the exceptions.
        import java.sql.*;

        public class DBConnection {
            private static DBConnection dbConnection;
            private Connection connection;
            private DBConnection() throws SQLException, ClassNotFoundException{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost/ThogaKade", "root", "2003");
            }
            public static DBConnection getInstance() throws SQLException, ClassNotFoundException{
                if(dbConnection==null){
                    dbConnection = new DBConnection();
                }
                return dbConnection;
            }
            public Connection getConnection(){
                return connection;
            }
        }
        
        //----------------------------MVC(Model Version Controller)------------------------------------------
        
        // This is how we gonna include SQL statement to update values in database.
        // In MVC design pattern, updating of something happens in seperate class.(Ex: CustomerController)
        // Here the updateCustomer is a method found in CustomerController.
        // Then there is a seperate class to control this. Where in there is the object is created(Ex: UpdateCustomerForm).
        
        public static boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException{
            Connection connection = DBConnection.getInstance().getConnection();
            String SQL = "UPDATE Customer set name = ?, address = ?, salary = ? WHERE id = ?";
            PreparedStatement stm = connection.prepareStatement(SQL);

            stm.setObject(1, customer.getName());
            stm.setObject(2, customer.getAddress());
            stm.setObject(3, customer.getSalary());
            stm.setObject(4, customer.getId());

            int res = stm.executeUpdate();
            return res>0;
        }
        
        // This is what we can see in the UpdateCustomerForm.
        // Where we create a customer of class Customer to store our details and we gonna update it.
        // For that purpose, is why we are transferring created object to CustomerController class.
        // If it is succesfull it will pop up with a message.
        
        private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                          
            try {
                Customer customer = new Customer(txtId.getText(), txtName.getText(), txtAddress.getText(), Double.parseDouble(txtSalary.getText()));
                boolean isUpdate = CustomerController.updateCustomer(customer);
                if(isUpdate){
                    JOptionPane.showMessageDialog(this, "Update Success");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }*/
        
    }
    
}
