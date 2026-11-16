import java.util.Scanner;
public class q3{ 
 public static void main(String[] args){ 
 Scanner sc=new Scanner(System.in); 
 Employee e1=new Employee(315,"Diva",70000); 
 e1.display(); 
 } 
} 
class Employee{ 
 int ID; 
 String name; 
 float salary; 
 Employee(int ID, String name, float salary){ 
 this.ID = ID; 
 this.name = name; 
 this.salary = salary; 
 } 
 void display(){ 
 System.out.println("Employee ID: " + ID); 
 System.out.println("Employee name: " + name); 
 System.out.println("Employee salary: " + salary); 
 } 
} 
