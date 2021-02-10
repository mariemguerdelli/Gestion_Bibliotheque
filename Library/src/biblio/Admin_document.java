package biblio;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Statement;

import net.proteanit.sql.DbUtils;

public class Admin_document extends JFrame  implements ActionListener {
		/**
	 * 
	 */
	private static final long serialVersionUID = 3458088938293720628L;
	
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	DefaultTableModel model = new DefaultTableModel();
	static JTable table = new JTable();
	private JButton button = new JButton("Retour");
	private JButton button1 = new JButton("Modifier");
	private JButton button2 = new JButton("Supprimer");
	private JButton button3 = new JButton("Ajouter");
	//private JButton button4 = new JButton("Refresh");
	//private JButton button5 = new JButton("Suppr_multi");
	//private JButton btnDelete = new JButton("Delete");
	//private Checkbox chkDel = new Checkbox();
	private JLabel text = new JLabel();
    private JLabel text2 = new JLabel();
	private JLabel lbltitre = new JLabel("Titre");
    private JLabel lbllocalisation = new JLabel("Localisation");
    private JLabel lblnbex = new JLabel("NbEx");
    private JTextField titre = new JTextField();
    private JTextField localisation = new JTextField();
    private JTextField nbex = new JTextField();
	private Indexx ii;
	private Modifierdoc md;
	private JTextField textFieldsearch;
	DefaultTableModel model1 = new DefaultTableModel();
	static JTable table1 = new JTable();
	private JComboBox combobox = new JComboBox();
	private JComboBox combobox1 = new JComboBox();
	private JComboBox combobox2 = new JComboBox();
			
	
		
	
	
	
	
	public Admin_document(){
		super("Admin");
		updateTable();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Admin_document.class.getResource("/images/man.png")));
		JPanel pan = (JPanel) this.getContentPane();
   		pan.setLayout(new FlowLayout(FlowLayout.LEFT));
   		pan = new JPanel();
   		pan.setBackground(Color.WHITE);
   		pan.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pan);
		pan.setLayout(null);
		this.setTitle("Gestion_Document");
        this.setSize(700, 500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 28, 380, 200);
		pan.add(scrollPane);
		
		conn = Connect.ConnectDb();
		Object col []= {"Code_unique", "Titre", "Localisation", "Nb_exemp"};
		model.setColumnIdentifiers(col);
		table.setModel(model);
		table.getColumnModel().getColumn(0).setPreferredWidth(89);
		scrollPane.setViewportView(table);
		
		/*JPanel panel = new JPanel();
		panel.setBackground(new Color(222, 49, 99));
		panel.setBounds(385, 30, 300, 195);
		pan.add(panel);*/
		//panel.setLayout(null);
		
		 text2.setText("Ajouter document ");
	     text2.setHorizontalAlignment(SwingConstants.CENTER);
	     text2.setFont(new Font("Cooper Black", Font.PLAIN, 18));
	     text2.setForeground(new Color(0,0,0));
	     text2.setBounds(380,-50, 300, 180);
	     pan.add(text2);
	     
	        
	        titre.setBounds(510, 65, 110, 36);
			pan.add(titre);
			titre.setColumns(7);
			
			
			lbltitre.setBounds(430, 80, 90, 14);
			lbltitre.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			pan.add(lbltitre);
			
			
			/*localisation.setBounds(510, 109, 110, 36);
			pan.add(localisation);
			localisation.setColumns(7);*/
			
			combobox1.setModel(new DefaultComboBoxModel(new String[] {"","S1", "S2", "S3","S4", "S5", "S6"}));
			combobox1.setForeground(Color.black);
			combobox1.setBackground(new Color(34, 66, 124));
			combobox1.setBounds(510, 109, 50, 31);
			pan.add(combobox1);
			
			combobox2.setModel(new DefaultComboBoxModel(new String[] {"","R1", "R2", "R3","R4", "R5", "R6"}));
			combobox2.setForeground(Color.black);
			combobox2.setBackground(new Color(34, 66, 124));
			combobox2.setBounds(560, 109, 50, 31);
			pan.add(combobox2);
			
			lbllocalisation.setBounds(430, 114, 90, 14);
			lbllocalisation.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			pan.add(lbllocalisation);
			
			
			nbex.setBounds(510, 153, 110, 36);
			pan.add(nbex);
			nbex.setColumns(7);
			
			
			lblnbex.setBounds(430, 158, 90, 14);
			lblnbex.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			pan.add(lblnbex);
	     
			//setContentPane(panel);
	     
			/*chkDel.setBounds(450, 180, 300, 70);
			//chkDel.setSelected(false);
			table.add(chkDel);*/
			
		
		
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(34, 66, 124));
		button.setBounds(570, 415, 80, 34);
		button.addActionListener(this);
		pan.add(button);
		
		button1.setForeground(Color.WHITE);
		button1.setBackground(new Color(34, 66, 124));
		button1.setBounds(100, 230, 80, 34);
		button1.addActionListener(this);
		pan.add(button1);
		
		button2.setForeground(Color.WHITE);
		button2.setBackground(new Color(34, 66, 124));
		button2.setBounds(200, 230,90, 34);
		button2.addActionListener(this);
		pan.add(button2);
		
		button3.setForeground(Color.WHITE);
		button3.setBackground(new Color(34, 66, 124));
		button3.setBounds(480, 200,80, 34);
		button3.addActionListener(this);
		pan.add(button3);
		
		 
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(37, 350, 500, 100);
		pan.add(scrollPane1);
		
		Object col1 []= {"Code_unique", "Titre", "Localisation", "Nb_exemp"};
		model1.setColumnIdentifiers(col1);
		table1.setModel(model1);
		table1.getColumnModel().getColumn(0).setPreferredWidth(89);
		scrollPane1.setViewportView(table1);
		
		
		combobox.setModel(new DefaultComboBoxModel(new String[] {"Code", "Titre", "Localisation"}));
		combobox.setForeground(Color.black);
		combobox.setBackground(new Color(34, 66, 124));
		combobox.setBounds(40, 310, 195, 31);
		pan.add(combobox);
		
		
		
	
		
		textFieldsearch = new JTextField();
		textFieldsearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					String selection = (String)combobox.getSelectedItem();
					String sql = "select * from document where "+selection+"=?"; 
					PreparedStatement pst = conn.prepareStatement(sql);
					pst.setString(1,textFieldsearch.getText());
					ResultSet rs = pst.executeQuery();
					table1.setModel(DbUtils.resultSetToTableModel(rs));
					pst.close();
					
					
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		textFieldsearch.setBounds(280,310, 250, 31);
		getContentPane().add(textFieldsearch, BorderLayout.WEST);
		textFieldsearch.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(250, 310, 583, 275);
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setIcon(new ImageIcon(Indexx.class.getResource("/images/search.png")));
		pan.add(label);
		
		/*btnDelete.setForeground(Color.WHITE);
		btnDelete.setBackground(new Color(222, 49, 99));
		btnDelete.setBounds(480,300, 100, 36);
		btnDelete.addActionListener(this);
		pan.add(btnDelete);*/
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
   	         md = new Modifierdoc();
   	         setVisible(false);
             md.setVisible(true);}
       	
       	/*if(event.getSource()== btnDelete) {
       		Object[] options = { "Yes", "No" };
			int n = JOptionPane.showOptionDialog(null, "Do you want to Delete data?","Confirm to Delete?",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null, options,options[1]);
			if (n == 0) // Confirm Delete = Yes
				{
				for (int i = 0; i < table.getRowCount(); i++) {
					Boolean chkDel = Boolean.valueOf(table.getValueAt(i, 0).toString()); // Checke
					if(chkDel) // Checked to Delete
						{
						String code = table.getValueAt(i, 1).toString(); // get CustomerID
						DeleteData(code); // Delete Data
						}}
				JOptionPane.showMessageDialog(null, "Delete Data Successfully");
				//PopulateData(); // Reload Table
				}
			};*/
     
       	
       	if(event.getSource()== button3) {
      		try {
      			Class.forName("com.mysql.jdbc.Driver");
      			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblio","root","");
      			PreparedStatement ps = conn.prepareStatement("INSERT INTO `document`(`titre`, `localisation`, `nb_exemplaires`) VALUES (?,?,?)");
      			ps.setString(1,titre.getText());
      			ps.setString(2,(String)combobox1.getSelectedItem());
      			//ps.setString(3,(String)combobox2.getSelectedItem());
      			//ps.setString(2,localisation.getText());
      			ps.setString(3,nbex.getText());
      			int x = ps.executeUpdate();
      			if (x>0) {
      				//System.out.println("Registration done sucessfully");
      				JOptionPane.showMessageDialog(null, "ajout du document avec succés!","Ajout_document" , JOptionPane.OK_OPTION);
      				table.setModel(model);
           			DefaultTableModel model = (DefaultTableModel) table.getModel();
           			model.addRow(new Object[] {
           					//rs.getInt("code"),
    						titre.getText(),
    						//ps.setString(4,(String)comboboxx1.getSelectedItem());
    						combobox1.getSelectedItem(),
    						//combobox2.getSelectedItem(),
    						//localisation.getText(),
    						nbex.getText()});
      				
      				titre.setText(null);
           			localisation.setText(null);
           			nbex.setText(null);
      			
      			}
      			else {
      				System.out.println("Add failed");
      			}
      		}
      		catch(Exception e1){
      			System.out.println(e1);
      		}
       	}
       	
 
       	if(event.getSource()== button2) {
       		try {
       		int row = table.getSelectedRow();
       		String value =  table.getModel().getValueAt(row, 0).toString();
       		String sql = "DELETE FROM `document` WHERE code=" +value; 
       		pst = conn.prepareStatement(sql);
        	pst.execute();
        	JOptionPane.showMessageDialog(null, "Données supprimés");
        	pst.close();
        	DefaultTableModel model = (DefaultTableModel) table.getModel();
        	model.removeRow(table.getSelectedRow());}
       		
       		catch(Exception ex) {
       			JOptionPane.showMessageDialog(null, ex);
       			if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Aucune donnée pour supprimer" , "Gestion des adhérants", JOptionPane.OK_OPTION);
					}
					else {
						JOptionPane.showMessageDialog(null, "Selectionner une ligne pour la supprimer" , "Gestion des adhérants", JOptionPane.OK_OPTION);
					}
				}}}}


	public void updateTable() {
		conn = Connect.ConnectDb();	
		if(conn != null)
			{
			String sql = "SELECT `code`, `titre`, `localisation`, `nb_exemplaires` FROM `document`";
            try {
            	pst = conn.prepareStatement(sql);
            	rs = pst.executeQuery();
            	Object col []= {"code", "titre", "localisation", "nb_exemplaires"};
    			model.setColumnIdentifiers(col);
    			table.setModel(model);
            	Object[] columnData = new Object[4];
      
            	while (rs.next()) {
            		//int i=0;
            		/*System.out.println(rs.getInt("id"));*/
            		columnData[0] = rs.getInt("code");
            		columnData[1] = rs.getString("titre");
            		columnData[2] = rs.getString("localisation");
            		columnData[3] = rs.getString("nb_exemplaires");
            		
            		 
            		model.addRow(columnData);
            	}
            
            }
            catch(Exception e ) {
            	JOptionPane.showMessageDialog(null, e);
            	
            }
			}
			}

}
/*adresse string w ba3d trecuperi les champs fi varibale adresse w ba3d tnediha fel requette
/* recuperer de la base fel textfield modifier: tableau string (adresse) String[] = adresse: string ede la base.split wel 7aja elli m9asma biha
entrep table compte fih code client walla fournisseur walle client 
vecteur type compte bancaire fel java ctout
*/

