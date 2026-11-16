import java.util.Scanner; 
class q5 { 
 public static void main(String[] args) { 
 Scanner sc=new Scanner(System.in); 
 Student s1=new Student("Aryan", 18); 
 Student s2=new Student("Sajith", 19); 
 s1.display(); 
 s2.display(); 
 } 
} 
class Student{ 
 String name; 
 int age; 
 Student(String name, int age){ 
 this.name = name; 
 this.age = age; 
 } 
 void display(){ 
 System.out.println("The name of the student is: " + name); 
 System.out.println("The age of the student is: " + age); 
  
 }
 } 
