import java.util.Scanner; 
class q1 { 
 public static void main(String[] args) { 
 Student s1=new Student(); 
 Scanner sc=new Scanner(System.in); 
 System.out.println("----STUDENT DETAILS----"); 
 System.out.println("Enter the name of the student: "); 
 s1.name=sc.nextLine(); 
 System.out.println("Enter the roll number of the student: "); 
 s1.rollno=sc.nextInt(); 
 sc.nextLine(); 
 System.out.println("Enter the department of the student: "); 
 s1.dept=sc.nextLine(); 
 s1.display(); 
 } 
} 
class Student{ 
 String name; 
 int rollno; 
 String dept; 
 void display(){ 
 System.out.println("The name of the student is: " +name);
 System.out.println("The roll number of the student is: " + rollno); 
 System.out.println("The department of the student: " + dept); 
 } 
} 
