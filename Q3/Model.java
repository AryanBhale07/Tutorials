package Q3;

import java.util.*; 
class Model { 
 String username = "admin"; 
 String password = "admin123"; 
 ArrayList<String> employees = new ArrayList<>(); 
 boolean login(String u, String p) { 
 return username.equals(u) && password.equals(p); 
 } 
 void addEmployee(String id, String name, String dept) { 
 employees.add(id + " - " + name + " - " + dept); 
 } 
 boolean changePassword(String old, String pass, String confirm) { 
 if (password.equals(old) && pass.equals(confirm) && !pass.isEmpty()) {  password = pass; 
 return true; 
 } 
 return false; 
 }
} 

