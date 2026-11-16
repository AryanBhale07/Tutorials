import java.sql.*; 
import java.util.*; 
public class q5 { 
 public static void main(String[] args) throws Exception { 
 Connection con = DriverManager.getConnection( 
 "jdbc:mysql://localhost:3306/store", "root", "password"); 
 Scanner sc = new Scanner(System.in); 
 while (true) {
 System.out.println("\n1.Insert Product\n2.Search Product\n3.Update  Quantity\n4.Display Low Stock\n5.Exit"); 
 System.out.print("Enter choice: "); 
 int ch = sc.nextInt(); 
 if (ch == 1) { 
 System.out.print("Product ID: "); 
 int id = sc.nextInt(); 
 sc.nextLine(); 
 System.out.print("Product Name: "); 
 String name = sc.nextLine(); 
 System.out.print("Price: "); 
 double price = sc.nextDouble(); 
 System.out.print("Quantity: "); 
 int qty = sc.nextInt(); 
 PreparedStatement ps = con.prepareStatement( 
 "INSERT INTO Product VALUES(?,?,?,?)"); 
 ps.setInt(1, id); 
 ps.setString(2, name); 
 ps.setDouble(3, price); 
 ps.setInt(4, qty); 
 ps.executeUpdate(); 
 System.out.println("Product inserted successfully"); 
 } 
 else if (ch == 2) { 
 System.out.print("Enter Product ID: "); 
 int id = sc.nextInt();
 PreparedStatement ps = con.prepareStatement(  "SELECT * FROM Product WHERE ProductID=?");  ps.setInt(1, id); 
 ResultSet rs = ps.executeQuery(); 
 if (rs.next()) { 
 System.out.println("ID: " + rs.getInt("ProductID"));  System.out.println("Name: " + rs.getString("ProductName"));  System.out.println("Price: " + rs.getDouble("Price"));  System.out.println("Quantity: " + rs.getInt("Quantity"));  } else { 
 System.out.println("Product not found"); 
 } 
 } 
 else if (ch == 3) { 
 System.out.print("Enter Product ID: "); 
 int id = sc.nextInt(); 
 System.out.print("Enter new quantity: "); 
 int qty = sc.nextInt(); 
 PreparedStatement ps = con.prepareStatement(  "UPDATE Product SET Quantity=? WHERE ProductID=?");  ps.setInt(1, qty); 
 ps.setInt(2, id); 
 int rows = ps.executeUpdate(); 
 if (rows > 0)
 System.out.println("Quantity updated successfully");  else 
 System.out.println("Product not found");  } 
 else if (ch == 4) { 
 PreparedStatement ps = con.prepareStatement(  "SELECT * FROM Product WHERE Quantity < 10");  ResultSet rs = ps.executeQuery(); 
 while (rs.next()) { 
 System.out.println( 
 rs.getInt("ProductID") + " " + 
 rs.getString("ProductName") + " " +  rs.getDouble("Price") + " " + 
 rs.getInt("Quantity")); 
 } 
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
