package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SaleManage extends JFrame {
	
	Vector <String> userColumn = new Vector<String>();
	Vector<String> userRow;
	DefaultTableModel model;
	

	private JPanel contentPane;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JTextField name;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaleManage frame = new SaleManage();
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
	public SaleManage() throws IOException {
		setTitle("\uB9E4\uCD9C\uAD00\uB9AC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 681);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB9E4\uCD9C\uAD00\uB9AC");
		lblNewLabel.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.BOLD, 23));
		lblNewLabel.setBounds(217, 27, 84, 40);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 137, 488, 435);
		contentPane.add(scrollPane);
	
		userColumn.addElement("ÆÇ¸Å ½Ã°¢");
		userColumn.addElement("»óÇ° ¸í");   
		userColumn.addElement("¼ö·®");
		userColumn.addElement("ºñ°í");

		model = new DefaultTableModel(userColumn,0);	
		table = new JTable(model);
		scrollPane.setViewportView(table);
				
		table.getColumnModel().getColumn(0).setPreferredWidth(100);  
		table.getColumnModel().getColumn(1).setPreferredWidth(70); 
		table.getColumnModel().getColumn(2).setPreferredWidth(5); 
		table.setRowHeight(25);
		table.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 13));
		
		lblNewLabel_1 = new JLabel("\uC0C1\uD488 \uBA85 \uAC80\uC0C9");
		lblNewLabel_1.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.BOLD, 16));
		lblNewLabel_1.setBounds(14, 83, 84, 42);
		contentPane.add(lblNewLabel_1);
		
		name = new JTextField();
		name.setBounds(112, 83, 242, 42);
		contentPane.add(name);
		name.setColumns(10);
		

		
		DefaultTableCellRenderer dctr = new DefaultTableCellRenderer();
		dctr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setCellRenderer(dctr);
		tcm.getColumn(1).setCellRenderer(dctr);
		tcm.getColumn(2).setCellRenderer(dctr);
		tcm.getColumn(3).setCellRenderer(dctr);
		
		


		
		
		
		JButton search = new JButton("\uAC80\uC0C9");
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = model.getRowCount() - 1; i >= 0; i--) {
				    model.removeRow(i);
				}
				String searchMenu =name.getText();
				
				//File file = new File("C:\\Users\\¸Û¾îÁö\\Desktop\\¿Ö°¡¸®\\SellLog.txt");
				File file = new File("SellLog.txt");
				if(file.exists()){
					BufferedReader inFile = null;
					try {
						inFile = new BufferedReader(new FileReader(file));
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					String sLine = null;
					try {
						while( (sLine = inFile.readLine()) != null ) {
							String date="";
							String menu="";
							String count="";
							String temp[] = sLine.split("\t");
							
							date=temp[0];
							menu=temp[1];
							count=temp[2];
							System.out.println(date+menu+count);
							if(menu.contains(searchMenu)) {
								userRow = new Vector<String>();
								userRow.addElement(date);
								userRow.addElement(menu);
								userRow.addElement(count);
								userRow.addElement(null);
								model.addRow(userRow);	
							}	
							else {
								continue;
							}
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
		});
		search.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.ITALIC, 16));
		search.setBounds(368, 83, 134, 42);
		contentPane.add(search);
		
		btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(178, 588, 172, 34);
		contentPane.add(btnNewButton);
		
		
	}
}
