package GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import Manage.SellManage;
import Menus.Accessory;
import Menus.Dessert;
import Menus.Drink;
import Menus.EatRate;
import Order.*;
import Stock.stock;
import Table.CanClass;
import Table.TableManage;
import javax.swing.border.BevelBorder;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.awt.event.ItemEvent;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MenuOrder extends JFrame {

	private JPanel contentPane;
	public String menuname;
	public int orderType;
	public static String WhatTypeOrder;

	boolean syrup;
	boolean whipping;
	boolean shot;
	boolean bubble;

	boolean hotsellok = true;
	boolean icesellok = true;
	boolean temp = true;

	private final ButtonGroup buttonGroup = new ButtonGroup();

	static int tablenumber;

	private JTable table;

	Vector<String> userColumn = new Vector<String>();
	Vector<String> userRow;
	DefaultTableModel model;
	TableManage TempTable = new TableManage();

	Vector saveOldMenu = new Vector();
	Vector saveOldSimpleMenu = new Vector();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuOrder frame = new MenuOrder();
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
	public MenuOrder() {
		TakeOut takeout = new TakeOut();
		ForHere forhere = new ForHere();
		AdditionalOrder addorder = new AdditionalOrder();
		// Ãß°¡¸Þ´º ÃÊ±âÈ­
		addorder.menus.removeAllElements();
		addorder.simple_menus.removeAllElements();

		setTitle("\uC8FC\uBB38\uBC1B\uAE30");
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 625);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		userColumn.addElement("¹øÈ£");
		userColumn.addElement("¸Þ´º");
		userColumn.addElement("¼ö·®");
		userColumn.addElement("ºñ°í");

		model = new DefaultTableModel(userColumn, 0);

		table = new JTable(model);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 79, 343, 351);
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

		// Ã¼Å©¹Ú½º¿¡¿ä
		JCheckBox checkShot = new JCheckBox("\uC0F7");
		checkShot.setBackground(new Color(255, 255, 204));
		checkShot.setSelected(false);
		checkShot.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					shot = true;
				} else {
					shot = false;
				}
			}
		});
		checkShot.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 20));
		checkShot.setBounds(464, 539, 60, 27);
		contentPane.add(checkShot);

		JCheckBox checkWhipping = new JCheckBox("\uD718\uD551");
		checkWhipping.setBackground(new Color(255, 255, 204));
		checkWhipping.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					whipping = true;
				} else {
					whipping = false;
				}

			}
		});

		checkWhipping.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 20));
		checkWhipping.setBounds(538, 539, 75, 27);
		contentPane.add(checkWhipping);

		JCheckBox checkBubble = new JCheckBox("\uBC84\uBE14");
		checkBubble.setBackground(new Color(255, 255, 204));
		checkBubble.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					bubble = true;
				} else {
					bubble = false;
				}

			}
		});
		checkBubble.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 20));
		checkBubble.setBounds(619, 539, 75, 27);
		contentPane.add(checkBubble);

		JCheckBox checkSyrup = new JCheckBox("\uC2DC\uB7FD");
		checkSyrup.setBackground(new Color(255, 255, 204));
		checkSyrup.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					syrup = true;
				} else {
					syrup = false;
				}
			}
		});
		checkSyrup.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 20));
		checkSyrup.setBounds(381, 539, 77, 27);
		contentPane.add(checkSyrup);

		JRadioButton checkHot = new JRadioButton("HOT");
		checkHot.setSelected(true);
		checkHot.setBackground(new Color(255, 255, 204));
		buttonGroup.add(checkHot);
		checkHot.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		checkHot.setBounds(464, 491, 75, 27);
		contentPane.add(checkHot);
		checkHot.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					temp = true;
				} else {
					temp = false;
				}

			}
		});

		JRadioButton checkIce = new JRadioButton("ICE");
		checkIce.setSelected(true);
		checkIce.setBackground(new Color(255, 255, 204));
		buttonGroup.add(checkIce);
		checkIce.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		checkIce.setBounds(538, 491, 139, 27);
		contentPane.add(checkIce);
		checkIce.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					temp = false;
				} else {
					temp = true;
				}

			}
		});

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(371, 50, 491, 380);
		contentPane.add(tabbedPane);

		JPanel drink = new JPanel();
		drink.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("\uC74C\uB8CC", null, drink, null);
		drink.setLayout(null);

		JLabel selectMenu = new JLabel("\uC120\uD0DD\uD55C \uBA54\uB274\uAC00 \uCD9C\uB825");
		selectMenu.setForeground(new Color(255, 0, 0));
		selectMenu.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.BOLD, 22));
		selectMenu.setBounds(381, 442, 205, 30);
		contentPane.add(selectMenu);

		if ((stock.hot_straw == 0) || (stock.papercup == 0)) {
			hotsellok = false;
		}
		if ((stock.ice_straw == 0) || (stock.plasticcup == 0)) {

			icesellok = false;
		}


		JButton americano = new JButton("\uC544\uBA54\uB9AC\uCE74\uB178");
		americano.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		americano.setBackground(new Color(245, 245, 220));
		americano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "¾Æ¸Þ¸®Ä«³ë";
				checkShot.setEnabled(true);
				checkWhipping.setEnabled(true);
				checkSyrup.setEnabled(true);
				checkBubble.setEnabled(false);
				checkBubble.setSelected(false);
				selectMenu.setText(menuname);
				orderType = 1;
				checkHot.setEnabled(true);
				checkIce.setEnabled(true);
				if (hotsellok == false) {
					checkHot.setEnabled(false);
					checkIce.setSelected(true);
					checkHot.setSelected(false);
				}
				if (icesellok == false) {
					checkIce.setEnabled(false);
					checkHot.setSelected(true);
					checkIce.setSelected(false);
				}

			}
		});
		americano.setBounds(18, 26, 142, 80);
		drink.add(americano);
		if (sell.americano == true) {
			americano.setEnabled(true);
		} else {
			americano.setEnabled(false);
		}
		if (hotsellok == false && icesellok == false) {
			americano.setEnabled(false);

		}

		if ((stock.tissue == 0) || (stock.cupholder == 0)) {
			americano.setEnabled(false);
		}

		JButton caffelatte = new JButton("\uCE74\uD398 \uB77C\uB5BC");
		caffelatte.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		caffelatte.setBackground(new Color(245, 245, 220));
		caffelatte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "Ä«Æä ¶ó¶¼";
				selectMenu.setText(menuname);
				checkShot.setEnabled(true);
				checkWhipping.setEnabled(true);
				checkSyrup.setEnabled(true);
				checkBubble.setEnabled(false);

				checkBubble.setSelected(false);
				orderType = 1;
				checkHot.setEnabled(true);
				checkIce.setEnabled(true);
				if (hotsellok == false) {
					checkHot.setEnabled(false);
					checkHot.setSelected(false);
				}
				if (icesellok == false) {
					checkIce.setEnabled(false);
					checkIce.setSelected(false);
				}
			}
		});

		caffelatte.setBounds(174, 26, 142, 80);
		drink.add(caffelatte);

		if (sell.caffelatte == true) {
			caffelatte.setEnabled(true);
		} else {
			caffelatte.setEnabled(false);
		}

		if (hotsellok == false && icesellok == false) {
			caffelatte.setEnabled(false);
		}

		if ((stock.tissue == 0) || (stock.cupholder == 0)) {
			caffelatte.setEnabled(false);
		}

		JButton blackmilktea = new JButton("\uBE14\uB799 \uBC00\uD06C\uD2F0");
		blackmilktea.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		blackmilktea.setBackground(new Color(245, 245, 220));
		blackmilktea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "ºí·¢ ¹ÐÅ© Æ¼";
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(true);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(true);
				selectMenu.setText(menuname);
				orderType = 1;

				checkShot.setSelected(false);
				checkSyrup.setSelected(false);
				checkHot.setEnabled(true);
				checkIce.setEnabled(true);
				if (hotsellok == false) {
					checkHot.setEnabled(false);
					checkHot.setSelected(false);
				}
				if (icesellok == false) {
					checkIce.setEnabled(false);
					checkIce.setSelected(false);
				}
			}
		});
		blackmilktea.setBounds(330, 26, 142, 80);
		drink.add(blackmilktea);

		if (sell.blackmilktea == true) {
			blackmilktea.setEnabled(true);
		} else {
			blackmilktea.setEnabled(false);
		}

		if (hotsellok == false && icesellok == false) {
			blackmilktea.setEnabled(false);
		}

		if ((stock.tissue == 0) || (stock.cupholder == 0)) {
			blackmilktea.setEnabled(false);
		}

		JButton mangosmoodie = new JButton("\uB9DD\uACE0\uC2A4\uBB34\uB514");
		mangosmoodie.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		mangosmoodie.setBackground(new Color(245, 245, 220));
		mangosmoodie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "¸Á°í ½º¹«µð";
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(true);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(true);
				selectMenu.setText(menuname);
				orderType = 1;
				checkShot.setSelected(false);
				checkSyrup.setSelected(false);
				checkHot.setEnabled(false);
				checkIce.setEnabled(true);
				checkHot.setSelected(false);
				checkIce.setSelected(true);
				if (hotsellok == false) {
					checkHot.setEnabled(false);
					checkHot.setSelected(false);
				}
				if (icesellok == false) {
					checkIce.setEnabled(false);
					checkIce.setSelected(false);
				}
			}
		});
		mangosmoodie.setBounds(18, 132, 142, 80);
		drink.add(mangosmoodie);

		if (sell.mangosmoodie == true) {
			mangosmoodie.setEnabled(true);
		} else {
			mangosmoodie.setEnabled(false);
		}

		if (icesellok == false) {
			mangosmoodie.setEnabled(false);
		}

		if ((stock.tissue == 0) || (stock.cupholder == 0)) {
			mangosmoodie.setEnabled(false);
		}

		JButton woolongtea = new JButton("\uC6B0\uB871 \uD2F0");
		woolongtea.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		woolongtea.setBackground(new Color(245, 245, 220));
		woolongtea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "¿ì·Õ Æ¼";
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(false);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				selectMenu.setText(menuname);
				orderType = 1;
				checkShot.setSelected(false);
				checkSyrup.setSelected(false);
				checkBubble.setSelected(false);
				checkWhipping.setSelected(false);
				checkHot.setEnabled(true);
				checkIce.setEnabled(true);
				if (hotsellok == false) {
					checkHot.setEnabled(false);
					checkHot.setSelected(false);
				}
				if (icesellok == false) {
					checkIce.setEnabled(false);
					checkIce.setSelected(false);
				}
			}
		});
		woolongtea.setBounds(174, 132, 142, 80);
		drink.add(woolongtea);

		if (sell.tea == true) {
			woolongtea.setEnabled(true);
		} else {
			woolongtea.setEnabled(false);
		}

		if (hotsellok == false && icesellok == false) {
			woolongtea.setEnabled(false);
		}

		if ((stock.tissue == 0) || (stock.cupholder == 0)) {
			woolongtea.setEnabled(false);
		}

		JButton chocosmoodie = new JButton("\uCD08\uCF54 \uC2A4\uBB34\uB514");
		chocosmoodie.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		chocosmoodie.setBackground(new Color(245, 245, 220));
		chocosmoodie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "ÃÊÄÚ ½º¹«µð";
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(true);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(true);
				selectMenu.setText(menuname);
				orderType = 1;
				checkShot.setSelected(false);
				checkSyrup.setSelected(false);
				checkHot.setEnabled(false);
				checkIce.setEnabled(true);
				checkHot.setSelected(false);
				checkIce.setSelected(true);
				if (hotsellok == false) {
					checkHot.setEnabled(false);
					checkHot.setSelected(false);
				}
				if (icesellok == false) {
					checkIce.setEnabled(false);
					checkIce.setSelected(false);
				}
			}
		});

		chocosmoodie.setBounds(330, 132, 142, 80);
		drink.add(chocosmoodie);

		if (sell.chocosmoodie == true) {
			chocosmoodie.setEnabled(true);
		} else {
			chocosmoodie.setEnabled(false);
		}

		if (icesellok == false) {
			chocosmoodie.setEnabled(false);
		}

		if ((stock.tissue == 0) || (stock.cupholder == 0)) {
			chocosmoodie.setEnabled(false);
		}

		JButton strawberrylatte = new JButton("\uB538\uAE30 \uB77C\uB5BC");
		strawberrylatte.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		strawberrylatte.setBackground(new Color(245, 245, 220));
		strawberrylatte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "µþ±â ¶ó¶¼";
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(true);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				selectMenu.setText(menuname);
				orderType = 1;
				checkShot.setSelected(false);
				checkSyrup.setSelected(false);
				checkBubble.setSelected(false);
				checkHot.setEnabled(true);
				checkIce.setEnabled(true);
				if (hotsellok == false) {
					checkHot.setEnabled(false);
					checkHot.setSelected(false);
				}
				if (icesellok == false) {
					checkIce.setEnabled(false);
					checkIce.setSelected(false);
				}
			}
		});
		strawberrylatte.setBounds(18, 242, 142, 80);
		drink.add(strawberrylatte);

		if (sell.strawberrylatte == true) {
			strawberrylatte.setEnabled(true);
		} else {
			strawberrylatte.setEnabled(false);
		}

		if (hotsellok == false && icesellok == false) {
			strawberrylatte.setEnabled(false);
		}

		if ((stock.tissue == 0) || (stock.cupholder == 0)) {
			strawberrylatte.setEnabled(false);
		}

		JButton blacksugarlatte = new JButton("\uD751\uB2F9 \uB77C\uB5BC");
		blacksugarlatte.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		blacksugarlatte.setBackground(new Color(245, 245, 220));
		blacksugarlatte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "Èæ´ç ¶ó¶¼";
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(true);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(true);
				selectMenu.setText(menuname);
				orderType = 1;
				checkShot.setSelected(false);
				checkSyrup.setSelected(false);
				checkHot.setEnabled(true);
				checkIce.setEnabled(true);
				if (hotsellok == false) {
					checkHot.setEnabled(false);
					checkHot.setSelected(false);
				}
				if (icesellok == false) {
					checkIce.setEnabled(false);
					checkIce.setSelected(false);
				}
			}
		});
		blacksugarlatte.setBounds(174, 242, 142, 80);
		drink.add(blacksugarlatte);

		if (sell.blacksugarlatte == true) {
			blacksugarlatte.setEnabled(true);
		} else {
			blacksugarlatte.setEnabled(false);
		}

		if (hotsellok == false && icesellok == false) {
			blacksugarlatte.setEnabled(false);
		}

		if ((stock.tissue == 0) || (stock.cupholder == 0)) {
			blacksugarlatte.setEnabled(false);
		}

		JButton grapeade = new JButton("\uCCAD\uD3EC\uB3C4 \uC5D0\uC774\uB4DC");
		grapeade.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		grapeade.setBackground(new Color(245, 245, 220));
		grapeade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "Ã»Æ÷µµ ¿¡ÀÌµå";
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(false);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				selectMenu.setText(menuname);
				orderType = 1;
				checkShot.setSelected(false);
				checkSyrup.setSelected(false);
				checkBubble.setSelected(false);
				checkWhipping.setSelected(false);
				checkHot.setEnabled(false);
				checkIce.setEnabled(true);
				checkHot.setSelected(false);
				checkIce.setSelected(true);
				if (hotsellok == false) {
					checkHot.setEnabled(false);
					checkHot.setSelected(false);
				}
				if (icesellok == false) {
					checkIce.setEnabled(false);
					checkIce.setSelected(false);
				}

			}
		});
		grapeade.setBounds(330, 242, 142, 80);
		drink.add(grapeade);

		if (sell.grapeade == true) {
			grapeade.setEnabled(true);
		} else {
			grapeade.setEnabled(false);
		}

		if (icesellok == false) {
			grapeade.setEnabled(false);
		}

		if ((stock.tissue == 0) || (stock.cupholder == 0)) {
			grapeade.setEnabled(false);
		}

		JPanel desset = new JPanel();
		desset.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("\uB514\uC800\uD2B8", null, desset, null);
		desset.setLayout(null);

		JButton chococake = new JButton("\uCD08\uCF54 \uCF00\uC774\uD06C");
		chococake.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		chococake.setBackground(new Color(245, 245, 220));
		chococake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "ÃÊÄÚ ÄÉÀÌÅ©";
				selectMenu.setText(menuname);
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(false);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				orderType = 2;
				checkHot.setEnabled(false);
				checkIce.setEnabled(false);

			}
		});

		chococake.setBounds(18, 26, 142, 80);
		desset.add(chococake);
		if (sell.chococake == true) {
			chococake.setEnabled(true);
		} else {
			chococake.setEnabled(false);
		}
		if ((stock.tissue == 0) || (stock.fork == 0)) {
			chococake.setEnabled(false);
		}

		JButton tiramisu = new JButton("\uD2F0\uB77C\uBBF8\uC218");
		tiramisu.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		tiramisu.setBackground(new Color(245, 245, 220));
		tiramisu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "Æ¼¶ó¹Ì¼ö";
				selectMenu.setText(menuname);
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(false);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				orderType = 2;
				checkHot.setEnabled(false);
				checkIce.setEnabled(false);
			}
		});
		tiramisu.setBounds(174, 26, 142, 80);
		desset.add(tiramisu);
		if (sell.tiramisu == true) {
			tiramisu.setEnabled(true);
		} else {
			tiramisu.setEnabled(false);
		}
		if ((stock.tissue == 0) || (stock.fork == 0)) {
			tiramisu.setEnabled(false);
		}

		JButton honeybread = new JButton("\uD5C8\uB2C8 \uBE0C\uB808\uB4DC");
		honeybread.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		honeybread.setBackground(new Color(245, 245, 220));
		honeybread.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "Çã´Ï ºê·¹µå";
				selectMenu.setText(menuname);
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(false);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				orderType = 2;
				checkHot.setEnabled(false);
				checkIce.setEnabled(false);

			}
		});

		honeybread.setBounds(330, 26, 142, 80);
		desset.add(honeybread);
		if (sell.honeybread == true) {
			honeybread.setEnabled(true);
		} else {
			honeybread.setEnabled(false);
		}
		if ((stock.tissue == 0) || (stock.fork == 0)) {
			honeybread.setEnabled(false);
		}

		JButton coffeeburn = new JButton("\uCEE4\uD53C \uBC88");
		coffeeburn.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		coffeeburn.setBackground(new Color(245, 245, 220));
		coffeeburn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "Ä¿ÇÇ ¹ø";
				selectMenu.setText(menuname);
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(false);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				orderType = 2;
				checkHot.setEnabled(false);
				checkIce.setEnabled(false);
			}
		});

		coffeeburn.setBounds(330, 132, 142, 80);
		desset.add(coffeeburn);
		if (sell.coffeeburn == true) {
			coffeeburn.setEnabled(true);
		} else {
			coffeeburn.setEnabled(false);
		}
		if ((stock.tissue == 0) || (stock.fork == 0)) {
			coffeeburn.setEnabled(false);
		}

		JButton cheesecake = new JButton("\uCE58\uC988 \uCF00\uC774\uD06C");
		cheesecake.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		cheesecake.setBackground(new Color(245, 245, 220));
		cheesecake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "Ä¡Áî ÄÉÀÌÅ©";
				selectMenu.setText(menuname);
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(false);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				orderType = 2;
				checkHot.setEnabled(false);
				checkIce.setEnabled(false);
			}
		});
		cheesecake.setBounds(174, 132, 142, 80);
		desset.add(cheesecake);
		if (sell.cheesecake == true) {
			cheesecake.setEnabled(true);
		} else {
			cheesecake.setEnabled(false);
		}
		if ((stock.tissue == 0) || (stock.fork == 0)) {
			cheesecake.setEnabled(false);
		}

		JButton strawberrytarte = new JButton("\uB538\uAE30 \uD0C0\uB974\uD2B8");
		strawberrytarte.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		strawberrytarte.setBackground(new Color(245, 245, 220));
		strawberrytarte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "µþ±â Å¸¸£Æ®";
				selectMenu.setText(menuname);
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(false);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				orderType = 2;
				checkHot.setEnabled(false);
				checkIce.setEnabled(false);
			}
		});
		strawberrytarte.setBounds(18, 132, 142, 80);
		desset.add(strawberrytarte);
		if (sell.tarte == true) {
			strawberrytarte.setEnabled(true);
		} else {
			strawberrytarte.setEnabled(false);
		}
		if ((stock.tissue == 0) || (stock.fork == 0)) {
			strawberrytarte.setEnabled(false);
		}

		JButton waffle = new JButton("\uC0AC\uACFC\uC7BC \uC640\uD50C");
		waffle.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		waffle.setBackground(new Color(245, 245, 220));
		waffle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "»ç°úÀë ¿ÍÇÃ";
				selectMenu.setText(menuname);
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(false);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				orderType = 2;
				checkHot.setEnabled(false);
				checkIce.setEnabled(false);
			}
		});
		waffle.setBounds(18, 242, 142, 80);
		desset.add(waffle);
		if (sell.waffle == true) {
			waffle.setEnabled(true);
		} else {
			waffle.setEnabled(false);
		}
		if ((stock.tissue == 0) || (stock.fork == 0)) {
			waffle.setEnabled(false);
		}

		JButton crepe = new JButton("\uD06C\uB808\uD398");
		crepe.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		crepe.setBackground(new Color(245, 245, 220));
		crepe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "Å©·¹Æä";
				selectMenu.setText(menuname);
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(false);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				orderType = 2;
				checkHot.setEnabled(false);
				checkIce.setEnabled(false);
			}
		});
		crepe.setBounds(174, 242, 142, 80);
		desset.add(crepe);
		if (sell.crepe == true) {
			crepe.setEnabled(true);
		} else {
			crepe.setEnabled(false);
		}
		if ((stock.tissue == 0) || (stock.fork == 0)) {
			crepe.setEnabled(false);
		}

		JButton cookie = new JButton("\uCD08\uCF54 \uCFE0\uD0A4");
		cookie.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		cookie.setBackground(new Color(245, 245, 220));
		cookie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "ÃÊÄÚ ÄíÅ°";
				selectMenu.setText(menuname);
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(false);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				orderType = 2;
				checkHot.setEnabled(false);
				checkIce.setEnabled(false);
			}
		});
		cookie.setBounds(330, 242, 142, 80);
		desset.add(cookie);
		if (sell.cookie == true) {
			cookie.setEnabled(true);
		} else {
			cookie.setEnabled(false);
		}
		if ((stock.tissue == 0) || (stock.fork == 0)) {
			cookie.setEnabled(false);
		}

		JPanel acssesory = new JPanel();
		acssesory.setBackground(new Color(255, 255, 255));
		acssesory.setLocation(364, 29);
		tabbedPane.addTab("\uC545\uC138\uC0AC\uB9AC", null, acssesory, null);
		acssesory.setLayout(null);

		JButton diary = new JButton("2020 \uB2E4\uC774\uC5B4\uB9AC");
		diary.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		diary.setBackground(new Color(245, 245, 220));
		diary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "2020 ´ÙÀÌ¾î¸®";
				selectMenu.setText(menuname);
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(false);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				orderType = 3;
				checkHot.setEnabled(false);
				checkIce.setEnabled(false);
			}
		});
		if (sell.diary == true) {
			diary.setEnabled(true);
		} else {
			diary.setEnabled(false);
		}
		diary.setBounds(18, 26, 142, 80);
		acssesory.add(diary);

		JButton tumblr = new JButton("\uAE08\uACF5\uCC28 \uD140\uBE14\uB7EC");
		tumblr.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		tumblr.setBackground(new Color(245, 245, 220));
		tumblr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "±Ý°øÂ÷ ÅÒºí·¯";
				selectMenu.setText(menuname);
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(false);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				orderType = 3;
				checkHot.setEnabled(false);
				checkIce.setEnabled(false);
			}
		});
		tumblr.setBounds(174, 26, 142, 80);
		acssesory.add(tumblr);
		if (sell.tumblr == true) {
			tumblr.setEnabled(true);
		} else {
			tumblr.setEnabled(false);
		}

		JButton note = new JButton("\uD55C\uC815\uD310 \uB178\uD2B8");
		note.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		note.setBackground(new Color(245, 245, 220));
		note.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "ÇÑÁ¤ÆÇ ³ëÆ®";
				selectMenu.setText(menuname);
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(false);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				orderType = 3;
				checkHot.setEnabled(false);
				checkIce.setEnabled(false);
			}
		});
		note.setBounds(330, 26, 142, 80);
		acssesory.add(note);
		if (sell.note == true) {
			note.setEnabled(true);
		} else {
			note.setEnabled(false);
		}

		JButton coffeebean = new JButton("\uCEE4\uD53C \uCF69");
		coffeebean.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		coffeebean.setBackground(new Color(245, 245, 220));
		coffeebean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "Ä¿ÇÇ Äá";
				selectMenu.setText(menuname);
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(false);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				orderType = 3;
				checkHot.setEnabled(false);
				checkIce.setEnabled(false);
			}
		});
		coffeebean.setBounds(18, 132, 142, 80);
		acssesory.add(coffeebean);
		if (sell.coffeebean == true) {
			coffeebean.setEnabled(true);
		} else {
			coffeebean.setEnabled(false);
		}

		JButton glass = new JButton("\uBE48\uD2F0\uC9C0 \uC720\uB9AC\uCEF5");
		glass.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		glass.setBackground(new Color(245, 245, 220));
		glass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "ºóÆ¼Áö À¯¸®ÄÅ";
				selectMenu.setText(menuname);
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(false);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				orderType = 3;
				checkHot.setEnabled(false);
				checkIce.setEnabled(false);
			}
		});
		glass.setBounds(174, 132, 142, 80);
		acssesory.add(glass);
		if (sell.glass == true) {
			glass.setEnabled(true);
		} else {
			glass.setEnabled(false);
		}

		JButton mug = new JButton("\uBA38\uADF8 \uCEF5");
		mug.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		mug.setBackground(new Color(245, 245, 220));
		mug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "¸Ó±× ÄÅ";
				selectMenu.setText(menuname);
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(false);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				orderType = 3;
				checkHot.setEnabled(false);
				checkIce.setEnabled(false);
			}
		});
		mug.setBounds(330, 132, 142, 80);
		acssesory.add(mug);
		if (sell.mug == true) {
			mug.setEnabled(true);
		} else {
			mug.setEnabled(false);
		}

		JButton straw = new JButton("\uC720\uB9AC \uC2A4\uD2B8\uB85C\uC6B0");
		straw.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		straw.setBackground(new Color(245, 245, 220));
		straw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "À¯¸® ½ºÆ®·Î¿ì";
				selectMenu.setText(menuname);
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(false);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				orderType = 3;
				checkHot.setEnabled(false);
				checkIce.setEnabled(false);
			}
		});
		straw.setBounds(18, 242, 142, 80);
		acssesory.add(straw);
		if (sell.glassstraw == true) {
			straw.setEnabled(true);
		} else {
			straw.setEnabled(false);
		}

		JButton card = new JButton("\uBA64\uBC84\uC2ED \uCE74\uB4DC");
		card.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		card.setBackground(new Color(245, 245, 220));
		card.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "¸â¹ö½Ê Ä«µå";
				selectMenu.setText(menuname);
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(false);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				orderType = 3;
				checkHot.setEnabled(false);
				checkIce.setEnabled(false);

			}
		});
		card.setBounds(174, 242, 142, 80);
		acssesory.add(card);
		if (sell.card == true) {
			card.setEnabled(true);
		} else {
			card.setEnabled(false);
		}

		JButton speaker = new JButton("\uCEE4\uD53C\uCF69 \uC2A4\uD53C\uCEE4");
		speaker.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		speaker.setBackground(new Color(245, 245, 220));
		speaker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuname = "Ä¿ÇÇ Äá ½ºÇÇÄ¿";
				selectMenu.setText(menuname);
				checkShot.setEnabled(false);
				checkWhipping.setEnabled(false);
				checkSyrup.setEnabled(false);
				checkBubble.setEnabled(false);
				orderType = 3;
				checkHot.setEnabled(false);
				checkIce.setEnabled(false);
			}
		});
		speaker.setBounds(330, 242, 142, 80);
		acssesory.add(speaker);
		if (sell.speaker == true) {
			speaker.setEnabled(true);
		} else {
			speaker.setEnabled(false);
		}

		JLabel label_3 = new JLabel("\uC635\uC158\uC120\uD0DD");
		label_3.setBounds(381, 495, 62, 18);
		contentPane.add(label_3);

		JButton cancel = new JButton("\uCDE8\uC18C");
		cancel.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.BOLD, 24));
		cancel.setBackground(new Color(255, 255, 153));
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((WhatTypeOrder.equals("TableOrder")) && (WhatTypeOrder.equals("TakeOut"))) {
					takeout.menus.removeAllElements();
					forhere.menus.removeAllElements();
				}
				if (WhatTypeOrder.equals("AdditionalOrder")) {
					addorder.menus.removeAllElements();
				}
				dispose();
			}
		});
		cancel.setBounds(194, 475, 161, 91);
		contentPane.add(cancel);

		JButton add = new JButton("\uCD94\uAC00");
		add.setBackground(new Color(233, 150, 122));
		add.setForeground(new Color(255, 255, 255));
		add.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.BOLD, 27));
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (WhatTypeOrder.equals("TableOrder")) {
					Drink drink = new Drink();
					Dessert dessert = new Dessert();
					Accessory acc = new Accessory();
					if (orderType == 1) {

						drink.SetDrinkOption(shot, whipping, bubble, syrup, temp);
						drink.nameset(menuname);
						int count = 1;
						boolean equal = false;
						int index = 0;
						for (int i = 0; i < forhere.menus.size(); i++) {
							if (forhere.menus.elementAt(i) instanceof Drink) {
								Drink check = (Drink) forhere.menus.elementAt(i);
								if (drink.name.equals(check.name)) {
									if ((drink.WhippingCheck == check.WhippingCheck)
											&& (drink.ShotCheck == check.ShotCheck)
											&& (drink.SyrupCheck == check.SyrupCheck)
											&& (drink.BubbleCheck == check.BubbleCheck)) {
										if ((drink.Hot == check.Hot) || (drink.Ice == check.Ice)) {
											equal = true;
											index = i;
											break;
										}
									}
								}
							}

						}
						if (equal == true) {
							drink = (Drink) forhere.menus.elementAt(index);
							drink.count++;
							forhere.AddSimpleMenus(drink.name, drink.count);
							String oldmenu = Integer.toString(forhere.menus.indexOf(drink) + 1);
							for (int row = 0; row < model.getRowCount(); row++) {
								if (oldmenu.equals(model.getValueAt(row, 0))) {
									model.setValueAt(drink.count + "", row, 2);
									break;
								}
							}
						} else {
							forhere.menus.add(drink);
							drink.countset(count);
							forhere.AddSimpleMenus(drink.name, drink.count);
							userRow = new Vector<String>();
							userRow.addElement((forhere.menus.indexOf(drink) + 1) + "");
							userRow.addElement(drink.name);
							userRow.addElement(drink.count + "");
							userRow.addElement(drink.strTemp);
							model.addRow(userRow);

							if (drink.ShotCheck == true) {
								userRow = new Vector<String>();
								userRow.addElement("¦¦");
								userRow.addElement("¼¦ Ãß°¡");
								userRow.addElement(null);
								userRow.addElement("¿É¼Ç");
								model.addRow(userRow);
							}
							if (drink.WhippingCheck == true) {
								userRow = new Vector<String>();
								userRow.addElement("¦¦");
								userRow.addElement("ÈÖÇÎ Ãß°¡");
								userRow.addElement(null);
								userRow.addElement("¿É¼Ç");
								model.addRow(userRow);
							}
							if (drink.SyrupCheck == true) {
								userRow = new Vector<String>();
								userRow.addElement("¦¦");
								userRow.addElement("½Ã·´ Ãß°¡");
								userRow.addElement(null);
								userRow.addElement("¿É¼Ç");
								model.addRow(userRow);
							}
							if (drink.BubbleCheck == true) {
								userRow = new Vector<String>();
								userRow.addElement("¦¦");
								userRow.addElement("¹öºíÆ¼ ÆÞ Ãß°¡");
								userRow.addElement(null);
								userRow.addElement("¿É¼Ç");
								model.addRow(userRow);
							}
						}
					}

					else if (orderType == 2) {
						dessert.nameset(menuname);
						int count = 1;
						boolean equal = false;
						int index = 0;
						for (int i = 0; i < forhere.menus.size(); i++) {
							if (forhere.menus.elementAt(i) instanceof Dessert) {
								Dessert check = (Dessert) forhere.menus.elementAt(i);
								if (dessert.name.equals(check.name)) {
									equal = true;
									index = i;
									break;
								} else {
									equal = false;
								}
							}
						}
						if (equal == true) {
							dessert = (Dessert) forhere.menus.elementAt(index);
							dessert.count++;
							forhere.AddSimpleMenus(dessert.name, dessert.count);
							String oldmenu = Integer.toString(forhere.menus.indexOf(dessert) + 1);
							for (int row = 0; row < model.getRowCount(); row++) {
								if (oldmenu.equals(model.getValueAt(row, 0))) {
									model.setValueAt(dessert.count + "", row, 2);
									break;
								}
							}
						} else {
							dessert.countset(count);
							forhere.menus.add(dessert);
							forhere.AddSimpleMenus(dessert.name, dessert.count);
							userRow = new Vector<String>();
							userRow.addElement((forhere.menus.indexOf(dessert) + 1) + "");
							userRow.addElement(dessert.name);
							userRow.addElement(dessert.count + "");
							userRow.addElement(null);
							model.addRow(userRow);
						}
					} else if (orderType == 3) {
						acc.nameset(menuname);
						int count = 1;
						boolean equal = false;
						int index = 0;
						for (int i = 0; i < forhere.menus.size(); i++) {
							if (forhere.menus.elementAt(i) instanceof Accessory) {
								Accessory check = (Accessory) forhere.menus.elementAt(i);
								if (acc.name.equals(check.name)) {
									equal = true;
									index = i;
									break;
								}

								else {
									equal = false;
								}
							}
						}
						if (equal == true) {
							acc = (Accessory) forhere.menus.elementAt(index);
							forhere.AddSimpleMenus(acc.name, acc.count);
							acc.count++;
							String oldmenu = Integer.toString(forhere.menus.indexOf(acc) + 1);
							for (int row = 0; row < model.getRowCount(); row++) {
								if (oldmenu.equals(model.getValueAt(row, 0))) {
									model.setValueAt(acc.count + "", row, 2);
									break;
								}
							}
						} else {
							acc.countset(count);
							forhere.menus.add(acc);
							forhere.AddSimpleMenus(acc.name, acc.count);
							userRow = new Vector<String>();
							userRow.addElement((forhere.menus.indexOf(acc) + 1) + "");
							userRow.addElement(acc.name);
							userRow.addElement(acc.count + "");
							userRow.addElement(null);
							model.addRow(userRow);
						}

					}
				} else if (WhatTypeOrder.equals("TakeOut")) {
					Drink drink = new Drink();
					Dessert dessert = new Dessert();
					Accessory acc = new Accessory();

					if (orderType == 1) {
						drink.SetDrinkOption(shot, whipping, bubble, syrup, temp);
						drink.nameset(menuname);
						int count = 1;
						boolean equal = false;
						int index = 0;
						for (int i = 0; i < takeout.menus.size(); i++) {
							if (takeout.menus.elementAt(i) instanceof Drink) {
								Drink check = (Drink) takeout.menus.elementAt(i);
								{
									if ((drink.WhippingCheck == check.WhippingCheck)
											&& (drink.ShotCheck == check.ShotCheck)
											&& (drink.SyrupCheck == check.SyrupCheck)
											&& (drink.BubbleCheck == check.BubbleCheck)) {
										if ((drink.Hot == check.Hot) || (drink.Ice == check.Ice)) {
											equal = true;
											index = i;
											break;
										}
									}
								}
							}
						}
						if (equal == true) {
							drink = (Drink) takeout.menus.elementAt(index);
							drink.count++;

							takeout.AddSimpleMenus(drink.name, drink.count);
							String oldmenu = Integer.toString(takeout.menus.indexOf(drink) + 1);
							for (int row = 0; row < model.getRowCount(); row++) {
								if (oldmenu.equals(model.getValueAt(row, 0))) {
									model.setValueAt(drink.count + "", row, 2);
									break;
								}
							}
						} else {
							takeout.menus.add(drink);

							drink.countset(count);

							takeout.AddSimpleMenus(drink.name, drink.count);
							userRow = new Vector<String>();
							userRow.addElement((takeout.menus.indexOf(drink) + 1) + "");
							userRow.addElement(drink.name);
							userRow.addElement(drink.count + "");
							userRow.addElement(drink.strTemp);
							model.addRow(userRow);

							if (drink.ShotCheck == true) {
								userRow = new Vector<String>();
								userRow.addElement("¦¦");
								userRow.addElement("¼¦ Ãß°¡");
								userRow.addElement(null);
								userRow.addElement("¿É¼Ç");
								model.addRow(userRow);
							}
							if (drink.WhippingCheck == true) {
								userRow = new Vector<String>();
								userRow.addElement("¦¦");
								userRow.addElement("ÈÖÇÎ Ãß°¡");
								userRow.addElement(null);
								userRow.addElement("¿É¼Ç");
								model.addRow(userRow);
							}
							if (drink.SyrupCheck == true) {
								userRow = new Vector<String>();
								userRow.addElement("¦¦");
								userRow.addElement("½Ã·´ Ãß°¡");
								userRow.addElement(null);
								userRow.addElement("¿É¼Ç");
								model.addRow(userRow);
							}
							if (drink.BubbleCheck == true) {
								userRow = new Vector<String>();
								userRow.addElement("¦¦");
								userRow.addElement("¹öºíÆ¼ ÆÞ Ãß°¡");
								userRow.addElement(null);
								userRow.addElement("¿É¼Ç");
								model.addRow(userRow);
							}
						}
					}

					else if (orderType == 2) {
						dessert.nameset(menuname);
						int count = 1;
						boolean equal = false;
						int index = 0;
						for (int i = 0; i < takeout.menus.size(); i++) {
							if (takeout.menus.elementAt(i) instanceof Dessert) {
								Dessert check = (Dessert) takeout.menus.elementAt(i);
								if (dessert.name.equals(check.name)) {
									equal = true;
									index = i;
									break;
								} else {
									equal = false;
								}
							}
						}
						if (equal == true) {
							dessert = (Dessert) takeout.menus.elementAt(index);
							dessert.count++;

							takeout.AddSimpleMenus(dessert.name, dessert.count);
							String oldmenu = Integer.toString(takeout.menus.indexOf(dessert) + 1);
							for (int row = 0; row < model.getRowCount(); row++) {
								if (oldmenu.equals(model.getValueAt(row, 0))) {
									model.setValueAt(dessert.count + "", row, 2);
									break;
								}
							}
						} else {
							dessert.countset(count);
							takeout.menus.add(dessert);

							takeout.AddSimpleMenus(dessert.name, dessert.count);
							userRow = new Vector<String>();
							userRow.addElement((takeout.menus.indexOf(dessert) + 1) + "");
							userRow.addElement(dessert.name);
							userRow.addElement(dessert.count + "");
							userRow.addElement(null);
							model.addRow(userRow);
						}
					} else if (orderType == 3) {
						acc.nameset(menuname);
						int count = 1;
						boolean equal = false;
						int index = 0;
						for (int i = 0; i < takeout.menus.size(); i++) {
							if (takeout.menus.elementAt(i) instanceof Accessory) {
								Accessory check = (Accessory) takeout.menus.elementAt(i);
								if (acc.name.equals(check.name)) {
									equal = true;
									index = i;
									break;
								} else {
									equal = false;
								}
							}
						}
						if (equal == true) {
							acc = (Accessory) takeout.menus.elementAt(index);
							acc.count++;

							takeout.AddSimpleMenus(acc.name, acc.count);
							String oldmenu = Integer.toString(takeout.menus.indexOf(acc) + 1);
							for (int row = 0; row < model.getRowCount(); row++) {
								if (oldmenu.equals(model.getValueAt(row, 0))) {
									model.setValueAt(acc.count + "", row, 2);
									break;
								}
							}
						} else {
							acc.countset(count);
							takeout.menus.add(acc);
							takeout.AddSimpleMenus(acc.name, acc.count);
							userRow = new Vector<String>();
							userRow.addElement((takeout.menus.indexOf(acc) + 1) + "");
							userRow.addElement(acc.name);
							userRow.addElement(acc.count + "");
							userRow.addElement(null);
							model.addRow(userRow);
						}
					}
				} else if (WhatTypeOrder.equals("AdditionalOrder")) {
					Drink drink = new Drink();
					Dessert dessert = new Dessert();
					Accessory acc = new Accessory();

					Object obj = TableManage.ttttt.elementAt(TableManage.tablenum - 1);
					Object s_obj = TableManage.sssss.elementAt(TableManage.tablenum - 1);

					Vector f = (Vector) obj;
					Vector v = (Vector) obj;

					forhere.menus = v;

					if (orderType == 1) {
						drink.SetDrinkOption(shot, whipping, bubble, syrup, temp);
						drink.nameset(menuname);
						int count = 1;
						boolean equal2 = false;
						int index2 = 0;
						if (addorder.menus.size() != 0) {
							for (int i = 0; i < addorder.menus.size(); i++) {
								if (addorder.menus.elementAt(i) instanceof Drink) {
									Drink check = (Drink) addorder.menus.elementAt(i);
									if (drink.name.equals(check.name)) {
										if ((drink.WhippingCheck == check.WhippingCheck)
												&& (drink.ShotCheck == check.ShotCheck)
												&& (drink.SyrupCheck == check.SyrupCheck)
												&& (drink.BubbleCheck == check.BubbleCheck)) {
											if ((drink.Hot == check.Hot) || (drink.Ice == check.Ice)) {
												equal2 = true;
												index2 = i;
												break;
											}
										}
									}
								}

							}
						}

						if (equal2 == true) {
							Drink drink_t = (Drink) addorder.menus.elementAt(index2);
							drink_t.count += 1;
							String oldmenu = Integer.toString(addorder.menus.indexOf(drink_t) + 1);
							for (int row = 0; row < model.getRowCount(); row++) {
								if (oldmenu.equals(model.getValueAt(row, 0))) {
									model.setValueAt(drink_t.count + "", row, 2);
									break;
								}
							}

						}

						else if (equal2 == false) {
							addorder.menus.add(drink);
							drink.countset(count);
							userRow = new Vector<String>();
							userRow.addElement((addorder.menus.indexOf(drink) + 1) + "");
							userRow.addElement(drink.name);
							userRow.addElement(drink.count + "");
							userRow.addElement(drink.strTemp);
							model.addRow(userRow);

							if (drink.ShotCheck == true) {
								userRow = new Vector<String>();
								userRow.addElement("¦¦");
								userRow.addElement("¼¦ Ãß°¡");
								userRow.addElement(null);
								userRow.addElement("¿É¼Ç");
								model.addRow(userRow);
							}
							if (drink.WhippingCheck == true) {
								userRow = new Vector<String>();
								userRow.addElement("¦¦");
								userRow.addElement("ÈÖÇÎ Ãß°¡");
								userRow.addElement(null);
								userRow.addElement("¿É¼Ç");
								model.addRow(userRow);
							}
							if (drink.SyrupCheck == true) {
								userRow = new Vector<String>();
								userRow.addElement("¦¦");
								userRow.addElement("½Ã·´ Ãß°¡");
								userRow.addElement(null);
								userRow.addElement("¿É¼Ç");
								model.addRow(userRow);
							}
							if (drink.BubbleCheck == true) {
								userRow = new Vector<String>();
								userRow.addElement("¦¦");
								userRow.addElement("¹öºíÆ¼ ÆÞ Ãß°¡");
								userRow.addElement(null);
								userRow.addElement("¿É¼Ç");
								model.addRow(userRow);
							}
						}
					}

					else if (orderType == 2) {
						dessert.nameset(menuname);
						int count = 1;
						boolean equal = false;
						int index = 0;
						for (int i = 0; i < addorder.menus.size(); i++) {
							if (addorder.menus.elementAt(i) instanceof Dessert) {
								Dessert check = (Dessert) addorder.menus.elementAt(i);
								if (dessert.name.equals(check.name)) {
									equal = true;
									index = i;
									break;
								} else {
									equal = false;
								}
							}
						}
						if (equal == true) {
							dessert = (Dessert) addorder.menus.elementAt(index);
							dessert.count++;

							String oldmenu = Integer.toString(addorder.menus.indexOf(dessert) + 1);
							for (int row = 0; row < model.getRowCount(); row++) {
								if (oldmenu.equals(model.getValueAt(row, 0))) {
									model.setValueAt(dessert.count + "", row, 2);
									break;
								}
							}
						} else {
							dessert.countset(count);
							addorder.menus.add(dessert);
							userRow = new Vector<String>();
							userRow.addElement((addorder.menus.indexOf(dessert) + 1) + "");
							userRow.addElement(dessert.name);
							userRow.addElement(dessert.count + "");
							userRow.addElement(null);
							model.addRow(userRow);
						}
					} else if (orderType == 3) {
						acc.nameset(menuname);
						int count = 1;
						boolean equal = false;
						int index = 0;
						for (int i = 0; i < addorder.menus.size(); i++) {
							if (addorder.menus.elementAt(i) instanceof Accessory) {
								Accessory check = (Accessory) addorder.menus.elementAt(i);
								if (acc.name.equals(check.name)) {
									equal = true;
									index = i;
									break;
								} else {
									equal = false;
								}
							}
						}
						if (equal == true) {
							acc = (Accessory) addorder.menus.elementAt(index);
							acc.count++;
							String oldmenu = Integer.toString(addorder.menus.indexOf(acc) + 1);
							for (int row = 0; row < model.getRowCount(); row++) {
								if (oldmenu.equals(model.getValueAt(row, 0))) {
									model.setValueAt(acc.count + "", row, 2);
									break;
								}
							}
						} else {
							acc.countset(count);
							addorder.menus.add(acc);
							userRow = new Vector<String>();
							userRow.addElement((addorder.menus.indexOf(acc) + 1) + "");
							userRow.addElement(acc.name);
							userRow.addElement(acc.count + "");
							userRow.addElement(null);
							model.addRow(userRow);
						}
					}

				}
			}

		});

		add.setBounds(704, 442, 148, 124);
		contentPane.add(add);

		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(722, 30, 130, 35);
		contentPane.add(panel);
		panel.setBackground(new Color(255, 255, 255));

		JLabel label_1 = new JLabel("\u25B6");
		label_1.setForeground(new Color(204, 0, 0));
		label_1.setBackground(Color.WHITE);
		panel.add(label_1);

		JLabel label = new JLabel("\uC8FC\uBB38\uCC3D ");
		panel.add(label);
		label.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 20));

		JLabel lblNewLabel = new JLabel("\u25C0");
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(204, 0, 0));
		lblNewLabel.setBackground(new Color(255, 255, 255));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 0, 0));
		panel_1.setBounds(0, 0, 866, 18);
		contentPane.add(panel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(14, 40, 343, 35);
		contentPane.add(panel_2);

		JLabel lblNewLabel_3 = new JLabel("\u2660");
		lblNewLabel_3.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_3);

		JLabel num = new JLabel(MenuOrder.tablenumber + "");
		num.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 20));
		panel_2.add(num);

		JLabel lblNewLabel_1 = new JLabel("\uBC88 \uD14C\uC774\uBE14 \uC8FC\uBB38 ");
		lblNewLabel_1.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("\u2660");
		lblNewLabel_2.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_2);

		JButton order = new JButton("\uC8FC\uBB38");
		order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (WhatTypeOrder.equals("TableOrder")) {
					boolean available = true;
					if (forhere.menus.size() == 0) {
					} else {
						int hot = 0;
						int ice = 0;
						int tissue = 0;
						int pacup = 0;
						int plcup = 0;
						int holder = 0;
						int fork = 0;
						for (int i = 0; i < forhere.menus.size(); i++) {
							Object obj = null;
							obj = forhere.menus.elementAt(i);
							if (obj instanceof Drink) {
								Drink drink = (Drink) obj;
								if (drink.strTemp.equals("HOT")) {
									if ((stock.hot_straw < drink.count) || (stock.papercup < drink.count)) {
										available = false;
									} else {
										hot += drink.count;
										pacup += drink.count;
									}
								} else if (drink.strTemp.equals("ICE")) {
									if ((stock.ice_straw < drink.count) || (stock.plasticcup < drink.count)) {
										available = false;
									} else {
										ice += drink.count;
										plcup += drink.count;
									}
								}
								if ((stock.tissue < drink.count) || (stock.cupholder < drink.count)) {
									available = false;
									break;
								} else {
									tissue += drink.count;
									holder += drink.count;

								}
							}
							if (obj instanceof Dessert) {
								Dessert dessert = (Dessert) obj;
								if ((stock.fork < dessert.count) || (stock.tissue < dessert.count)) {
									available = false;
									break;
								} else {
									fork += dessert.count;
									tissue += dessert.count;
								}
							}
							if (obj instanceof Accessory) {
								Accessory acc = (Accessory) obj;
							}
						}
						if (available == false) {
							JOptionPane aa = new JOptionPane();
							aa.showMessageDialog(null, "Àç°íºÎÁ·À¸·Î ÀÎÇÏ¿© ÁÖ¹®ÀÌ ºÒ°¡´ÉÇÕ´Ï´Ù. ¸ÞÀÎÈ­¸é¿¡¼­ Àç°í¸¦ È®ÀÎÇØÁÖ¼¼¿ä.");
						} else {

							TempTable.SetSimpleTable(forhere.simple_menus);
							TempTable.SetTable(forhere.menus);
							stock.hot_straw -= hot;
							stock.papercup -= pacup;
							stock.ice_straw -= ice;
							stock.plasticcup -= plcup;
							stock.tissue -= tissue;
							stock.cupholder -= holder;
							stock.fork -= fork;
							Main.PrintSimpleMenu(TableManage.tablenum);

							SellManage sell = new SellManage();

							SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							Date time = new Date();
							String time1 = format1.format(time);
							sell.WriteSaleLog(forhere.simple_menus, time1);

							EatRate eat1 = new EatRate();
							EatRate eat2 = new EatRate();
							EatRate eat3 = new EatRate();
							EatRate eat4 = new EatRate();
							EatRate eat5 = new EatRate();
							EatRate eat6 = new EatRate();
							EatRate eat7 = new EatRate();
							EatRate eat8 = new EatRate();
							EatRate eat9 = new EatRate();
							EatRate eat10 = new EatRate();
							EatRate eat11 = new EatRate();
							EatRate eat12 = new EatRate();
							if (!(TableManage.ttttt.elementAt(TableManage.tablenum - 1) instanceof CanClass)) {
								if (TableManage.tablenum == 1) {
									Vector eateat = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat1.EatRateSet(eateat);

									Thread thread1 = new Thread(eat1);
									thread1.start();
								} else if (TableManage.tablenum == 2) {
									Vector eateat2 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat2.EatRateSet(eateat2);
									Thread thread2 = new Thread(eat2);
									thread2.start();
								} else if (TableManage.tablenum == 3) {
									Vector eateat3 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat3.EatRateSet(eateat3);
									Thread thread3 = new Thread(eat3);
									thread3.start();
								} else if (TableManage.tablenum == 4) {
									Vector eateat4 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat4.EatRateSet(eateat4);
									Thread thread4 = new Thread(eat4);
									thread4.start();
								} else if (TableManage.tablenum == 5) {
									Vector eateat5 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat5.EatRateSet(eateat5);
									Thread thread5 = new Thread(eat5);
									thread5.start();
								} else if (TableManage.tablenum == 6) {
									Vector eateat6 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat6.EatRateSet(eateat6);
									Thread thread6 = new Thread(eat6);
									thread6.start();
								} else if (TableManage.tablenum == 7) {
									Vector eateat7 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat7.EatRateSet(eateat7);
									Thread thread7 = new Thread(eat7);
									thread7.start();
								} else if (TableManage.tablenum == 8) {
									Vector eateat8 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat8.EatRateSet(eateat8);
									Thread thread8 = new Thread(eat8);
									thread8.start();
								} else if (TableManage.tablenum == 9) {
									Vector eateat9 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat9.EatRateSet(eateat9);
									Thread thread9 = new Thread(eat9);
									thread9.start();
								} else if (TableManage.tablenum == 10) {
									Vector eateat10 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat10.EatRateSet(eateat10);
									Thread thread10 = new Thread(eat10);
									thread10.start();
								} else if (TableManage.tablenum == 11) {
									Vector eateat11 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat11.EatRateSet(eateat11);
									Thread thread11 = new Thread(eat11);
									thread11.start();
								} else if (TableManage.tablenum == 12) {
									Vector eateat12 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat12.EatRateSet(eateat12);
									Thread thread12 = new Thread(eat12);
									thread12.start();
								}
							}

						}
					}

				}

				else if (WhatTypeOrder.equals("TakeOut")) {
					boolean available = true;
					if (takeout.menus.size() == 0) {

					} else {
						int hot = 0;
						int ice = 0;
						int tissue = 0;
						int pacup = 0;
						int plcup = 0;
						int holder = 0;
						int fork = 0;
						for (int i = 0; i < takeout.menus.size(); i++) {
							Object obj = null;
							obj = takeout.menus.elementAt(i);
							if (obj instanceof Drink) {
								Drink drink = (Drink) obj;
								if (drink.strTemp.equals("HOT")) {
									if ((stock.hot_straw < drink.count) || (stock.papercup < drink.count)) {
										available = false;
										break;
									} else {
										hot += drink.count;
										pacup += drink.count;
									}
								} else if (drink.strTemp.equals("ICE")) {
									if ((stock.ice_straw < drink.count) || (stock.plasticcup < drink.count)) {
										available = false;
										break;
									} else {
										ice += drink.count;
										plcup += drink.count;
									}
								}
								if ((stock.tissue < drink.count) || (stock.cupholder < drink.count)) {
									available = false;
									break;
								} else {
									tissue += drink.count;
									holder += drink.count;

								}
							}
							if (obj instanceof Dessert) {
								Dessert dessert = (Dessert) obj;
								if ((stock.fork < dessert.count) || (stock.tissue < dessert.count)) {
									available = false;
									break;
								} else {
									fork += dessert.count;
									tissue += dessert.count;
								}
							}
							if (obj instanceof Accessory) {
								Accessory acc = (Accessory) obj;
							}
						}
						if (available == false) {
							JOptionPane aa = new JOptionPane();
							aa.showMessageDialog(null, "Àç°íºÎÁ·À¸·Î ÀÎÇÏ¿© ÁÖ¹®ÀÌ ºÒ°¡´ÉÇÕ´Ï´Ù. ¸ÞÀÎÈ­¸é¿¡¼­ Àç°í¸¦ È®ÀÎÇØÁÖ¼¼¿ä.");
						} else {

							stock.hot_straw -= hot;
							stock.papercup -= pacup;
							stock.ice_straw -= ice;
							stock.plasticcup -= plcup;
							stock.tissue -= tissue;
							stock.cupholder -= holder;
							stock.fork -= fork;

							SellManage sell = new SellManage();
							SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							Date time = new Date();
							String time1 = format1.format(time);
							sell.WriteSaleLog(takeout.simple_menus, time1);

						}

					}
				}

				else if (WhatTypeOrder.equals("AdditionalOrder")) {

					boolean available = true;
					int hot = 0;
					int ice = 0;
					int tissue = 0;
					int pacup = 0;
					int plcup = 0;
					int holder = 0;
					int fork = 0;

					if (addorder.menus.size() == 0) {
					} else {

						for (int i = 0; i < addorder.menus.size(); i++) {
							Object obj = null;
							obj = addorder.menus.elementAt(i);
							if (obj instanceof Drink) {
								Drink drink = (Drink) obj;
								if (drink.strTemp.equals("HOT")) {
									if ((stock.hot_straw < drink.count) || (stock.papercup < drink.count)) {
										available = false;
										break;
									} else {
										hot += drink.count;
										pacup += drink.count;
									}
								} else if (drink.strTemp.equals("ICE")) {
									if ((stock.ice_straw < drink.count) || (stock.plasticcup < drink.count)) {
										available = false;
										break;
									} else {
										ice += drink.count;
										plcup += drink.count;
									}
								}
								if ((stock.tissue < drink.count) || (stock.cupholder < drink.count)) {
									available = false;
									break;
								} else {
									tissue += drink.count;
									holder += drink.count;

								}
							}
							if (obj instanceof Dessert) {
								Dessert dessert = (Dessert) obj;
								if ((stock.fork < dessert.count) || (stock.tissue < dessert.count)) {
									available = false;
									break;
								} else {
									fork += dessert.count;
									tissue += dessert.count;
								}
							}
							if (obj instanceof Accessory) {
								Accessory acc = (Accessory) obj;
							}
						}
						if (available == false) {
							JOptionPane aa = new JOptionPane();
							aa.showMessageDialog(null, "Àç°íºÎÁ·À¸·Î ÀÎÇÏ¿© ÁÖ¹®ÀÌ ºÒ°¡´ÉÇÕ´Ï´Ù. ¸ÞÀÎÈ­¸é¿¡¼­ Àç°í¸¦ È®ÀÎÇØÁÖ¼¼¿ä.");
						} else {
							Vector Combine = new Vector();
							Vector SimpleCombine = new Vector();

							Combine = forhere.menus;
							SimpleCombine = forhere.simple_menus;

							for (int i = 0; i < addorder.menus.size(); i++) {
								Object o = addorder.menus.elementAt(i);
								if (o instanceof Drink) {
									Drink drink = (Drink) o;
									int count = 1;
									boolean equal = false;
									int index = 0;
									for (int j = 0; j < Combine.size(); j++) {
										if (Combine.elementAt(j) instanceof Drink) {
											Drink check = (Drink) Combine.elementAt(j);
											if (drink.name.equals(check.name)) {
												if ((drink.WhippingCheck == check.WhippingCheck)
														&& (drink.ShotCheck == check.ShotCheck)
														&& (drink.SyrupCheck == check.SyrupCheck)
														&& (drink.BubbleCheck == check.BubbleCheck)) {
													if ((drink.Hot == check.Hot) || (drink.Ice == check.Ice)) {
														equal = true;
														index = j;
														break;
													}
												}
											}
										}

									}
									if (equal == true) {
										drink = (Drink) Combine.elementAt(index);
										drink.count += ((Drink) o).count;
										drink.eatrate = 100;

									} else {
										Combine.add(drink);
										drink.countset(((Drink) o).count);

									}
								}
								if (o instanceof Dessert) {
									Dessert dessert = (Dessert) o;
									int count = 1;
									boolean equal = false;
									int index = 0;
									for (int j = 0; j < Combine.size(); j++) {
										if (Combine.elementAt(j) instanceof Dessert) {
											Dessert check = (Dessert) Combine.elementAt(j);
											if (dessert.name.equals(check.name)) {
												equal = true;
												index = j;
												break;
											} else {
												equal = false;
											}
										}
									}
									if (equal == true) {
										dessert = (Dessert) Combine.elementAt(index);
										dessert.count += ((Dessert) o).count;
										dessert.eatrate = 100;

									} else {
										dessert.countset(((Dessert) o).count);
										forhere.menus.add(dessert);

									}
								}
								if (o instanceof Accessory) {
									Accessory acc = (Accessory) o;
									int count = 1;
									boolean equal = false;
									int index = 0;
									for (int j = 0; j < Combine.size(); j++) {
										if (Combine.elementAt(j) instanceof Accessory) {
											Accessory check = (Accessory) Combine.elementAt(j);
											if (acc.name.equals(check.name)) {
												equal = true;
												index = j;
												break;
											} else {
												equal = false;
											}

										}
									}
									if (equal == true) {
										acc = (Accessory) Combine.elementAt(index);
										acc.count += ((Accessory) o).count;

									} else {
										acc.countset(((Accessory) o).count);
										Combine.add(acc);

									}

								}

							}

							TempTable.SetTable(Combine);

							for (int i = 0; i < Combine.size(); i++) {
								Object o = Combine.elementAt(i);
								if (o instanceof Drink) {
									Drink drink = (Drink) o;
									addorder.AddSimpleMenus(drink.name, drink.count);
								}
								if (o instanceof Dessert) {
									Dessert des = (Dessert) o;
									addorder.AddSimpleMenus(des.name, des.count);
								}
								if (o instanceof Accessory) {
									Accessory acc = (Accessory) o;
									addorder.AddSimpleMenus(acc.name, acc.count);
								}
							}

							TempTable.SetSimpleTable(addorder.simple_menus);

							Main.PrintSimpleMenu(TableManage.tablenum);
							stock.hot_straw -= hot;
							stock.papercup -= pacup;
							stock.ice_straw -= ice;
							stock.plasticcup -= plcup;
							stock.tissue -= tissue;
							stock.cupholder -= holder;
							stock.fork -= fork;

							SellManage sell = new SellManage();
							SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							Date time = new Date();
							String time1 = format1.format(time);
							sell.WriteSaleLog(addorder.simple_menus, time1);

							EatRate eat1 = new EatRate();
							EatRate eat2 = new EatRate();
							EatRate eat3 = new EatRate();
							EatRate eat4 = new EatRate();
							EatRate eat5 = new EatRate();
							EatRate eat6 = new EatRate();
							EatRate eat7 = new EatRate();
							EatRate eat8 = new EatRate();
							EatRate eat9 = new EatRate();
							EatRate eat10 = new EatRate();
							EatRate eat11 = new EatRate();
							EatRate eat12 = new EatRate();

							if (!(TableManage.ttttt.elementAt(TableManage.tablenum - 1) instanceof CanClass)) {
								if (TableManage.tablenum == 1) {
									Vector eateat = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat1.EatRateSet(eateat);

									Thread thread1 = new Thread(eat1);
									thread1.start();
								} else if (TableManage.tablenum == 2) {
									Vector eateat2 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat2.EatRateSet(eateat2);
									Thread thread2 = new Thread(eat2);
									thread2.start();
								} else if (TableManage.tablenum == 3) {
									Vector eateat3 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat3.EatRateSet(eateat3);
									Thread thread3 = new Thread(eat3);
									thread3.start();
								} else if (TableManage.tablenum == 4) {
									Vector eateat4 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat4.EatRateSet(eateat4);
									Thread thread4 = new Thread(eat4);
									thread4.start();
								} else if (TableManage.tablenum == 5) {
									Vector eateat5 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat5.EatRateSet(eateat5);
									Thread thread5 = new Thread(eat5);
									thread5.start();
								} else if (TableManage.tablenum == 6) {
									Vector eateat6 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat6.EatRateSet(eateat6);
									Thread thread6 = new Thread(eat6);
									thread6.start();
								} else if (TableManage.tablenum == 7) {
									Vector eateat7 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat7.EatRateSet(eateat7);
									Thread thread7 = new Thread(eat7);
									thread7.start();
								} else if (TableManage.tablenum == 8) {
									Vector eateat8 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat8.EatRateSet(eateat8);
									Thread thread8 = new Thread(eat8);
									thread8.start();
								} else if (TableManage.tablenum == 9) {
									Vector eateat9 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat9.EatRateSet(eateat9);
									Thread thread9 = new Thread(eat9);
									thread9.start();
								} else if (TableManage.tablenum == 10) {
									Vector eateat10 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat10.EatRateSet(eateat10);
									Thread thread10 = new Thread(eat10);
									thread10.start();
								} else if (TableManage.tablenum == 11) {
									Vector eateat11 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat11.EatRateSet(eateat11);
									Thread thread11 = new Thread(eat11);
									thread11.start();
								} else if (TableManage.tablenum == 12) {
									Vector eateat12 = (Vector) TableManage.ttttt.elementAt(TableManage.tablenum - 1);
									eat12.EatRateSet(eateat12);
									Thread thread12 = new Thread(eat12);
									thread12.start();
								}
							}

						}

					}

				}
				TableManage m = new TableManage();
				if (m.CheckFullTable() == true) {
					Main.NoOrder();
				}
				dispose();

			}
		});
		order.setForeground(new Color(255, 255, 255));
		order.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.BOLD, 24));
		order.setBackground(new Color(204, 0, 0));
		order.setBounds(14, 475, 173, 91);
		contentPane.add(order);

	}
}
