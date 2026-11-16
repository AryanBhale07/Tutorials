import javax.swing.*; 
import javax.swing.table.DefaultTableModel; 
import java.awt.*; 
public class q5 { 
 public static void main(String[] args) { 
 JFrame f = new JFrame("Student Course Management"); 
 f.setSize(600, 400); 
 f.setLayout(new FlowLayout()); 
 String courses[] = {"Java", "Python", "C Programming", "Web Development",  "Database"}; 
 JList<String> list = new JList<>(courses); 
 list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  JScrollPane sp1 = new JScrollPane(list); 
 sp1.setPreferredSize(new Dimension(150, 100)); 
 String data[][] = {}; 
 String columns[] = {"Student Name", "Course", "Status"}; 
 DefaultTableModel model = new DefaultTableModel(data, columns);  JTable table = new JTable(model); 
 JScrollPane sp2 = new JScrollPane(table); 
 sp2.setPreferredSize(new Dimension(400, 150));
 JTextField name = new JTextField(12); 
 JButton add = new JButton("Add Registration"); 
 JButton remove = new JButton("Remove Registration"); 
 f.add(new JLabel("Student Name:")); 
 f.add(name); 
 f.add(new JLabel("Available Courses:")); 
 f.add(sp1); 
 f.add(add); 
 f.add(remove); 
 f.add(sp2); 
 add.addActionListener(e -> { 
 String student = name.getText(); 
 String course = list.getSelectedValue(); 
 if (student.isEmpty() || course == null) { 
 JOptionPane.showMessageDialog(f, "Enter name and select a course");  } else { 
 model.addRow(new Object[]{student, course, "Enrolled"});  name.setText(""); 
 } 
 }); 
 remove.addActionListener(e -> { 
 int row = table.getSelectedRow(); 
 if (row != -1) { 
 model.removeRow(row);
 } else { 
 JOptionPane.showMessageDialog(f, "Select a registration to remove");  } 
 }); 
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 f.setVisible(true); 
 } 
} 
