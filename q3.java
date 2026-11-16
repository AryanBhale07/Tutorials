class ExamTask implements Runnable { 
private String activity; 
ExamTask(String activity) { 
this.activity = activity; 
} 
public void run() { 
for (int i = 1; i <= 3; i++) { 
System.out.println( 
Thread.currentThread().getName() + 
" - " + activity 
); 
try {
if (activity.equals("Displaying Remaining Time")) { 
Thread.sleep(1000); 
} 
else if (activity.equals("Auto Saving Answers")) { 
Thread.sleep(2000); 
} 
else { 
Thread.sleep(1500); 
} 
} 
catch (Exception e) { 
System.out.println("Thread interrupted"); 
} 
} 
} 
} 
public class q3 { 
public static void main(String[] args) { 
ExamTask timer = new ExamTask("Displaying Remaining Time"); ExamTask autoSave = new ExamTask("Auto Saving Answers"); ExamTask network = new ExamTask("Checking Network Connection"); Thread t1 = new Thread(timer); 
Thread t2 = new Thread(autoSave); 
Thread t3 = new Thread(network); 
t1.setName("Timer Thread"); 
t2.setName("Auto-Save Thread"); 
t3.setName("Network Thread"); 
t1.start(); 
t2.start();
t3.start(); 
} 
} 
