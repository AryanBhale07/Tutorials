import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class q3 { 
 public static void main(String[] args) { 
 JFrame f = new JFrame("Student Registration"); 
 f.setSize(400, 350); 
 f.setLayout(new FlowLayout()); 
 JTextField name = new JTextField(15); 
 JTextField regno = new JTextField(15);
 JRadioButton male = new JRadioButton("Male");  JRadioButton female = new JRadioButton("Female");  ButtonGroup bg = new ButtonGroup(); 
 bg.add(male); 
 bg.add(female); 
 String dept[] = {"CSE", "IT", "ECE", "EEE", "AIML"};  JComboBox<String> department = new JComboBox<>(dept); 
 JButton submit = new JButton("Submit"); 
 f.add(new JLabel("Student Name:")); 
 f.add(name); 
 f.add(new JLabel("Register Number:")); 
 f.add(regno); 
 f.add(new JLabel("Gender:")); 
 f.add(male); 
 f.add(female); 
 f.add(new JLabel("Department:")); 
 f.add(department); 
 f.add(submit); 
 submit.addActionListener(new ActionListener() {  public void actionPerformed(ActionEvent e) {  String gender = ""; 
 if (male.isSelected()) 
 gender = "Male"; 
 else if (female.isSelected())
 gender = "Female"; 
 JOptionPane.showMessageDialog(f, 
 "Student Name: " + name.getText() + 
 "\nRegister Number: " + regno.getText() + 
 "\nGender: " + gender + 
 "\nDepartment: " + department.getSelectedItem()); 
 } 
 }); 
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 f.setVisible(true); 
 } 
} 
