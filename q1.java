class EmergencyAlert extends Thread { 
 public void run() { 
 System.out.println(getName() + " Priority: " + getPriority()); 
 } 
} 
class VitalMonitor extends Thread { 
 public void run() { 
 System.out.println(getName() + " Priority: " + getPriority()); 
 } 
} 
class ReportGenerator extends Thread { 
 public void run() { 
 System.out.println(getName() + " Priority: " + getPriority()); 
 } 
} 
public class q1 { 
 public static void main(String[] args) { 
 EmergencyAlert t1 = new EmergencyAlert(); 
 VitalMonitor t2 = new VitalMonitor(); 
 ReportGenerator t3 = new ReportGenerator(); 
 t1.setName("EmergencyAlert"); 
 t2.setName("VitalMonitor"); 
 t3.setName("ReportGenerator");
 t1.setPriority(10); 
 t2.setPriority(5); 
 t3.setPriority(1); 
 t1.start(); 
 t2.start(); 
 t3.start(); 
 } 
} 
