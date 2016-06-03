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
import javax.swing.JLabel;

public class Test {

	private JFrame frmSearchDatabase;
	private JTextField bcSearch;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	public Test() {
		initialize();
	}


	public void initialize() {
		frmSearchDatabase = new JFrame();
		frmSearchDatabase.setTitle("Search DataBase");
		frmSearchDatabase.setBackground(Color.GRAY);
		frmSearchDatabase.setBounds(100, 100, 525, 500);
		frmSearchDatabase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSearchDatabase.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Create New Entry");
		btnNewButton.setBounds(182, 317, 125, 32);
		frmSearchDatabase.getContentPane().add(btnNewButton);
		
		bcSearch = new JTextField();
		bcSearch.setBounds(152, 11, 192, 20);
		frmSearchDatabase.getContentPane().add(bcSearch);
		bcSearch.setColumns(10);
		
		JLabel lblScanBarcode = new JLabel("Scan Barcode");
		lblScanBarcode.setBounds(77, 14, 65, 14);
		frmSearchDatabase.getContentPane().add(lblScanBarcode);
		
		textField = new JTextField();
		textField.setBounds(62, 65, 86, 20);
		frmSearchDatabase.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(62, 102, 86, 20);
		frmSearchDatabase.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(62, 170, 86, 20);
		frmSearchDatabase.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(62, 133, 86, 20);
		frmSearchDatabase.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(168, 170, 86, 20);
		frmSearchDatabase.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(168, 133, 86, 20);
		frmSearchDatabase.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(168, 102, 86, 20);
		frmSearchDatabase.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(168, 65, 86, 20);
		frmSearchDatabase.getContentPane().add(textField_7);
		frmSearchDatabase.setVisible(true);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		frmSearchDatabase.setJMenuBar(menuBar);
		
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
				JOptionPane.showMessageDialog(frmSearchDatabase, "Created by Mitchell");
			}
		});
		JMenuItem mntmAbout = new JMenuItem("About");
		menuBar.add(mnHelp);
		mnHelp.add(mntmAbout);
		mnHelp.add(mntmCredits_1);
	}
}
