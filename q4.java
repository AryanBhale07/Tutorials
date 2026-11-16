import java.util.Scanner; 
public class q4{ 
 public static void main(String[] args){ 
 Scanner sc=new Scanner(System.in);
 Showroom s1=new Showroom(); 
 Showroom s2=new Showroom("Porsche"); 
 Showroom s3=new Showroom("Volkswagon",400000);  } 
} 
class Showroom{ 
 String name; 
 float price; 
 Showroom(){ 
 System.out.println("No details entered."); 
 } 
 Showroom(String name){ 
 this.name = name; 
 System.out.println("Model name: " + name); 
 } 
 Showroom(String name, float price){ 
 this.name = name; 
 this.price = price; 
 System.out.println("Model name: " + name); 
 System.out.println("Price: " + price); 
 } 
} 
