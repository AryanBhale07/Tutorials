class Junction1 extends Thread { 
 public void run() { 
 for (int i = 1; i <= 3; i++) { 
 System.out.println(getName() + " - Traffic Status: Heavy - " + i); 
 try { 
 Thread.sleep(1000); 
 } catch (InterruptedException e) { 
 System.out.println(e); 
 }
 } 
 } 
} 
class Junction2 extends Thread { 
 public void run() { 
 for (int i = 1; i <= 3; i++) { 
 System.out.println(getName() + " - Traffic Status: Moderate - " + i); 
 try { 
 Thread.sleep(1500); 
 } catch (InterruptedException e) { 
 System.out.println(e); 
 } 
 } 
 } 
} 
class Junction3 extends Thread { 
 public void run() { 
 for (int i = 1; i <= 3; i++) { 
 System.out.println(getName() + " - Traffic Status: Low - " + i); 
 try { 
 Thread.sleep(2000); 
 } catch (InterruptedException e) { 
 System.out.println(e); 
 } 
 }
 } 
} 
public class q5 { 
 public static void main(String[] args) {  Junction1 j1 = new Junction1();  Junction2 j2 = new Junction2();  Junction3 j3 = new Junction3(); 
 j1.setName("Junction 1");  j2.setName("Junction 2");  j3.setName("Junction 3"); 
 j1.start(); 
 j2.start(); 
 j3.start(); 
 } 
}
