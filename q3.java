import java.util.Scanner;
class q3{
public static void main(String[] args){
int length, breadth;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of the playground: ");
length = sc.nextInt();
System.out.println("Enter the breadth of the playground: ");
breadth = sc.nextInt();
System.out.println("Area of the playground is: " +(length*breadth));
}
}