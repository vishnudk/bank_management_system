package gasd;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bank_management {

	public String password,username;
	private JFrame frame;
	private JPasswordField pwdHsvdnk;
	private JTextField txtUserName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bank_management window = new bank_management();
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
	public bank_management() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//String password,username;
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		pwdHsvdnk = new JPasswordField();
		pwdHsvdnk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			 password=arg0.getActionCommand();
			}
		});
		pwdHsvdnk.setToolTipText("enter your password!!");
		pwdHsvdnk.setHorizontalAlignment(JTextField.CENTER);
		pwdHsvdnk.setBounds(85, 150, 265, 33);
		frame.getContentPane().add(pwdHsvdnk);
		
		txtUserName = new JTextField();
		txtUserName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username=e.getActionCommand();
				System.out.println(username);
			}
		});
		txtUserName.setToolTipText("enter your user name!!");
		txtUserName.setHorizontalAlignment(JTextField.CENTER);
		txtUserName.setBounds(85, 71, 265, 33);
		frame.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblUsername = new JLabel("USER NAME");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBackground(Color.BLACK);
		lblUsername.setBounds(85, 28, 170, 42);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBackground(Color.BLACK);
		lblPassword.setBounds(85, 111, 95, 42);
		frame.getContentPane().add(lblPassword);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String response=e.getActionCommand();
				if(response=="Sign Up")
				{
					frame.dispose();
					registration r1=new registration();
					r1.setVisible(true);
					r1.setExtendedState(JFrame.MAXIMIZED_BOTH);
					System.out.println("signup being pressed"+password+"=="+username);
				}
				
			}
		});
		btnSignUp.setToolTipText("click to sign up!!");
		btnSignUp.setBounds(233, 235, 100, 25);
		frame.getContentPane().add(btnSignUp);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String response=e.getActionCommand();
				if(response=="Sign In")
				{
					frame.dispose();
					home_page hp=new home_page();
					hp.setVisible(true);
					//hp.setExtendedState(JFrame.MAXIMIZED_BOTH);
					System.out.println("sign in being pressed");
				}
			}
		});
		btnSignIn.setBounds(108, 235, 107, 25);
		frame.getContentPane().add(btnSignIn);
		
		JLabel lblBankmanagement = new JLabel("");
		lblBankmanagement.setForeground(Color.WHITE);
		lblBankmanagement.setIcon(new ImageIcon("/home/vishnu/Desktop/gasd/src/gasd/05c9ace61b57c06f42eecbbd6dddd5a1 (copy).jpg"));
		lblBankmanagement.setBounds(-26, -121, 557, 525);
		frame.getContentPane().add(lblBankmanagement);
	}
}
