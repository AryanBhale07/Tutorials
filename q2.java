import java.util.Scanner; 
class q2 { 
 public static void main(String[] args) { 
 Book b1=new Book(); 
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter the title of the book: "); 
 b1.title=sc.nextLine(); 
 System.out.println("Enter the price of the book: "); 
 b1.price=sc.nextInt(); 
 sc.nextLine(); 
 System.out.println("Enter the name of the author of the book: "); 
 b1.author=sc.nextLine(); 
 b1.display(); 
 } 
} 
class Book{ 
 String title; 
 int price; 
 String author;
 void display(){ 
 System.out.println("----BOOK DETAILS----"); 
 System.out.println("The title of the book is: " +title); 
 System.out.println("The price of the book is: " + price); 
 System.out.println("The author of the book is: " + author); 
 } 
} 
