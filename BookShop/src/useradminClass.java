import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class useradminClass {

	private JFrame frame;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void UserAdminScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					useradminClass window = new useradminClass();
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
	public useradminClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 0));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(250, 22, 125, 53);
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Myanmar Text", Font.BOLD, 40));
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(31, 85, 579, 240);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				homepage hp2=new homepage();
				hp2.main(null);
			}
			
		});
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(225, 174, 89, 23);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Student");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signinforstudent sis1=new signinforstudent();
				sis1.SignInStudentScreen() ;
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1.setBounds(193, 48, 154, 37);
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Admin");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signinforadmin sia1=new signinforadmin();
				sia1.SignInAdminScreen();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_2.setBounds(193, 107, 154, 37);
		panel.add(btnNewButton_2);
		frame.setBackground(new Color(0, 128, 0));
		frame.setBounds(100, 100, 665, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
