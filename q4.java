import java.util.Scanner; 
class q4 { 
 public static void main(String[] args) { 
 Rectangle r1=new Rectangle(); 
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter the length of the rectangle: "); 
 r1.length=sc.nextInt(); 
 System.out.println("Enter the breadth of the rectangle: "); 
 r1.breadth=sc.nextInt(); 
 r1.display(); 
 } 
} 
class Rectangle{ 
 int length; 
 int breadth; 
 void display(){ 
 System.out.println("The area of the rectangle is: " + (length*breadth));  }
} 
