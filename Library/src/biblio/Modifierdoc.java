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

	public class Modifierdoc extends JFrame implements  ActionListener {
			/**
		 * 
		 */
		private static final long serialVersionUID = 3458088938293720628L;
		private  Indexx ii;
		private Admin_document addoc;
	        private JLabel text = new JLabel();
	        private JLabel text2 = new JLabel();
	        private JButton button2 = new JButton("Retour");
	        private JButton button1 = new JButton("Enregistrer");
	        private JLabel lblcode = new JLabel("code");
	        private JLabel lbltitre = new JLabel("titre");
	        private JLabel lbllocalisation = new JLabel("localisation");
	        private JLabel lblnb_exemplaires = new JLabel("nb_exemplaires");
	       
	        private JTextField code = new JTextField();
	        private JTextField titre = new JTextField();
	        private JTextField localisation = new JTextField();
	        private JTextField nb_exemplaires = new JTextField();
	        
	        
	        public Modifierdoc(){
	        	setIconImage(Toolkit.getDefaultToolkit().getImage(Modifierdoc.class.getResource("/images/man.png")));
	  
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
			
			
	   
	       /* text.setText("Bonjour cher Visiteur!");
	        text.setHorizontalAlignment(SwingConstants.CENTER);
	        text.setFont(new Font("Cooper Black", Font.PLAIN, 25));
	        text.setForeground(new Color(222, 49, 99));
	        text.setBounds(240, -180, 500, 420);
	        pan.add(text); */
	        
	        
			
			
				
				 text2.setText("Modifier documents");
			     text2.setHorizontalAlignment(SwingConstants.CENTER);
			     text2.setFont(new Font("Cooper Black", Font.PLAIN, 20));
			     text2.setForeground(new Color(0,0,0));
			     text2.setBounds(200,-20, 450, 200);
			     pan.add(text2);
			     

			     
			        code.setBounds(430, 110, 200, 36);
					pan.add(code);
					code.setColumns(10);
					
					
					lblcode.setBounds(355, 120, 114, 14);
					lblcode.setFont(new Font("Times New Roman", Font.PLAIN, 12));
					pan.add(lblcode);
					
					
					titre.setBounds(430, 154, 200, 36);
					pan.add(titre);
					titre.setColumns(10);
					
					
					lbltitre.setBounds(355, 160, 114, 14);
					lbltitre.setFont(new Font("Times New Roman", Font.PLAIN, 12));
					pan.add(lbltitre);
					
					
					localisation.setBounds(430, 198, 200, 36);
					pan.add(localisation);
					localisation.setColumns(10);
					
					
					lbllocalisation.setBounds(355, 200, 114, 14);
					lbllocalisation.setFont(new Font("Times New Roman", Font.PLAIN, 12));
					pan.add(lbllocalisation);
			     
			     
			        /*JTextField textField = new JTextField();
					textField.setBounds(430, 242, 200, 36);
					pan.add(textField);
					textField.setColumns(10);*/
					
					
					//type.setModel(new DefaultComboBoxModel(new String[] {"Etudiant","Enseignant"}));
					nb_exemplaires.setBounds(430, 240, 175, 30);
					pan.add(nb_exemplaires);
					nb_exemplaires.setColumns(10);
					
					
					
					
					lblnb_exemplaires.setBounds(355, 244, 114, 14);
					lblnb_exemplaires.setFont(new Font("Times New Roman", Font.PLAIN, 12));
					pan.add(lblnb_exemplaires);
					
					
					
			     
			     
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
	          	         addoc = new Admin_document();
	          	         setVisible(false);
	                    addoc.setVisible(true);
	          }   
	              	if(event.getSource()== button1) {
	              		try {
	              		Class.forName("com.mysql.jdbc.Driver");
              			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblio","root","");
              			String sql = "Update document set  titre='"+titre.getText()+"' , localisation='"+localisation.getText()+"',nb_exemplaires='"+nb_exemplaires.getText()+"' where code='"+code.getText()+"'" ;  
              			PreparedStatement pst = conn.prepareStatement(sql);
                    	pst.execute();
                    	JOptionPane.showMessageDialog(null, "Mise à jour de données avec succés");
                    	pst.close();
                    	code.setText(null);
               			titre.setText(null);
               			localisation.setText(null);
               			nb_exemplaires.setText(null);
               		
	              		
	              		
	              		}
	              		catch (Exception ex){
	              			JOptionPane.showMessageDialog(null, ex);
	              		}
	              		

	              		
	              		
	          }
	               }
	                
	}


