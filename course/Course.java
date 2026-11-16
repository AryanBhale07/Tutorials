package course; 
public class Course { 
String name; 
String code; 
int credits; 
public Course(String name, String code, int credits) { 
this.name = name; 
this.code = code; 
this.credits = credits; 
} 
public void displayCourse() { 
System.out.println("Course Name: " + name); 
System.out.println("Course Code: " + code); 
System.out.println("Credits: " + credits); 
} 
} 
