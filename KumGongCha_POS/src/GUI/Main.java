package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import Manage.manageMember;
import Menus.Accessory;
import Menus.Dessert;
import Menus.Drink;
import Menus.EatRate;
import Order.ForHere;
import Table.CanClass;
import Table.TableManage;
import Table.TableManage;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.CardLayout;

public class Main extends JFrame implements Runnable {

	private Thread thread;
	// 스레드

	public String order = "";
	private JPanel contentPane;
	public boolean menuEdit = false;
	JOptionPane aa = new JOptionPane();
	private JTable table;

	DefaultTableModel model;
	Vector<String> userColumn = new Vector<String>();
	Vector<String> userRow;

	public static String[] printmenu = new String[12];

	public int currentNumber;
	public String currentMenu;
	public int currentMenuCount;
	public String currentEtc;

	static JTextArea tb1;
	static JTextArea tb2;
	static JTextArea tb3;
	static JTextArea tb4;
	static JTextArea tb5;
	static JTextArea tb6;
	static JTextArea tb7;
	static JTextArea tb8;
	static JTextArea tb9;
	static JTextArea tb10;
	static JTextArea tb11;
	static JTextArea tb12;
	static JButton tOrder;

	JLabel Time;

	public int NowTableCount = 8;

	public static void NoOrder() {
		//// ln("추가주문만 받을 수 있습니다");
		Main.tOrder.setBackground(new Color(204, 0, 0));
		Main.tOrder.setText("추가주문");
	}

	public void run() {

		while (true) {

			SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date time = new Date();
			String time1 = format1.format(time);
			if (TableManage.tablenum != 0) {
				for (int i = 0; i < TableManage.NowTableCount; i++) {
					if ((!(TableManage.ttttt.elementAt(i) instanceof CanClass))) {
						
						Vector mm = (Vector) TableManage.ttttt.elementAt(i);
						EatRate eat = new EatRate();
						eat.EatRateSet(mm);
						
						
						if (eat.check() == true) {

							if (i == 0) {
								tb1.setBackground(new Color(244, 0, 0));

							}

							if (i == 1) {
								tb2.setBackground(new Color(244, 0, 0));

							}

							if (i == 2) {
								tb3.setBackground(new Color(244, 0, 0));

							}

							if (i == 3) {
								tb4.setBackground(new Color(244, 0, 0));

							}

							if (i == 4) {
								tb5.setBackground(new Color(244, 0, 0));

							}

							if (i == 5) {
								tb6.setBackground(new Color(244, 0, 0));

							}

							if (i == 6) {
								tb7.setBackground(new Color(244, 0, 0));

							}

							if (i == 7) {
								tb8.setBackground(new Color(244, 0, 0));

							}

							if (i == 8) {
								tb9.setBackground(new Color(244, 0, 0));

							}

							if (i == 9) {
								tb10.setBackground(new Color(244, 0, 0));

							}

							if (i == 10) {
								tb11.setBackground(new Color(244, 0, 0));

							}
							if (i == 11) {
								tb12.setBackground(new Color(244, 0, 0));

							}

						}

					}
				}

				if ((TableManage.ttttt.elementAt(TableManage.tablenum - 1) instanceof CanClass)) {
					if (TableManage.tablenum == 1) {
						tb1.setBackground(new Color(255, 255, 255));

					}
					if (TableManage.tablenum == 2) {
						tb2.setBackground(new Color(255, 255, 255));

					}
					if (TableManage.tablenum == 3) {
						tb3.setBackground(new Color(255, 255, 255));

					}
					if (TableManage.tablenum == 4) {
						tb4.setBackground(new Color(255, 255, 255));

					}
					if (TableManage.tablenum == 5) {
						tb5.setBackground(new Color(255, 255, 255));

					}
					if (TableManage.tablenum == 6) {
						tb6.setBackground(new Color(255, 255, 255));

					}
					if (TableManage.tablenum == 7) {
						tb7.setBackground(new Color(255, 255, 255));

					}

					if (TableManage.tablenum == 8) {
						tb8.setBackground(new Color(255, 255, 255));

					}
					if (TableManage.tablenum == 9) {
						tb9.setBackground(new Color(255, 255, 255));

					}
					if (TableManage.tablenum == 10) {
						tb10.setBackground(new Color(255, 255, 255));

					}
					if (TableManage.tablenum == 11) {
						tb11.setBackground(new Color(255, 255, 255));

					}
					if (TableManage.tablenum == 12) {
						tb12.setBackground(new Color(255, 255, 255));

					}
				}
			}

			Time.setText(time1.toString());
			if (TableManage.tablenum != 0) {

				if ((!(TableManage.ttttt.elementAt(TableManage.tablenum - 1) instanceof CanClass))) {

					Vector mm = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
					Object o = TableManage.ttttt.elementAt(TableManage.tablenum - 1);

					for (int i = 0; i < mm.size(); i++) {
						if (mm.elementAt(i) instanceof Drink) {

							Drink dd = (Drink) mm.elementAt(i);

							String oldmenu = Integer.toString(mm.indexOf(dd) + 1);
							for (int row = 0; row < model.getRowCount(); row++) {
								if (oldmenu.equals(model.getValueAt(row, 0))) {
									model.setValueAt(dd.eatrate + "%", row, 4);
									break;
								}
							}
						}
						if (mm.elementAt(i) instanceof Dessert) {

							Dessert dd = (Dessert) mm.elementAt(i);

							String oldmenu = Integer.toString(mm.indexOf(dd) + 1);
							for (int row = 0; row < model.getRowCount(); row++) {
								if (oldmenu.equals(model.getValueAt(row, 0))) {
									model.setValueAt(dd.eatrate + "%", row, 4);
									break;
								}
							}
						}
						if (mm.elementAt(i) instanceof Accessory) {

							Accessory dd = (Accessory) mm.elementAt(i);

							String oldmenu = Integer.toString(mm.indexOf(dd) + 1);
							for (int row = 0; row < model.getRowCount(); row++) {
								if (oldmenu.equals(model.getValueAt(row, 0))) {
									model.setValueAt("완료", row, 4);
									break;
								}
							}
						}

					}

				}

			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void PrintSimpleMenu(int tablenumber) {

		String str = "";
		//// ln(tablenumber);
		TableManage manage = new TableManage();
		str = manage.getSimpleTable(tablenumber);
		// ln(str);
		if (tablenumber == 1) {
			tb1.setText(str);
		}
		if (tablenumber == 2) {
			tb2.setText(str);
		}
		if (tablenumber == 3) {
			tb3.setText(str);
		}
		if (tablenumber == 4) {
			tb4.setText(str);
		}
		if (tablenumber == 5) {
			tb5.setText(str);
		}
		if (tablenumber == 6) {
			tb6.setText(str);
		}
		if (tablenumber == 7) {
			tb7.setText(str);
		}
		if (tablenumber == 8) {
			tb8.setText(str);
		}

		if (tablenumber == 9) {
			tb9.setText(str);
		}

		if (tablenumber == 10) {
			tb10.setText(str);
		}

		if (tablenumber == 11) {
			tb11.setText(str);
		}

		if (tablenumber == 12) {
			tb12.setText(str);
		}
	}

	public void printInit() {
		boolean check = false;
		for (int i = 0; i < TableManage.sssss.size(); i++) {
			Object obj = TableManage.sssss.elementAt(i);
			if (!(obj instanceof CanClass)) {
				check = true;
				break;
			}
		}
		if (check == true) {
			for (int i = 1; i < TableManage.sssss.size() + 1; i++) {
				TableManage manage = new TableManage();
				String str = "";
				str = manage.getSimpleTable(i);
				if (i == 1) {
					//// ln("1번테이블의 주문현황:"+str);
					tb1.setText(str);
				} else if (i == 2) {
					//// ln("2번테이블의 주문현황:"+str);
					tb2.setText(str);
				} else if (i == 3) {
					//// ln("3번테이블의 주문현황:"+str);
					tb3.setText(str);
				} else if (i == 4) {
					//// ln("4번테이블의 주문현황:"+str);
					tb4.setText(str);
				} else if (i == 5) {
					//// ln("5번테이블의 주문현황:"+str);
					tb5.setText(str);
				} else if (i == 6) {
					//// ln("6번테이블의 주문현황:"+str);
					tb6.setText(str);
				} else if (i == 7) {
					//// ln("7번테이블의 주문현황:"+str);
					tb7.setText(str);
				} else if (i == 8) {
					//// ln("8번테이블의 주문현황:"+str);
					tb8.setText(str);
				}
			}

		}

	}

	public Main(String strname, String strgrade, boolean check) {
//		//ln(TableManage.sssss.size());
//
//		//ln(strname);
//		//ln(strgrade);

		setTitle("\uAE08\uACF5\uCC28 POS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1012, 699);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		userColumn.addElement("번호");
		userColumn.addElement("메뉴");
		userColumn.addElement("수량");
		userColumn.addElement("비고");
		userColumn.addElement("음용률");

		model = new DefaultTableModel(userColumn, 0);

		table = new JTable(model);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(607, 118, 358, 347);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(table);

		userRow = new Vector<String>();

		table.getColumnModel().getColumn(0).setPreferredWidth(20);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(20);

		table.getColumnModel().getColumn(3).setPreferredWidth(50);
		table.setRowHeight(25);
		table.setFont(new Font("나눔바른고딕", Font.PLAIN, 13));
		DefaultTableCellRenderer dctr = new DefaultTableCellRenderer();
		dctr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setCellRenderer(dctr);
		tcm.getColumn(1).setCellRenderer(dctr);
		tcm.getColumn(2).setCellRenderer(dctr);
		tcm.getColumn(3).setCellRenderer(dctr);
		tcm.getColumn(4).setCellRenderer(dctr);

		tb1 = new JTextArea();
		tb1.setEditable(false);
		tb1.setBounds(14, 104, 131, 97);
		contentPane.add(tb1);

		tb2 = new JTextArea();
		tb2.setEditable(false);
		tb2.setBounds(159, 104, 131, 97);
		contentPane.add(tb2);

		tb3 = new JTextArea();
		tb3.setEditable(false);
		tb3.setBounds(304, 104, 131, 97);
		contentPane.add(tb3);

		tb4 = new JTextArea();
		tb4.setEditable(false);
		tb4.setBounds(449, 104, 131, 97);
		contentPane.add(tb4);

		tb5 = new JTextArea();
		tb5.setEditable(false);
		tb5.setBounds(14, 240, 131, 97);
		contentPane.add(tb5);

		tb6 = new JTextArea();
		tb6.setEditable(false);
		tb6.setBounds(159, 240, 131, 97);
		contentPane.add(tb6);

		tb7 = new JTextArea();
		tb7.setEditable(false);
		tb7.setBounds(304, 240, 131, 97);
		contentPane.add(tb7);

		tb8 = new JTextArea();
		tb8.setEditable(false);
		tb8.setBounds(449, 240, 131, 97);
		contentPane.add(tb8);

		printInit();

		JLabel tablenumber = new JLabel("0");
		tablenumber.setFont(new Font("나눔바른고딕", Font.PLAIN, 25));
		tablenumber.setForeground(new Color(255, 0, 51));
		tablenumber.setBounds(609, 72, 36, 48);
		contentPane.add(tablenumber);

		JButton table1 = new JButton("\uD14C\uC774\uBE141");
		table1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = "";

				TableManage.tablenum = 1;
				tablenumber.setText(TableManage.tablenum + "");

				Object can = TableManage.ttttt.get(TableManage.tablenum - 1);
				if (can instanceof CanClass) {
					int rowCount = model.getRowCount();
					//// ln(TableManage.tablenum+"번 테이블은 비어있다.");
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}

				}

				else if ((can instanceof Object) && !(can instanceof CanClass)) {
					TableManage TempTable = new TableManage();
					Vector tempmenulist = null;
					//// ln(TableManage.tablenum);
					tempmenulist = TempTable.GetOrder(TableManage.tablenum);
					// ln(tempmenulist.size());

					int rowCount = model.getRowCount();
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}

					if (tempmenulist != null) {
						for (int i = 0; i < tempmenulist.size(); i++) {

							if (tempmenulist.elementAt(i) instanceof Drink) {
								Drink drink = (Drink) tempmenulist.elementAt(i);
								userRow = new Vector<String>();
								userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
								userRow.addElement(drink.name);
								userRow.addElement((drink.count) + "");
								userRow.addElement(drink.strTemp);

								userRow.addElement(drink.eatrate + "%");

								model.addRow(userRow);
								str += drink.name + "\r\n";

								if (drink.BubbleCheck == true) {
									userRow = new Vector<String>();
									// ("버블 ");
									userRow.addElement("└");
									userRow.addElement("버블 펄 추가");
									userRow.addElement(null);
									userRow.addElement("옵션");
									model.addRow(userRow);
								}
								if (drink.ShotCheck == true) {
									// ("샷");
									userRow = new Vector<String>();
									userRow.addElement("└");
									userRow.addElement("샷 추가");
									userRow.addElement(null);
									userRow.addElement("옵션");
									model.addRow(userRow);
								}
								if (drink.WhippingCheck == true) {
									// ("휘핑");
									userRow = new Vector<String>();
									userRow.addElement("└");
									userRow.addElement("휘핑 추가");
									userRow.addElement(null);
									userRow.addElement("옵션");
									model.addRow(userRow);
								}
								if (drink.SyrupCheck == true) {
									// ("시럽 ");
									userRow = new Vector<String>();
									userRow.addElement("└");
									userRow.addElement("시럽 추가");
									userRow.addElement(null);
									userRow.addElement("옵션");
									model.addRow(userRow);
								}
								//// ln();

							} else if (tempmenulist.elementAt(i) instanceof Dessert) {
								userRow = new Vector<String>();
								Dessert dessert = (Dessert) tempmenulist.elementAt(i);
								//// ln(dessert.name);
								userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
								userRow.addElement(dessert.name);
								userRow.addElement((dessert.count) + "");
								userRow.addElement(null);

								userRow.addElement(dessert.eatrate + "%");
								model.addRow(userRow);
								str += dessert.name + "\r\n";

							} else if (tempmenulist.elementAt(i) instanceof Accessory) {
								userRow = new Vector<String>();
								Accessory acc = (Accessory) tempmenulist.elementAt(i);
								//// ln(acc.name);
								userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
								userRow.addElement(acc.name);
								userRow.addElement((acc.count) + "");
								userRow.addElement(null);

								userRow.addElement("완료");
								model.addRow(userRow);
								str += acc.name + "\r\n";

							}

						}
					}

				}

			}
		});

		table1.setBackground(new Color(255, 204, 153));
		table1.setFont(new Font("나눔바른고딕", Font.PLAIN, 15));
		table1.setBounds(14, 79, 131, 27);
		contentPane.add(table1);

		JButton table2 = new JButton("\uD14C\uC774\uBE142");
		table2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TableManage.tablenum = 2;
				tablenumber.setText(TableManage.tablenum + "");
				Object can = TableManage.ttttt.get(TableManage.tablenum - 1);
				if (can instanceof CanClass) {
					int rowCount = model.getRowCount();
					//// ln(TableManage.tablenum+"번 테이블은 비어있다.");
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}
				} else if ((can instanceof Object) && !(can instanceof CanClass)) {
					// String str="";
					TableManage TempTable = new TableManage();
					//// ln(TableManage.tablenum);
					TempTable.GetOrder(TableManage.tablenum);
					TableManage TempTable2 = new TableManage();
					Vector tempmenulist = null;
					//// ln(TableManage.tablenum);
					tempmenulist = TempTable2.GetOrder(TableManage.tablenum);
					//// ln(tempmenulist.size());

					int rowCount = model.getRowCount();
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}
					for (int i = 0; i < tempmenulist.size(); i++) {

						if (tempmenulist.elementAt(i) instanceof Drink) {
							Drink drink = (Drink) tempmenulist.elementAt(i);
							userRow = new Vector<String>();
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(drink.name);
							userRow.addElement((drink.count) + "");
							userRow.addElement(drink.strTemp);
							userRow.addElement(drink.eatrate + "%");
							model.addRow(userRow);
							// (drink.name+":");

							if (drink.BubbleCheck == true) {
								userRow = new Vector<String>();
								// ("버블 ");
								userRow.addElement("└");
								userRow.addElement("버블 펄 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.ShotCheck == true) {
								// ("샷");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("샷 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.WhippingCheck == true) {
								// ("휘핑");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("휘핑 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.SyrupCheck == true) {
								// ("시럽 ");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("시럽 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							//// ln();

						} else if (tempmenulist.elementAt(i) instanceof Dessert) {
							userRow = new Vector<String>();
							Dessert dessert = (Dessert) tempmenulist.elementAt(i);
							//// ln(dessert.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(dessert.name);
							userRow.addElement((dessert.count) + "");
							userRow.addElement(null);

							userRow.addElement(dessert.eatrate + "%");
							model.addRow(userRow);

						} else if (tempmenulist.elementAt(i) instanceof Accessory) {
							userRow = new Vector<String>();
							Accessory acc = (Accessory) tempmenulist.elementAt(i);
							//// ln(acc.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(acc.name);
							userRow.addElement(acc.count + "");
							userRow.addElement(null);

							userRow.addElement("완료");
							model.addRow(userRow);
						}
					}
				}

			}

		});
		table2.setBackground(new Color(255, 204, 153));
		table2.setFont(new Font("나눔바른고딕", Font.PLAIN, 15));
		table2.setBounds(159, 79, 131, 27);
		contentPane.add(table2);

		JButton table3 = new JButton("\uD14C\uC774\uBE143");
		table3.setFont(new Font("나눔바른고딕", Font.PLAIN, 15));
		table3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TableManage.tablenum = 3;
				tablenumber.setText(TableManage.tablenum + "");
				Object can = TableManage.ttttt.get(TableManage.tablenum - 1);
				if (can instanceof CanClass) {
					int rowCount = model.getRowCount();
					//// ln(TableManage.tablenum+"번 테이블은 비어있다.");
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}
				} else if ((can instanceof Object) && !(can instanceof CanClass)) {
					TableManage TempTable = new TableManage();
					// ln(TableManage.tablenum);
					TempTable.GetOrder(TableManage.tablenum);
					TableManage TempTable3 = new TableManage();
					Vector tempmenulist = null;
					// ln(TableManage.tablenum);
					tempmenulist = TempTable.GetOrder(TableManage.tablenum);
					// ln(tempmenulist.size());

					int rowCount = model.getRowCount();
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}

					for (int i = 0; i < tempmenulist.size(); i++) {

						if (tempmenulist.elementAt(i) instanceof Drink) {
							Drink drink = (Drink) tempmenulist.elementAt(i);
							userRow = new Vector<String>();
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(drink.name);
							userRow.addElement((drink.count) + "");
							userRow.addElement(drink.strTemp);

							userRow.addElement(drink.eatrate + "%");
							model.addRow(userRow);
							// (drink.name+":");

							if (drink.BubbleCheck == true) {
								userRow = new Vector<String>();
								// ("버블 ");
								userRow.addElement("└");
								userRow.addElement("버블 펄 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.ShotCheck == true) {
								// ("샷");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("샷 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.WhippingCheck == true) {
								// ("휘핑");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("휘핑 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.SyrupCheck == true) {
								// ("시럽 ");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("시럽 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							// ln();

						} else if (tempmenulist.elementAt(i) instanceof Dessert) {
							userRow = new Vector<String>();
							Dessert dessert = (Dessert) tempmenulist.elementAt(i);
							// ln(dessert.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(dessert.name);
							userRow.addElement((dessert.count) + "");
							userRow.addElement(null);

							userRow.addElement(dessert.eatrate + "%");
							model.addRow(userRow);

						} else if (tempmenulist.elementAt(i) instanceof Accessory) {
							userRow = new Vector<String>();
							Accessory acc = (Accessory) tempmenulist.elementAt(i);
							// ln(acc.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(acc.name);
							userRow.addElement(acc.count + "");
							userRow.addElement(null);

							userRow.addElement("완료");
							model.addRow(userRow);
						}

					}
				}

			}
		});
		table3.setBackground(new Color(255, 204, 153));
		table3.setBounds(304, 79, 131, 27);
		contentPane.add(table3);

		JButton table4 = new JButton("\uD14C\uC774\uBE144");
		table4.setFont(new Font("나눔바른고딕", Font.PLAIN, 15));
		table4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TableManage.tablenum = 4;
				tablenumber.setText(TableManage.tablenum + "");
				Object can = TableManage.ttttt.get(TableManage.tablenum - 1);
				if (can instanceof CanClass) {
					int rowCount = model.getRowCount();
					// ln(TableManage.tablenum+"번 테이블은 비어있다.");
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}
				} else if ((can instanceof Object) && !(can instanceof CanClass)) {
					TableManage TempTable = new TableManage();
					// ln(TableManage.tablenum);
					TempTable.GetOrder(TableManage.tablenum);
					TableManage TempTable3 = new TableManage();
					Vector tempmenulist = null;
					// ln(TableManage.tablenum);
					tempmenulist = TempTable.GetOrder(TableManage.tablenum);
					// ln(tempmenulist.size());

					int rowCount = model.getRowCount();
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}

					for (int i = 0; i < tempmenulist.size(); i++) {

						if (tempmenulist.elementAt(i) instanceof Drink) {
							Drink drink = (Drink) tempmenulist.elementAt(i);
							userRow = new Vector<String>();
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(drink.name);
							userRow.addElement((drink.count) + "");
							userRow.addElement(drink.strTemp);

							userRow.addElement(drink.eatrate + "%");
							model.addRow(userRow);
							// (drink.name+":");

							if (drink.BubbleCheck == true) {
								userRow = new Vector<String>();
								// ("버블 ");
								userRow.addElement("└");
								userRow.addElement("버블 펄 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.ShotCheck == true) {
								// ("샷");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("샷 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.WhippingCheck == true) {
								// ("휘핑");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("휘핑 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.SyrupCheck == true) {
								// ("시럽 ");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("시럽 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							// ln();

						} else if (tempmenulist.elementAt(i) instanceof Dessert) {
							userRow = new Vector<String>();
							Dessert dessert = (Dessert) tempmenulist.elementAt(i);
							// ln(dessert.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(dessert.name);
							userRow.addElement((dessert.count) + "");
							userRow.addElement(null);

							userRow.addElement(dessert.eatrate + "%");
							model.addRow(userRow);

						} else if (tempmenulist.elementAt(i) instanceof Accessory) {
							userRow = new Vector<String>();
							Accessory acc = (Accessory) tempmenulist.elementAt(i);
							// ln(acc.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(acc.name);
							userRow.addElement(acc.count + "");
							userRow.addElement(null);

							userRow.addElement("완료");
							model.addRow(userRow);
						}

					}
				}

			}
		});
		table4.setBackground(new Color(255, 204, 153));
		table4.setBounds(449, 79, 131, 27);
		contentPane.add(table4);

		JButton table5 = new JButton("\uD14C\uC774\uBE145");
		table5.setFont(new Font("나눔바른고딕", Font.PLAIN, 15));
		table5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TableManage.tablenum = 5;
				tablenumber.setText(TableManage.tablenum + "");
				Object can = TableManage.ttttt.get(TableManage.tablenum - 1);
				if (can instanceof CanClass) {
					int rowCount = model.getRowCount();
					// ln(TableManage.tablenum+"번 테이블은 비어있다.");
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}
				} else if ((can instanceof Object) && !(can instanceof CanClass)) {
					TableManage TempTable = new TableManage();
					// ln(TableManage.tablenum);
					TempTable.GetOrder(TableManage.tablenum);
					TableManage TempTable3 = new TableManage();
					Vector tempmenulist = null;
					// ln(TableManage.tablenum);
					tempmenulist = TempTable.GetOrder(TableManage.tablenum);
					// ln(tempmenulist.size());

					int rowCount = model.getRowCount();
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}

					for (int i = 0; i < tempmenulist.size(); i++) {

						if (tempmenulist.elementAt(i) instanceof Drink) {
							Drink drink = (Drink) tempmenulist.elementAt(i);
							userRow = new Vector<String>();
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(drink.name);
							userRow.addElement((drink.count) + "");
							userRow.addElement(drink.strTemp);

							userRow.addElement(drink.eatrate + "%");
							model.addRow(userRow);
							// (drink.name+":");

							if (drink.BubbleCheck == true) {
								userRow = new Vector<String>();
								// ("버블 ");
								userRow.addElement("└");
								userRow.addElement("버블 펄 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.ShotCheck == true) {
								// ("샷");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("샷 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.WhippingCheck == true) {
								// ("휘핑");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("휘핑 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.SyrupCheck == true) {
								// ("시럽 ");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("시럽 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							// ln();

						} else if (tempmenulist.elementAt(i) instanceof Dessert) {
							userRow = new Vector<String>();
							Dessert dessert = (Dessert) tempmenulist.elementAt(i);
							// ln(dessert.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(dessert.name);
							userRow.addElement((dessert.count) + "");
							userRow.addElement(null);

							userRow.addElement(dessert.eatrate + "%");
							model.addRow(userRow);

						} else if (tempmenulist.elementAt(i) instanceof Accessory) {
							userRow = new Vector<String>();
							Accessory acc = (Accessory) tempmenulist.elementAt(i);
							// ln(acc.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(acc.name);
							userRow.addElement(acc.count + "");
							userRow.addElement(null);

							userRow.addElement("완료");
							model.addRow(userRow);
						}

					}

				}
			}
		});
		table5.setBackground(new Color(255, 255, 153));
		table5.setBounds(14, 213, 131, 27);
		contentPane.add(table5);

		JButton table6 = new JButton("\uD14C\uC774\uBE146");
		table6.setFont(new Font("나눔바른고딕", Font.PLAIN, 15));
		table6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TableManage.tablenum = 6;
				tablenumber.setText(TableManage.tablenum + "");
				Object can = TableManage.ttttt.get(TableManage.tablenum - 1);
				if (can instanceof CanClass) {
					int rowCount = model.getRowCount();
					// ln(TableManage.tablenum+"번 테이블은 비어있다.");
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}
				} else if ((can instanceof Object) && !(can instanceof CanClass)) {
					String str = "";
					TableManage TempTable = new TableManage();
					// ln(TableManage.tablenum);
					TempTable.GetOrder(TableManage.tablenum);
					TableManage TempTable3 = new TableManage();
					Vector tempmenulist = null;
					// ln(TableManage.tablenum);
					tempmenulist = TempTable.GetOrder(TableManage.tablenum);
					// ln(tempmenulist.size());

					int rowCount = model.getRowCount();
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}

					for (int i = 0; i < tempmenulist.size(); i++) {

						if (tempmenulist.elementAt(i) instanceof Drink) {
							Drink drink = (Drink) tempmenulist.elementAt(i);
							userRow = new Vector<String>();
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(drink.name);
							userRow.addElement((drink.count) + "");
							userRow.addElement(drink.strTemp);

							userRow.addElement(drink.eatrate + "%");
							model.addRow(userRow);
							// (drink.name+":");
							str += drink.name + "\r\n";

							if (drink.BubbleCheck == true) {
								userRow = new Vector<String>();
								// ("버블 ");
								userRow.addElement("└");
								userRow.addElement("버블 펄 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.ShotCheck == true) {
								// ("샷");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("샷 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.WhippingCheck == true) {
								// ("휘핑");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("휘핑 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.SyrupCheck == true) {
								// ("시럽 ");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("시럽 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							// ln();

						} else if (tempmenulist.elementAt(i) instanceof Dessert) {
							userRow = new Vector<String>();
							Dessert dessert = (Dessert) tempmenulist.elementAt(i);
							// ln(dessert.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(dessert.name);
							userRow.addElement((dessert.count) + "");
							userRow.addElement(null);

							userRow.addElement(dessert.eatrate + "%");
							model.addRow(userRow);
							str += dessert.name + "\r\n";

						} else if (tempmenulist.elementAt(i) instanceof Accessory) {
							userRow = new Vector<String>();
							Accessory acc = (Accessory) tempmenulist.elementAt(i);
							// ln(acc.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(acc.name);
							userRow.addElement(acc.count + "");
							userRow.addElement(null);

							userRow.addElement("완료");
							model.addRow(userRow);
							str += acc.name + "\r\n";
						}

					}
				}
			}
		});
		table6.setBackground(new Color(255, 255, 153));
		table6.setBounds(159, 213, 131, 27);
		contentPane.add(table6);

		JButton table7 = new JButton("\uD14C\uC774\uBE147");
		table7.setFont(new Font("나눔바른고딕", Font.PLAIN, 15));
		table7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TableManage.tablenum = 7;
				tablenumber.setText(TableManage.tablenum + "");
				Object can = TableManage.ttttt.get(TableManage.tablenum - 1);
				if (can instanceof CanClass) {
					int rowCount = model.getRowCount();
					// ln(TableManage.tablenum+"번 테이블은 비어있다.");
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}
				} else if ((can instanceof Object) && !(can instanceof CanClass)) {
					TableManage TempTable = new TableManage();
					TempTable.GetOrder(TableManage.tablenum);
					TableManage TempTable3 = new TableManage();
					Vector tempmenulist = null;
					tempmenulist = TempTable.GetOrder(TableManage.tablenum);

					int rowCount = model.getRowCount();
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}

					for (int i = 0; i < tempmenulist.size(); i++) {

						if (tempmenulist.elementAt(i) instanceof Drink) {
							Drink drink = (Drink) tempmenulist.elementAt(i);
							userRow = new Vector<String>();
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(drink.name);
							userRow.addElement(drink.count + "");
							userRow.addElement(drink.strTemp);

							userRow.addElement(drink.eatrate + "%");
							model.addRow(userRow);
							// (drink.name+":");

							if (drink.BubbleCheck == true) {
								userRow = new Vector<String>();
								// ("버블 ");
								userRow.addElement("└");
								userRow.addElement("버블 펄 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.ShotCheck == true) {
								// ("샷");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("샷 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.WhippingCheck == true) {
								// ("휘핑");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("휘핑 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.SyrupCheck == true) {
								// ("시럽 ");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("시럽 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							// ln();

						} else if (tempmenulist.elementAt(i) instanceof Dessert) {
							userRow = new Vector<String>();
							Dessert dessert = (Dessert) tempmenulist.elementAt(i);
							// ln(dessert.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(dessert.name);
							userRow.addElement(dessert.count + "");
							userRow.addElement(null);

							userRow.addElement(dessert.eatrate + "%");
							model.addRow(userRow);

						} else if (tempmenulist.elementAt(i) instanceof Accessory) {
							userRow = new Vector<String>();
							Accessory acc = (Accessory) tempmenulist.elementAt(i);
							// ln(acc.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(acc.name);
							userRow.addElement(acc.count + "");
							userRow.addElement(null);

							userRow.addElement("완료");
							model.addRow(userRow);
						}

					}

				}
			}
		});

		table7.setBackground(new Color(255, 255, 153));
		table7.setBounds(304, 213, 131, 27);
		contentPane.add(table7);

		JButton table8 = new JButton("\uD14C\uC774\uBE148");
		table8.setFont(new Font("나눔바른고딕", Font.PLAIN, 15));
		table8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TableManage.tablenum = 8;
				tablenumber.setText(TableManage.tablenum + "");
				Object can = TableManage.ttttt.get(TableManage.tablenum - 1);
				if (can instanceof CanClass) {
					int rowCount = model.getRowCount();
					// ln(TableManage.tablenum+"번 테이블은 비어있다.");
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}
				} else if ((can instanceof Object) && !(can instanceof CanClass)) {
					TableManage TempTable = new TableManage();
					TempTable.GetOrder(TableManage.tablenum);
					TableManage TempTable3 = new TableManage();
					Vector tempmenulist = null;
					tempmenulist = TempTable.GetOrder(TableManage.tablenum);
					int rowCount = model.getRowCount();
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}

					for (int i = 0; i < tempmenulist.size(); i++) {

						if (tempmenulist.elementAt(i) instanceof Drink) {
							Drink drink = (Drink) tempmenulist.elementAt(i);
							userRow = new Vector<String>();
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(drink.name);
							userRow.addElement(drink.count + "");
							userRow.addElement(drink.strTemp);

							userRow.addElement(drink.eatrate + "%");
							model.addRow(userRow);
							// (drink.name+":");
							if (drink.BubbleCheck == true) {
								userRow = new Vector<String>();
								// ("버블 ");
								userRow.addElement("└");
								userRow.addElement("버블 펄 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.ShotCheck == true) {
								// ("샷");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("샷 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.WhippingCheck == true) {
								// ("휘핑");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("휘핑 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.SyrupCheck == true) {
								// ("시럽 ");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("시럽 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							// ln();

						} else if (tempmenulist.elementAt(i) instanceof Dessert) {
							userRow = new Vector<String>();
							Dessert dessert = (Dessert) tempmenulist.elementAt(i);
							// ln(dessert.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(dessert.name);
							userRow.addElement(dessert.count + "");

							userRow.addElement(null);

							userRow.addElement(dessert.eatrate + "%");
							model.addRow(userRow);

						} else if (tempmenulist.elementAt(i) instanceof Accessory) {
							userRow = new Vector<String>();
							Accessory acc = (Accessory) tempmenulist.elementAt(i);
							// ln(acc.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(acc.name);
							userRow.addElement(acc.count + "");
							userRow.addElement(null);

							userRow.addElement("완료");
							model.addRow(userRow);
						}

					}
				}
			}
		});
		table8.setBackground(new Color(255, 255, 153));
		table8.setBounds(449, 213, 131, 27);
		contentPane.add(table8);

		JButton table9 = new JButton("\uD14C\uC774\uBE149");
		table9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TableManage.tablenum = 9;
				tablenumber.setText(TableManage.tablenum + "");
				Object can = TableManage.ttttt.get(TableManage.tablenum - 1);
				if (can instanceof CanClass) {
					int rowCount = model.getRowCount();
					// ln(TableManage.tablenum+"번 테이블은 비어있다.");
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}
				} else if ((can instanceof Object) && !(can instanceof CanClass)) {
					TableManage TempTable = new TableManage();
					TempTable.GetOrder(TableManage.tablenum);
					TableManage TempTable3 = new TableManage();
					Vector tempmenulist = null;
					tempmenulist = TempTable.GetOrder(TableManage.tablenum);
					int rowCount = model.getRowCount();
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}

					for (int i = 0; i < tempmenulist.size(); i++) {

						if (tempmenulist.elementAt(i) instanceof Drink) {
							Drink drink = (Drink) tempmenulist.elementAt(i);
							userRow = new Vector<String>();
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(drink.name);
							userRow.addElement(drink.count + "");
							userRow.addElement(drink.strTemp);

							userRow.addElement(drink.eatrate + "%");
							model.addRow(userRow);
							// (drink.name+":");
							if (drink.BubbleCheck == true) {
								userRow = new Vector<String>();
								// ("버블 ");
								userRow.addElement("└");
								userRow.addElement("버블 펄 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.ShotCheck == true) {
								// ("샷");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("샷 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.WhippingCheck == true) {
								// ("휘핑");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("휘핑 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.SyrupCheck == true) {
								// ("시럽 ");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("시럽 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							// ln();

						} else if (tempmenulist.elementAt(i) instanceof Dessert) {
							userRow = new Vector<String>();
							Dessert dessert = (Dessert) tempmenulist.elementAt(i);
							// ln(dessert.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(dessert.name);
							userRow.addElement(dessert.count + "");

							userRow.addElement(null);

							userRow.addElement(dessert.eatrate + "%");
							model.addRow(userRow);

						} else if (tempmenulist.elementAt(i) instanceof Accessory) {
							userRow = new Vector<String>();
							Accessory acc = (Accessory) tempmenulist.elementAt(i);
							// ln(acc.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(acc.name);
							userRow.addElement(acc.count + "");
							userRow.addElement(null);

							userRow.addElement("완료");
							model.addRow(userRow);
						}

					}
				}
			}
		});
		table9.setEnabled(false);
		table9.setFont(new Font("나눔바른고딕", Font.PLAIN, 15));
		table9.setBackground(new Color(255, 255, 153));
		table9.setBounds(14, 349, 131, 27);
		contentPane.add(table9);

		tb9 = new JTextArea();
		tb9.setEditable(false);
		tb9.setBounds(14, 376, 131, 97);
		contentPane.add(tb9);

		JButton table10 = new JButton("\uD14C\uC774\uBE1410");
		table10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TableManage.tablenum = 10;
				tablenumber.setText(TableManage.tablenum + "");
				Object can = TableManage.ttttt.get(TableManage.tablenum - 1);
				if (can instanceof CanClass) {
					int rowCount = model.getRowCount();
					// ln(TableManage.tablenum+"번 테이블은 비어있다.");
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}
				} else if ((can instanceof Object) && !(can instanceof CanClass)) {
					TableManage TempTable = new TableManage();
					TempTable.GetOrder(TableManage.tablenum);
					TableManage TempTable3 = new TableManage();
					Vector tempmenulist = null;
					tempmenulist = TempTable.GetOrder(TableManage.tablenum);
					int rowCount = model.getRowCount();
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}

					for (int i = 0; i < tempmenulist.size(); i++) {

						if (tempmenulist.elementAt(i) instanceof Drink) {
							Drink drink = (Drink) tempmenulist.elementAt(i);
							userRow = new Vector<String>();
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(drink.name);
							userRow.addElement(drink.count + "");
							userRow.addElement(drink.strTemp);

							userRow.addElement(drink.eatrate + "%");
							model.addRow(userRow);
							// (drink.name+":");
							if (drink.BubbleCheck == true) {
								userRow = new Vector<String>();
								// ("버블 ");
								userRow.addElement("└");
								userRow.addElement("버블 펄 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.ShotCheck == true) {
								// ("샷");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("샷 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.WhippingCheck == true) {
								// ("휘핑");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("휘핑 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.SyrupCheck == true) {
								// ("시럽 ");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("시럽 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							// ln();

						} else if (tempmenulist.elementAt(i) instanceof Dessert) {
							userRow = new Vector<String>();
							Dessert dessert = (Dessert) tempmenulist.elementAt(i);
							// ln(dessert.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(dessert.name);
							userRow.addElement(dessert.count + "");

							userRow.addElement(null);

							userRow.addElement(dessert.eatrate + "%");
							model.addRow(userRow);

						} else if (tempmenulist.elementAt(i) instanceof Accessory) {
							userRow = new Vector<String>();
							Accessory acc = (Accessory) tempmenulist.elementAt(i);
							// ln(acc.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(acc.name);
							userRow.addElement(acc.count + "");
							userRow.addElement(null);

							userRow.addElement("완료");
							model.addRow(userRow);
						}

					}
				}
			}
		});
		table10.setEnabled(false);
		table10.setFont(new Font("나눔바른고딕", Font.PLAIN, 15));
		table10.setBackground(new Color(255, 255, 153));
		table10.setBounds(159, 349, 131, 27);
		contentPane.add(table10);

		tb10 = new JTextArea();
		tb10.setEditable(false);
		tb10.setBounds(159, 376, 131, 97);
		contentPane.add(tb10);

		JButton table11 = new JButton("\uD14C\uC774\uBE1411");
		table11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TableManage.tablenum = 11;
				tablenumber.setText(TableManage.tablenum + "");
				Object can = TableManage.ttttt.get(TableManage.tablenum - 1);
				if (can instanceof CanClass) {
					int rowCount = model.getRowCount();
					// ln(TableManage.tablenum+"번 테이블은 비어있다.");
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}
				} else if ((can instanceof Object) && !(can instanceof CanClass)) {
					TableManage TempTable = new TableManage();
					TempTable.GetOrder(TableManage.tablenum);
					TableManage TempTable3 = new TableManage();
					Vector tempmenulist = null;
					tempmenulist = TempTable.GetOrder(TableManage.tablenum);
					int rowCount = model.getRowCount();
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}

					for (int i = 0; i < tempmenulist.size(); i++) {

						if (tempmenulist.elementAt(i) instanceof Drink) {
							Drink drink = (Drink) tempmenulist.elementAt(i);
							userRow = new Vector<String>();
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(drink.name);
							userRow.addElement(drink.count + "");
							userRow.addElement(drink.strTemp);

							userRow.addElement(drink.eatrate + "%");
							model.addRow(userRow);
							// (drink.name+":");
							if (drink.BubbleCheck == true) {
								userRow = new Vector<String>();
								// ("버블 ");
								userRow.addElement("└");
								userRow.addElement("버블 펄 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.ShotCheck == true) {
								// ("샷");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("샷 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.WhippingCheck == true) {
								// ("휘핑");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("휘핑 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.SyrupCheck == true) {
								// ("시럽 ");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("시럽 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							// ln();

						} else if (tempmenulist.elementAt(i) instanceof Dessert) {
							userRow = new Vector<String>();
							Dessert dessert = (Dessert) tempmenulist.elementAt(i);
							// ln(dessert.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(dessert.name);
							userRow.addElement(dessert.count + "");

							userRow.addElement(null);

							userRow.addElement(dessert.eatrate + "%");
							model.addRow(userRow);

						} else if (tempmenulist.elementAt(i) instanceof Accessory) {
							userRow = new Vector<String>();
							Accessory acc = (Accessory) tempmenulist.elementAt(i);
							// ln(acc.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(acc.name);
							userRow.addElement(acc.count + "");
							userRow.addElement(null);

							userRow.addElement("완료");
							model.addRow(userRow);
						}

					}
				}
			}
		});
		table11.setEnabled(false);
		table11.setFont(new Font("나눔바른고딕", Font.PLAIN, 15));
		table11.setBackground(new Color(255, 255, 153));
		table11.setBounds(304, 349, 131, 27);
		contentPane.add(table11);

		tb11 = new JTextArea();
		tb11.setEditable(false);
		tb11.setBounds(304, 376, 131, 97);
		contentPane.add(tb11);

		JButton table12 = new JButton("\uD14C\uC774\uBE1412");
		table12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TableManage.tablenum = 12;
				tablenumber.setText(TableManage.tablenum + "");
				Object can = TableManage.ttttt.get(TableManage.tablenum - 1);
				if (can instanceof CanClass) {
					int rowCount = model.getRowCount();
					// ln(TableManage.tablenum+"번 테이블은 비어있다.");
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}
				} else if ((can instanceof Object) && !(can instanceof CanClass)) {
					TableManage TempTable = new TableManage();
					TempTable.GetOrder(TableManage.tablenum);
					TableManage TempTable3 = new TableManage();
					Vector tempmenulist = null;
					tempmenulist = TempTable.GetOrder(TableManage.tablenum);
					int rowCount = model.getRowCount();
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}

					for (int i = 0; i < tempmenulist.size(); i++) {

						if (tempmenulist.elementAt(i) instanceof Drink) {
							Drink drink = (Drink) tempmenulist.elementAt(i);
							userRow = new Vector<String>();
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(drink.name);
							userRow.addElement(drink.count + "");
							userRow.addElement(drink.strTemp);

							userRow.addElement(drink.eatrate + "%");
							model.addRow(userRow);
							// (drink.name+":");
							if (drink.BubbleCheck == true) {
								userRow = new Vector<String>();
								// ("버블 ");
								userRow.addElement("└");
								userRow.addElement("버블 펄 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.ShotCheck == true) {
								// ("샷");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("샷 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.WhippingCheck == true) {
								// ("휘핑");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("휘핑 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							if (drink.SyrupCheck == true) {
								// ("시럽 ");
								userRow = new Vector<String>();
								userRow.addElement("└");
								userRow.addElement("시럽 추가");
								userRow.addElement(null);
								userRow.addElement("옵션");
								model.addRow(userRow);
							}
							// ln();

						} else if (tempmenulist.elementAt(i) instanceof Dessert) {
							userRow = new Vector<String>();
							Dessert dessert = (Dessert) tempmenulist.elementAt(i);
							// ln(dessert.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(dessert.name);
							userRow.addElement(dessert.count + "");

							userRow.addElement(null);

							userRow.addElement(dessert.eatrate + "%");
							model.addRow(userRow);

						} else if (tempmenulist.elementAt(i) instanceof Accessory) {
							userRow = new Vector<String>();
							Accessory acc = (Accessory) tempmenulist.elementAt(i);
							// ln(acc.name);
							userRow.addElement(tempmenulist.indexOf(tempmenulist.elementAt(i)) + 1 + "");
							userRow.addElement(acc.name);
							userRow.addElement(acc.count + "");
							userRow.addElement(null);

							userRow.addElement("완료");
							model.addRow(userRow);
						}

					}
				}
			}
		});
		table12.setEnabled(false);
		table12.setFont(new Font("나눔바른고딕", Font.PLAIN, 15));
		table12.setBackground(new Color(255, 255, 153));
		table12.setBounds(449, 349, 131, 27);
		contentPane.add(table12);

		tb12 = new JTextArea();
		tb12.setEditable(false);
		tb12.setBounds(449, 376, 131, 97);
		contentPane.add(tb12);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(14, 12, 951, 48);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uAE08\uACF5\uCC28");
		lblNewLabel.setFont(new Font("나눔바른고딕", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(38, 6, 106, 36);
		panel_1.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\u2665");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(132, 0, 38, 50);
		panel_1.add(lblNewLabel_1);

		JLabel label = new JLabel("\u2665");
		label.setForeground(Color.RED);
		label.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 23));
		label.setBackground(Color.WHITE);
		label.setBounds(14, 0, 38, 50);
		panel_1.add(label);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(517, 6, 420, 36);
		panel_1.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

		JLabel grade = new JLabel("\uC544\uB974\uBC14\uC774\uD2B8\r\n");
		panel_4.add(grade);
		grade.setForeground(new Color(222, 184, 135));
		grade.setFont(new Font("나눔바른고딕", Font.BOLD, 20));
		grade.setText(strgrade);

		JLabel name = new JLabel("\uC774\uB984");
		panel_4.add(name);
		name.setFont(new Font("나눔바른고딕", Font.BOLD, 20));
		name.setText(strname);

		JLabel lblNewLabel_2 = new JLabel("\uB2D8 \uAED8\uC11C \uB85C\uADF8\uC778\uD558\uC168\uC2B5\uB2C8\uB2E4");
		panel_4.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("나눔바른고딕", Font.PLAIN, 17));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(14, 476, 806, 152);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JButton button = new JButton("\uD14C\uC774\uBE14\uCD94\uAC00");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				/*
				 * TableManage manage = new TableManage(); manage.addTable();
				 */
				TableManage.NowTableCount++;
				if (TableManage.NowTableCount == 9) {
					table9.setEnabled(true);
				}
				if (TableManage.NowTableCount == 10) {
					table10.setEnabled(true);
				}
				if (TableManage.NowTableCount == 11) {
					table11.setEnabled(true);
				}
				if (TableManage.NowTableCount == 12) {
					table12.setEnabled(true);
				}

			}
		});
		button.setForeground(new Color(0, 0, 0));
		button.setBackground(new Color(255, 255, 153));
		button.setFont(new Font("나눔바른고딕", Font.PLAIN, 14));
		button.setBounds(257, 15, 96, 128);
		panel_3.add(button);

		JLabel lblNewLabel_4 = new JLabel("\u266C \uD604\uC7AC\uC2DC\uAC01");
		lblNewLabel_4.setFont(new Font("나눔바른고딕", Font.BOLD, 19));
		lblNewLabel_4.setBounds(14, 15, 129, 18);
		panel_3.add(lblNewLabel_4);

		JButton button_1 = new JButton("\uB9E4\uCD9C \uAD00\uB9AC");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SaleManage salemanage = null;
				try {
					salemanage = new SaleManage();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				salemanage.setVisible(true);
			}
		});
		button_1.setBackground(new Color(255, 255, 153));
		button_1.setFont(new Font("나눔바른고딕", Font.PLAIN, 16));
		button_1.setBounds(696, 15, 96, 128);
		panel_3.add(button_1);

		JButton btnNewButton = new JButton("\uC7AC\uACE0 \uAD00\uB9AC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StockManage stock = new StockManage();
				stock.setVisible(true);
			}
		});
		btnNewButton.setBounds(586, 16, 96, 128);
		panel_3.add(btnNewButton);
		btnNewButton.setBackground(new Color(255, 255, 153));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("나눔바른고딕", Font.PLAIN, 16));

		JButton menumanage = new JButton("\uBA54\uB274 \uAD00\uB9AC");
		menumanage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuSetting frame = new MenuSetting();
				frame.setVisible(true);

			}
		});
		menumanage.setBounds(476, 16, 96, 128);
		panel_3.add(menumanage);
		menumanage.setBackground(new Color(255, 255, 204));
		menumanage.setForeground(new Color(0, 0, 0));
		menumanage.setFont(new Font("나눔바른고딕", Font.PLAIN, 16));

		tOrder = new JButton("\uD14C\uC774\uBE14 \uC8FC\uBB38");
		tOrder.setBackground(new Color(204, 0, 0));
		tOrder.setForeground(new Color(255, 255, 255));
		tOrder.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
		tOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (TableManage.tablenum == 0) {
					aa.showMessageDialog(null, "테이블을 선택하세요");
				}

				else if ((TableManage.tablenum != 0)) {
					Object obj = TableManage.ttttt.get(TableManage.tablenum - 1);
					if ((obj instanceof Object) && !(obj instanceof CanClass)) {
						// ln("주문이 이미 있습니다");
						MenuOrder.WhatTypeOrder = "AdditionalOrder";
						if ((TableManage.tablenum != 0) && (MenuOrder.WhatTypeOrder.equals("AdditionalOrder"))) {
							MenuOrder order = new MenuOrder();
							// ln(MenuOrder.tablenumber);
							order.setVisible(true);
						}
					} else if (obj instanceof CanClass) {
						MenuOrder.WhatTypeOrder = "TableOrder";
						MenuOrder.tablenumber = TableManage.tablenum;
						MenuOrder order = new MenuOrder();
						// ln(MenuOrder.tablenumber);
						order.setVisible(true);
						tOrder.setText("테이블주문");
					}

				}

			}
		});
		tOrder.setBounds(834, 476, 131, 71);
		contentPane.add(tOrder);
		TableManage manage = new TableManage();
		if (manage.CheckFullTable() == true) {
			tOrder.setEnabled(false);
			
		}
		if (manage.CheckFullTable() == false) {
			tOrder.setEnabled(true);
		}

		JButton button_6 = new JButton("\uD14C\uC774\uD06C\uC544\uC6C3");
		button_6.setForeground(new Color(255, 255, 255));
		button_6.setBackground(new Color(204, 0, 0));
		button_6.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuOrder.WhatTypeOrder = "TakeOut";
				MenuOrder order = new MenuOrder();
				order.setVisible(true);
			}
		});
		button_6.setBounds(834, 557, 131, 71);
		contentPane.add(button_6);

		JLabel lblNewLabel_3 = new JLabel("\uBC88 \uD14C\uC774\uBE14");
		lblNewLabel_3.setFont(new Font("나눔바른고딕", Font.BOLD, 20));
		lblNewLabel_3.setBounds(643, 88, 84, 18);
		contentPane.add(lblNewLabel_3);

		JButton button_8 = new JButton("\uC7AC\uB85C\uADF8\uC778");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login login = new Login();
				login.setVisible(true);
			}
		});
		button_8.setForeground(Color.BLACK);
		button_8.setFont(new Font("나눔고딕", Font.BOLD, 13));
		button_8.setBackground(new Color(255, 255, 102));
		button_8.setBounds(881, 72, 84, 40);
		contentPane.add(button_8);

		if (check == true) {
			menumanage.setEnabled(true);
			menumanage.setBackground(new Color(255, 255, 153));
			menumanage.setText("메뉴 관리");
		} else {
			menumanage.setEnabled(false);
			menumanage.setBackground(new Color(255, 255, 204));
			menumanage.setText("접근 불가");

		}
		/*
		 * for(int i=0;i<manage.tablelist.length;i++) { manage.tablelist[i]; }
		 */

		JTextArea[] tb = { tb1, tb2, tb3, tb4, tb5, tb6, tb7, tb8, tb9, tb10, tb11, tb12 };

		JButton button_7 = new JButton("\uD14C\uC774\uBE14\uC815\uB9AC");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TableManage manage = new TableManage();
				if (manage.ClearTable() == true) {
					int rowCount = model.getRowCount();
					for (int i = rowCount - 1; i >= 0; i--) {
						model.removeRow(i);
					}
					tb[TableManage.tablenum - 1].setText("");
				}
				if (manage.CheckFullTable() == false) {
					tOrder.setEnabled(true);
					tOrder.setBackground(new Color(204, 0, 0));
					tOrder.setText("테이블주문");
				}
			}
		});
		button_7.setForeground(Color.BLACK);
		button_7.setFont(new Font("나눔바른고딕", Font.PLAIN, 14));
		button_7.setBackground(new Color(255, 255, 153));
		button_7.setBounds(367, 16, 96, 128);
		panel_3.add(button_7);
		Time = new JLabel();
		Time.setBounds(24, 45, 230, 18);
		panel_3.add(Time);
		Time.setFont(new Font("나눔바른고딕", Font.BOLD, 20));

		if (thread == null) {
			thread = new Thread(this);
			thread.start();

		}

	}
}
