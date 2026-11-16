import java.util.Scanner;
class q2{
public static void main(String[] args){
int p1, p2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the price of the first product: ");
p1 = sc.nextInt();
System.out.println("Enter the price of the second product: ");
p2 = sc.nextInt();
System.out.println("Total amount of both the products is: " +(p1+p2
));
System.out.println("Difference of the two products is: "
+(p1>p2?(p1-p2):(p2-p1)));
System.out.println("Product of the two products is: " +(p1*p2));
System.out.println("Quotient of the two products is: "
+(p1>p2?(p1/p2):(p2/p1)));
System.out.println("Remainder of the two products is: "
+(p1>p2?(p1%p2):(p2%p1)));
}
}