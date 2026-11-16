interface Payment {
 void pay(double amt); 
} 
interface SecurePayment extends Payment {  void verifyPayment(); 
} 
class UPIPayment implements SecurePayment {  public void pay(double amt) { 
 System.out.println("Paid Rs." + amt + " using UPI");  } 
 public void verifyPayment() { 
 System.out.println("UPI payment verified");  } 
} 
class CardPayment implements Payment { 
 public void pay(double amt) { 
 System.out.println("Paid Rs." + amt + " using Card");  } 
} 
public class q7 { 
 public static void main(String[] args) {
 UPIPayment upi = new UPIPayment(); 
 upi.verifyPayment(); 
 upi.pay(1500); 
 System.out.println(); 
 CardPayment card = new CardPayment(); 
 card.pay(2500); 
 } 
} 
