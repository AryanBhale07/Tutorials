import java.util.Scanner; 
public class q1{ 
 public static void main(String[] args){ 
 Scanner sc=new Scanner(System.in); 
 int[] arr = new int[5]; 
 int total = 0; 
 System.out.println("Enter the price of 5 products: "); 
 for(int i=0; i<arr.length;i++){ 
 arr[i]=sc.nextInt(); 
 total+=arr[i]; 
 } 
 if(total>5000){ 
 System.out.println("Total bill: " + total + "\n Discount applicable");  } 
 else{ 
 System.out.println("Total bill: " + total + "\n No Discount"); 
 } 
 } 
} 
