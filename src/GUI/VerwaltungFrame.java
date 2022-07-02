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

public class VerwaltungFrame extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerwaltungFrame frame = new VerwaltungFrame();
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
	public VerwaltungFrame() {
		setTitle("VerwaltungFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Kundendaten Verwalten");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setToolTipText("Kundendaten Verwalten");
		btnNewButton.setBounds(141, 60, 218, 31);
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
		
		JButton btnFilmeVerwalten = new JButton("Filme verwalten");
		btnFilmeVerwalten.setToolTipText("Filme verwalten");
		btnFilmeVerwalten.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnFilmeVerwalten.setBounds(141, 114, 218, 31);
		btnFilmeVerwalten.addActionListener(this);
		contentPane.add(btnFilmeVerwalten);
		
		JButton btnReservierung = new JButton("Kunden informieren");
		btnReservierung.setToolTipText("Kunden informieren");
		btnReservierung.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnReservierung.setBounds(141, 162, 218, 31);
		contentPane.add(btnReservierung);
		
		JButton btnVorstellungen = new JButton("Vorstellungen bearbeiten");
		btnVorstellungen.setToolTipText("Vorstellungen Verwalten");
		btnVorstellungen.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnVorstellungen.setBounds(141, 213, 218, 31);
		contentPane.add(btnVorstellungen);
		
		JButton btnZurck = new JButton("Zurück");
		btnZurck.setToolTipText("Zurück");
		btnZurck.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnZurck.setBounds(141, 306, 218, 31);
		btnZurck.addActionListener(this);
		contentPane.add(btnZurck);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("Zurück")){
				MainFrame mainFrame = new MainFrame();
				mainFrame.setVisible(true);
				setVisible(false);
			}
			if(e.getActionCommand().equals("Kundendaten Verwalten")){
				KundenVerwaltung kundenVerwaltung = new KundenVerwaltung();
				kundenVerwaltung.setVisible(true);
				setVisible(false);
			}
			if(e.getActionCommand().equals("Filme verwalten")){
				FilmVerwaltung filmVerwaltung = new FilmVerwaltung();
				filmVerwaltung.setVisible(true);
				setVisible(false);
				
			}
		
		
	}

}
