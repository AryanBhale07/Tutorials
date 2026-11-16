package Q2;

import javax.swing.*; 
class Controller { 
 Controller(Model model, View view) { 
 view.calculate.addActionListener(e -> { 
 if (view.regno.getText().isEmpty()) { 
 JOptionPane.showMessageDialog(view, "Enter registration number");  return; 
 } 
 if (!view.bike.isSelected() && !view.car.isSelected()) {  JOptionPane.showMessageDialog(view, "Select vehicle type");  return; 
 } 
 model.calculate( 
 view.s1.isSelected(), 
 view.s2.isSelected(), 
 view.s3.isSelected(), 
 view.s4.isSelected() 
 ); 
 view.result.setText("Total Cost: Rs." + model.total); 
 JOptionPane.showMessageDialog(view,
 "Registration Number: " + view.regno.getText() + 
 "\nVehicle Type: " + 
 (view.bike.isSelected() ? "Two Wheeler" : "Car") + 
 "\nTotal Service Cost: Rs." + model.total); 
 }); 
 } 
} 

