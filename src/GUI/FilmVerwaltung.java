package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import Handler.HandlerClass;

public class FilmVerwaltung extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtTitel;
	private JTextField txtDauer;
	private JTextField txtRegisseur;
	private JTextField txtErschJahr;
	private JTextField txtAlterfrgb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FilmVerwaltung frame = new FilmVerwaltung();
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
	public FilmVerwaltung() {
		setTitle("FilmVerwaltung");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitel = new JLabel("Titel");
		lblTitel.setBounds(49, 94, 85, 14);
		contentPane.add(lblTitel);

		JLabel lblNewLabel = new JLabel("Dauer");
		lblNewLabel.setBounds(49, 119, 85, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Regisseur");
		lblNewLabel_1.setBounds(49, 144, 85, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Erscheinungsjahr");
		lblNewLabel_2.setBounds(49, 169, 85, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Altersfreigabe");
		lblNewLabel_3.setBounds(49, 194, 85, 14);
		contentPane.add(lblNewLabel_3);

		txtTitel = new JTextField();
		txtTitel.setBounds(159, 91, 127, 20);
		contentPane.add(txtTitel);
		txtTitel.setColumns(10);

		txtDauer = new JTextField();
		txtDauer.setBounds(159, 116, 127, 20);
		contentPane.add(txtDauer);
		txtDauer.setColumns(10);

		txtRegisseur = new JTextField();
		txtRegisseur.setBounds(159, 141, 127, 20);
		contentPane.add(txtRegisseur);
		txtRegisseur.setColumns(10);

		txtErschJahr = new JTextField();
		txtErschJahr.setBounds(159, 166, 127, 20);
		contentPane.add(txtErschJahr);
		txtErschJahr.setColumns(10);

		txtAlterfrgb = new JTextField();
		txtAlterfrgb.setBounds(159, 191, 127, 20);
		contentPane.add(txtAlterfrgb);
		txtAlterfrgb.setColumns(10);

		JButton btnSpeichern = new JButton("Speichern");
		btnSpeichern.setBounds(112, 337, 117, 23);
		btnSpeichern.addActionListener(this);
		contentPane.add(btnSpeichern);

		JButton btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.setBounds(285, 337, 117, 23);
		btnAbbrechen.addActionListener(this);
		contentPane.add(btnAbbrechen);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Abbrechen")) {
			VerwaltungFrame verwaltungFrame = new VerwaltungFrame();
			verwaltungFrame.setVisible(true);
			setVisible(false);
		}
		if (e.getActionCommand().equals("Speichern")) {
			int dauer, erschJahr, altersfrgb;
			try{
				dauer = Integer.parseInt(txtDauer.getText());
				erschJahr =Integer.parseInt(txtErschJahr.getText());
				altersfrgb = Integer.parseInt(txtAlterfrgb.getText());
				
				new HandlerClass().HelperFilm(txtTitel.getText(),
					dauer,
					txtRegisseur.getText(),
					erschJahr,
					altersfrgb);
			}catch(Exception ex){
				
				txtDauer.setText("nur Zahlen eingeben");
				txtErschJahr.setText("nur Zahlen eingeben");
				txtAlterfrgb.setText("nur Zahlen eingeben");
				
			}
			
		}

	}

}
