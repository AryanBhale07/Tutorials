package Q1;

import javax.swing.*; 
class Controller { 
 Controller(Model model, View view) { 
 view.calculate.addActionListener(e -> { 
 try { 
 String name = view.name.getText(); 
 int a = Integer.parseInt(view.m1.getText()); 
 int b = Integer.parseInt(view.m2.getText()); 
 int c = Integer.parseInt(view.m3.getText()); 
 if (name.isEmpty() || a < 0 || a > 100 || 
 b < 0 || b > 100 || c < 0 || c > 100) { 
 JOptionPane.showMessageDialog(view, "Enter valid details and marks between 0  and 100");
 return; 
 } 
 model.calculate(name, a, b, c); 
 JOptionPane.showMessageDialog(view, 
 "Student Name: " + model.name + 
 "\nTotal Marks: " + model.total + 
 "\nAverage: " + String.format("%.2f", model.avg) + 
 "\nGrade: " + model.grade); 
 } catch (NumberFormatException ex) { 
 JOptionPane.showMessageDialog(view, "Enter valid marks");  } 
 }); 
 } 
} 


