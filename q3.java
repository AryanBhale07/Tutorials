import java.util.Scanner; 
class q3 { 
 public static void main(String[] args) { 
 Student s1=new Student(); 
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter the name of the student: "); 
 s1.name=sc.nextLine(); 
 System.out.println("Enter the roll number of the student: "); 
 s1.rollNo=sc.nextInt(); 
 s1.display(); 
 } 
} 
class Student{ 
 String name; 
 int rollNo; 
 void display(){
 System.out.println("----STUDENT DETAILS----"); 
 System.out.println("The name of the student is: " +name); 
 System.out.println("The roll number of the student is: " + rollNo);  } 
} 
