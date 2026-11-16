//In Payment.java 
/* 
package payment; 
public interface Payment { 
 void pay(double amt); 
} 
//In SecurePayment.java 
package payment; 
public interface SecurePayment extends Payment { 
 void verifyPayment(); 
} 
//In OnlineTransaction.java 
package payment; 
public interface OnlineTransaction {
} 
//In UPIPayment.java 
package online; 
import payment.*; 
public class UPIPayment implements SecurePayment, OnlineTransaction {  public void pay(double amt) { 
 System.out.println("Paid Rs." + amt + " using UPI");  } 
 public void verifyPayment() { 
 System.out.println("UPI payment verified"); 
 } 
} 
//In CardPayment.java 
package card; 
import payment.*; 
public class CardPayment implements Payment, OnlineTransaction {  public void pay(double amt) { 
 System.out.println("Paid Rs." + amt + " using Card");  } 
} 
//In Main.java 
import payment.*;
import online.*; 
import card.*; 
*/
public class q6 { 
 public static void main(String[] args) { 
 UPIPayment upi = new UPIPayment(); 
 upi.verifyPayment(); 
 upi.pay(1500); 
 System.out.println(); 
 CardPayment card = new CardPayment();  card.pay(2500); 
 System.out.println(); 
 if (upi instanceof OnlineTransaction) 
 System.out.println("UPI is an online transaction");  if (card instanceof OnlineTransaction) 
 System.out.println("Card is an online transaction");  } 
}
