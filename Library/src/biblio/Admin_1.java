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


public class Admin_1 extends JFrame implements  ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6044030649469212128L;
	private JButton button2 = new JButton("Retour");
	private JButton button = new JButton("Gestion_Adherants");
	private JButton button1 = new JButton("Gestion_Documents");
	private JButton button3 = new JButton("Gestion_Emprunts");
	private JLabel text = new JLabel();
    private  Indexx ii;
    private Admin ad;
    private Admin_document addoc;
    private Admin_emprunt ademp;
    
    
    
    public Admin_1() {
    	super("Admin");
    	setIconImage(Toolkit.getDefaultToolkit().getImage(Admin_1.class.getResource("/images/man.png")));
   		JPanel pan = (JPanel) this.getContentPane();
   		pan.setLayout(new FlowLayout(FlowLayout.LEFT));
   		pan = new JPanel();
   		pan.setBackground(Color.WHITE);
   		pan.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pan);
		pan.setLayout(null);
		//this.setTitle("Etudiant");
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
        text.setFont(new Font("Cooper Black", Font.PLAIN, 30));
        text.setForeground(new Color(34, 66, 124));
        text.setBounds(240, -140, 500, 420);
        pan.add(text); 
        

    	
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(34, 66, 124));
		button.setBounds(400, 150, 180, 36);
		button.addActionListener(this);
		pan.add(button);
		
		
	     
		 button1.setForeground(Color.WHITE);
		 button1.setBackground(new Color(34, 66, 124));
		 button1.setBounds(400, 240, 180, 36);
	     button1.addActionListener(this);
		 pan.add(button1);
		 
		 button3.setForeground(Color.WHITE);
		 button3.setBackground(new Color(34, 66, 124));
		 button3.setBounds(400, 300, 180, 36);
	     button3.addActionListener(this);
		 pan.add(button3);
		 
		
		 
		 button2.setForeground(Color.WHITE);
		 button2.setBackground(new Color(34, 66, 124));
		 button2.setBounds(580, 420, 100, 36);
		 button2.addActionListener(this);
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
           	if(event.getSource()== button) {
        		this.dispose();
        		ad = new Admin();
        	}
           	
           	if(event.getSource()== button1) {
        		this.dispose();
        		addoc = new Admin_document();
        	}
        	if(event.getSource()== button3) {
        		this.dispose();
        		ademp = new Admin_emprunt();
        	}
           	
           
   
          
          
}
}















































/*package biblio;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;







	public class Gestion  extends JFrame  implements ActionListener {
			
		private static final long serialVersionUID = 3458088938293720628L;
		
		
		private JButton button = new JButton("Retour");
		private JButton button1 = new JButton("Gestion_Adherants");
		private JButton button2 = new JButton("Gestion_Documents");
		private  Admin aaa;
		private Indexx ii;
		
		
		public static void main(String[] args) throws Exception {
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
			Gestion mywindow1 = new Gestion();//la fénétre est cachée a ce moment
			mywindow1.setVisible(true);//la fenetre est visible
			
		}
		
		
		
		public Gestion (){
			
			
			
			JPanel pan = (JPanel) this.getContentPane();
	   		pan.setLayout(new FlowLayout(FlowLayout.LEFT));
	   		pan = new JPanel();
	   		pan.setBackground(Color.WHITE);
	   		pan.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(pan);
			pan.setLayout(null);
			this.setTitle("Administrateur");
	        this.setSize(700, 500);
	        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        this.setLocationRelativeTo(null);
	        
	        
			
			button.setForeground(Color.WHITE);
			button.setBackground(new Color(222, 49, 99));
			button.setBounds(10, 400, 80, 36);
			button.addActionListener(this);
			pan.add(button);
			
			button1.setForeground(Color.WHITE);
			button1.setBackground(new Color(222, 49, 99));
			button1.setBounds(550, 80, 100, 36);
			button1.addActionListener(this);
			pan.add(button1);
			
			button2.setForeground(Color.WHITE);
			button2.setBackground(new Color(222, 49, 99));
			button2.setBounds(550, 150, 100, 36);
			button2.addActionListener(this);
			pan.add(button2);
		     
			
			setContentPane(pan);
			
			
	        this.setVisible(true);
		}
		
		
		public void actionPerformed(ActionEvent event) {
           	if(event.getSource()== button) {
           		this.dispose();
       	         ii = new Indexx();
       	         setVisible(false);
                 ii.setVisible(true);}
           	if(event.getSource()== button1) {
           		this.dispose();
    	    	aaa = new Admin();
           		
           	}
           		
	}
	}*/











