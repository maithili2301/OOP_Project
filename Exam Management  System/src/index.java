import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class index {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index window = new index();
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
	public index() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1320, 753);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Student");
		btnNewButton.setBounds(516, 99, 186, 63);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\Qems Icon Jframe\\index student.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.setBounds(757, 99, 167, 63);
		btnAdmin.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\Qems Icon Jframe\\index admin.png"));
		btnAdmin.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(btnAdmin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			int a;
			public void actionPerformed(ActionEvent e) {
				
				a=JOptionPane.showConfirmDialog(null,"Do You Want to Exit Application ?","Select",JOptionPane.YES_NO_OPTION);
				if(a==0) {
					System.exit(0);
				}
				
			}
		});
		
		btnExit.setBounds(1033, 99, 179, 63);
		btnExit.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\Qems Icon Jframe\\Close.png"));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\Qems Icon Jframe\\index background.png"));
		lblNewLabel.setBounds(0, 0, 1306, 716);
		frame.getContentPane().add(lblNewLabel);
	}
}
