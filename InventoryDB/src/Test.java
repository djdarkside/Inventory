import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Dialog.ModalExclusionType;

public class Test {

	private JFrame frame;
	private JTextField bcSearch;

	public Test() {
		initialize();
	}


	public void initialize() {
		frame = new JFrame();
		frame.setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		frame.setBackground(Color.GRAY);
		frame.setBounds(100, 100, 525, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Create New Entry");
		btnNewButton.setBounds(182, 317, 125, 32);
		frame.getContentPane().add(btnNewButton);
		
		bcSearch = new JTextField();
		bcSearch.setBounds(152, 11, 192, 20);
		frame.getContentPane().add(bcSearch);
		bcSearch.setColumns(10);
		frame.setVisible(true);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");		
		JMenuItem mntmSave = new JMenuItem("Save");		
		JMenuItem mntmClose = new JMenuItem("Close");
		mntmClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(1);
			}
		});
		menuBar.add(mnFile);
		mnFile.add(mntmSave);
		mnFile.add(mntmClose);
		
		JMenu mnOptions = new JMenu("Options");
		JMenuItem mntmSettings = new JMenuItem("Settings");
		menuBar.add(mnOptions);		
		mnOptions.add(mntmSettings);
		
		JMenu mnHelp = new JMenu("Help");		
		JMenuItem mntmCredits_1 = new JMenuItem("Credits");		
		mntmCredits_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(frame, "Created by Mitchell");
			}
		});
		JMenuItem mntmAbout = new JMenuItem("About");
		menuBar.add(mnHelp);
		mnHelp.add(mntmAbout);
		mnHelp.add(mntmCredits_1);
	}
}
