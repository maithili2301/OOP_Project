import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class adminhome {
	public static int open=0;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminhome window = new adminhome();
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
	public adminhome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1381, 742);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Add New Question");
		mnNewMenu_1.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\Qems Icon Jframe\\add new question.png"));
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu_1);
		
		JMenu mnUpdateQuestion_1 = new JMenu("Update Question");
		mnUpdateQuestion_1.setBorder(new TitledBorder(null, "Navigation Bar", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		mnUpdateQuestion_1.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\Qems Icon Jframe\\Update Question.png"));
		mnUpdateQuestion_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnUpdateQuestion_1);
		
		JMenu mnAllQuestion_1 = new JMenu("All Question");
		mnAllQuestion_1.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\Qems Icon Jframe\\all questions.png"));
		mnAllQuestion_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnAllQuestion_1);
		
		JMenu mnDeleteQuestion_1 = new JMenu("Delete Question");
		mnDeleteQuestion_1.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\Qems Icon Jframe\\delete Question.png"));
		mnDeleteQuestion_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnDeleteQuestion_1);
		
		JMenu mnAllStudentResult_1 = new JMenu("All Student Result");
		mnAllStudentResult_1.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\Qems Icon Jframe\\all student result.png"));
		mnAllStudentResult_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnAllStudentResult_1);
		
		JMenu mnLogout_1 = new JMenu("Logout");
		mnLogout_1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame jf =new JFrame();
				jf.setAlwaysOnTop(true);
				int a=JOptionPane.showConfirmDialog(jf,"Do you really want to logout","Select",JOptionPane.YES_NO_OPTION);
				if(a==0) {
					setVisible(false);
					new loginAdmin().setVisible(true);
				}
			}
		});
		mnLogout_1.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\Qems Icon Jframe\\Logout.png"));
		mnLogout_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnLogout_1);
		
		JMenu mnExit_1 = new JMenu("Exit");
		mnExit_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame jf =new JFrame();
				jf.setAlwaysOnTop(true);
				int a=JOptionPane.showConfirmDialog(jf,"Do you really want to Exit Application","Select",JOptionPane.YES_NO_OPTION);
				if(a==0) {
					System.exit(0);
				}
			}
			
		});
		mnExit_1.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\Qems Icon Jframe\\Close.png"));
		mnExit_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnExit_1);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\Qems Icon Jframe\\index background.png"));
		lblNewLabel.setBounds(10, 0, 1367, 612);
		frame.getContentPane().add(lblNewLabel);
	}
}
