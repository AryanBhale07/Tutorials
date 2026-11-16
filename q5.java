import java.util.Scanner; 
class q5{ 
 public static void main(String[] args){
 int s1,s2,s3; 
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter the score of the first student: ");  s1 = sc.nextInt(); 
 System.out.println("Enter the score of the second student: ");  s2 = sc.nextInt(); 
 System.out.println("Enter the score of the third student: ");  s3 = sc.nextInt(); 
 if(s1>s2 && s1>s3){ 
 System.out.println("The highest score is of the first student who scored "  +s1); 
 } 
 else if(s2>s3){ 
 System.out.println("The highest score is of the second student who scored  " +s2); 
 } 
 else{ 
 System.out.println("The highest score is of the third student who scored "  +s3); 
 } 
 } 
} 
