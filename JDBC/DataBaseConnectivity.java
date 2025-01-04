package JDBC;
/*
 * 1. import java.sql.*;
 * 2. Load and Register the Driver -> com.mysql.jdbc.Driver -> Class.forName("com.mysql.jdbc.Driver");
 * 3. Establish the Connection -> Connection -> DriverManager.getConnection(url, username, password);
 * 4. Create the Statement -> Statement -> Connection.createStatement();
 * 5. Execute the Query -> ResultSet -> Statement.executeQuery("select * from table_name");
 * 6. Process the Results -> ResultSet.next();
 * 7. Close the Connection -> Connection.close();
 * 8. Handle the Exceptions -> try-catch
 */

    // DAO -> Data Access Object
    // DTO -> Data Transfer Object

    
    public class DataBaseConnectivity {
        public static void main(String[] args) throws Exception {
            Class.forName("JDBC.PQR");
        }
    }

    // Class.forName -> Load the class and register the driver with DriverManager
    // loading the class means -> execute the static block of the class
    
    class PQR {
        static {
            System.out.println("static block");
        }
    
        {
            System.out.println("Instance block");
        }
    }