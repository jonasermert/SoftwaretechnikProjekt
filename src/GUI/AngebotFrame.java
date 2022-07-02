package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AngebotFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private ButtonGroup group = new ButtonGroup();
	private JRadioButton rdbtnRabatt, rdbtnGetrnk, rdbtnGutschein;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AngebotFrame frame = new AngebotFrame();
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
	public AngebotFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 292);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblWhlenSieEin = new JLabel("Wählen Sie ein Angebot");
		lblWhlenSieEin.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblWhlenSieEin.setBounds(28, 11, 274, 33);
		contentPane.add(lblWhlenSieEin);

		rdbtnRabatt = new JRadioButton("Preisnachlass");
		rdbtnRabatt.setBounds(69, 76, 109, 23);
		rdbtnRabatt.setSelected(true);
		group.add(rdbtnRabatt);

		rdbtnGetrnk = new JRadioButton("Snack");
		rdbtnGetrnk.setBounds(69, 102, 109, 23);
		group.add(rdbtnGetrnk);

		rdbtnGutschein = new JRadioButton("Gutschein");
		rdbtnGutschein.setBounds(69, 128, 109, 23);
		group.add(rdbtnGutschein);

		contentPane.add(rdbtnRabatt);
		contentPane.add(rdbtnGetrnk);
		contentPane.add(rdbtnGutschein);

		JButton btnWeiter = new JButton("Weiter");
		btnWeiter.setBounds(191, 198, 134, 23);
		btnWeiter.addActionListener(this);
		contentPane.add(btnWeiter);

		JButton btnZurck = new JButton("zurück");
		btnZurck.setBounds(28, 198, 119, 23);
		btnZurck.addActionListener(this);
		contentPane.add(btnZurck);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Weiter")) {
			if (rdbtnRabatt.isSelected()) {
				// Rabatt ausgewählt
			}
			if (rdbtnGetrnk.isSelected()) {
				// Getränk ausgewählt
			}
			if (rdbtnGutschein.isSelected()) {
				// Gutschein ausgewählt
			}
			ZahlungFrame zahlungFrame = new ZahlungFrame();
			zahlungFrame.setVisible(true);
			setVisible(false);

		}
		if (e.getActionCommand().equals("zurück")) {
			new VorstellungFrame().setVisible(true);
			setVisible(false);

		}
	}
}
