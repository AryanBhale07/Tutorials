class Ride { 
 int no; 
 String name;
 Ride(int no, String name) { 
 this.no = no; 
 this.name = name; 
 } 
} 
public class q5 { 
 public static void main(String[] args) {  Ride[] r = new Ride[5]; 
 r[0] = new Ride(1, "Ride 1");  r[1] = new Ride(2, "Ride 2");  r[2] = new Ride(3, "Ride 3");  r[3] = new Ride(4, "Ride 4");  r[4] = new Ride(5, "Ride 5"); 
 for (int i = 0; i < 5; i++) { 
 System.out.print(r[i].name + ": "); 
 for (int j = 0; j < r[i].no; j++) {  System.out.print("*");  } 
 System.out.println(); 
 } 
 } 
}
