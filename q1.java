import student.Student; 
import course.Course; 
public class q1 { 
public static void main(String[] args) { 
Student s = new Student("Aryan", 101, "Cybersecurity"); 
Course c = new Course("OOOPS", "ABC", 4); 
System.out.println("STUDENT INFORMATION"); 
s.displayStudent(); 
System.out.println(); 
System.out.println("COURSE INFORMATION"); 
c.displayCourse(); 
} 
} 
