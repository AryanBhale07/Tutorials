import java.util.*; 
public class q1 { 
public static void main(String[] args) {
ArrayList<Product> p = new ArrayList<>(); p.add(new Product(1, "Chips", 50, 2)); 
p.add(new Product(2, "Soda", 20, 1)); 
p.add(new Product(3, "Pencil", 10, 3)); 
p.add(new Product(4, "Eraser", 5, 1)); 
p.add(new Product(5, "Scale", 10, 2)); 
for (Product i : p) { 
i.total = i.price * i.quantity; 
if (i.total >= 5000) { 
i.discount = (i.total * 10) / 100; 
}  
else { 
i.discount = (i.total * 5) / 100; 
} 
i.finalprice = i.total - i.discount; 
i.display(); 
} 
} 
} 
class Product{ 
int id, quantity; 
String name; 
float price; 
float total; 
float finalprice; 
float discount; 
Product(int id, String name, float price, int quantity) { this.id = id; 
this.name = name;
this.price = price; 
this.quantity = quantity; 
} 
void display() { 
System.out.println("The ID of the product is: " + id); 
System.out.println("The Name of the product is: " + name); 
System.out.println("The Total Price of the product is: " + total); 
System.out.println("The Discount Applied is: " + discount); 
System.out.println("The Final Price of the product is: " + finalprice); 
System.out.println(); 
} 
} 
