package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import Stock.stock;

import javax.swing.border.BevelBorder;
import Table.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
 
public class StockManage extends JFrame implements MouseListener {

	private JPanel contentPane;
	private JTextField search;
	private JTable table;
	Vector <String> userColumn = new Vector<String>();
	Vector<String> userRow;
	DefaultTableModel model;
	String SelectStock;
	stock stock= new stock();

	public StockManage() {
		setTitle("\uC7AC\uACE0\uAD00\uB9AC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		userColumn.addElement("¹øÈ£");
		userColumn.addElement("¸íÄª");   
		userColumn.addElement("¼ö·®");
		userColumn.addElement("ºñ°í");

		model = new DefaultTableModel(userColumn,0);	
		table = new JTable(model);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 131, 341, 349);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(table);
				
		table.getColumnModel().getColumn(0).setPreferredWidth(20);  
		table.getColumnModel().getColumn(1).setPreferredWidth(100); 
		table.getColumnModel().getColumn(2).setPreferredWidth(20); 
		table.setRowHeight(25);
		table.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 13));
		DefaultTableCellRenderer dctr = new DefaultTableCellRenderer();
		dctr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setCellRenderer(dctr);
		tcm.getColumn(1).setCellRenderer(dctr);
		tcm.getColumn(2).setCellRenderer(dctr);
		tcm.getColumn(3).setCellRenderer(dctr);
		table.addMouseListener(this);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		//ÃÊ±âÈ­
		stock.Refresh();
		stock.init();
		
		for(int i=0;i<stock.StockManage.length;i++) {
			userRow = new Vector<String>();
			userRow.addElement(i+1+"");
			userRow.addElement(stock.namearr[i]);
			userRow.addElement(stock.StockManage[i]+"");
			userRow.addElement(null);
			model.addRow(userRow);
		}
		
		
		JButton searchbutton = new JButton("\uAC80\uC0C9");
		searchbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ãâ·Â"+search.getText());
				
				int a =model.getRowCount();
				stock.SearchResult.removeAllElements();
				System.out.println(a);
				stock.SearchExistStock(search.getText());
				for(int i=0;i<stock.SearchResult.size();i++) {
					System.out.println(stock.SearchResult.elementAt(i));
				}
				if(a!=0){
					System.out.println(a);
					int b=model.getRowCount();
					for(int i=0;i<b;i++) {
						model.removeRow(0);
					}
				}
				for(int i=0;i<stock.SearchResult.size();i++) {
					System.out.println((stock.StockManage[stock.SearchResult.indexOf(stock.SearchResult.elementAt(i))]));
					System.out.println(stock.SearchResult.indexOf(stock.SearchResult.elementAt(i)));
					userRow = new Vector<String>();
					userRow.addElement(i+1+"");
					userRow.addElement(stock.SearchResult.elementAt(i));
					userRow.addElement(stock.StockManage[stock.SearchResult.indexOf(stock.SearchResult.elementAt(i))]+"");
					userRow.addElement(null);
					model.addRow(userRow);			
				}
		
				System.out.println(search.getText());
				
			}
		});
		searchbutton.setBounds(288, 77, 69, 42);
		contentPane.add(searchbutton);
		
		search = new JTextField();
		search.setBounds(73, 77, 201, 42);
		contentPane.add(search);
		search.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984");
		lblNewLabel_1.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(27, 82, 45, 30);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(15, 12, 342, 53);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("\uC7AC\uACE0 \uAC80\uC0C9");
		lblNewLabel.setFont(new Font("³ª´®°íµñ", Font.BOLD, 18));
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\\uBA4D\uC5B4\uC9C0\\Desktop\\searchicon.png"));
		
		JButton add = new JButton("\uC7AC\uACE0 \uCD94\uAC00");
		add.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stock.AddStock(SelectStock,30);
				stock.Refresh();
				int a =model.getRowCount();
				if(a!=0){
					System.out.println(a);
					int b=model.getRowCount();
					for(int i=0;i<b;i++) {
						model.removeRow(0);
					}
				}
				for(int i=0;i<stock.SearchResult.size();i++) {
					System.out.println((stock.StockManage[stock.SearchResult.indexOf(stock.SearchResult.elementAt(i))]));
					System.out.println(stock.SearchResult.indexOf(stock.SearchResult.elementAt(i)));
					userRow = new Vector<String>();
					userRow.addElement(i+1+"");
					userRow.addElement(stock.SearchResult.elementAt(i));
					userRow.addElement(stock.StockManage[stock.SearchResult.indexOf(stock.SearchResult.elementAt(i))]+"");
					userRow.addElement(null);
					model.addRow(userRow);			
				}

			}
		});
		add.setBounds(75, 492, 105, 46);
		contentPane.add(add);
		
		JButton btnNewButton_2 = new JButton("\uC885\uB8CC");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		btnNewButton_2.setBounds(194, 492, 105, 46);
		contentPane.add(btnNewButton_2);
	}
	public void mouseClicked(MouseEvent me) {
		int row=table.getSelectedRow();
		int column=table.getSelectedColumn();
		SelectStock=(String) table.getValueAt(row, column);
		System.out.println(SelectStock);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
}
