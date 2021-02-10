package biblio;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Index0 extends JFrame {
			ImageIcon img = new ImageIcon();
			
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index0 frame = new Index0();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Index0() throws IOException {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1210, 700);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(34, 66, 124)));
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(489, 332, 265, 249);
		getContentPane().add(panel);
		
		JButton btnRapport = new JButton("Rapport");
		btnRapport.setForeground(SystemColor.text);
		btnRapport.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnRapport.setBackground(new Color(34, 66, 124));
		btnRapport.setBounds(68, 111, 137, 36);
		panel.add(btnRapport);
		
		JButton btnExecuter = new JButton("Executer");
		btnExecuter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Indexx frame1 = new  Indexx();
				
				frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame1.setVisible(true);
			}
		});
		btnExecuter.setForeground(SystemColor.text);
		btnExecuter.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnExecuter.setBackground(new Color(34, 66, 124));
		btnExecuter.setBounds(68, 181, 137, 36);
		panel.add(btnExecuter);
		
		JButton btnEnonc = new JButton("Enonc\u00E9");
		btnEnonc.setForeground(Color.WHITE);
		btnEnonc.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnEnonc.setBackground(new Color(34, 66, 124));
		btnEnonc.setBounds(68, 35, 137, 36);
		panel.add(btnEnonc);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tekton Pro", Font.BOLD, 13));
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(0, 0, 1200, 700);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Index0.class.getResource("/images/bg.png")));
		 
	}
}
