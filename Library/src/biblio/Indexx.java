package biblio;


import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.sql.*;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Indexx extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8611985006278409232L;
	private JRadioButton Radionbutton = new JRadioButton("Visiteur");
	private JRadioButton Radionbutton1 = new JRadioButton("Etudiant");
	private JRadioButton Radionbutton2 = new JRadioButton("Enseignant");
	private JButton adm = new JButton("Administrateur");
	private Visiteur vv;
	private Etudiant ee;
	private Enseignant en;
	private Admin aa1;
	private Login_admin log;
	//int xx,xy;

	
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		Indexx mywindow = new Indexx();//la fénétre est cachée a ce moment
		mywindow.setVisible(true);//la fenetre est visible
		
	}
	
	
	// going to borrow code from a gist to move frame.
	

	/**
	 * Create the frame.
	 */
	public Indexx() {
		super("Gestion Bibliotheque");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Indexx.class.getResource("/images/learning.png")));
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(700, 500);
		this.setLocationRelativeTo(null);
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(53, 122, 183));
		panel.setBounds(0, 0, 346, 490);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIENVENUE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		lblNewLabel.setForeground(new Color(240, 248, 255));
		lblNewLabel.setBounds(48, 272, 251, 86);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setBounds(-10, -16, 583, 275);
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setIcon(new ImageIcon(Indexx.class.getResource("/images/aa.png")));
		panel.add(label);
		
		JLabel lblWeGotYou = new JLabel("La lecture: une ampoule s'allume et éteint ce qui l'entoure.");
		lblWeGotYou.setForeground(new Color(240, 248, 255));
		lblWeGotYou.setFont(new Font("Chiller", Font.PLAIN, 19));
		lblWeGotYou.setBounds(6, 380, 338, 27);
		panel.add(lblWeGotYou);
		
		JLabel lblWeGotYou1 = new JLabel("Charles Dantzig.");
		lblWeGotYou1.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeGotYou1.setForeground(new Color(240, 248, 255));
		lblWeGotYou1.setFont(new Font("Chiller", Font.PLAIN, 19));
		lblWeGotYou1.setBounds(188, 419, 141, 27);
		panel.add(lblWeGotYou1);

		
		ButtonGroup bg = new ButtonGroup();
		bg.add(Radionbutton);
		bg.add(Radionbutton1);
		bg.add(Radionbutton2);
		
		Radionbutton.setBounds(450, 150, 283, 50);
		Radionbutton.setSelected(false);
		contentPane.add(Radionbutton);
		
		
		
		Radionbutton1.setBounds(450, 180, 300, 70);
		Radionbutton1.setSelected(false);
		contentPane.add(Radionbutton1);
		
		
		Radionbutton2.setBounds(450, 210, 337, 90);
		Radionbutton2.setSelected(false);
		contentPane.add(Radionbutton2);
		
		JPanel panel_a = new JPanel();
		panel_a.setBounds(369, 93, 283, 249);
		contentPane.add(panel_a);
		panel_a.setLayout(null);
		panel_a.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(34, 66, 124)));
		panel_a.setBackground(new Color(230, 230, 250));
		
		
		
		JLabel lblUsername = new JLabel("Etes-vous un : ");
		lblUsername.setBounds(47, 6, 180, 62);
		panel_a.add(lblUsername);
		lblUsername.setFont(new Font("Bookman Old Style", Font.BOLD, 21));
		
		JButton button = new JButton("Valider");
		button.setBounds(70, 186, 137, 36);
		panel_a.add(button);
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(34, 66, 124));
		button.addActionListener(this);
		
		adm.setForeground(Color.WHITE);
		adm.setBackground(new Color(34, 66, 124));
		adm.setBounds(529, 407, 137, 36);
		adm.addActionListener(this);
		contentPane.add(adm);
		
	
	}

@Override
public void actionPerformed(ActionEvent event) {
	// TODO Auto-generated method stub
	   if(event.getSource()== adm) {
		   this.dispose();
		   log = new Login_admin();
	   }
 
		if (Radionbutton.isSelected()) {
			 this.dispose();
	         vv = new Visiteur();}
		else if (Radionbutton1.isSelected()) {
			this.dispose();
	         ee = new Etudiant();}
		else if (Radionbutton2.isSelected()) {
			this.dispose();
	         en = new Enseignant();}
		
	}
}





