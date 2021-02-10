
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

	public class  Admin_emprunt extends JFrame  implements ActionListener {
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
		private JButton button3 = new JButton("Recherche retardataire");
		//private JButton button3 = new JButton("Ajouter");
		//private JButton button4 = new JButton("Refresh");
		//private JButton button5 = new JButton("Suppr_multi");
		//private JButton btnDelete = new JButton("Delete");
		//private Checkbox chkDel = new Checkbox();
		private JLabel text = new JLabel();
	    private JLabel text2 = new JLabel();
		/*private JLabel lbltitre = new JLabel("Titre");
	    private JLabel lbllocalisation = new JLabel("Localisation");
	    private JLabel lblnbex = new JLabel("NbEx");*/
	    /*private JTextField titre = new JTextField();
	    private JTextField localisation = new JTextField();
	    private JTextField nbex = new JTextField();*/
		private Indexx ii;
		private Rech_retardataire rechretard;
		private Modifieremprunt memp;
		private JTextField textFieldsearch;
		DefaultTableModel model1 = new DefaultTableModel();
		static JTable table1 = new JTable();
		private JComboBox combobox = new JComboBox();
				
		
			
		
		
		
		
		public  Admin_emprunt(){
			super("Admin");
			updateTable();
			setIconImage(Toolkit.getDefaultToolkit().getImage(Admin_emprunt.class.getResource("/images/man.png")));
			JPanel pan = (JPanel) this.getContentPane();
	   		pan.setLayout(new FlowLayout(FlowLayout.LEFT));
	   		pan = new JPanel();
	   		pan.setBackground(Color.WHITE);
	   		pan.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(pan);
			pan.setLayout(null);
			this.setTitle("Gestion_Emprunt");
	        this.setSize(700, 500);
	        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        this.setLocationRelativeTo(null);
	        
	        JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(15, 28, 620, 200);
			pan.add(scrollPane);
			
			conn = Connect.ConnectDb();
			Object col []= {"id", "Nom", "Prenom", "Statut","Titre","date_debut_pret","date_limite"};
			model.setColumnIdentifiers(col);
			table.setModel(model);
			table.getColumnModel().getColumn(0).setPreferredWidth(89);
			scrollPane.setViewportView(table);
			
			/*JPanel panel = new JPanel();
			panel.setBackground(new Color(222, 49, 99));
			panel.setBounds(385, 30, 300, 195);
			pan.add(panel);*/
			//panel.setLayout(null);
			
			 /*text2.setText("Ajouter document ");
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
				
				
				localisation.setBounds(510, 109, 110, 36);
				pan.add(localisation);
				localisation.setColumns(7);
				
				
				lbllocalisation.setBounds(430, 114, 90, 14);
				lbllocalisation.setFont(new Font("Times New Roman", Font.PLAIN, 13));
				pan.add(lbllocalisation);
				
				
				nbex.setBounds(510, 153, 110, 36);
				pan.add(nbex);
				nbex.setColumns(7);
				
				
				lblnbex.setBounds(430, 158, 90, 14);
				lblnbex.setFont(new Font("Times New Roman", Font.PLAIN, 13));
				pan.add(lblnbex);*/
		     
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
			button3.setBounds(300, 230,180, 34);
			button3.addActionListener(this);
			pan.add(button3);
			
			/*button3.setForeground(Color.WHITE);
			button3.setBackground(new Color(222, 49, 99));
			button3.setBounds(480, 200,80, 34);
			button3.addActionListener(this);
			pan.add(button3);*/
			
			 
			JScrollPane scrollPane1 = new JScrollPane();
			scrollPane1.setBounds(37, 350, 500, 100);
			pan.add(scrollPane1);
			
			Object col1 []= {"id", "Nom", "Prenom", "Statut","Titre","date_debut_pret","date_limite"};
			model1.setColumnIdentifiers(col1);
			table1.setModel(model1);
			table1.getColumnModel().getColumn(0).setPreferredWidth(89);
			scrollPane1.setViewportView(table1);
			
			
			combobox.setModel(new DefaultComboBoxModel(new String[] {"id", "Nom", "Prenom", "Statut","Titre","date_debut_pret","date_limite"}));
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
						String sql = "select * from fiche_emprunt where "+selection+"=?"; 
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
	   	         memp = new Modifieremprunt();
	   	         setVisible(false);
	   	         memp.setVisible(true);}
	       	
	       	
	     	if(event.getSource()== button3) {
	       		this.dispose();
	   	         rechretard = new Rech_retardataire();
	   	         setVisible(false);
	   	         rechretard.setVisible(true);}
	       	
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
	     
	       	
	       	/*if(event.getSource()== button3) {
	      		try {
	      			Class.forName("com.mysql.jdbc.Driver");
	      			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblio","root","");
	      			PreparedStatement ps = conn.prepareStatement("INSERT INTO `document`(`titre`, `localisation`, `nb_exemplaires`) VALUES (?,?,?)");
	      			ps.setString(1,titre.getText());
	      			ps.setString(2,localisation.getText());
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
	    						localisation.getText(),
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
	       	}*/
	       	
	 
	       	if(event.getSource()== button2) {
	       		try {
	       		int row = table.getSelectedRow();
	       		String value =  table.getModel().getValueAt(row, 0).toString();
	       		String sql = "DELETE FROM `fiche_emprunt` WHERE id=" +value; 
	       		pst = conn.prepareStatement(sql);
	        	pst.execute();
	        	JOptionPane.showMessageDialog(null, "Emprunt supprimé");
	        	pst.close();
	        	DefaultTableModel model = (DefaultTableModel) table.getModel();
	        	model.removeRow(table.getSelectedRow());}
	       		
	       		catch(Exception ex) {
	       			JOptionPane.showMessageDialog(null, ex);
	       			if(table.getSelectedRow() == -1) {
						if(table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Aucune emprunt pour supprimer" , "Gestion des Emprunts", JOptionPane.OK_OPTION);
						}
						else {
							JOptionPane.showMessageDialog(null, "Selectionner une ligne pour la supprimer" , "Gestion des Emprunts", JOptionPane.OK_OPTION);
						}
					}}}}


		public void updateTable() {
			conn = Connect.ConnectDb();	
			if(conn != null)
				{
				String sql = "SELECT `id`, `Nom`, `Prenom`, `Statut`,`Titre`, `date_debut_pret`, `date_limite` FROM `fiche_emprunt`";
	            try {
	            	pst = conn.prepareStatement(sql);
	            	rs = pst.executeQuery();
	            	Object col []= {"id", "Nom", "Prenom", "Statut","Titre","date_debut_pret","date_limite"};
	    			model.setColumnIdentifiers(col);
	    			table.setModel(model);
	            	Object[] columnData = new Object[7];
	      
	            	while (rs.next()) {
	            		//int i=0;
	            		/*System.out.println(rs.getInt("id"));*/
	            		columnData[0] = rs.getInt("id");
	            		columnData[1] = rs.getString("Nom");
	            		columnData[2] = rs.getString("Prenom");
	            		columnData[3] = rs.getString("Statut");
	            		columnData[4] = rs.getString("Titre");
	            		columnData[5] = rs.getString("date_debut_pret");
	            		columnData[6] = rs.getString("date_limite");
	            		
	            		
	            		 
	            		model.addRow(columnData);
	            	}
	            
	            }
	            catch(Exception e ) {
	            	JOptionPane.showMessageDialog(null, e);
	            	
	            }
				}
				}

	}

		
		
		



