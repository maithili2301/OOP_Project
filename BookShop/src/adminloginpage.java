import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminloginpage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void AdminLoginScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminloginpage window = new adminloginpage();
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
	public adminloginpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(173, 255, 47));
		frame.setBounds(100, 100, 818, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 782, 76);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Student data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(10, 22, 127, 27);
		panel.add(btnNewButton);
		
		JButton btnExam = new JButton("Exam");
		btnExam.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExam.setBounds(147, 22, 127, 27);
		panel.add(btnExam);
		
		JButton btnAddExam = new JButton("Add Exam");
		btnAddExam.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAddExam.setBounds(284, 22, 127, 27);
		panel.add(btnAddExam);
		
		JButton btnResult = new JButton("Result");
		btnResult.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnResult.setBounds(421, 22, 127, 27);
		panel.add(btnResult);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signinforadmin sia1 =new signinforadmin();
				sia1.SignInAdminScreen();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogout.setBounds(645, 26, 127, 27);
		panel.add(btnLogout);
	}

}
