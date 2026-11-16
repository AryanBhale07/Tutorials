import java.util.Scanner; 
public class q2{ 
 public static void main(String[] args){ 
 Scanner sc=new Scanner(System.in); 
 int[] arr=new int [7]; 
 int total = 0; 
 System.out.println("Enter 1 for being present and 0 for being absent: ");  for(int i=0; i<arr.length; i++){ 
 arr[i] = sc.nextInt(); 
 if(arr[i]==1){ 
 total++; 
 } 
 if((total/7)*100>=75){ 
 System.out.println("Eligible for Exam"); 
 } 
 else{ 
 System.out.println("Not Eligible"); 
 } 
 } 
 System.out.println("The total number of present days is: " + total);   } 
} 
