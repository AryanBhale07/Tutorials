import java.util.Scanner; 
class q6{ 
 public static void main(String[] args){
 int s; 
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter the seat number: "); 
 s = sc.nextInt(); 
 if(s%2==0){ 
 System.out.println("The seat number is even."); 
 } 
 else{ 
 System.out.println("The seat number is odd."); 
 } 
 } 
} 
