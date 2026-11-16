class Account { 
 int accno; 
 String name; 
 double bal; 
 Account(int accno, String name, double bal) { 
 this.accno = accno; 
 this.name = name; 
 this.bal = bal; 
 } 
 void displayDetails() { 
 System.out.println("Account No: " + accno); 
 System.out.println("Name: " + name); 
 System.out.println("Balance: " + bal); 
 } 
}
class SavingsAccount extends Account { 
 double rate; 
 SavingsAccount(int accno, String name, double bal, double rate) {  super(accno, name, bal); 
 this.rate = rate; 
 } 
 void displayDetails() { 
 System.out.println("Savings Account"); 
 System.out.println("Account No: " + accno); 
 System.out.println("Name: " + name); 
 System.out.println("Balance: " + bal); 
 System.out.println("Interest Rate: " + rate + "%");  } 
} 
class CurrentAccount extends Account { 
 double limit; 
 CurrentAccount(int accno, String name, double bal, double limit) {  super(accno, name, bal); 
 this.limit = limit; 
 }
 void displayDetails() { 
 System.out.println("Current Account"); 
 System.out.println("Account No: " + accno); 
 System.out.println("Name: " + name); 
 System.out.println("Balance: " + bal); 
 System.out.println("Overdraft Limit: " + limit); 
 } 
} 
public class q6 { 
 public static void main(String[] args) { 
 Account a; 
 a = new SavingsAccount(101, "Aryan", 25000, 5.5); 
 a.displayDetails(); 
 System.out.println(); 
 a = new CurrentAccount(102, "Rahul", 40000, 10000); 
 a.displayDetails(); 
 } 
} 
