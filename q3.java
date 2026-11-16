import java.util.*; 
public class q3 { 
 public static void main(String[] args) {
 Employee[] e = new Employee[5]; 
 e[0] = new Employee(1, "Aryan", 35000);  e[1] = new Employee(2, "Rahul", 25000);  e[2] = new Employee(3, "Priya", 45000);  e[3] = new Employee(4, "Kiran", 28000);  e[4] = new Employee(5, "Anu", 30000); 
 for (Employee i : e) { 
 i.calculateAnnualSalary(); 
 i.calculateBonus(); 
 i.checkEligibility(); 
 i.display(); 
 } 
 } 
} 
class Employee { 
 int id; 
 String name; 
 float monthlySalary; 
 float annualSalary; 
 float bonus; 
 String eligibility; 
 Employee(int id, String name, float monthlySalary) {  this.id = id;
 this.name = name; 
 this.monthlySalary = monthlySalary; 
 } 
 void calculateAnnualSalary() { 
 annualSalary = monthlySalary * 12; 
 } 
 void calculateBonus() { 
 bonus = (monthlySalary >= 30000) ? (annualSalary * 10) / 100 : 0;  } 
 void checkEligibility() { 
 eligibility = (monthlySalary >= 30000) 
 ? "Eligible" : "Not Eligible"; 
 } 
 void display() { 
 System.out.println("Employee ID: " + id); 
 System.out.println("Employee Name: " + name); 
 System.out.println("Monthly Salary: " + monthlySalary);  System.out.println("Annual Salary: " + annualSalary);  System.out.println("Bonus: " + bonus); 
 System.out.println("Bonus Eligibility: " + eligibility);  System.out.println(); 
 } 
}
