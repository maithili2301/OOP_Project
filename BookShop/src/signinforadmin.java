import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class signinforadmin {

	private JFrame frame;
	private JTextField username1;
	private JTextField password1;

	/**
	 * Launch the application.
	 */
	public static void SignInAdminScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signinforadmin  window = new signinforadmin();
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
	public signinforadmin() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(34, 139, 34));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Login");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Myanmar Text", Font.BOLD, 30));
		lblNewLabel.setBounds(286, 11, 175, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(34, 68, 653, 278);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Username : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(72, 44, 121, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password : ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(72, 100, 121, 25);
		panel.add(lblNewLabel_1_1);
		
		username1 = new JTextField();
		username1.setBounds(252, 44, 292, 25);
		panel.add(username1);
		username1.setColumns(10);
		
		password1 = new JTextField();
		password1.setColumns(10);
		password1.setBounds(252, 100, 292, 25);
		panel.add(password1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
					Statement stmt=con.createStatement();
					String sql="Select * from adminlogininfo  where username='"+username1.getText()+"' and password='"+password1.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					adminloginpage alp1=new  adminloginpage();

					if(rs.next())

						alp1.AdminLoginScreen();
					else
						JOptionPane.showMessageDialog(null, "Incorrect name or password");
					con.close();
				}
				catch(Exception ex)
				{
					System.out.print(ex);
				}

				 
				
			}
		});
		btnNewButton.setBackground(new Color(255, 69, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(165, 168, 106, 23);
		panel.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				useradminClass ua1=new useradminClass();
				ua1.UserAdminScreen();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCancel.setBackground(new Color(255, 69, 0));
		btnCancel.setBounds(355, 168, 100, 23);
		panel.add(btnCancel);
		frame.setBounds(100, 100, 761, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
