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
import java.awt.Desktop;

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
import java.io.IOException;


public class Indexx2 extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8611985006278409232L;
	private JButton adm = new JButton("Enonc\u00E9");
	private JButton btn = new JButton("Executer");
	
	private Visiteur vv;
	private Etudiant ee;
	private Enseignant en;
	private Admin aa1;
	private Login_admin log;
	private Indexx indexx;
	//int xx,xy;

	
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		Indexx2 mywindow = new Indexx2();//la fénétre est cachée a ce moment
		mywindow.setVisible(true);//la fenetre est visible
		
	}
	
	
	// going to borrow code from a gist to move frame.
	

	/**
	 * Create the frame.
	 */
	public Indexx2() {
		super("Gestion Bibliotheque");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Indexx2.class.getResource("/images/learning.png")));
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(1200, 700);
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
		panel.setBounds(0, 0, 1182, 653);
		contentPane.add(panel);
		panel.setLayout(null);
		adm.setBounds(529, 327, 137, 36);
		panel.add(adm);
		
		adm.setForeground(Color.WHITE);
		adm.setBackground(new Color(34, 66, 124));
		adm.addActionListener(this);
		
		
		btn.setForeground(Color.WHITE);
		btn.setBackground(new Color(34, 66, 124));
		btn.setBounds(529, 392, 137, 36);
		btn.addActionListener(this);
		panel.add(btn);
		
		JButton button_1 = new JButton("Index");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			indexx = new Indexx();
			indexx.setVisible(true);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(34, 66, 124));
		button_1.setBounds(529, 464, 137, 36);
		panel.add(button_1);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 1182, 663);
		label.setIcon(new ImageIcon(Indexx.class.getResource("/images/bg.png")));
		panel.add(label);

		
		ButtonGroup bg = new ButtonGroup();
		
	
	}

@Override
public void actionPerformed(ActionEvent event) {
	// TODO Auto-generated method stub
	   if(event.getSource()== adm) {
		   try {
			Desktop.getDesktop().open(new java.io.File("File/en.pdf"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   this.dispose();
	   }
 
}


}





