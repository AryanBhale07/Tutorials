import java.util.Scanner;
class q1 {
public static void main(String[] args) {

String name, department, clgname, regno;
int year;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the name of the student:");
name = sc.nextLine();
System.out.println("Enter the department of the student:");
department = sc.nextLine();
System.out.println("Enter the name of the college:");
clgname = sc.nextLine();
System.out.println("Enter the registration number:");
regno = sc.nextLine();
System.out.println("Enter the year of study:");
year = sc.nextInt();
System.out.println("Name of Student : " + name);
System.out.println("Registration Number : " + regno);
System.out.println("Department : " + department);
System.out.println("Year of Study : " + year);
System.out.println("College Name : " + clgname);

}
}