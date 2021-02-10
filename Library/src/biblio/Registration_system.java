package biblio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration_system extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1982601755158562765L;
	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_system frame = new Registration_system();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registration_system() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel.setBounds(10, 10, 1360, 700);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(30, 34, 1298, 87);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Membership Registration system");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(199, 11, 874, 65);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_2.setBackground(new Color(176, 224, 230));
		panel_2.setBounds(30, 132, 372, 418);
		panel.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Reference No");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(20, 26, 141, 25);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblFirstname = new JLabel("Firstname");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFirstname.setBounds(20, 60, 108, 25);
		panel_2.add(lblFirstname);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSurname.setBounds(20, 94, 108, 25);
		panel_2.add(lblSurname);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAddress.setBounds(20, 130, 108, 25);
		panel_2.add(lblAddress);
		
		JLabel lblPostCode = new JLabel("Post Code");
		lblPostCode.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPostCode.setBounds(20, 163, 108, 25);
		panel_2.add(lblPostCode);
		
		JLabel lblTelephone = new JLabel("Telephone");
		lblTelephone.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTelephone.setBounds(20, 199, 108, 25);
		panel_2.add(lblTelephone);
		
		JLabel lblDateRegistration = new JLabel("Date Registration");
		lblDateRegistration.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDateRegistration.setBounds(20, 235, 187, 25);
		panel_2.add(lblDateRegistration);
		
		JLabel lblProveOfId = new JLabel("Prove of ID");
		lblProveOfId.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblProveOfId.setBounds(20, 269, 126, 25);
		panel_2.add(lblProveOfId);
		
		JLabel lblMembership = new JLabel("Membership");
		lblMembership.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMembership.setBounds(20, 309, 131, 25);
		panel_2.add(lblMembership);
		
		JLabel lblAmountPaid = new JLabel("Amount Paid");
		lblAmountPaid.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAmountPaid.setBounds(20, 346, 141, 25);
		panel_2.add(lblAmountPaid);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(206, 27, 141, 23);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(206, 61, 141, 23);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(206, 95, 141, 23);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(206, 131, 141, 23);
		panel_2.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(206, 165, 141, 23);
		panel_2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(206, 200, 141, 23);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(206, 236, 141, 23);
		panel_2.add(textField_6);
		  
       
		JComboBox comboBox= new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Make a selection", "Student", "Driving Licence", "Pilot Licence", "Passport", ""}));
		comboBox.setBounds(206, 275, 141, 20);
		panel_2.add(comboBox);
	
		JComboBox comboBox_1= new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Make a selection", "Monthly", "Quarterly", "Six Months", "Annually", "Make a selection"}));
		comboBox_1.setBounds(206, 315, 141, 20);
		panel_2.add(comboBox_1);
		
		JComboBox comboBox_2= new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Make a selection", "1dt", "3dt", "5dt", "9dt", ""}));
		comboBox_2.setBounds(206, 352, 141, 20);
		panel_2.add(comboBox_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_3.setBackground(new Color(176, 224, 230));
		panel_3.setBounds(30, 571, 1298, 101);
		panel.add(panel_3);
		
		JButton btnNewButton = new JButton("Add record");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
						textField.getText(),
						textField_1.getText(),
						textField_2.getText(),
						textField_3.getText(),
						textField_4.getText(),
						textField_5.getText(),
						textField_6.getText(),
						comboBox.getSelectedItem(),
						comboBox_1.getSelectedItem(),
						comboBox_2.getSelectedItem(),
				});
				
				if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Membership Update Confirmed","Membership Management System" , JOptionPane.OK_OPTION);
					}
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(33, 33, 172, 33);
		panel_3.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				comboBox.setSelectedItem("Make a Selection");
				comboBox_1.setSelectedItem("Make a Selection");
				comboBox_2.setSelectedItem("Make a Selection");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(277, 33, 172, 33);
		panel_3.add(btnReset);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow()== -1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null, "No data to delete" , "Membership Management System", JOptionPane.OK_OPTION);
					}
					else {
						JOptionPane.showMessageDialog(null, "Select a row to delete" , "Membership Management System", JOptionPane.OK_OPTION);
					}
				}
				else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(762, 33, 172, 33);
		panel_3.add(btnDelete);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Membership Regiqtration System", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(1067, 33, 172, 33);
		panel_3.add(btnExit);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				}
				catch(java.awt.print.PrinterException e)
				{
					System.err.format("No Printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPrint.setBounds(520, 33, 172, 33);
		panel_3.add(btnPrint);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_4.setBackground(new Color(176, 224, 230));
		panel_4.setBounds(423, 132, 905, 418);
		panel.add(panel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 28, 833, 358);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Reference No", "Firstname", "Surname", "Address", "Post Code", "Telephone", "Date Reg", "Prove of ID", "Membership", "Amount Paid"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(89);
		scrollPane.setViewportView(table);
	}
}
