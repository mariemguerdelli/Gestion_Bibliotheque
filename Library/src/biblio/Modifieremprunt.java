package biblio;

	import javax.swing.ComboBoxModel;
	import javax.swing.DefaultComboBoxModel;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JComboBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JTextField;
	import javax.swing.SwingConstants;
	import javax.swing.border.EmptyBorder;

	import java.awt.Color;
	import java.awt.FlowLayout;
	import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.sql.*;

	public class Modifieremprunt extends JFrame implements  ActionListener {
			/**
		 * 
		 */
		private static final long serialVersionUID = 3458088938293720628L;
		private  Indexx ii;
		private Admin_emprunt ademp;
	        private JLabel text = new JLabel();
	        private JLabel text2 = new JLabel();
	        private JButton button2 = new JButton("Retour");
	        private JButton button1 = new JButton("Enregistrer");
	        private JLabel lblid = new JLabel("ID");
	        private JLabel lblnom = new JLabel("Nom");
	        private JLabel lblprenom = new JLabel("Prenom");
	        private JLabel lblstatut = new JLabel("Statut");
	        private JLabel lbltype = new JLabel("Type");
	        private JLabel lbltitre = new JLabel("Titre");
	        private JLabel lbldate_debut_pret = new JLabel("date_debut");
	        private JLabel lbldate_limite = new JLabel("date_limite");
		       
		       
	       
	        private JTextField id = new JTextField();
	        private JTextField Nom = new JTextField();
	        private JTextField Prenom = new JTextField();
	        //private JTextField Statut = new JTextField();
	        private JTextField Titre = new JTextField();
	        private JTextField date_debut_pret = new JTextField();
	        private JTextField date_limite = new JTextField();
	        private JComboBox Statut = new JComboBox();
	    	private JComboBox type = new JComboBox();
	        
	    	
	        public Modifieremprunt(){
	        setIconImage(Toolkit.getDefaultToolkit().getImage(Modifieremprunt.class.getResource("/images/man.png")));
	  
	   		JPanel pan = (JPanel) this.getContentPane();
	   		pan.setLayout(new FlowLayout(FlowLayout.LEFT));
	   		pan = new JPanel();
	   		pan.setBackground(Color.WHITE);
	   		pan.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(pan);
			pan.setLayout(null);
			this.setTitle("Document");
	        this.setSize(700, 500);
	        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        this.setLocationRelativeTo(null);
	   		
	   		
			JPanel panel1 = new JPanel();
			panel1.setBackground(new Color(34, 66, 124));
			panel1.setBounds(0, 240, 330, 300);
			pan.add(panel1);
			pan.setLayout(null);
			
			
	   
				
				 text2.setText("Modifier Emprunts");
			     text2.setHorizontalAlignment(SwingConstants.CENTER);
			     text2.setFont(new Font("Cooper Black", Font.PLAIN, 20));
			     text2.setForeground(new Color(0,0,0));
			     text2.setBounds(230,-50, 450, 200);
			     pan.add(text2);
			     

			     
			        id.setBounds(430, 80, 175, 30);
					pan.add(id);
					id.setColumns(10);
					
					
					lblid.setBounds(355, 90, 114, 14);
					lblid.setFont(new Font("Times New Roman", Font.PLAIN, 12));
					pan.add(lblid);
					
					
					Nom.setBounds(430, 124, 175, 30);
					pan.add(Nom);
					Nom.setColumns(10);
					
					
					lblnom.setBounds(355, 130, 114, 14);
					lblnom.setFont(new Font("Times New Roman", Font.PLAIN, 12));
					pan.add(lblnom);
					
					
					Prenom.setBounds(430, 168, 175, 30);
					pan.add(Prenom);
					Prenom.setColumns(10);
					
					
					lblprenom.setBounds(355, 170, 114, 14);
					lblprenom.setFont(new Font("Times New Roman", Font.PLAIN, 12));
					pan.add(lblprenom);
			     
			     
			        
					Statut.setModel(new DefaultComboBoxModel(new String[] {"","Visiteur","Enseignant","Etudiant"}));
					Statut.setForeground(Color.black);
					Statut.setBackground(new Color(34, 66, 124));
					Statut.setBounds(430, 200, 141, 23);
					pan.add(Statut);
					
					lblstatut.setBounds(355, 214, 114, 14);
					lblstatut.setFont(new Font("Times New Roman", Font.PLAIN, 12));
					pan.add(lblstatut);
					
					type.setModel(new DefaultComboBoxModel(new String[] {"","Livre","Article","Magazine"}));
					type.setForeground(Color.black);
					type.setBackground(new Color(34, 66, 124));
					type.setBounds(430, 240, 141, 23);
					pan.add(type);
					
					lbltype.setBounds(355, 254, 114, 14);
					lbltype.setFont(new Font("Times New Roman", Font.PLAIN, 12));
					pan.add(lbltype);
					
					
					
					
					Titre.setBounds(430, 270, 175, 30);
					pan.add(Titre);
					Titre.setColumns(10);
					
					
					lbltitre.setBounds(355, 284, 114, 14);
					lbltitre.setFont(new Font("Times New Roman", Font.PLAIN, 12));
					pan.add(lbltitre);
					
					
					date_debut_pret.setBounds(430, 310, 175, 30);
					pan.add(date_debut_pret);
					date_debut_pret.setColumns(10);
					
					
					lbldate_debut_pret.setBounds(355, 328, 114, 14);
					lbldate_debut_pret.setFont(new Font("Times New Roman", Font.PLAIN, 12));
					pan.add(lbldate_debut_pret);
					
					
					date_limite.setBounds(430, 350, 175, 30);
					pan.add(date_limite);
					date_limite.setColumns(10);
					
					
					lbldate_limite.setBounds(355, 368, 114, 14);
					lbldate_limite.setFont(new Font("Times New Roman", Font.PLAIN, 12));
					pan.add(lbldate_limite);
					
					
					
					
					
					
					
			     
			     
			 button1.setForeground(Color.WHITE);
			 button1.setBackground(new Color(34, 66, 124));
		     button1.setBounds(440, 390, 110, 36);
			 button1.addActionListener(this);
		     pan.add(button1);
			 
			 
			 button2.setForeground(Color.WHITE);
			 button2.setBackground(new Color(34, 66, 124));
			 button2.setBounds(580, 420, 100, 36);
			 button2.addActionListener(this);
		//button.addActionListener(this);
			 pan.add(button2);
			 
			    JLabel lblNewLabel = new JLabel("BIENVENUE");
			    lblNewLabel.setForeground(new Color(240, 248, 255));
			    lblNewLabel.setFont(new Font("Cooper Black", Font.PLAIN, 25));
			    lblNewLabel.setBounds(20, 420, 120, 30);
				panel1.add(lblNewLabel);
				
			    JLabel lblWeGotYou = new JLabel("La lecture: une ampoule s'allume et éteint ce qui l'entoure.");
				lblWeGotYou.setForeground(new Color(240, 248, 255));
				lblWeGotYou.setFont(new Font("Chiller", Font.PLAIN, 18));
				lblWeGotYou.setBounds(20, 400, 500, 27);
				panel1.add(lblWeGotYou);
				
				JLabel lblWeGotYou1 = new JLabel("Charles Dantzig.");
				lblWeGotYou1.setHorizontalAlignment(SwingConstants.CENTER);
				lblWeGotYou1.setForeground(new Color(240, 248, 255));
				lblWeGotYou1.setFont(new Font("Chiller", Font.PLAIN, 19));
				lblWeGotYou1.setBounds(175, 392, 141, 27);
				panel1.add(lblWeGotYou1);
				
			
	        JLabel label1 = new JLabel("");   
	        label1.setBounds(-10, -16, 583, 275);
	        label1.setVerticalAlignment(SwingConstants.TOP);
	        label1.setIcon(new ImageIcon(Visiteur.class.getResource("/images/aa.png")));
	        pan.add(label1);
	           
	        setContentPane(pan);
	           
	           
	               
	           this.setVisible(true);                             
	        }
	          public void actionPerformed(ActionEvent event) {
	              	if(event.getSource()== button2) {
	              		this.dispose();
	          	         ademp = new Admin_emprunt();
	          	         setVisible(false);
	                    ademp.setVisible(true);
	          }   
	              	if(event.getSource()== button1) {
	   
	              		try {
	              		Class.forName("com.mysql.jdbc.Driver");
              			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblio","root","");
              			String sql = "Update fiche_emprunt set nom='"+Nom.getText()+"' , prenom='"+Prenom.getText()+"',statut='"+Statut.getSelectedItem()+"',type='"+type.getSelectedItem()+"',titre='"+Titre.getText()+"',date_debut_pret='"+date_debut_pret.getText()+"',date_limite='"+date_limite.getText()+"' where id='"+id.getText()+"'" ;  
              			PreparedStatement pst = conn.prepareStatement(sql);
                    	pst.execute();
                    	JOptionPane.showMessageDialog(null, "Mise à jour de l'emprunt avec succés");
                    	pst.close();
                    	id.setText(null);
               			Nom.setText(null);
               			Prenom.setText(null);
               			Statut.setSelectedItem(null);
               			type.setSelectedItem(null);
               			Titre.setText(null);
               			date_debut_pret.setText(null);
               			date_limite.setText(null);
               		
	              		
	              		
	              		}
	              		catch (Exception ex){
	              			JOptionPane.showMessageDialog(null, ex);
	              		}
	              		

	              		
	              		
	          }
	               }
	                
	}


