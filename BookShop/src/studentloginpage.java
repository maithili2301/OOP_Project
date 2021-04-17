import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studentloginpage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void StudentLogInScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentloginpage window = new studentloginpage();
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
	public studentloginpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(173, 255, 47));
		frame.setBounds(100, 100, 847, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 811, 75);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Exams");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exams exm=new exams();
				exm.ExamSelectionScreen();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(23, 11, 89, 37);
		panel.add(btnNewButton);
		
		JButton btnResult = new JButton("Result");
		btnResult.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnResult.setBounds(120, 11, 89, 37);
		panel.add(btnResult);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signinforstudent sis1=new signinforstudent();
				sis1.SignInStudentScreen();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogout.setBounds(689, 13, 100, 37);
		panel.add(btnLogout);
		
		JButton btnContactAdmin = new JButton("Contact Admin");
		btnContactAdmin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnContactAdmin.setBounds(219, 11, 147, 39);
		panel.add(btnContactAdmin);
		
		JLabel lblNewLabel = new JLabel("Welcome...");
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.BOLD, 30));
		lblNewLabel.setBounds(219, 166, 269, 62);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Here are some practice tests for you...");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(229, 239, 358, 22);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
