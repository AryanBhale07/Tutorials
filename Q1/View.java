package Q1;
import javax.swing.*; 
import java.awt.*; 
class View extends JFrame { 
 JTextField name = new JTextField(15); 
 JTextField m1 = new JTextField(5); 
 JTextField m2 = new JTextField(5); 
 JTextField m3 = new JTextField(5); 
 JButton calculate = new JButton("Calculate Result"); 
 View() { 
 setTitle("Student Grade Calculator");  setSize(350, 300); 
 setLayout(new FlowLayout()); 
 add(new JLabel("Student Name:"));
 add(name); 
 add(new JLabel("Subject 1:")); 
 add(m1); 
 add(new JLabel("Subject 2:")); 
 add(m2); 
 add(new JLabel("Subject 3:")); 
 add(m3); 
 add(calculate); 
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 setVisible(true); 
 } 
} 

