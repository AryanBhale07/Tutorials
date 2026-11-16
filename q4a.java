import java.util.Scanner;
class q4a{
public static void main(String[] args){
int r1,r2;
int temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first roll number: ");
r1 = sc.nextInt();
System.out.println("Enter the second roll number: ");
r2 = sc.nextInt();
System.out.println("Without swapping, the first roll number is: " +r1+ " and the second roll number is: " +r2);
temp = r1;
r1 = r2;
r2 = temp;

System.out.println("After swapping, the first roll number is: " +r1+ " and the second roll number is: " +r2);
}
}