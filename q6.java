import java.sql.*; 
import java.util.*; 
public class q6 { 
 public static void main(String[] args) throws Exception { 
 Connection con = DriverManager.getConnection( 
 "jdbc:mysql://localhost:3306/college", "root", "password"); 
 Scanner sc = new Scanner(System.in); 
 System.out.print("Enter Course Code: "); 
 String code = sc.nextLine(); 
 PreparedStatement ps = con.prepareStatement( 
 "SELECT * FROM CourseRegistration WHERE CourseCode=?");  ps.setString(1, code); 
 ResultSet rs = ps.executeQuery(); 
 if (!rs.isBeforeFirst()) { 
 System.out.println("No students registered for this course"); 
 } else { 
 while (rs.next()) { 
 System.out.println("Student ID: " + rs.getInt("StudentID"));
 System.out.println("Student Name: " + rs.getString("StudentName"));  System.out.println("Course Code: " + rs.getString("CourseCode"));  System.out.println("Course Name: " + rs.getString("CourseName"));  System.out.println("Semester: " + rs.getInt("Semester"));  System.out.println("----------------------"); 
 } 
 } 
 con.close(); 
 sc.close(); 
 } 
}

