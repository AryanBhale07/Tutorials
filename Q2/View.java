package Q2;

import javax.swing.*; 
import java.awt.*; 
class View extends JFrame { 
 JTextField regno = new JTextField(15); 
 JRadioButton bike = new JRadioButton("Two Wheeler"); 
 JRadioButton car = new JRadioButton("Car"); 
 JCheckBox s1 = new JCheckBox("General Service - Rs.1000");
 JCheckBox s2 = new JCheckBox("Oil Change - Rs.800");  JCheckBox s3 = new JCheckBox("Brake Service - Rs.1200");  JCheckBox s4 = new JCheckBox("Battery Check - Rs.500");  JButton calculate = new JButton("Calculate Cost");  JLabel result = new JLabel("Total Cost: Rs.0"); 
 View() { 
 setTitle("Vehicle Service Cost Estimator"); 
 setSize(350, 400); 
 setLayout(new FlowLayout()); 
 ButtonGroup bg = new ButtonGroup(); 
 bg.add(bike); 
 bg.add(car); 
 add(new JLabel("Registration Number:")); 
 add(regno); 
 add(new JLabel("Vehicle Type:")); 
 add(bike); 
 add(car); 
 add(new JLabel("Select Services:")); 
 add(s1); 
 add(s2); 
 add(s3); 
 add(s4); 
 add(calculate); 
 add(result); 
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setVisible(true); 
 } 
} 

