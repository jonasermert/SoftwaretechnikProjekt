package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankEinzug extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtKontonr;
	private JTextField txtBankleitzahl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankEinzug frame = new BankEinzug();
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
	public BankEinzug() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtKontonr = new JTextField();
		txtKontonr.setText("KontoNr");
		txtKontonr.setBounds(152, 70, 186, 20);
		contentPane.add(txtKontonr);
		txtKontonr.setColumns(10);
		
		JLabel lblKontonummer = new JLabel("Kontonummer");
		lblKontonummer.setForeground(Color.BLUE);
		lblKontonummer.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblKontonummer.setBounds(30, 73, 112, 14);
		contentPane.add(lblKontonummer);
		
		txtBankleitzahl = new JTextField();
		txtBankleitzahl.setText("Bankleitzahl");
		txtBankleitzahl.setBounds(152, 101, 186, 20);
		contentPane.add(txtBankleitzahl);
		txtBankleitzahl.setColumns(10);
		
		JLabel lblBankleitzahl = new JLabel("Bankleitzahl");
		lblBankleitzahl.setForeground(Color.BLUE);
		lblBankleitzahl.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblBankleitzahl.setBounds(30, 104, 89, 14);
		contentPane.add(lblBankleitzahl);
		
		JButton btnBesttigen = new JButton("best\u00E4tigen");
		btnBesttigen.setToolTipText("best\u00E4tigen");
		btnBesttigen.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnBesttigen.setBounds(30, 220, 162, 31);
		contentPane.add(btnBesttigen);
		
		JButton btnAbbrechen = new JButton("abbrechen");
		btnAbbrechen.setToolTipText("abbrechen");
		btnAbbrechen.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnAbbrechen.setBounds(260, 220, 131, 31);
		btnAbbrechen.addActionListener(this);
		contentPane.add(btnAbbrechen);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			
		if(e.getActionCommand().equals("abbrechen")){
			new ZahlungFrame().setVisible(true);
			setVisible(false);//tes
		}
	}

}
