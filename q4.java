import java.sql.*; 
import java.util.*; 
public class q4 { 
 public static void main(String[] args) throws Exception { 
 Connection con = DriverManager.getConnection( 
 "jdbc:mysql://localhost:3306/library", "root", "password"); 
 Scanner sc = new Scanner(System.in); 
 while (true) { 
 System.out.println("\n1.Insert Book\n2.Search Book\n3.Display Available  Books\n4.Issue Book\n5.Exit"); 
 System.out.print("Enter choice: "); 
 int ch = sc.nextInt(); 
 if (ch == 1) { 
 System.out.print("Book ID: "); 
 int id = sc.nextInt(); 
 sc.nextLine(); 
 System.out.print("Title: "); 
 String title = sc.nextLine(); 
 System.out.print("Author: "); 
 String author = sc.nextLine(); 
 System.out.print("Price: "); 
 double price = sc.nextDouble();
 PreparedStatement ps = con.prepareStatement( 
 "INSERT INTO Book VALUES(?,?,?,?,?)"); 
 ps.setInt(1, id); 
 ps.setString(2, title); 
 ps.setString(3, author); 
 ps.setDouble(4, price); 
 ps.setString(5, "Available"); 
 ps.executeUpdate(); 
 System.out.println("Book inserted successfully");  } 
 else if (ch == 2) { 
 System.out.print("Enter Book ID: "); 
 int id = sc.nextInt(); 
 PreparedStatement ps = con.prepareStatement( 
 "SELECT * FROM Book WHERE BookID=?");  ps.setInt(1, id); 
 ResultSet rs = ps.executeQuery(); 
 if (rs.next()) { 
 System.out.println("ID: " + rs.getInt("BookID"));  System.out.println("Title: " + rs.getString("Title"));  System.out.println("Author: " + rs.getString("Author"));  System.out.println("Price: " + rs.getDouble("Price"));  System.out.println("Availability: " + rs.getString("Availability"));  } else { 
 System.out.println("Book not found"); 
 }
 } 
 else if (ch == 3) { 
 Statement st = con.createStatement(); 
 ResultSet rs = st.executeQuery( 
 "SELECT * FROM Book WHERE Availability='Available'"); 
 while (rs.next()) { 
 System.out.println( 
 rs.getInt("BookID") + " " + 
 rs.getString("Title") + " " + 
 rs.getString("Author") + " " + 
 rs.getDouble("Price") + " " + 
 rs.getString("Availability")); 
 } 
 } 
 else if (ch == 4) { 
 System.out.print("Enter Book ID to issue: "); 
 int id = sc.nextInt(); 
 PreparedStatement ps = con.prepareStatement( 
 "UPDATE Book SET Availability='Issued' WHERE BookID=? AND  Availability='Available'"); 
 ps.setInt(1, id); 
 int rows = ps.executeUpdate(); 
 if (rows > 0) 
 System.out.println("Book issued successfully"); 
 else
 System.out.println("Book not found or already issued"); 
 } 
 else if (ch == 5) { 
 con.close(); 
 sc.close(); 
 break; 
 } 
 else { 
 System.out.println("Invalid choice"); 
 } 
 } 
 } 
} 
