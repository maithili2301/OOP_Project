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
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class signinforstudent{

	private JFrame frame;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void SignInStudentScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signinforstudent  window = new signinforstudent();
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
	public signinforstudent() {
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
		lblNewLabel.setFont(new Font("Myanmar Text", Font.BOLD, 35));
		lblNewLabel.setBounds(318, 21, 190, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(33, 92, 756, 309);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Username : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(56, 44, 121, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password : ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(56, 146, 121, 25);
		panel.add(lblNewLabel_1_1);
		
		username = new JTextField();
		username.setBounds(217, 48, 384, 25);
		panel.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.addComponentListener(new ComponentAdapter() {
			
		});
		password.setColumns(10);
		password.setBounds(217, 150, 384, 25);
		panel.add(password);
		
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
					Statement stmt=con.createStatement();
					String sql="Select * from studentinfo  where username='"+username.getText()+"' and password='"+password.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					studentloginpage slp1=new  studentloginpage();

					if(rs.next())

						slp1.StudentLogInScreen();
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
		btnNewButton.setBounds(190, 214, 130, 23);
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
		btnCancel.setBounds(407, 214, 121, 23);
		panel.add(btnCancel);
		
		JLabel lblNewLabel_2 = new JLabel("Don't have Account? Click here to register..");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(246, 260, 282, 16);
		panel.add(lblNewLabel_2);
		frame.setBounds(100, 100, 838, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
