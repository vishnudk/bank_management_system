package gasd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.JTree;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javax.swing.JTextField;
import java.awt.Font;

public class home_page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static home_page frame = new home_page();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	static String UserName,NewPassword,CPassword,First_name,Last_name,phone_number_txt,dob,father_name,mother_name,house_name,sex;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public home_page() {
		
		try {
			FileInputStream fi = new FileInputStream(new File("BankFile.txt"));
	        ObjectInputStream oi = new ObjectInputStream(fi);
			// Read objects
	        Bank pr1 = (Bank) oi.readObject();
	        UserName = pr1.getUsername();
	        CPassword = pr1.getPassword();
	        First_name = pr1.getFirstName();
	        Last_name = pr1.getLastName();
	        phone_number_txt = pr1.getPhno();
	        dob = pr1.getDob();
	        father_name = pr1.getFatherName();
	        mother_name = pr1.getMotherName();
	        house_name=pr1.getHouseName();
	        sex=pr1.getSex();
			}
			catch(Exception e)
			{
				
			}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHome = new JButton("HOME");
		btnHome.setForeground(Color.BLACK);
		btnHome.setBounds(602, 12, 117, 25);
		contentPane.add(btnHome);
		
		JButton btnProfile = new JButton("PROFILE");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				profile4 p4=new profile4();
				frame.setVisible(false);
				p4.setVisible(true);
				//frame.dispose();
			}
		});
		btnProfile.setBounds(473, 12, 117, 25);
		contentPane.add(btnProfile);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(-1, 49, 730, 57);
		contentPane.add(separator);
		
		String a[]= {"d","e","f"};
		
		JLabel lblWelcome = new JLabel("WELCOME :"+First_name);
		lblWelcome.setForeground(Color.WHITE);
		lblWelcome.setBounds(49, 87, 204, 15);
		contentPane.add(lblWelcome);
		
		JLabel lblTransaction = new JLabel("Transaction");
		lblTransaction.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTransaction.setForeground(Color.WHITE);
		lblTransaction.setBounds(286, 87, 173, 65);
		contentPane.add(lblTransaction);
		
		JLabel lblEnterTheAccount = new JLabel("enter the account number");
		lblEnterTheAccount.setForeground(Color.WHITE);
		lblEnterTheAccount.setBounds(49, 155, 280, 15);
		contentPane.add(lblEnterTheAccount);
		
		textField = new JTextField();
		textField.setBounds(49, 182, 243, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterTheAmount = new JLabel("enter the amount ");
		lblEnterTheAmount.setForeground(Color.WHITE);
		lblEnterTheAmount.setBounds(49, 214, 218, 15);
		contentPane.add(lblEnterTheAmount);
		
		textField_1 = new JTextField();
		textField_1.setBounds(49, 241, 243, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnTransact = new JButton("Transact");
		btnTransact.setBounds(557, 488, 117, 25);
		contentPane.add(btnTransact);
		
		JLabel lblEnterOtp = new JLabel("Enter OTP");
		lblEnterOtp.setForeground(Color.WHITE);
		lblEnterOtp.setBounds(59, 272, 117, 15);
		contentPane.add(lblEnterOtp);
		
		textField_2 = new JTextField();
		textField_2.setBounds(57, 305, 235, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/home/vishnu/Desktop/gasd/src/gasd/05c9ace61b57c06f42eecbbd6dddd5a1.jpg"));
		label.setBounds(-1, -35, 772, 625);
		contentPane.add(label);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
