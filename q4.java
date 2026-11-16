abstract class Product{ 
 int id; 
 String n; 
 double p; 
 Product(int id,String n,double p){ 
 this.id=id; 
 this.n=n; 
 this.p=p; 
 } 
 abstract double calculateDiscount(); 
} 
class Electronics extends Product{ 
 Electronics(int id,String n,double p){ 
 super(id,n,p); 
 }
 double calculateDiscount(){ 
 return p*0.10; 
 } 
} 
class Clothing extends Product{ 
 Clothing(int id,String n,double p){ 
 super(id,n,p); 
 } 
 double calculateDiscount(){ 
 return p*0.20; 
 } 
} 
class Books extends Product{ 
 Books(int id,String n,double p){ 
 super(id,n,p); 
 } 
 double calculateDiscount(){ 
 return p*0.15; 
 } 
} 
public class q4{ 
 public static void main(String[] args){ 
 Product p1=new Electronics(101,"Laptop",50000); 
 Product p2=new Clothing(102,"Shirt",2000); 
 Product p3=new Books(103,"Java Book",1000); 
 System.out.println("Electronics Final Price: "+(p1.p 
p1.calculateDiscount())); 
 System.out.println("Clothing Final Price: "+(p2.p-p2.calculateDiscount()));  System.out.println("Books Final Price: "+(p3.p-p3.calculateDiscount()));  } 
} 
