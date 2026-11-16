class Employee{ 
 String n; 
 int id; 
 double bs; 
 Employee(String n,int id,double bs){ 
 this.n=n; 
 this.id=id; 
 this.bs=bs; 
 } 
 double calculateSalary(){ 
 return bs; 
 } 
} 
class Professor extends Employee{ 
 Professor(String n,int id,double bs){ 
 super(n,id,bs); 
 } 
 double calculateSalary(){ 
 return bs+10000; 
 } 
} 
class LabAssistant extends Employee{ 
 LabAssistant(String n,int id,double bs){ 
 super(n,id,bs); 
 } 
 double calculateSalary(){ 
 return bs+5000; 
 } 
} 
class AdministrativeStaff extends Employee{ 
 AdministrativeStaff(String n,int id,double bs){ 
 super(n,id,bs); 
 }
 double calculateSalary(){ 
 return bs+3000; 
 } 
} 
public class q2{ 
 public static void main(String[] args){ 
 Employee e1=new Professor("Arun",101,50000); 
 Employee e2=new LabAssistant("Ravi",102,30000); 
 Employee e3=new AdministrativeStaff("Raj",103,25000);  System.out.println("Professor Salary: "+e1.calculateSalary());  System.out.println("Lab Assistant Salary: "+e2.calculateSalary());  System.out.println("Administrative Staff Salary: "+e3.calculateSalary());  } 
} 
