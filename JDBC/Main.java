package JDBC;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        StudentDAO dao = new StudentDAO();
        dao.createTable();  // Create table if it doesn't exist and insert sample data
        
        // Get a student from the database
        Student s1 = dao.getStudent(4);
        
        if (s1 != null) {
            System.out.println("Student Roll No: " + s1.rollno);
            System.out.println("Student Name: " + s1.sname);
        }
    }
}


class StudentDAO {
	
    public void createTable() {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:test.db")) {
            Statement stmt = connection.createStatement();
            
            // Create the table if it doesn't exist
            String createTableSQL = "CREATE TABLE IF NOT EXISTS students ("
                    + "rollno INTEGER PRIMARY KEY, "
                    + "sname TEXT)";
            stmt.execute(createTableSQL);
            
            // Insert sample data if the table is empty
            String insertDataSQL = "INSERT INTO students (rollno, sname) "
                    + "SELECT 1, 'Tanay' WHERE NOT EXISTS (SELECT 1 FROM students WHERE rollno = 1);";
            stmt.executeUpdate(insertDataSQL);
            insertDataSQL = "INSERT INTO students (rollno, sname) "
                    + "SELECT 2, 'John' WHERE NOT EXISTS (SELECT 1 FROM students WHERE rollno = 2);";
            stmt.executeUpdate(insertDataSQL);
            insertDataSQL = "INSERT INTO students (rollno, sname) "
                    + "SELECT 3, 'Alice' WHERE NOT EXISTS (SELECT 1 FROM students WHERE rollno = 3);";
            stmt.executeUpdate(insertDataSQL);
            insertDataSQL = "INSERT INTO students (rollno, sname) "
                    + "SELECT 4, 'Aastha' WHERE NOT EXISTS (SELECT 1 FROM students WHERE rollno = 4);";
            stmt.executeUpdate(insertDataSQL);
            
            System.out.println("Table created and sample data inserted.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Student getStudent(int rollno) {
        try {
            // Load SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

            String url = "jdbc:sqlite:test.db";  // SQLite database file
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected to SQLite database successfully!");

            // Query to get student data (adjust based on your actual schema)
            String query = "SELECT rollno, sname FROM students where rollno="+rollno;  // Example query
            
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            // Assuming the table has columns rollno and sname
            if (rs.next()) {
                Student student = new Student();
                student.rollno = rs.getInt("rollno");
                student.sname = rs.getString("sname");

                // Close resources
                rs.close();
                stmt.close();
                connection.close();

                return student;
            }
            
            // Close resources if no data is found
            rs.close();
            stmt.close();
            connection.close();
            
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

class Student {
    int rollno;
    String sname;
}

/* String url = "jdbc:sqlite:test.db";  // SQLite database file (will be created if it doesn't exist)
        
        try {
            Class.forName("org.sqlite.JDBC");
            
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected to SQLite database successfully!");
            
            // Close connection
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
 */