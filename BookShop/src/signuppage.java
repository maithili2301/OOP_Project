import java.awt.EventQueue;


import java.sql.*;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class signuppage {

	private JFrame frame;
	private JTextField textName;
	private JTextField textUsername;
	private JTextField textPass;

	/**
	 * Launch the application.
	 */
	public static void SignUpPage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signuppage window = new signuppage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public signuppage() {
		initialize();
		Connect();
	}
// 	for connection and preparestatement i have importedt java.sql.*; 
	Connection con;
	PreparedStatement pst; 
//	Statement stm=null;
	
	 public void Connect()
	 {
// 		 this is database connection
		 try
		 { Class.forName("com.mysql.jdbc.Driver");
		  con= DriverManager.getConnection("jdbc:mysql://localhost/students","root","");
		  

		 }
		 catch(ClassNotFoundException ex){
			 
		 }
		 catch(SQLException ex) {
			 
		 }
	 }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(34, 139, 34));
		frame.setBounds(100, 100, 851, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(24, 77, 788, 336);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Student Name : ");
		lblNewLabel_1.setBounds(34, 72, 65, -24);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(55, 86, 27, -17);
		panel.add(label);
		
		JLabel lblNewLabel_2 = new JLabel("Student Name : ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(55, 23, 163, 25);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Username : ");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(55, 98, 163, 25);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Password : ");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_3.setBounds(55, 156, 202, 36);
		panel.add(lblNewLabel_2_3);
		
		textName = new JTextField();
		textName.setBounds(273, 23, 348, 25);
		panel.add(textName);
		textName.setColumns(10);
		
		textUsername = new JTextField();
		textUsername.setColumns(10);
		textUsername.setBounds(273, 102, 348, 25);
		panel.add(textUsername);
		
		textPass = new JTextField();
		textPass.setColumns(10);
		textPass.setBounds(273, 166, 348, 25);
		panel.add(textPass);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
// 				after clicking save button info is saved in database
				String StuName, Username,Password;
				StuName=textName.getText();
				
				Username=textUsername.getText();
				
				Password=textPass.getText();
				
				try {
					pst=con.prepareStatement("insert into studentinfo(Student_Name,Username,Password)values(?,?,?) ");
//					String sql1="insert into studentinfo(Student_Name,Username,Password)values('?','?','?') ";
//					pst=con.prepareStatement(sql1);
					pst.setString(1,StuName);
				
					pst.setString(2, Username);
					pst.setString(3,Password);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record saved succesfully");
// 					by following code text boxes will be empty after saving previous records
					textName.setText("");
					
					textUsername.setText("");
					textPass.setText("");
					textName.requestFocus();
					
				}
				catch(Exception el)
				{
					System.out.print(el);
				}
			}

			

			
		});
		btnNewButton.setBackground(new Color(220, 20, 60));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(154, 271, 137, 29);
		panel.add(btnNewButton);
		 
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
// 				after clicking back we will jump to homepage
				homepage hp2=new homepage();
				hp2.main(null);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnCancel.setBackground(new Color(220, 20, 60));
		btnCancel.setBounds(392, 271, 137, 29);
		panel.add(btnCancel);
		
		JLabel lblNewLabel = new JLabel("Student Registration");
		lblNewLabel.setFont(new Font("Myanmar Text", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBounds(238, 21, 294, 45);
		frame.getContentPane().add(lblNewLabel);
	}
}
