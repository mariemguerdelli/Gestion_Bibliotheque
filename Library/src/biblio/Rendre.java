package biblio;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Rendre extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1982601755158562765L;
	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField combobox = new JTextField();
	private JTextField combobox1 = new JTextField();
	private Indexx ii;
	private JButton btnretour = new JButton("Back");
	private JButton btnRendre = new JButton("Rendre");
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	PreparedStatement pst1 = null;
	ResultSet rs1 = null;
	
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_system frame = new Registration_system();
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
	public Rendre() {
		super("Fiche Rendre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Rendre.class.getResource("/images/avatar.png")));
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(700, 500);
		this.setLocationRelativeTo(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setBorder(null);
		panel.setBounds(0, 0, 684, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(34, 66, 124)));
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(168, 11, 348, 49);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Fiche Rendre Document");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(61, 11, 244, 27);
		panel_1.add(lblNewLabel);

		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(34, 66, 124)));
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(10, 183, 326, 199);
		panel.add(panel_2);
		
		JLabel lblSurname = new JLabel("Statut");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSurname.setBounds(10, 11, 108, 25);
		panel_2.add(lblSurname);
		
		JLabel lblAddress = new JLabel("Type");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAddress.setBounds(10, 47, 108, 25);
		panel_2.add(lblAddress);
		
		JLabel lblPostCode = new JLabel("Titre");
		lblPostCode.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPostCode.setBounds(10, 83, 108, 25);
		panel_2.add(lblPostCode);
		
		JLabel lblTelephone = new JLabel("date_retour");
		lblTelephone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelephone.setBounds(10, 119, 108, 25);
		panel_2.add(lblTelephone);
		
		JLabel lblDateRegistration = new JLabel("date_limite");
		lblDateRegistration.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDateRegistration.setBounds(10, 155, 113, 25);
		panel_2.add(lblDateRegistration);
		
		//combobox.setModel(new DefaultComboBoxModel(new String[] {"","Visiteur"}));
		//combobox.setForeground(Color.black);
		combobox = new JTextField();
		combobox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		//combobox.setBackground(new Color(34, 66, 124));
		combobox.setBounds(153, 12, 141, 23);
		panel_2.add(combobox);
		
		
		/*textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(163, 92, 141, 23);
		panel_2.add(textField_2);*/
		
		/*textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(163, 128, 141, 23);
		panel_2.add(textField_3);*/
		//combobox1.setModel(new DefaultComboBoxModel(new String[] {"","Livre","Article","Magazine"}));
		combobox1 = new JTextField();
		combobox1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		//combobox1.setForeground(Color.black);
		//combobox1.setBackground(new Color(34, 66, 124));
		combobox1.setBounds(153, 48, 141, 23);
		panel_2.add(combobox1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(153, 84, 141, 23);
		panel_2.add(textField_4);
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		
		textField_5 = new JTextField(format.format(date));
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBounds(153, 120, 141, 23);
		panel_2.add(textField_5);
		
		/*Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DATE,6);
		Date currentDatePlusOne = c.getTime();*/
		
		
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_6.setColumns(10);
		textField_6.setBounds(153, 156, 141, 23);
		panel_2.add(textField_6);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(34, 66, 124)));
		panel_5.setBackground(new Color(230, 230, 250));
		panel_5.setBounds(0, -31, 328, 25);
		panel_2.add(panel_5);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(34, 66, 124)));
		panel_4.setBackground(new Color(230, 230, 250));
		panel_4.setBounds(346, 178, 328, 204);
		panel.add(panel_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 308, 182);
		panel_4.add(textArea);
		
       
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(69, 395, 530, 49);
		panel.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(34, 66, 124)));
		panel_3.setBackground(new Color(230, 230, 250));
		
	
		
		
		
		
		
		
		//public void actionPerformed(ActionEvent event) {
		JButton btnRendre = new JButton("Rendre");
		btnRendre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		    	
				try {
					/*String sql5 = "Alter table fiche_rendre ADD retardataire BOOLEAN";
					PreparedStatement pst5 = conn.prepareStatement(sql5);
			    	pst5.execute();
			    	pst5.close(); */
                	
                	String sql4 = "Update fiche_rendre set  retardataire = 1  where  date_limite < date_retour" ;  
          			PreparedStatement pst4 = conn.prepareStatement(sql4);
                	pst4.execute();
                	pst4.close();
                	
                	/*String sql5 = "Update bibll  set  nbemp = nbmep-1  where  nom='"+textField.getText()+"'" ;  
          			PreparedStatement pst5 = conn.prepareStatement(sql5);
                	pst5.execute();
                	pst.close();*/
					
	      			PreparedStatement ps = conn.prepareStatement("INSERT INTO `fiche_rendre`(`nom`, `prenom`, `statut`,`type`, `titre`, `date_retour`,`date_limite`) VALUES (?,?,?,?,?,?,?)");
	      			//PreparedStatement ps1 = conn.prepareStatement("DELETE FROM `fiche_emprunt` WHERE `nom` = "+ textField.getText().toString()+"' AND `prenom`= "+ textField_1.getText().toString()+"'");
	      			ps.setString(1,textField.getText());
	      			ps.setString(2,textField_1.getText());
	      			ps.setString(3,combobox.getText());
   		      		ps.setString(4,combobox1.getText());
   		      		ps.setString(5,textField_4.getText());
   		      	    ps.setString(6,textField_5.getText());
   		      		ps.setString(7,textField_6.getText());
   		      		//ps.setString(8, pst4.toString());
   		      	/*String value =  textField.getText().toString();
   		        String value2 =  textField_1.getText().toString();
   		      	
   	       		String sql1 = "DELETE FROM `fiche_emprunt` WHERE `nom` =" +value+ "AND `prenom` =" +value2+"'"; */
   		      	PreparedStatement ps1 = conn.prepareStatement("DELETE FROM `fiche_emprunt` WHERE nom ='"+ textField.getText().toString()+"' AND  prenom = '"+ textField_1.getText().toString()+"'");	
   	       		//pst = conn.prepareStatement(sql1);
   	        	ps1.execute();
   	        	//JOptionPane.showMessageDialog(null, "Données supprimés");
   	        	ps1.close();
	      			
	      			int x = ps.executeUpdate();
	      			if (x>0) {
	      			
	      				JOptionPane.showMessageDialog(null, "Vous avez rendre le document, Merci :)","Rendre_document" , JOptionPane.OK_OPTION);
	      				
	      				textArea.setText("");
		      			textArea.append("                       Fiche Rendre Document\n"
		      			+"       ****************************************************** \n"
           				+"Nom :\t"+textField.getText()
           				+"\nPrenom :\t "+textField_1.getText()
           				+"\nStatut :\t "+combobox.getText()
           				+"\nType :\t "+combobox1.getText()
           				+"\nTitre :\t "+textField_4.getText()
           				+"\ndate_retour : "+textField_5.getText()
           				+"\ndate_limite :\t "+textField_6.getText()+"\n");
		      			
	      				textField.setText(null);
	      				textField_1.setText(null);
	      				combobox.setText(null);
	      				combobox1.setText(null);
	      				textField_4.setText(null);
	      				textField_5.setText(null);
	      				textField_6.setText(null);
	      				
	      			
	      			}
	      			else {
	      				System.out.println("Erreur");
	      			}
	      		}
	      		catch(Exception e1){
	      			System.out.println(e1);
	      		}
			}});
				
			
	
		btnRendre.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRendre.setBounds(10, 11, 105, 23);
		panel_3.add(btnRendre);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				combobox.setText("");
				combobox1.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textArea.setText("");
				
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReset.setBounds(125, 11, 82, 23);
		panel_3.add(btnReset);
		
		
		btnretour.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnretour.setBounds(315, 11, 82, 23);
		btnretour.addActionListener(this);
		panel_3.add(btnretour);
		
		
		conn = Connect.ConnectDb();
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Membership Regiqtration System", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExit.setBounds(407, 11, 82, 23);
		panel_3.add(btnExit);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					textArea.print();
				}
				catch(java.awt.print.PrinterException e)
				{
					System.err.format("No Printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPrint.setBounds(217, 11, 88, 23);
		panel_3.add(btnPrint);
		
		
		
		JPanel panel_a = new JPanel();
		panel_a.setBounds(10, 93, 664, 79);
		panel.add(panel_a);
		panel_a.setLayout(null);
		panel_a.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(34, 66, 124)));
		panel_a.setBackground(new Color(230, 230, 250));
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setBounds(21, 21, 54, 25);
		panel_a.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		
		
		textField = new JTextField();
		textField.setBounds(66, 22, 116, 31);
		panel_a.add(textField);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setColumns(10);
		
		JLabel lblFirstname = new JLabel("Prénom");
		lblFirstname.setBounds(199, 21, 73, 25);
		panel_a.add(lblFirstname);
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_1 = new JTextField();
		textField_1.setBounds(267, 22, 116, 31);
		panel_a.add(textField_1);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	       	
	       		String sql = "SELECT statut,type,titre,date_limite  FROM fiche_emprunt  WHERE nom ='"+ textField.getText().toString()+"' AND  prenom = '"+ textField_1.getText().toString()+"'";
	       		
	       		try {
	                	pst = conn.prepareStatement(sql);
		       			rs = pst.executeQuery();
		       			
			      		
	                	while (rs.next()) {
	                		combobox.setText(rs.getString("statut"));
	                		combobox1.setText(rs.getString("type"));
	                		textField_4.setText(rs.getString("titre"));
	                		textField_6.setText(rs.getString("date_limite"));
	                		
	                	}
	                	/*if (!textField.getText().toString().equals("nom") && !textField_1.getText().toString().equals("prenom")) {
	    	       			JOptionPane.showMessageDialog(null, "Vous n'avez pas un document pour le rendre, Merci :)","Rendre_document" , JOptionPane.OK_OPTION);
	    	       			textField.setText(null);
		      				textField_1.setText(null);
		      				combobox.setText(null);
		      				combobox1.setText(null);
		      				textField_4.setText(null);
		      				textField_5.setText(null);
		      				textField_6.setText(null);
	    	       		}*/
	                }
	       		
	                catch(Exception e1){
   		      			System.out.println(e1);
   		      		}
			}
				
			
		});
		btnNewButton.setBounds(423, 23, 89, 23);
		panel_a.add(btnNewButton);}
		

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== btnretour) {
			this.dispose();
	         ii = new Indexx();
	         setVisible(false);
	         ii.setVisible(true);}
		}
}
		
		
		
		
		
		

	
	


