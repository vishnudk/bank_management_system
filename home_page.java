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
	public home_page() {
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
				frame.dispose();
				p4.setVisible(true);
				//frame.dispose();
			}
		});
		btnProfile.setBounds(473, 12, 117, 25);
		contentPane.add(btnProfile);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(-11, 49, 730, 57);
		contentPane.add(separator);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/home/vishnu/Desktop/gasd/src/gasd/05c9ace61b57c06f42eecbbd6dddd5a1.jpg"));
		label.setBounds(-1, -35, 772, 625);
		contentPane.add(label);
	}
}
