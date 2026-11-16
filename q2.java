public class q2 { 
 public static void main(String[] args) { 
 Payment p; 
 p = new CreditCardPayment(); 
 p.pay(5000); 
 System.out.println(); 
 p = new UPIPayment(); 
 p.pay(2500); 
 System.out.println(); 
 p = new NetBankingPayment(); 
 p.pay(3000); 
 } 
} 
interface Payment{ 
 void pay(double amount); 
} 
class CreditCardPayment implements Payment{ 
 public void pay(double amount){ 
 System.out.println("Paid " + amount + " using Credit Card."); 
 } 
} 
class UPIPayment implements Payment{ 
 public void pay(double amount){ 
 System.out.println("Paid " + amount + " using UPI."); 
 }
} 
class NetBankingPayment implements Payment{ 
 public void pay(double amount){ 
 System.out.println("Paid " + amount + " using Net Banking."); 
 } 
} 
