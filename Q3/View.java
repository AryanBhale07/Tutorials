package Q3;
import javax.swing.*; 
import java.awt.*; 
class View extends JFrame { 
 JTextField username = new JTextField(15); 
 JPasswordField password = new JPasswordField(15);  JButton login = new JButton("Login"); 
 JMenuItem add = new JMenuItem("Add Employee");  JMenuItem view = new JMenuItem("View Employee");  JMenuItem change = new JMenuItem("Change Password");  JMenuItem logout = new JMenuItem("Logout");  JMenuItem exit = new JMenuItem("Exit Application"); 
 View() { 
 setTitle("Employee Login"); 
 setSize(300, 180); 
 setLayout(new FlowLayout()); 
 add(new JLabel("Username:")); 
 add(username); 
 add(new JLabel("Password:")); 
 add(password); 
 add(login); 
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  setVisible(true);
 } 
 void showHome() { 
 getContentPane().removeAll(); 
 setTitle("Employee Management Portal"); 
 setSize(500, 300); 
 setLayout(new FlowLayout()); 
 JMenuBar bar = new JMenuBar(); 
 JMenu employee = new JMenu("Employee"); 
 JMenu tools = new JMenu("Tools"); 
 JMenu ex = new JMenu("Exit"); 
 employee.add(add); 
 employee.add(view); 
 tools.add(change); 
 ex.add(logout); 
 ex.add(exit); 
 bar.add(employee); 
 bar.add(tools); 
 bar.add(ex); 
 setJMenuBar(bar); 
 add(new JLabel("Welcome to Employee Management Portal"));  revalidate(); 
 repaint(); 
 } 
}
