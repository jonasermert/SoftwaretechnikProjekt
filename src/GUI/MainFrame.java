package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setBackground(Color.RED);
		setTitle("MainFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(151, 69, 174, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblBenutzername = new JLabel("Benutzername");
		lblBenutzername.setForeground(Color.BLUE);
		lblBenutzername.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblBenutzername.setBounds(30, 72, 98, 14);
		contentPane.add(lblBenutzername);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(151, 120, 174, 20);
		contentPane.add(passwordField);
		
		JLabel lblPasswort = new JLabel("Passwort");
		lblPasswort.setForeground(Color.BLUE) ;
		lblPasswort.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblPasswort.setBounds(30, 123, 98, 14);
		contentPane.add(lblPasswort);
		
		JButton btnAnmelden = new JButton("Anmelden");
		btnAnmelden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("kunde")){
				KundenFrame kundenFrame = new KundenFrame();
				kundenFrame.setVisible(true);
				setVisible(false);
				}
				if(textField.getText().equals("admin")){
					VerwaltungFrame verwaltungFrame = new VerwaltungFrame();
					setVisible(false);
					verwaltungFrame.setVisible(true);
					
				}
			}
		});
		
		btnAnmelden.setBounds(108, 228, 103, 23);
		contentPane.add(btnAnmelden);
		
		JButton btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.setBounds(236, 228, 113, 23);
		contentPane.add(btnAbbrechen);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("src/GUI/Kino0.gif"));
		lblNewLabel.setBounds(0, 0, 434, 262);
		contentPane.add(lblNewLabel);
	}
}
