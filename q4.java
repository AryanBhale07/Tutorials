class Transaction implements Runnable { 
 public void run() { 
 for (int i = 1; i <= 3; i++) { 
 System.out.println(Thread.currentThread().getName() 
 + " - Transaction Processing - " + i); 
 try { 
 Thread.sleep(1000); 
 } catch (InterruptedException e) { 
 System.out.println(e); 
 } 
 } 
 } 
} 
class Balance implements Runnable { 
 public void run() { 
 for (int i = 1; i <= 3; i++) { 
 System.out.println(Thread.currentThread().getName() 
 + " - Balance Updating - " + i); 
 try {
 Thread.sleep(1500); 
 } catch (InterruptedException e) { 
 System.out.println(e); 
 } 
 } 
 } 
} 
class SMS implements Runnable { 
 public void run() { 
 for (int i = 1; i <= 3; i++) { 
 System.out.println(Thread.currentThread().getName()  + " - SMS Notification - " + i); 
 try { 
 Thread.sleep(2000); 
 } catch (InterruptedException e) { 
 System.out.println(e); 
 } 
 } 
 } 
} 
public class q4 { 
 public static void main(String[] args) { 
 Transaction transaction = new Transaction();  Balance balance = new Balance(); 
 SMS sms = new SMS();
 Thread t1 = new Thread(transaction); 
 Thread t2 = new Thread(balance); 
 Thread t3 = new Thread(sms); 
 t1.setName("Transaction"); 
 t2.setName("Balance"); 
 t3.setName("SMS"); 
 t1.start(); 
 t2.start(); 
 t3.start(); 
 } 
} 
