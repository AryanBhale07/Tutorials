public class q1 { 
 public static void main(String[] args) { 
 Vehicle v = new Vehicle(1234, 100, "Ford"); 
 v.displayDetails(); 
 System.out.println(); 
 Car c = new Car(5678, 150, "Toyota", 4); 
 c.displayDetails(); 
 System.out.println(); 
 Bike b = new Bike(9101, 80, "Honda", true); 
 b.displayDetails(); 
 } 
} 
class Vehicle{ 
 int vehicleNumber, speed; 
 String brand; 
 Vehicle(int vehicleNumber, int speed, String brand){ 
 this.vehicleNumber = vehicleNumber; 
 this.speed = speed; 
 this.brand = brand; 
 } 
 void displayDetails(){ 
 System.out.println("Vehicle Number: " + vehicleNumber); 
 System.out.println("Speed: " + speed); 
 System.out.println("Brand: " + brand);
 } 
} 
class Car extends Vehicle{ 
 int numberOfDoors; 
 Car(int vehicleNumber, int speed, String brand, int numberOfDoors){  super(vehicleNumber, speed, brand); 
 this.numberOfDoors = numberOfDoors; 
 } 
 void displayDetails(){ 
 System.out.println("Vehicle Number: " + vehicleNumber);  System.out.println("Speed: " + speed); 
 System.out.println("Brand: " + brand); 
 System.out.println("Number of Doors: " + numberOfDoors);  } 
} 
class Bike extends Vehicle{ 
 boolean hasGear; 
 Bike(int vehicleNumber, int speed, String brand, boolean hasGear){  super(vehicleNumber, speed, brand); 
 this.hasGear = hasGear; 
 } 
 void displayDetails(){ 
 System.out.println("Vehicle Number: " + vehicleNumber);  System.out.println("Speed: " + speed); 
 System.out.println("Brand: " + brand); 
 System.out.println("Has Gear: " + hasGear); 
 } 
}
