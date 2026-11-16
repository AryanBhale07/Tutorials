package student; 
public class Student { 
String name; 
int rollNo; 
String dept; 
public Student(String name, int rollNo, String dept) { 
this.name = name;
this.rollNo = rollNo; 
this.dept = dept; 
} 
public void displayStudent() { 
System.out.println("Student Name: " + name); 
System.out.println("Roll Number: " + rollNo); 
System.out.println("Department: " + dept); 
} 
} 
