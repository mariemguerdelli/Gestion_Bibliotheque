package biblio;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
//import javax.swing.JButton;
//import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
//import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login_admin extends JFrame implements  ActionListener {
		/**
	 * 
	 */
	private static final long serialVersionUID = 3458088938293720628L;
	private JButton button2 = new JButton("Retour");
	//private JButton button = new JButton("Consulter catalogue");
	private JButton button4 = new JButton("Reset");
	private JPasswordField textField_1 = new JPasswordField();
	private JTextField textField = new JTextField();
	private JButton button1 = new JButton("Authentifier");
	private JLabel lblUsername = new JLabel("Login");
	//private JPasswordField lblPassword1 = new JPasswordField();
	private JLabel lblPassword = new JLabel ("");
	private JCheckBox CheckBox = new JCheckBox("");
	private JPanel pan = new JPanel();
		//private JPanel pan = new JPanel();
        private JLabel text = new JLabel();
        private JLabel text1 = new JLabel();
        private JLabel text2 = new JLabel();
        private JLabel text3 = new JLabel();
        private  Indexx ii;
        //private Catalogue1 cc1;
        private Admin aaa;
        private Admin_1 aa11;
       
       // private Gestion_administrateur gg11;
           //private JButton bouton1 = new JButton("Start");
           public Login_admin(){
           //pan.setLayout(new BorderLayout());
  
        setIconImage(Toolkit.getDefaultToolkit().getImage(Admin_document.class.getResource("/images/man.png")));
   		JPanel pan = (JPanel) this.getContentPane();
   		pan.setLayout(new FlowLayout(FlowLayout.LEFT));
   		
   		pan.setBackground(Color.WHITE);
   		pan.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pan);
		pan.setLayout(null);
		this.setTitle("Administrateur");
        this.setSize(700, 500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
   		
   		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(53, 122, 183));
		panel1.setBounds(0, 240, 330, 300);
		pan.add(panel1);
		pan.setLayout(null);
		
		
   
        text.setText("ADMINISTRATEUR");
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setFont(new Font("Cooper Black", Font.PLAIN, 25));
        text.setForeground(new Color(34, 66, 124));
        text.setBounds(240, -180, 500, 420);
        pan.add(text); 
        
         
        
        
        
  
		
		 text2.setText("Entrez vos donn�es pour ce connecter:  ");
	     text2.setHorizontalAlignment(SwingConstants.CENTER);
	     text2.setFont(new Font("Cooper Black", Font.PLAIN, 16));
	     text2.setForeground(new Color(0,0,0));
	     text2.setBounds(280, 100, 450, 200);
	     pan.add(text2);
	     
	     
	        
			textField.setBounds(430, 230, 200, 36);
			pan.add(textField);
			textField.setColumns(10);
			
			
			lblUsername.setBounds(355, 240, 114, 14);
			lblUsername.setFont(new Font("Cooper Black", Font.PLAIN, 14));
			pan.add(lblUsername);
			
			
			lblPassword.setBounds(430, 290, 200, 36);
			lblPassword.setFont(new Font("Cooper Black", Font.PLAIN, 14));
			pan.add(lblPassword);
			
			 text3.setText("Password");
			 text3.setFont(new Font("Cooper Black", Font.PLAIN, 14));
		     text3.setBounds(355, 210, 450, 200);
		     pan.add(text3);
			
			
			textField_1.setColumns(10);
			textField_1.setBounds(430, 290, 200, 36);
			//pan.getContentPane().add(textField_1);
			pan.add(textField_1);
			
	     
	     
		 button1.setForeground(Color.WHITE);
		 button1.setBackground(new Color(34, 66, 124));
		 button1.setBounds(410, 340, 150, 36);
	     button1.addActionListener(this);
		 pan.add(button1);
		 
		
		 button4.setForeground(Color.WHITE);
		 button4.setBackground(new Color(34, 66, 124));
		 button4.setBounds(370, 420, 95, 36);
	     button4.addActionListener(this);
		 pan.add(button4);
		 
		 
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
			
		    JLabel lblWeGotYou = new JLabel("La lecture: une ampoule s'allume et �teint ce qui l'entoure.");
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
        
        /*CheckBox.setBounds(630, 280, 283, 50);
		CheckBox.setSelected(true);
		pan.add(CheckBox);*/
		
		/*CheckBox.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(CheckBox.isSelected()) {
					
					lblPassword.setEchoChar((char)0);
				}else {
					lblPassword.setEchoChar('*');
				}
			}
		});*/
           
		
           
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
           	/*if(event.getSource()== button) {
        		this.dispose();
        		cc1 = new Catalogue1();
        	}*/
           	
           	if(event.getSource()== button4) {
           		textField.setText(null);
           		textField_1.setText(null);
        	}
           	
           	if(event.getSource()== button1) {
           		String lblUsername = textField.getText();
           		String lblPassword = textField_1.getText();
           		
           		if(lblPassword.contains("login") && lblUsername.contains("login")) {
           			JOptionPane.showMessageDialog(pan,"you are sucessfully logined");
           			textField_1.setText(null);
           			textField.setText(null);
           			this.dispose();
           			aa11 = new Admin_1();
           			
           			//gg11 = new Gestion_administrateur();
           			//aaa = new Admin();
           		}
           		else {
           			JOptionPane.showMessageDialog(pan, "Invalid Login Details","Login Error",JOptionPane.ERROR_MESSAGE);
           			textField_1.setText(null);
           			textField.setText(null);
           		}
        	}
          
          
}
}
