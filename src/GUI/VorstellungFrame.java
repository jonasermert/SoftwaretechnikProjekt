package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class VorstellungFrame extends JFrame {
	JMenuItem item1, item2, item3;
	Image image;
	private final Map<String, ImageIcon> imageMap;

	public VorstellungFrame() {

		String[] nameList = { "Trailer 1", "Trailer 2", "Trailer 3",
				"Trailer 4", "Trailer 5" };

		// String[] nameList = {"Mario",
		// "boujamaa","Awatar","the Lord of King","waqas"};
		// branch 'master' of https://bitbucket.org/taybi/projekt
		imageMap = createImageMap(nameList);
		JList list = new JList(nameList);
		list.setCellRenderer(new MarioListRenderer());
		list.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent evt) {
				if (evt.isPopupTrigger()) {
					showMenu(evt);
				}
			}

			private void showMenu(MouseEvent evt) {
				JPopupMenu menu = new JPopupMenu();
				item1 = new JMenuItem("TrailerAnschauen");
				// item1.setBackground(Color.WHITE);
				item1.setSize(40, 20);
				item1.addActionListener(new Close());

				// item1.addItemListener(this);
				JMenuItem item2 = new JMenuItem("Vorstellung auswählen");
				// item2.setBackground(Color.gray);
				item2.addActionListener(new Close());
				item2.setSize(80, 50);
				JMenuItem item3 = new JMenuItem("Abbrechen");
				// item3.setBackground(Color.yellow);
				item3.addMouseListener(this);
				item3.setSize(40, 20);
				item3.addActionListener(new Close());
				// item.addActionListener(list);
				menu.add(item1);
				menu.add(item2);
				menu.add(item3);
				menu.show(list, evt.getX(), evt.getY());

			}
		});

		JScrollPane scroll = new JScrollPane(list);
		scroll.setPreferredSize(new Dimension(300, 400));

		getContentPane().add(scroll);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(565, 466);
		this.setLocation(170, 130);
		this.setVisible(true);
	}

	public class MarioListRenderer extends DefaultListCellRenderer {

		Font font = new Font("helvitica", Font.BOLD, 24);

		@Override
		public Component getListCellRendererComponent(JList list, Object value,
				int index, boolean isSelected, boolean cellHasFocus) {

			JLabel label = (JLabel) super.getListCellRendererComponent(list,
					value, index, isSelected, cellHasFocus);
			label.setIcon(imageMap.get((String) value));
			label.setHorizontalTextPosition(JLabel.RIGHT);
			label.setFont(font);
			return label;
		}
	}

	private Map<String, ImageIcon> createImageMap(String[] list) {
		Map<String, ImageIcon> map = new HashMap<>();
		try {

			ImageIcon imageicon = new ImageIcon("src/GUI/Kino0.gif");
			ImageIcon icon = new ImageIcon(imageicon.getImage()
					.getScaledInstance(80, 80, Image.SCALE_DEFAULT));
			map.put("Trailer 1", icon);
			ImageIcon imageicon1 = new ImageIcon("src/GUI/Kino1.gif");
			ImageIcon icon1 = new ImageIcon(imageicon1.getImage()
					.getScaledInstance(80, 80, Image.SCALE_DEFAULT));
			map.put("Trailer 2", icon1);
			ImageIcon imageicon2 = new ImageIcon("src/GUI/Kino2.gif");
			ImageIcon icon2 = new ImageIcon(imageicon2.getImage()
					.getScaledInstance(80, 80, Image.SCALE_DEFAULT));
			map.put("Trailer 3", icon2);
			ImageIcon imageicon3 = new ImageIcon("src/GUI/Kino3.gif");
			ImageIcon icon3 = new ImageIcon(imageicon3.getImage()
					.getScaledInstance(80, 80, Image.SCALE_DEFAULT));

			map.put("Trailer 4", icon3);

			map.put("Awatar", icon3);

			ImageIcon imageicon4 = new ImageIcon("src/GUI/Kino4.gif");
			ImageIcon icon4 = new ImageIcon(imageicon4.getImage()
					.getScaledInstance(80, 80, Image.SCALE_DEFAULT));
			map.put("Trailer 5", icon4);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return map;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new VorstellungFrame();
			}
		});
	}

	class Close implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Abbrechen")) {

				KundenFrame frame = new KundenFrame();
				frame.setVisible(true);
				setVisible(false);
			}
			if (e.getActionCommand().equals("TrailerAnschauen")) {

				VideoPlayer frame1 = new VideoPlayer();
				frame1.setVisible(true);
				setVisible(false);
			}
			if(e.getActionCommand().equals("Vorstellung auswählen")){
				AngebotFrame angebotFrame = new AngebotFrame();
				angebotFrame.setVisible(true);
				setVisible(false);
				
			}

		}

	}

}
