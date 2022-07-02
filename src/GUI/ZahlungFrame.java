package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZahlungFrame extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { 
			public void run() {
				try {
					ZahlungFrame frame = new ZahlungFrame();
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
	public ZahlungFrame() {
		setTitle("ZahlungFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBankeinzug = new JButton("Bankeinzug");
		btnBankeinzug.setToolTipText("Bankeinzug");
		btnBankeinzug.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnBankeinzug.setBounds(99, 54, 218, 31);
		btnBankeinzug.addActionListener(this);
		contentPane.add(btnBankeinzug);
		
		JButton btnAbendkasse = new JButton("Abendkasse");
		btnAbendkasse.setToolTipText("Abendkasse");
		btnAbendkasse.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnAbendkasse.setBounds(99, 108, 218, 31);
		contentPane.add(btnAbendkasse);
		
//		JButton btnSonstiges = new JButton("Sonstiges");
//		btnSonstiges.setToolTipText("Paypal, /Überweisung....");
//		btnSonstiges.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
//		btnSonstiges.setBounds(99, 164, 218, 31);
//		contentPane.add(btnSonstiges);
		
		JButton btnZurck = new JButton("Zurück");
		btnZurck.setToolTipText("Zurück");
		btnZurck.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnZurck.setBounds(99, 231, 218, 31);
		btnZurck.addActionListener(this);
		contentPane.add(btnZurck);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			
		if(e.getActionCommand().equals("Bankeinzug")){
			new BankEinzug().setVisible(true);
			setVisible(false);
			
		}
		if(e.getActionCommand().equals("Zurück")){
			new AngebotFrame().setVisible(true);
			setVisible(false);
		}

		
		
	}

}
