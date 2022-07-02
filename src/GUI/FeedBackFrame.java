package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FeedBackFrame extends JFrame implements ActionListener{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeedBackFrame frame = new FeedBackFrame();
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
	public FeedBackFrame() {
		setTitle("FeedBackFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setText("");
		editorPane.setBounds(0, 11, 424, 199);
		contentPane.add(editorPane);
		
		JButton btnSenden = new JButton("Senden");
		btnSenden.setToolTipText("senden");
		btnSenden.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnSenden.setBounds(20, 221, 169, 31);
		contentPane.add(btnSenden);
		
		JButton btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.setToolTipText("abbrechen");
		btnAbbrechen.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnAbbrechen.setBounds(237, 221, 169, 31);
		btnAbbrechen.addActionListener(this);
		contentPane.add(btnAbbrechen);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Abbrechen")){
			new KundenFrame().setVisible(true);
			this.setVisible(false);
		}
	}
}
