import java.util.Scanner; 
class Employee { 
 int id; 
 String name; 
 double salary; 
 Employee(int id, String name, double salary) { 
 this.id = id; 
 this.name = name; 
 this.salary = salary; 
 } 
 void displayDetails() { 
 System.out.println("Employee ID: " + id); 
 System.out.println("Employee Name: " + name); 
 System.out.println("Salary: " + salary); 
 System.out.println(); 
 } 
} 
 class q6{ 
 public static void main(String[] args) { 
 Employee e1 = new Employee(101, "Rahul", 35000);
 Employee e2 = new Employee(102, "Priya", 42000); 
 e1.displayDetails(); 
 e2.displayDetails(); 
 } 
} 
