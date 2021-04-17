import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class studentdataforadmin {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentdataforadmin window = new studentdataforadmin();
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
	public studentdataforadmin() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(154, 205, 50));
		frame.setBounds(100, 100, 808, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Show Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  try {
					  Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
						Statement stmt=con.createStatement();
						String sql="Select * from studentinfo ";
						ResultSet rs=stmt.executeQuery(sql);
//					 pstm.executeUpdate();
					 while(rs.next()) {
						 String Student_Name=rs.getString(1);
						 System.out.println(Student_Name);
						 String Username=rs.getString(1);
						 System.out.println(Username);
						 String Password=rs.getString(1);
						 System.out.println(Password);
					 }
				  }catch(Exception ex) {
					  
				  }
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(58, 30, 144, 23);
		frame.getContentPane().add(btnNewButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(58, 98, 658, 235);
		frame.getContentPane().add(textPane);
	}
}
