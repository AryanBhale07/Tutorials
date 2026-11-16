package Q1;
class Model { 
 String name; 
 int m1, m2, m3; 
 int total; 
 double avg; 
 String grade; 
 void calculate(String n, int a, int b, int c) { 
 name = n; 
 m1 = a; 
 m2 = b; 
 m3 = c; 
 total = m1 + m2 + m3; 
 avg = total / 3.0;
 if (avg >= 90) 
 grade = "A"; 
 else if (avg >= 75) 
 grade = "B"; 
 else if (avg >= 60) 
 grade = "C"; 
 else if (avg >= 50) 
 grade = "D"; 
 else 
 grade = "F"; 
 } 
} 


