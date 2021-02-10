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

import net.proteanit.sql.DbUtils;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class Empruntetudiant extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1982601755158562765L;
	private JPanel contentPane;
	private JFrame frame;
	private JTextField textFieldd;
	private JTextField textFieldd_1;
	private JTextField textFieldd_2;
	private JTextField textFieldd_3;
	private JTextField textFieldd_4;
	private JTextField textFieldd_5;
	private JTextField textFieldd_6;
	private JTextField textFieldd_7;
	private JComboBox comboboxx = new JComboBox();
	private JComboBox comboboxx1 = new JComboBox();
	private Indexx ii;
	private JButton btnretour = new JButton("Back");
	private JButton btnEmprunt = new JButton("Emprunter");
	public int nbemp1 = 0;
	

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
	public Empruntetudiant() {
		super("Fiche Emprunt");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Empreint.class.getResource("/images/avatar.png")));
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
		panel_1.setBounds(173, 11, 328, 49);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Fiche Empreint");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(95, 11, 152, 27);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(34, 66, 124)));
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(10, 93, 326, 291);
		panel.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(20, 13, 141, 25);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblFirstname = new JLabel("Prénom");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFirstname.setBounds(20, 49, 108, 25);
		panel_2.add(lblFirstname);
		
		JLabel lblSurname = new JLabel("Statut");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSurname.setBounds(20, 87, 108, 25);
		panel_2.add(lblSurname);
		
		JLabel lblAddress = new JLabel("Type");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAddress.setBounds(20, 123, 108, 25);
		panel_2.add(lblAddress);
		
		JLabel lblPostCode = new JLabel("Titre");
		lblPostCode.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPostCode.setBounds(20, 156, 108, 25);
		panel_2.add(lblPostCode);
		
		JLabel lblTelephone = new JLabel("date_debut_pret");
		lblTelephone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelephone.setBounds(20, 192, 108, 25);
		panel_2.add(lblTelephone);
		
		JLabel lblDateRegistration = new JLabel("date_limite");
		lblDateRegistration.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDateRegistration.setBounds(20, 228, 113, 25);
		panel_2.add(lblDateRegistration);
		
		//JLabel lblnbemprunt = new JLabel("Nbr_emprunt");
		//lblnbemprunt.setFont(new Font("Tahoma", Font.BOLD, 12));
		//lblnbemprunt.setBounds(20, 255, 113, 25);
		//panel_2.add(lblnbemprunt);
		
		
		
		textFieldd = new JTextField();
		textFieldd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldd.setBounds(163, 11, 141, 27);
		panel_2.add(textFieldd);
		textFieldd.setColumns(10);
		
		textFieldd_1 = new JTextField();
		textFieldd_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldd_1.setColumns(10);
		textFieldd_1.setBounds(163, 51, 141, 23);
		panel_2.add(textFieldd_1);
		
		comboboxx.setModel(new DefaultComboBoxModel(new String[] {"","Etudiant"}));
		comboboxx.setForeground(Color.black);
		comboboxx.setBackground(new Color(34, 66, 124));
		comboboxx.setBounds(163, 85, 141, 23);
		panel_2.add(comboboxx);
		
		
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
		comboboxx1.setModel(new DefaultComboBoxModel(new String[] {"","Livre","Article","Magazine"}));
		comboboxx1.setForeground(Color.black);
		comboboxx1.setBackground(new Color(34, 66, 124));
		comboboxx1.setBounds(163, 121, 141, 23);
		panel_2.add(comboboxx1);
		
		textFieldd_4 = new JTextField();
		/*textFieldd_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				String titre = textFieldd_4.getText().toString();
				String sql = "select titre  from document";
				
				try {
					pst = conn.prepareStatement(sql);
           			rs = pst.executeQuery();
	      
					while (rs.next()) {
						String titre1 = rs.getString("titre");
	       				if(!titre1.equals(titre)) {
						JOptionPane.showMessageDialog(null, "Le titre n'existe pas", "Informations", JOptionPane.PLAIN_MESSAGE);
	       					//System.out.println("le titre n'existe pas");
					}
	       				else {
	       					JOptionPane.showMessageDialog(null, "Le titre existe", "Informations", JOptionPane.PLAIN_MESSAGE);
	       					//System.out.println("le titre existe");
	       				}
					}
					rs.close();
					pst.close();
		   			
					
				}	
				
				 catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		
			
		});*/
		textFieldd_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldd_4.setColumns(10);
		textFieldd_4.setBounds(163, 154, 141, 23);
		panel_2.add(textFieldd_4);
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		
		textFieldd_5 = new JTextField(format.format(date));
		textFieldd_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldd_5.setColumns(10);
		textFieldd_5.setBounds(163, 190, 141, 23);
		panel_2.add(textFieldd_5);
		
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DATE,6);
		Date currentDatePlusOne = c.getTime();
		
		
		
		textFieldd_6 = new JTextField(format.format(currentDatePlusOne));
		textFieldd_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldd_6.setColumns(10);
		textFieldd_6.setBounds(163, 226, 141, 23);
		panel_2.add(textFieldd_6);
		
		//textFieldd_7 = new JTextField();
		//textFieldd_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		//textFieldd_7.setColumns(10);
		//textFieldd_7.setBounds(163, 256, 141, 23);
		//panel_2.add(textFieldd_7);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(34, 66, 124)));
		panel_4.setBackground(new Color(230, 230, 250));
		panel_4.setBounds(346, 93, 328, 291);
		panel.add(panel_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 308, 269);
		panel_4.add(textArea);
		
       
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(69, 395, 530, 49);
		panel.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(34, 66, 124)));
		panel_3.setBackground(new Color(230, 230, 250));
		
	
		
		

		JButton btnEmprunt = new JButton("Emprunter");
		btnEmprunt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				String nom = textFieldd.getText().toString();
	       		String prenom = textFieldd_1.getText().toString();
	       		String sql = "select nom, prenom  from fiche_emprunt";
	       		int id=40;
	       		boolean ok = false;
	       				try {
	       				 
	       					System.out.println("try executé");
	       					String sql0="SELECT `nbemp` FROM `bibll` WHERE nom='"+textFieldd.getText()+"'"; 
	              			PreparedStatement pst1 = conn.prepareStatement(sql0);
	              			rs1 = pst1.executeQuery();
	              			System.out.println("sql");
	              			System.out.println(rs1);
	                    	while(rs1.next()) {
	              			int nbemp1 = rs1.getInt("nbemp");
	                    	System.out.println(nbemp1);
	                    	if(nbemp1>=2) {
               					
               					JOptionPane.showMessageDialog(null, "Vous avez depasser le nombre d'emprunt possible!!!!!!!!!!");
               					textFieldd.setText(null);
                       			textFieldd_1.setText(null);
                       			comboboxx.setSelectedItem(null);
                       			comboboxx1.setSelectedItem(null);
                       			textFieldd_4.setText(null);
                       			ok = false;
               		      		}
               				else ok=true;
	                    	}
	                    	
	               				
	               				
	                    	
						} catch (Exception e2) {
							System.out.println("erreur sql");
						}

	       		try {
	       			
           				System.out.println(ok);
           				
                	
           				if(ok) {
	       				
	       			
	       			
	       			System.out.println("else executé");
	       			String sql1 = "Update document set  nb_exemplaires = nb_exemplaires - 1" ;  
          			PreparedStatement pst1 = conn.prepareStatement(sql1);
                	pst1.execute();
                	pst1.close();
                	
                	String sql2 = "Update document set  disponibilite = 1 where nb_exemplaires >0 and titre='"+textFieldd_4.getText()+"'" ;  
          			PreparedStatement pst2 = conn.prepareStatement(sql2);
                	pst2.execute();
                	pst2.close();
                	
                	String sql3 = "Update document set  nb_emprunt = nb_emprunt+1  where  titre='"+textFieldd_4.getText()+"'" ;  
          			PreparedStatement pst3 = conn.prepareStatement(sql3);
                	pst3.execute();
                	pst3.close();
                	
                	String sql4 = "Update bibll set  nbemp = nbemp+1  where  nom='"+textFieldd.getText()+"'" ;  
          			PreparedStatement pst4 = conn.prepareStatement(sql4);
                	pst4.execute();
                	pst4.close();
                	
	       			
	       			PreparedStatement ps = conn.prepareStatement("INSERT INTO `fiche_emprunt`(`nom`, `prenom`, `statut`,`type`, `titre`, `date_debut_pret`,`date_limite`,`Nbr_emprunt`) VALUES (?,?,?,?,?,?,?,'1')");

		      		pst = conn.prepareStatement(sql);
	       			rs = pst.executeQuery();
	       			
	       		while (rs.next()) {
       				String username1 = rs.getString("nom");
       				String password1 = rs.getString("prenom");
       				
       				if(!username1.equals(nom) && !password1.equals(prenom)) {
       					
       		      			ps.setString(1,textFieldd.getText());
       		      			ps.setString(2,textFieldd_1.getText());
       		      			ps.setString(3,(String)comboboxx.getSelectedItem());
       		      			ps.setString(4,(String)comboboxx1.getSelectedItem());
       		      		    ps.setString(5,textFieldd_4.getText());
       		      			ps.setString(6,textFieldd_5.getText());
       		      			ps.setString(7,textFieldd_6.getText());
       		      		    
       		      		}
                       else {
       					
       					JOptionPane.showMessageDialog(null, "Vous n'avez le droit que pour emprunter un seul document.Vous voulez d'autres? Alors inscrivez-vous.");
       					textFieldd.setText(null);
               			textFieldd_1.setText(null);
               			comboboxx.setSelectedItem(null);
               			comboboxx1.setSelectedItem(null);
               			textFieldd_4.setText(null);
               		
               			
              		   }}
       		      			int x = ps.executeUpdate();
       		      			if (x>0) {
       		      				JOptionPane.showMessageDialog(null, "Emprunt enregistré","Emprunt" , JOptionPane.PLAIN_MESSAGE);
       		      			textArea.setText("");
           					textArea.append("                       Fiche d'emprunt\n"
           					+"       ****************************************************** \n"
           					+"Nom :\t"+textFieldd.getText()
           					+"\nPrenom :\t "+textFieldd_1.getText()
           					+"\nStatut :\t "+comboboxx.getSelectedItem()
           					+"\nType :\t "+comboboxx1.getSelectedItem()
           					+"\nTitre :\t "+textFieldd_4.getText()
           					+"\ndate_debut_pret : "+textFieldd_5.getText()
           					+"\ndate_limite :\t "+textFieldd_6.getText()+"\n");
       		      			}
       		      		
       		   			//rs1.close();
	       		ps.close();
	   			rs.close();
	       		}
	       		}
	       		
	       		
	       		
       					catch(Exception e1){
       		      			System.out.println("erreeeeeeeeeeeeeeeeer");
       		      		}
	       	
	       		
			
			}});
	       		
				
			
	
		btnEmprunt.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEmprunt.setBounds(10, 11, 105, 23);
		panel_3.add(btnEmprunt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldd.setText("");
				textFieldd_1.setText("");
				comboboxx.setSelectedItem("");
				//textField_2.setText("");
				comboboxx1.setSelectedItem("");
				//textField_3.setText("");
				textFieldd_4.setText("");
				//textFieldd_5.setText("");
				//textFieldd_6.setText("");
				//textField_7.setText("");
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
		/*@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			if(event.getSource()== btnretour) {
				this.dispose();
		         ii = new Indexx();
		         setVisible(false);
		         ii.setVisible(true);}*/
		
		
		
				
		
		
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
		panel_3.add(btnPrint);}
		
		/*table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Reference No", "Firstname", "Surname", "Address", "Post Code", "Telephone", "Date Reg", "Prove of ID", "Membership", "Amount Paid"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(89);
		scrollPane.setViewportView(table);*/
	

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
	
		
		
		
		
		

	
	


