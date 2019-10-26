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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class bank_management {

	public String password,username;
   JFrame frame;
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
		
		JLabel lblTest = new JLabel("");
		lblTest.setForeground(Color.RED);
		lblTest.setBounds(85, 195, 287, 15);
		frame.getContentPane().add(lblTest);
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
					int flag=-1;
					Bank p1 = new Bank();
			        //Bank p2 = new Bank("Vishn", "DK", "D","K", "DK","20 May" ,99999,"iopo");

			        try {
			            //FileOutputStream f = new FileOutputStream(new File("BankFile.txt"));
			            //ObjectOutputStream o = new ObjectOutputStream(f);

			            // Write objects to file
			            //o.writeObject(p1);
			           

			            //o.close();
			            //f.close();

			            FileInputStream fi = new FileInputStream(new File("BankFile.txt"));
			            ObjectInputStream oi = new ObjectInputStream(fi);
			
			{
			            // Read objects
			            Bank pr1 = (Bank) oi.readObject();
			            String s = pr1.getFirstName();
                       // String s=pr1.getUsername();

			            if (s.equalsIgnoreCase(username)) {

			                String p = pr1.getPassword();
			                if (p.equalsIgnoreCase(password)) {
			                   
			                	
			                	frame.dispose();
								home_page hp=new home_page();
								hp.setVisible(true);
								//hp.setExtendedState(JFrame.MAXIMIZED_BOTH);
								System.out.println("sign in being pressed");
			                	
			                	
			                	
			                } else {
			                	lblTest.setText("not authorized!!");
			                    //System.out.println("nooooooooo");
			                }
			            }

			            System.out.println(pr1.toString());
			      
			        }
			            oi.close();
			            fi.close();

			        } catch (FileNotFoundException e1) {
			            System.out.println("File not found");
			        } catch (IOException e1) {
			            System.out.println("Error initializing stream");
			        } catch (ClassNotFoundException e1) {

			            e1.printStackTrace();
			        }

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
