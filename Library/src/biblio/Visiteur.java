package biblio;

import javax.swing.ImageIcon;
import javax.swing.JButton;
//import javax.swing.JButton;
//import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Visiteur extends JFrame implements ActionListener {
		/**
	 * 
	 */
	private static final long serialVersionUID = 3458088938293720628L;
	private  Indexx ii;
	private Inscription in;
	private Catalogue cc;
		//private JPanel pan = new JPanel();
        private JLabel text = new JLabel();
        private JLabel text1 = new JLabel();
        private JLabel text2 = new JLabel();
        private JButton button2 = new JButton("Retour");
        private JButton button1 = new JButton("S'inscrir");
        private JButton button = new JButton("Consulter catalogue");
           //private JButton bouton1 = new JButton("Start");
           public Visiteur(){
           //pan.setLayout(new BorderLayout());
  
        setIconImage(Toolkit.getDefaultToolkit().getImage(Visiteur.class.getResource("/images/avatar.png")));
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
        text.setForeground(new Color(222, 49, 99));
        text.setBounds(240, -180, 500, 420);
        pan.add(text); 
        
         
        text1.setText("Vous pouvez ");
        text1.setHorizontalAlignment(SwingConstants.CENTER);
        text1.setFont(new Font("Cooper Black", Font.PLAIN, 20));
        text1.setForeground(new Color(0, 0, 0));
        text1.setBounds(310, 120, 200, 36);
        pan.add(text1);
        
        
    	
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(34, 66, 124));
		button.setBounds(490, 120, 150, 36);
		button.addActionListener(this);
		pan.add(button);
		
		 text2.setText("Vous voulez emprunter un document? ");
	     text2.setHorizontalAlignment(SwingConstants.CENTER);
	     text2.setFont(new Font("Cooper Black", Font.PLAIN, 16));
	     text2.setForeground(new Color(0,0,0));
	     text2.setBounds(280, 150, 450, 200);
	     pan.add(text2);
	     
	     
		 button1.setForeground(Color.WHITE);
		 button1.setBackground(new Color(34, 66, 124));
		 button1.setBounds(430, 280, 150, 36);
		 button1.addActionListener(this);
	//button.addActionListener(this);
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
    		this.dispose();
    		in = new Inscription();
    	}
    	if(event.getSource()== button) {
    		this.dispose();
    		cc = new Catalogue();
    	}
    	
                
}
}