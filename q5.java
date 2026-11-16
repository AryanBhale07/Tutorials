import java.util.Scanner; 
abstract class Shape{ 
 abstract double calculateArea();
} 
class Circle extends Shape{ 
 double r; 
 Circle(double r){ 
 this.r=r; 
 } 
 double calculateArea(){ 
 return 3.14*r*r; 
 } 
} 
class Rectangle extends Shape{ 
 double l,b; 
 Rectangle(double l,double b){ 
 this.l=l; 
 this.b=b; 
 } 
 double calculateArea(){ 
 return l*b; 
 } 
} 
class Triangle extends Shape{ 
 double b,h; 
 Triangle(double b,double h){ 
 this.b=b; 
 this.h=h; 
 } 
 double calculateArea(){ 
 return 0.5*b*h; 
 } 
} 
public class q5{ 
 public static void main(String[] args){  Scanner sc=new Scanner(System.in);  System.out.print("Enter radius: ");  double r=sc.nextDouble(); 
 System.out.print("Enter length and breadth: ");  double l=sc.nextDouble(); 
 double b=sc.nextDouble(); 
 System.out.print("Enter base and height: ");  double tb=sc.nextDouble(); 
 double h=sc.nextDouble(); 
 Shape s; 
 s=new Circle(r);
 System.out.println("Circle Area: "+s.calculateArea()); 
 s=new Rectangle(l,b); 
 System.out.println("Rectangle Area: "+s.calculateArea());  s=new Triangle(tb,h); 
 System.out.println("Triangle Area: "+s.calculateArea());  } 
} 
