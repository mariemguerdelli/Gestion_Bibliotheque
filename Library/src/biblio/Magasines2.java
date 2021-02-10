package biblio;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Magasines2 extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7024974267973968308L;
	private JLabel text = new JLabel();
	private JLabel text1 = new JLabel();
	private JLabel text2 = new JLabel();
	private JButton button2 = new JButton("Retour");
	private Indexx ii;
	private Search s1;
	private JButton btnSearch = new JButton("Recherche");
	private JLabel text3 = new JLabel();
	private JButton button3 = new JButton("Emprunter");
	private JButton button4 = new JButton("Emprunter");
	private JButton button5 = new JButton("Emprunter");
	private JButton button6 = new JButton("Emprunter");
	private JButton button7 = new JButton("Emprunter");
	private JButton button8 = new JButton("Cliquer ici pour consulter tous nos livres");
	private Empreint E1;

		
public Magasines2(){
	
JPanel pan = (JPanel) this.getContentPane();
	pan.setLayout(new FlowLayout(FlowLayout.LEFT));
	pan = new JPanel();
	pan.setBackground(Color.WHITE);
	pan.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(pan);
pan.setLayout(null);
this.setTitle("Magasines_Enseignant");
this.setSize(700, 500);
this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
this.setLocationRelativeTo(null);
	
	


text.setText("Nos Magasines ");
text.setHorizontalAlignment(SwingConstants.CENTER);
text.setFont(new Font("Cooper Black", Font.PLAIN, 30));
text.setForeground(new Color(34, 66, 124));
text.setBounds(100, -180, 500, 420);
pan.add(text); 


button2.setForeground(Color.WHITE);
button2.setBackground(new Color(34, 66, 124));
button2.setBounds(580, 420, 100, 36);
button2.addActionListener(this);
pan.add(button2);

btnSearch.setForeground(Color.WHITE);
btnSearch.setBackground(new Color(34, 66, 124));
btnSearch.setBounds(380, 70, 100, 36);
btnSearch.addActionListener(this);
pan.add(btnSearch);

text1.setText("Cliquer 'Recherche' pour chercher une magasine : ");
text1.setHorizontalAlignment(SwingConstants.CENTER);
text1.setFont(new Font("Cooper Black", Font.PLAIN, 14));
text1.setForeground(new Color(0, 0, 0));
text1.setBounds(-50, -120, 500, 420);
pan.add(text1); 

text2.setText("Nos magasines les plus empruntés : ");
text2.setHorizontalAlignment(SwingConstants.CENTER);
text2.setFont(new Font("Cooper Black", Font.PLAIN, 17));
text2.setForeground(new Color(0, 0, 0));
text2.setBounds(100, -70, 500, 420);
pan.add(text2); 

JLabel label1 = new JLabel("");   
label1.setBounds(60, 185, 583, 275);
label1.setVerticalAlignment(SwingConstants.TOP);
label1.setIcon(new ImageIcon(Visiteur.class.getResource("/images/11.png")));
pan.add(label1);

button3.setForeground(Color.WHITE);
button3.setBackground(new Color(34, 66, 124));
button3.setBounds(56, 310, 90, 30);
button3.addActionListener(this);
pan.add(button3);

JLabel label2 = new JLabel("");   
label2.setBounds(180, 186, 300, 300);
label2.setVerticalAlignment(SwingConstants.TOP);
label2.setIcon(new ImageIcon(Visiteur.class.getResource("/images/12.png")));
pan.add(label2);

button4.setForeground(Color.WHITE);
button4.setBackground(new Color(34, 66, 124));
button4.setBounds(175, 310, 90, 30);
button4.addActionListener(this);
pan.add(button4);

JLabel label3 = new JLabel("");   
label3.setBounds(300, 184, 300, 275);
label3.setVerticalAlignment(SwingConstants.TOP);
label3.setIcon(new ImageIcon(Visiteur.class.getResource("/images/13.png")));
pan.add(label3);

button5.setForeground(Color.WHITE);
button5.setBackground(new Color(34, 66, 124));
button5.setBounds(300, 310, 90, 30);
button5.addActionListener(this);
pan.add(button5);

JLabel label4 = new JLabel("");   
label4.setBounds(420, 180, 300, 275);
label4.setVerticalAlignment(SwingConstants.TOP);
label4.setIcon(new ImageIcon(Visiteur.class.getResource("/images/15.png")));
pan.add(label4);

button6.setForeground(Color.WHITE);
button6.setBackground(new Color(34, 66, 124));
button6.setBounds(420, 310, 90, 30);
button6.addActionListener(this);
pan.add(button6);

JLabel label5 = new JLabel("");   
label5.setBounds(540, 182, 300, 275);
label5.setVerticalAlignment(SwingConstants.TOP);
label5.setIcon(new ImageIcon(Visiteur.class.getResource("/images/14.png")));
pan.add(label5);


text3.setText("NB: Vous pouvez emprunter au max 4 magasines à la fois");
text3.setHorizontalAlignment(SwingConstants.CENTER);
text3.setFont(new Font("Cooper Black", Font.PLAIN, 15));
text3.setForeground(new Color(0, 0, 0));
text3.setBounds(80, 170, 500, 420);
pan.add(text3);


button7.setForeground(Color.WHITE);
button7.setBackground(new Color(34, 66, 124));
button7.setBounds(540, 310, 90, 30);
button7.addActionListener(this);
pan.add(button7);

button8.setForeground(Color.WHITE);
button8.setBackground(new Color(34, 66, 124));
button8.setBounds(20, 420, 250, 30);
button8.addActionListener(this);
pan.add(button8);
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
	if(event.getSource()== btnSearch) {
		//String name = JOptionPane.showInputDialog("Entrez le nom de magasine recherchée");}
		this.dispose();
		 s1 = new Search();
		 setVisible(false);
        s1.setVisible(true);}
	
	if(event.getSource()== button3) {
		this.dispose();
        E1 = new Empreint();
         setVisible(false);
         E1.setVisible(true);}
	if(event.getSource()== button4) {
		this.dispose();
        E1 = new Empreint();
         setVisible(false);
         E1.setVisible(true);}
	if(event.getSource()== button5) {
		this.dispose();
        E1 = new Empreint();
         setVisible(false);
         E1.setVisible(true);}
	if(event.getSource()== button6) {
		this.dispose();
        E1 = new Empreint();
         setVisible(false);
         E1.setVisible(true);}
	if(event.getSource()== button7) {
		this.dispose();
        E1 = new Empreint();
         setVisible(false);
         E1.setVisible(true);}
}
}