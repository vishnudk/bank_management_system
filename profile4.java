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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class profile4 extends JFrame {

	private JPanel contentPane;
	public String UsrName="";

	/**
	 * Launch the application.
	 */
	public static profile4 frame = new profile4();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//profile4 frame = new profile4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void getusrName(String UsrName)
	{
		this.UsrName=UsrName;
	}

	/**
	 * Create the frame.
	 */
	public profile4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		FileStore fs=new FileStore();
		Bank b=new Bank();
		b=fs.fillData(b,UsrName);
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("/home/vishnu/Desktop/e1xternal-content.duckduckgo.com.jpeg"));
		label_1.setBounds(12, 12, 130, 143);
		contentPane.add(label_1);
		
		JLabel lblFirstName = new JLabel("First Name : "+b.getFirstName());
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setBounds(210, 65, 501, 15);
		contentPane.add(lblFirstName);

		//String a=" vishnu";
		JLabel lblLastName = new JLabel("Last Name : "+b.getLastName());
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setBounds(220, 123, 492, 15);
		contentPane.add(lblLastName);
		
		JLabel lblFathersName = new JLabel("Fathers Name : "+b.getFatherName());
		lblFathersName.setForeground(Color.WHITE);
		lblFathersName.setBounds(197, 183, 473, 15);
		contentPane.add(lblFathersName);
		
		JLabel lblMothersNmae = new JLabel("Mother's Nmae : "+b.getMotherName());
		lblMothersNmae.setForeground(Color.WHITE);
		lblMothersNmae.setBounds(197, 249, 486, 15);
		contentPane.add(lblMothersNmae);
		
		JLabel lblHouseName = new JLabel("House Name : "+b.getHouseName());
		lblHouseName.setForeground(Color.WHITE);
		lblHouseName.setBounds(211, 311, 500, 15);
		contentPane.add(lblHouseName);
		
		JLabel lblGender = new JLabel("Gender : ");
		lblGender.setForeground(Color.WHITE);
		lblGender.setBounds(245, 370, 466, 26);
		contentPane.add(lblGender);
		
		JLabel lblBalance = new JLabel("Balance : ");
		lblBalance.setForeground(Color.WHITE);
		lblBalance.setBounds(245, 435, 466, 15);
		contentPane.add(lblBalance);
		
		JButton btnHome = new JButton("Home : ");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				home_page hp=new home_page();
				frame.dispose();
						hp.setVisible(true);
			}
		});
		btnHome.setBounds(566, 483, 117, 25);
		contentPane.add(btnHome);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/home/vishnu/Desktop/gasd/src/gasd/05c9ace61b57c06f42eecbbd6dddd5a1.jpg"));
		label.setBounds(0, 0, 759, 574);
		contentPane.add(label);
	}
}
