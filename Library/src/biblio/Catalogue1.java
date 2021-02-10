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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Catalogue1 extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1581390189284028451L;
	private JLabel text = new JLabel();
	private JLabel text2 = new JLabel();
	private JButton button2 = new JButton("Retour");
	private JButton button3 = new JButton("Livres");
	private JButton button4 = new JButton("Magazines");
	private JButton button5 = new JButton("Articles");
	private  Indexx ii;
	private Livres1 ll1;
	private Magasines1 mm1;
	private Articles1 ar1;

		
public Catalogue1(){
	
JPanel pan = (JPanel) this.getContentPane();
	pan.setLayout(new FlowLayout(FlowLayout.LEFT));
	pan = new JPanel();
	pan.setBackground(Color.WHITE);
	pan.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(pan);
pan.setLayout(null);
this.setTitle("Etudiant");
this.setSize(700, 500);
this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
this.setLocationRelativeTo(null);
	
	
JPanel panel1 = new JPanel();
panel1.setBackground(new Color(34, 66, 124));
panel1.setBounds(0, 240, 330, 300);
pan.add(panel1);
pan.setLayout(null);



text.setText("Catalogue ");
text.setHorizontalAlignment(SwingConstants.CENTER);
text.setFont(new Font("Cooper Black", Font.PLAIN, 27));
text.setForeground(new Color(34, 66, 124));
text.setBounds(240, -180, 500, 420);
pan.add(text); 

text2.setText("Vous pouvez emprunter :  ");
text2.setHorizontalAlignment(SwingConstants.CENTER);
text2.setFont(new Font("Cooper Black", Font.PLAIN, 18));
text2.setForeground(new Color(0,0,0));
text2.setBounds(280, -1, 450, 200);
pan.add(text2);

button3.setForeground(Color.WHITE);
button3.setBackground(new Color(34, 66, 124));
button3.setBounds(450, 150, 100, 36);
button3.addActionListener(this);
pan.add(button3);

button4.setForeground(Color.WHITE);
button4.setBackground(new Color(34, 66, 124));
button4.setBounds(450, 200, 100, 36);
button4.addActionListener(this);
pan.add(button4);

button5.setForeground(Color.WHITE);
button5.setBackground(new Color(34, 66, 124));
button5.setBounds(450, 250, 100, 36);
button5.addActionListener(this);
pan.add(button5);


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

button2.setForeground(Color.WHITE);
button2.setBackground(new Color(34, 66, 124));
button2.setBounds(580, 420, 100, 36);
button2.addActionListener(this);
//button.addActionListener(this);
pan.add(button2);

JLabel label1 = new JLabel("");   
label1.setBounds(-10, -16, 583, 275);
label1.setVerticalAlignment(SwingConstants.TOP);
label1.setIcon(new ImageIcon(Visiteur.class.getResource("/images/aa.png")));
pan.add(label1);

setContentPane(pan);


   
this.setVisible(true);                             
}


@Override
public void actionPerformed(ActionEvent event) {
	// TODO Auto-generated method stub
	if(event.getSource()== button2) {
		this.dispose();
         ii = new Indexx();
         setVisible(false);
         ii.setVisible(true);
	
}
	if(event.getSource()== button3) {
		this.dispose();
		ll1 = new Livres1();
	
}
	if(event.getSource()== button4) {
		this.dispose();
		mm1 = new Magasines1();
	
}
	if(event.getSource()== button5) {
		this.dispose();
		ar1 = new Articles1();
	
}
}
}