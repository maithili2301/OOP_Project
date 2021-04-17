import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class welcomepageClass {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcomepageClass window = new welcomepageClass();
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
	public welcomepageClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(154, 205, 50));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Online Test Series");
		lblNewLabel.setFont(new Font("Myanmar Text", Font.PLAIN, 30));
		lblNewLabel.setBounds(188, 142, 430, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//here when we click on NEXT button the user admin screen will be visible.
//				useradminClass ua1=new useradminClass();
//				ua1.UserAdminScreen();
			
			}
		});
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(647, 353, 105, 33);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 808, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
