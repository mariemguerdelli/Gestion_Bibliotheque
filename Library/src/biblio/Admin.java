package biblio;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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

import net.proteanit.sql.DbUtils;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;



	public class Admin  extends JFrame  implements ActionListener {
			/**
		 * 
		 */
		private static final long serialVersionUID = 3458088938293720628L;
		
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		DefaultTableModel model = new DefaultTableModel();
		private JTable table = new JTable();
		private JButton button = new JButton("Retour");
		//private JButton button1 = new JButton("Modifier");
		private JButton button2 = new JButton("Supprimer");
		private Indexx ii;
		
		private JTextField textFieldsearch;
		DefaultTableModel model1 = new DefaultTableModel();
		static JTable table1 = new JTable();
		private JComboBox combobox = new JComboBox();
		private JCheckBox checkbox = new  JCheckBox();
		private JPanel pan = new JPanel();
		
		
		
		public Admin(){
			
			
			updateTable();
			setIconImage(Toolkit.getDefaultToolkit().getImage(Admin.class.getResource("/images/man.png")));
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
	        
	        JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(37, 28, 500, 200);
			pan.add(scrollPane);
			
			conn = Connect.ConnectDb();
			Object col []= {"id", "nom", "prenom", "adresse", "type", "password"};
			model.setColumnIdentifiers(col);
			table.setModel(model);
			table.getColumnModel().getColumn(0).setPreferredWidth(89);
			scrollPane.setViewportView(table);
			
			
			
			button.setForeground(Color.WHITE);
			button.setBackground(new Color(34, 66, 124));
			button.setBounds(10, 417, 80, 36);
			button.addActionListener(this);
			pan.add(button);
			
			/*button1.setForeground(Color.WHITE);
			button1.setBackground(new Color(222, 49, 99));
			button1.setBounds(550, 80, 100, 36);
			button1.addActionListener(this);
			pan.add(button1);*/
			
			button2.setForeground(Color.WHITE);
			button2.setBackground(new Color(34, 66, 124));
			button2.setBounds(550, 60, 100, 36);
			button2.addActionListener(this);
			pan.add(button2);
		     
			JScrollPane scrollPane1 = new JScrollPane();
			scrollPane1.setBounds(37, 310, 500, 100);
			pan.add(scrollPane1);
			
			
			
			//conn = Connect.ConnectDb();
			Object col1 []= {"id", "nom", "prenom", "adresse","type","password"};
			model1.setColumnIdentifiers(col1);
			table1.setModel(model1);
			table1.getColumnModel().getColumn(0).setPreferredWidth(89);
			scrollPane1.setViewportView(table1);
			
			
			combobox.setModel(new DefaultComboBoxModel(new String[] {"id","nom", "prenom", "adresse","type","password"}));
			combobox.setForeground(Color.black);
			combobox.setBackground(new Color(34, 66, 124));
			combobox.setBounds(40, 270, 195, 31);
			pan.add(combobox);
			
			
			
		
			
			textFieldsearch = new JTextField();
			textFieldsearch.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					try {
						String selection = (String)combobox.getSelectedItem();
						String sql = "select * from bibll where "+selection+"=?"; 
						PreparedStatement pst = conn.prepareStatement(sql);
						pst.setString(1,textFieldsearch.getText());
						ResultSet rs = pst.executeQuery();
						table1.setModel(DbUtils.resultSetToTableModel(rs));
						pst.close();}
						
					 
						
					 catch(Exception ex) {
						ex.printStackTrace();
						//if(table1.getRowCount() == 0) {
							//JOptionPane.showMessageDialog(null, "Aucune donnée trouvés" , "Recherche adhérant", JOptionPane.OK_OPTION);
						
					}
					
					  
				}
			});
			textFieldsearch.setBounds(280,270, 250, 31);
			getContentPane().add(textFieldsearch, BorderLayout.WEST);
			textFieldsearch.setColumns(10);
			
			JLabel label = new JLabel("");
			label.setBounds(250, 270, 583, 275);
			label.setVerticalAlignment(SwingConstants.TOP);
			label.setIcon(new ImageIcon(Indexx.class.getResource("/images/search.png")));
			pan.add(label);
	
			
			   setContentPane(pan);
	           this.setVisible(true);
		}
		
		
		
		
		
		
		public void actionPerformed(ActionEvent event) {
           	if(event.getSource()== button) {
           		this.dispose();
       	         ii = new Indexx();
       	         setVisible(false);
                 ii.setVisible(true);}
           	if(event.getSource()== button2) {
           		try {
           		int row = table.getSelectedRow();
           		String value =  table.getModel().getValueAt(row, 0).toString();
           		String sql = "DELETE FROM `bibll` WHERE id=" +value; 
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
				String sql = "SELECT `id`, `nom`, `prenom`, `adresse`, `type`, `password` FROM `bibll`";
                try {
                	pst = conn.prepareStatement(sql);
                	rs = pst.executeQuery();
                	Object col []= {"id", "nom", "prenom", "adresse", "type", "password"};
        			model.setColumnIdentifiers(col);
        			table.setModel(model);
                	Object[] columnData = new Object[7];
          
                	while (rs.next()) {
                		/*System.out.println(rs.getInt("id"));*/
                		 
                		//columnData[0] = rs.setValueAt(false);
                		columnData[0] = rs.getInt("id");
                		columnData[1] = rs.getString("nom");
                		columnData[2] = rs.getString("prenom");
                		columnData[3] = rs.getString("adresse");
                		columnData[4] = rs.getString("type");
                		columnData[5] = rs.getString("password");
                		columnData[5] = rs.getString("password");
                		//columnData[6] = rs.getString("checkbox");
                		
                		
                		model.addRow(columnData);
                		 /*for(int i=0;i<table.getRowCount();i++)
                	        {
                			  table.add(checkbox);
                	          Boolean checked=Boolean.valueOf(table.getValueAt(i, 0).toString());
                	          String cc =table.getValueAt(i, 1).toString();
                	}}*/
                
                }}
                catch(Exception e ) {
                	JOptionPane.showMessageDialog(null, e);
                	
                }
				}
				}
	
	}
