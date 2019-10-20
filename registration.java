package gasd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registration extends JFrame {
	String UserName,NewPassword,CPassword;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration frame = new registration();
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public registration() {
		setTitle("Registration From");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setBounds(26, 37, 133, 15);
		contentPane.add(lblFirstName);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setBounds(26, 59, 346, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setBounds(26, 89, 113, 15);
		contentPane.add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(26, 116, 346, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setForeground(Color.WHITE);
		lblPhoneNumber.setBounds(26, 137, 113, 41);
		contentPane.add(lblPhoneNumber);
		
		textField_2 = new JTextField();
		textField_2.setBounds(26, 169, 346, 29);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setForeground(Color.WHITE);
		lblDob.setBounds(26, 210, 70, 15);
		contentPane.add(lblDob);
		
		textField_3 = new JTextField();
		textField_3.setBounds(26, 232, 346, 29);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblFathersName = new JLabel("Father's Name");
		lblFathersName.setForeground(Color.WHITE);
		lblFathersName.setBounds(26, 261, 133, 15);
		contentPane.add(lblFathersName);
		
		textField_4 = new JTextField();
		textField_4.setBounds(25, 288, 346, 29);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblMothersName = new JLabel("Mother's Name");
		lblMothersName.setForeground(Color.WHITE);
		lblMothersName.setBounds(26, 329, 148, 15);
		contentPane.add(lblMothersName);
		
		textField_5 = new JTextField();
		textField_5.setBounds(26, 357, 346, 29);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblHouseName = new JLabel("House Name");
		lblHouseName.setForeground(Color.WHITE);
		lblHouseName.setBounds(36, 386, 123, 15);
		contentPane.add(lblHouseName);
		
		textField_6 = new JTextField();
		textField_6.setBounds(26, 413, 346, 29);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(Color.WHITE);
		lblGender.setBounds(26, 449, 70, 15);
		contentPane.add(lblGender);
		
		 String cb1[]= {" ","M","F","other"};
		JComboBox comboBox = new JComboBox(cb1);
		comboBox.setBounds(26, 476, 80, 24);
		contentPane.add(comboBox);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String res=e.getActionCommand();
				if(res=="Reset") {
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					textField_7.setText("");
					textField_8.setText("");
					textField_9.setText("");
					comboBox.setSelectedItem(" ");
					
				}
			}
		});
		btnReset.setForeground(Color.BLACK);
		btnReset.setBounds(172, 502, 117, 32);
		contentPane.add(btnReset);
		
		JLabel lblRegistrationForm = new JLabel("Registration Form");
		lblRegistrationForm.setForeground(Color.WHITE);
		lblRegistrationForm.setBounds(291, 12, 148, 15);
		contentPane.add(lblRegistrationForm);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setForeground(Color.WHITE);
		lblUserName.setBounds(425, 37, 104, 15);
		contentPane.add(lblUserName);
		
		textField_7 = new JTextField();
		textField_7.setBounds(425, 59, 274, 24);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setForeground(Color.WHITE);
		lblNewPassword.setBounds(425, 89, 133, 15);
		contentPane.add(lblNewPassword);
		
		textField_8 = new JTextField();
		textField_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewPassword=e.getActionCommand();
			}
		});
		textField_8.setBounds(425, 116, 274, 29);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setForeground(Color.WHITE);
		lblConfirmPassword.setBounds(425, 150, 139, 15);
		contentPane.add(lblConfirmPassword);
		
		textField_9 = new JTextField();
		textField_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CPassword=e.getActionCommand();
			}
		});
		textField_9.setBounds(425, 169, 274, 24);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(435, 210, 264, 15);
		contentPane.add(lblNewLabel);
		
		JButton btnSave = new JButton("save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(CPassword==NewPassword)
				{
					if(CPassword=="")
					{
						lblNewLabel.setText("");	
					}
					else
					lblNewLabel.setText("confirmed");
				}
				else
				{
					lblNewLabel.setText("wrong!!");
				}
			}
		});
		btnSave.setBounds(390, 504, 117, 29);
		contentPane.add(btnSave);
		
		JLabel label = new JLabel("");
		label.setBounds(-15, -20, 773, 1475);
		label.setIcon(new ImageIcon("/home/vishnu/Downloads/Red Island [1920x1080]"));
		contentPane.add(label);
	}
}
