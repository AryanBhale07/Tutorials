/*In Student.java 
package studentmanagement; 
public class Student { 
 int rno; 
 String name; 
 String dept; 
 Student(int rno, String name, String dept) { 
 this.rno = rno; 
 this.name = name; 
 this.dept = dept; 
 } 
 void display() { 
 System.out.println("Student Details"); 
 System.out.println("Roll No: " + rno); 
 System.out.println("Name: " + name); 
 System.out.println("Department: " + dept); 
 } 
}
 */
//In Course.java 
/* 
package coursemanagement; 
public class Course { 
 int cid; 
 String cname; 
 int credit; 
 Course(int cid, String cname, int credit) { 
 this.cid = cid; 
 this.cname = cname; 
 this.credit = credit; 
 } 
 void display() { 
 System.out.println("Course Details"); 
 System.out.println("Course ID: " + cid); 
 System.out.println("Course Name: " + cname);  System.out.println("Credits: " + credit); 
 } 
} 
 */
//In Main.java 
import studentmanagement.Student; 
import coursemanagement.Course; 
public class q5 { 
 public static void main(String[] args) { 
 Student s = new Student(101, "Aryan", "Cybersecurity");  Course c = new Course(501, "Data Structures", 4);
 s.display(); 
 System.out.println(); 
 c.display(); 
 } 
} 
