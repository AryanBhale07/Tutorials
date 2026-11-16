import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class q4 { 
 public static void main(String[] args) { 
 JFrame f = new JFrame("User Login"); 
 f.setSize(350, 300); 
 f.setLayout(new FlowLayout()); 
 JTextField username = new JTextField(15);
 JPasswordField password = new JPasswordField(15); 
 JCheckBox remember = new JCheckBox("Remember Me"); 
 JCheckBox notify = new JCheckBox("Receive Notifications");  JButton login = new JButton("Login"); 
 f.add(new JLabel("Username:")); 
 f.add(username); 
 f.add(new JLabel("Password:")); 
 f.add(password); 
 f.add(remember); 
 f.add(notify); 
 f.add(login); 
 login.addActionListener(new ActionListener() { 
 public void actionPerformed(ActionEvent e) { 
 if (username.getText().isEmpty() || 
 password.getPassword().length == 0) { 
 JOptionPane.showMessageDialog(f, "Please enter username and password");  } else { 
 JOptionPane.showMessageDialog(f, 
 "Login Successful\nUsername: " + username.getText() +  "\nRemember Me: " + remember.isSelected() + 
 "\nReceive Notifications: " + notify.isSelected()); 
 } 
 } 
 }); 
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 f.setVisible(true);
 } 
} 
