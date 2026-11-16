import java.util.Scanner; 
class Marks { 
 int m1, m2, m3; 
 Marks(int m1, int m2, int m3) { 
 this.m1 = m1; 
 this.m2 = m2; 
 this.m3 = m3; 
 } 
 void calculate() { 
 int total = m1 + m2 + m3; 
 double average = total / 3.0; 
 System.out.println("Mark 1: " + m1); 
 System.out.println("Mark 2: " + m2); 
 System.out.println("Mark 3: " + m3);
 System.out.println("Total Marks: " + total); 
 System.out.println("Average Marks: " + average); 
 } 
} 
 class q7{ 
 public static void main(String[] args) { 
 Marks student = new Marks(85, 90, 80); 
 student.calculate(); 
 } 
} 
