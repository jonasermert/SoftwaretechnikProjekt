package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KundenFrame extends JFrame implements ActionListener{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KundenFrame frame = new KundenFrame();
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
	public KundenFrame() {
		setTitle("KundenFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVorstellungAnschauen = new JButton("Vorstellung anschauen");
		btnVorstellungAnschauen.setToolTipText("Vorstellung anschauen");
		btnVorstellungAnschauen.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnVorstellungAnschauen.setBounds(96, 66, 218, 31);
		btnVorstellungAnschauen.addActionListener(this);
		contentPane.add(btnVorstellungAnschauen);
		
		JButton btnReservierungen = new JButton("Reservierung Stornieren");
		btnReservierungen.setToolTipText("Reservierung bearbeiten");
		btnReservierungen.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnReservierungen.setBounds(96, 108, 218, 31);
		contentPane.add(btnReservierungen);
		
//		JButton btnFeedback = new JButton("Feedback");
//		btnFeedback.setToolTipText("Kundendaten Verwalten");
//		btnFeedback.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
//		btnFeedback.setBounds(96, 174, 218, 31);
//		btnFeedback.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				FeedBackFrame feedBackFrame = new FeedBackFrame();
//				feedBackFrame.setVisible(true);
//				setVisible(false);
//			}
//		});
//		contentPane.add(btnFeedback);
		
		JButton btnZurck = new JButton("Zurück");
		btnZurck.setToolTipText("Zurück");
		btnZurck.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnZurck.setBounds(96, 305, 218, 31);
		btnZurck.addActionListener(this);
		contentPane.add(btnZurck);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Zurück")){
		MainFrame mainFrame = new MainFrame();
		mainFrame.setVisible(true);
		this.setVisible(false);
		}
			if(e.getActionCommand().equals("Vorstellung anschauen")){
				VorstellungFrame vorstellungFrame = new VorstellungFrame();
				vorstellungFrame.setVisible(true);
				setVisible(false);
				
			}
	}

}
