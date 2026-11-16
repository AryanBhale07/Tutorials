class BankAccount{ 
 private int accNo; 
 private String name; 
 private double bal; 
 BankAccount(int accNo,String name,double bal){ 
 this.accNo=accNo; 
 this.name=name; 
 this.bal=bal; 
 } 
 void deposit(double amt){ 
 bal=bal+amt; 
 } 
 void withdraw(double amt){ 
 if(amt<=bal) 
 bal=bal-amt; 
 else 
 System.out.println("Insufficient balance"); 
 } 
 void display(){ 
 System.out.println("Account Number: "+accNo); 
 System.out.println("Account Holder: "+name); 
 System.out.println("Balance: "+bal); 
 } 
} 
public class q1{ 
 public static void main(String[] args){ 
 BankAccount b=new BankAccount(101,"Aryan",5000);  b.deposit(2000); 
 b.withdraw(1000); 
 b.display(); 
 }
} 
