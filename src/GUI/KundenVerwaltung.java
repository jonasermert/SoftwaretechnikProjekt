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

import Database.DatabaseHelper;
import Handler.HandlerClass;
import Handler.Kunde;

public class KundenVerwaltung extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtNachname;
	private JTextField txtEmail;
	private JTextField txtAdresse;
	private JTextField txtTelefon;
	private Kunde kunde;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KundenVerwaltung frame = new KundenVerwaltung();
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
	public KundenVerwaltung() {
		setTitle("KundenVerwaltung");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(39, 89, 90, 14);
		contentPane.add(lblName);

		JLabel lblNachname = new JLabel("Nachname");
		lblNachname.setBounds(39, 114, 90, 14);
		contentPane.add(lblNachname);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(39, 139, 90, 14);
		contentPane.add(lblEmail);

		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(39, 164, 90, 14);
		contentPane.add(lblAdresse);

		JLabel lblTelefon = new JLabel("Telefon");
		lblTelefon.setBounds(39, 189, 90, 14);
		contentPane.add(lblTelefon);

		txtName = new JTextField();
		txtName.setBounds(179, 86, 133, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);

		txtNachname = new JTextField();
		txtNachname.setBounds(179, 111, 133, 20);
		contentPane.add(txtNachname);
		txtNachname.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setBounds(179, 136, 133, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);

		txtAdresse = new JTextField();
		txtAdresse.setBounds(179, 161, 133, 20);
		contentPane.add(txtAdresse);
		txtAdresse.setColumns(10);

		txtTelefon = new JTextField();
		txtTelefon.setBounds(179, 186, 133, 20);
		contentPane.add(txtTelefon);
		txtTelefon.setColumns(10);

		JButton btnSpeichern = new JButton("Speichern");
		btnSpeichern.setBounds(92, 368, 119, 23);
		btnSpeichern.addActionListener(this);
		contentPane.add(btnSpeichern);

		JButton btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.setBounds(291, 368, 119, 23);
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
			HandlerClass helperClass = new HandlerClass();

			kunde = new Kunde(txtName.getText(), txtNachname.getText(),
					txtEmail.getText(), txtAdresse.getText(),
					txtTelefon.getText());
			helperClass.HelperKunde(kunde);

//			helperClass.HelperKunde1(txtName.getText(), txtNachname.getText(),
//					txtEmail.getText(), txtAdresse.getText(),
//					txtTelefon.getText());
			//
			System.out.println("called" + txtNachname.getText());

		}
	}
}
