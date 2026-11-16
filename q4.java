import java.util.Scanner; 
class Patient { 
 String name; 
 double fee; 
 Patient(String name, double fee) { 
 this.name = name; 
 this.fee = fee; 
 } 
 double calculate(double fee) { 
 if (fee >= 2000) 
 return fee - (fee * 0.10); 
 else
 return fee - (fee * 0.05); 
 } 
 void display() { 
 double discount; 
 if (fee >= 2000) 
 discount = fee * 0.10; 
 else 
 discount = fee * 0.05; 
 System.out.println("Name: " + name); 
 System.out.println("Original Fee: " + fee);  System.out.println("Discount: " + discount);  System.out.println("Final Amount: " + calculate(fee));  System.out.println(); 
 } 
} 
public class q4 { 
 public static void main(String[] args) { 
 Scanner sc = new Scanner(System.in); 
 Patient[] p = new Patient[5]; 
 for (int i = 0; i < 5; i++) { 
 System.out.print("Enter name: "); 
 String name = sc.nextLine();
 System.out.print("Enter consultation fee: "); 
 double fee = sc.nextDouble(); 
 sc.nextLine(); 
 p[i] = new Patient(name, fee); 
 } 
 for (int i = 0; i < 5; i++) { 
 p[i].display(); 
 } 
 } 
} 
