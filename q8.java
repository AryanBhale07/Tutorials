import java.util.Scanner; 
class Temperature { 
 double celsius; 
 Temperature(double celsius) { 
 this.celsius = celsius; 
 } 
 void calculate() { 
 double fahrenheit = (9/5 * celsius) + 32; 
 System.out.println("Temperature in Celsius: " + celsius); 
 System.out.println("Temperature in Fahrenheit: " + fahrenheit);
 } 
 class q8{ 
 public static void main(String[] args) {  Temperature temp = new Temperature(25);  temp.calculate(); 
 } 
}
