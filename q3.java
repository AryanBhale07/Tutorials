import java.util.Scanner; 
abstract class Payment{ 
 abstract void makePayment(double amt); 
} 
class UPI extends Payment{ 
 void makePayment(double amt){ 
 System.out.println("Paid Rs."+amt+" using UPI"); 
 } 
} 
class CreditCard extends Payment{ 
 void makePayment(double amt){ 
 System.out.println("Paid Rs."+amt+" using Credit Card");  } 
} 
class NetBanking extends Payment{ 
 void makePayment(double amt){ 
 System.out.println("Paid Rs."+amt+" using Net Banking");  } 
} 
public class q3{
 public static void main(String[] args){ 
 Scanner sc=new Scanner(System.in); 
 System.out.print("Enter amount: "); 
 double amt=sc.nextDouble(); 
 System.out.println("1. UPI"); 
 System.out.println("2. Credit Card"); 
 System.out.println("3. Net Banking"); 
 System.out.print("Select payment method: "); 
 int ch=sc.nextInt(); 
 Payment p; 
 if(ch==1) 
 p=new UPI(); 
 else if(ch==2) 
 p=new CreditCard(); 
 else 
 p=new NetBanking(); 
 p.makePayment(amt); 
 } 
} 
