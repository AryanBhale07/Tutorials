class OrderProcessing extends Thread { 
 public void run() { 
 System.out.println(getName() + " Priority: " + getPriority() + " - Processing customer  orders"); 
 } 
} 
class DeliveryTracking extends Thread { 
 public void run() { 
 System.out.println(getName() + " Priority: " + getPriority() + " - Tracking delivery  locations"); 
 } 
} 
class Notification extends Thread { 
 public void run() { 
 System.out.println(getName() + " Priority: " + getPriority() + " - Sending order status  notifications"); 
 }
} 
public class q2 { 
 public static void main(String[] args) { 
 OrderProcessing t1 = new OrderProcessing(); 
 DeliveryTracking t2 = new DeliveryTracking(); 
 Notification t3 = new Notification(); 
 t1.setPriority(10); 
 t2.setPriority(5); 
 t3.setPriority(1); 
 t1.start(); 
 t2.start(); 
 t3.start(); 
 } 
} 
