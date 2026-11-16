import java.util.*; 
public class q2 { 
 public static void main(String[] args) { 
 Student[] s = new Student[5]; 
 s[0] = new Student(1, "Aryan", 85, 90, 80, 85); 
 s[1] = new Student(2, "Rahul", 60, 55, 65, 75); 
 s[2] = new Student(3, "Priya", 95, 90, 92, 90); 
 s[3] = new Student(4, "Kiran", 40, 45, 35, 70); 
 s[4] = new Student(5, "Anu", 75, 80, 70, 82); 
 for (Student i : s) { 
 i.total = 0; 
 for (int j = 0; j < i.marks.length; j++) { 
 i.total = i.total + i.marks[j]; 
 } 
 i.average = i.total / 3.0; 
 i.result = (i.average >= 50) ? "Pass" : "Fail";
 i.scholarship = (i.average >= 75 && i.attendance >= 80)  ? "Eligible" : "Not Eligible"; 
 i.performance = (i.average >= 85) ? "Excellent" : "Good"; 
 i.display(); 
 } 
 Student highest = s[0]; 
 for (Student i : s) { 
 if (i.average > highest.average) { 
 highest = i; 
 } 
 } 
 System.out.println("Student with Highest Average:");  System.out.println("Name: " + highest.name);  System.out.println("Roll Number: " + highest.roll);  System.out.println("Average: " + highest.average);  } 
} 
class Student { 
 int roll; 
 String name; 
 int[] marks;
 float attendance; 
 int total; 
 double average; 
 String result; 
 String scholarship; 
 String performance; 
 Student(int roll, String name, int mark1, int mark2,  int mark3, float attendance) { 
 this.roll = roll; 
 this.name = name; 
 marks = new int[3]; 
 marks[0] = mark1; 
 marks[1] = mark2; 
 marks[2] = mark3; 
 this.attendance = attendance; 
 } 
 void display() { 
 System.out.println("Roll Number: " + roll);  System.out.println("Student Name: " + name);  System.out.println("Marks: " + marks[0] + " " +
 marks[1] + " " + marks[2]); 
 System.out.println("Attendance: " + attendance + "%"); 
 System.out.println("Total Marks: " + total); 
 System.out.println("Average Marks: " + average); 
 System.out.println("Result: " + result); 
 System.out.println("Scholarship: " + scholarship); 
 System.out.println("Performance: " + performance); 
 System.out.println(); 
 } 
} 
