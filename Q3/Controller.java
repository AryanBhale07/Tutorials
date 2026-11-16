package Q3;
import javax.swing.*; 
class Controller { 
 Controller(Model m, View v) { 
 v.login.addActionListener(e -> { 
 String u = v.username.getText(); 
 String p = new String(v.password.getPassword()); 
 if (m.login(u, p)) { 
 JOptionPane.showMessageDialog(v, "Login Successful");  v.showHome(); 
 } else { 
 JOptionPane.showMessageDialog(v, "Invalid Username or Password");  } 
 }); 
 v.add.addActionListener(e -> { 
 JTextField id = new JTextField(); 
 JTextField name = new JTextField(); 
 JTextField dept = new JTextField(); 
 Object[] fields = { 
 "Employee ID:", id, 
 "Employee Name:", name, 
 "Department:", dept 
 }; 
 int result = JOptionPane.showConfirmDialog(v, fields,
 "Add Employee", JOptionPane.OK_CANCEL_OPTION); 
 if (result == JOptionPane.OK_OPTION) { 
 if (id.getText().isEmpty() || name.getText().isEmpty()  || dept.getText().isEmpty()) { 
 JOptionPane.showMessageDialog(v, "Fill all fields");  } else { 
 m.addEmployee(id.getText(), name.getText(), dept.getText());  JOptionPane.showMessageDialog(v, "Employee Added Successfully");  } 
 } 
 }); 
 v.view.addActionListener(e -> { 
 String data = ""; 
 for (String emp : m.employees) 
 data += emp + "\n"; 
 if (data.isEmpty()) 
 data = "No Employees Found"; 
 JOptionPane.showMessageDialog(v, data, "Employee Details",  JOptionPane.INFORMATION_MESSAGE); 
 }); 
 v.change.addActionListener(e -> { 
 JPasswordField old = new JPasswordField(); 
 JPasswordField pass = new JPasswordField(); 
 JPasswordField confirm = new JPasswordField();
 Object[] fields = { 
 "Old Password:", old, 
 "New Password:", pass, 
 "Confirm Password:", confirm 
 }; 
 int result = JOptionPane.showConfirmDialog(v, fields, 
 "Change Password", JOptionPane.OK_CANCEL_OPTION); 
 if (result == JOptionPane.OK_OPTION) { 
 boolean changed = m.changePassword( 
 new String(old.getPassword()), 
 new String(pass.getPassword()), 
 new String(confirm.getPassword()) 
 ); 
 if (changed) 
 JOptionPane.showMessageDialog(v, "Password Changed Successfully");  else 
 JOptionPane.showMessageDialog(v, "Invalid old password or passwords do not  match"); 
 } 
 }); 
 v.logout.addActionListener(e -> { 
 v.setJMenuBar(null); 
 v.getContentPane().removeAll(); 
 v.setTitle("Employee Login");
 v.setSize(300, 180); 
 v.setLayout(new java.awt.FlowLayout()); 
 v.add(new JLabel("Username:")); 
 v.add(v.username); 
 v.add(new JLabel("Password:")); 
 v.add(v.password); 
 v.add(v.login); 
 v.username.setText(""); 
 v.password.setText(""); 
 v.revalidate(); 
 v.repaint(); 
 }); 
 v.exit.addActionListener(e -> System.exit(0)); 
 } 
} 

