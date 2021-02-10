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


public class Inscription extends JFrame implements  ActionListener {
		/**
	 * 
	 */
	private static final long serialVersionUID = 3458088938293720628L;
	private  Indexx ii;
	
        private JLabel text = new JLabel();
        private JLabel text2 = new JLabel();
        private JButton button2 = new JButton("Retour");
        private JButton button1 = new JButton("Valider");
        
        private JLabel lblnom = new JLabel("Nom");
        private JLabel lblprenom = new JLabel("Prénom");
        private JLabel lbladresse = new JLabel("Adresse");
        private JLabel lbltype = new JLabel("Type");
        private JLabel lblPassword = new JLabel("MDP");
        private JTextField nom = new JTextField();
        private JTextField prenom = new JTextField();
        private JTextField adresse = new JTextField();
        //private JTextField type = new JTextField();
        private JTextField password = new JTextField();
        private JComboBox type = new JComboBox();
        
        public Inscription(){
        	setIconImage(Toolkit.getDefaultToolkit().getImage(Inscription.class.getResource("/images/avatar.png")));
  
   		JPanel pan = (JPanel) this.getContentPane();
   		pan.setLayout(new FlowLayout(FlowLayout.LEFT));
   		pan = new JPanel();
   		pan.setBackground(Color.WHITE);
   		pan.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pan);
		pan.setLayout(null);
		this.setTitle("Visiteur");
        this.setSize(700, 500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
   		
   		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(34, 66, 124));
		panel1.setBounds(0, 240, 330, 300);
		pan.add(panel1);
		pan.setLayout(null);
		
		
   
        text.setText("Bonjour cher Visiteur!");
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setFont(new Font("Cooper Black", Font.PLAIN, 25));
        text.setForeground(new Color(34, 66, 124));
        text.setBounds(240, -180, 500, 420);
        pan.add(text); 
        
        
		
		
			
			 text2.setText("Inscription ");
		     text2.setHorizontalAlignment(SwingConstants.CENTER);
		     text2.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		     text2.setForeground(new Color(0,0,0));
		     text2.setBounds(200,-20, 450, 200);
		     pan.add(text2);
		     
		        
		        nom.setBounds(430, 110, 200, 36);
				pan.add(nom);
				nom.setColumns(10);
				
				
				lblnom.setBounds(355, 120, 114, 14);
				lblnom.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				pan.add(lblnom);
				
				
				prenom.setBounds(430, 154, 200, 36);
				pan.add(prenom);
				prenom.setColumns(10);
				
				
				lblprenom.setBounds(355, 160, 114, 14);
				lblprenom.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				pan.add(lblprenom);
				
				
				adresse.setBounds(430, 198, 200, 36);
				pan.add(adresse);
				adresse.setColumns(10);
				
				
				lbladresse.setBounds(355, 200, 114, 14);
				lbladresse.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				pan.add(lbladresse);
		     
		     
		        /*JTextField textField = new JTextField();
				textField.setBounds(430, 242, 200, 36);
				pan.add(textField);
				textField.setColumns(10);*/
				
				
				//type.setModel(new DefaultComboBoxModel(new String[] {"Etudiant","Enseignant"}));
				/*type.setBounds(430, 240, 175, 30);
				pan.add(type);
				type.setColumns(10);*/
				type.setModel(new DefaultComboBoxModel(new String[] {"etudiant","enseignant"}));
				type.setForeground(Color.black);
				type.setBackground(new Color(34, 66, 124));
				type.setBounds(430, 240, 195, 31);
				pan.add(type);
				
				
				
				
				lbltype.setBounds(355, 244, 114, 14);
				lbltype.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				pan.add(lbltype);
				
				
				lblPassword.setBounds(355, 284, 540, 36);
				lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				pan.add(lblPassword);
				
				
				password.setColumns(10);
				password.setBounds(430, 282, 200, 36);
				pan.add(password);
				
				JLabel lblPassword1 = new JLabel("Répeter MDP");
				lblPassword1.setBounds(354, 324, 540, 36);
				lblPassword1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				pan.add(lblPassword1);
				
				JTextField textField_5 = new JTextField();
				textField_5.setColumns(10);
				textField_5.setBounds(430, 324, 200, 36);
				pan.add(textField_5);
				
		     
		     
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
          	         ii = new Indexx();
          	         setVisible(false);
                    ii.setVisible(true);
          }   
              	if(event.getSource()== button1) {
              		try {
              			Class.forName("com.mysql.jdbc.Driver");
              			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblio","root","");
              			PreparedStatement ps = conn.prepareStatement("INSERT INTO `bibll`(`nom`, `prenom`, `adresse`, `type`, `password`,`nbemp`) VALUES (?,?,?,?,?,'0')");
              			ps.setString(1,nom.getText());
              			ps.setString(2,prenom.getText());
              			ps.setString(3,adresse.getText());
              			ps.setString(4,(String)type.getSelectedItem());
              			ps.setString(5,password.getText());
              			int x = ps.executeUpdate();
              			if (x>0) {
              				//System.out.println("Registration done sucessfully");
              				JOptionPane.showMessageDialog(null, "Vous etes maintenant un adhérant!","Inscription" , JOptionPane.PLAIN_MESSAGE);
              			}
              			else {
              				System.out.println("Registration failed");
              			}
              		}
              		catch(Exception e1){
              			System.out.println(e1);
              		}

              		
              		
          }
                 
               }
                
}

