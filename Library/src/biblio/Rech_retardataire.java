package biblio;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

//import com.mysql.jdbc.PreparedStatement;

import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;



/**
 *
 * @author 1BestCsharp
 */
public class Rech_retardataire extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8446689396410707468L;
	private JTextField textFieldsearch;
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	DefaultTableModel model = new DefaultTableModel();
	static JTable table = new JTable();
	private JComboBox combobox = new JComboBox();
	
	
	
	public Rech_retardataire(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(Search.class.getResource("/images/avatar.png")));
		JPanel pan = (JPanel) this.getContentPane();
   		pan.setLayout(new FlowLayout(FlowLayout.LEFT));
   		pan = new JPanel();
   		pan.setBackground(Color.WHITE);
   		pan.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pan);
		pan.setLayout(null);
		this.setTitle("Search");
        this.setSize(700, 500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(95, 134, 468, 256);
		pan.add(scrollPane);
		
		
		conn = Connect.ConnectDb();
		Object col []= {"id", "nom", "prenom", "statut","type","titre","date_retour","date_limite"};
		model.setColumnIdentifiers(col);
		table.setModel(model);
		table.getColumnModel().getColumn(0).setPreferredWidth(89);
		scrollPane.setViewportView(table);
		
		
		combobox.setModel(new DefaultComboBoxModel(new String[] {"id", "nom", "prenom", "statut","type","titre","date_retour","date_limite"}));
		combobox.setForeground(Color.black);
		combobox.setBackground(new Color(34, 66, 124));
		combobox.setBounds(95, 56, 195, 31);
		pan.add(combobox);
		
	
		
		textFieldsearch = new JTextField();
		textFieldsearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					String selection = (String)combobox.getSelectedItem();
					String sql = "select * from fiche_rendre where "+selection+"=? and date_limite < date_retour"; 
					PreparedStatement pst = conn.prepareStatement(sql);
					pst.setString(1,textFieldsearch.getText());
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					pst.close();
					
					
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		
		});
		if(table.getRowCount() == 0) {
			JOptionPane.showMessageDialog(null, "Aucune retardataire trouvé" , "Gestion des Emprunts", JOptionPane.OK_OPTION);}
		textFieldsearch.setBounds(332, 56, 231, 31);
		getContentPane().add(textFieldsearch, BorderLayout.WEST);
		textFieldsearch.setColumns(10);
	}
		
	}

