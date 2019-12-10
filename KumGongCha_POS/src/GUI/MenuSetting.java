package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;

import Order.sell;

import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuSetting extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private final ButtonGroup buttonGroup_6 = new ButtonGroup();
	private final ButtonGroup buttonGroup_7 = new ButtonGroup();
	private final ButtonGroup buttonGroup_8 = new ButtonGroup();
	private final ButtonGroup buttonGroup_9 = new ButtonGroup();
	private final ButtonGroup buttonGroup_10 = new ButtonGroup();
	private final ButtonGroup buttonGroup_11 = new ButtonGroup();
	private final ButtonGroup buttonGroup_12 = new ButtonGroup();
	private final ButtonGroup buttonGroup_13 = new ButtonGroup();
	private final ButtonGroup buttonGroup_14 = new ButtonGroup();
	private final ButtonGroup buttonGroup_15 = new ButtonGroup();
	private final ButtonGroup buttonGroup_16 = new ButtonGroup();
	private final ButtonGroup buttonGroup_17 = new ButtonGroup();
	private final ButtonGroup buttonGroup_18 = new ButtonGroup();
	private final ButtonGroup buttonGroup_19 = new ButtonGroup();
	private final ButtonGroup buttonGroup_20 = new ButtonGroup();
	private final ButtonGroup buttonGroup_21 = new ButtonGroup();
	private final ButtonGroup buttonGroup_22 = new ButtonGroup();
	private final ButtonGroup buttonGroup_23 = new ButtonGroup();
	private final ButtonGroup buttonGroup_24 = new ButtonGroup();
	private final ButtonGroup buttonGroup_25 = new ButtonGroup();
	private final ButtonGroup buttonGroup_26 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuSetting frame = new MenuSetting();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public MenuSetting() {
		setTitle("\uBA54\uB274\uAD00\uB9AC");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 324, 514);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\uC801\uC6A9");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.BOLD, 20));
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(204, 0, 0));
		button.setBounds(107, 419, 93, 36);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("\uBA54\uB274\uAD00\uB9AC");
		lblNewLabel.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.BOLD, 23));
		lblNewLabel.setBounds(116, 17, 84, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("\u2665");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setBackground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(94, 22, 20, 18);
		contentPane.add(lblNewLabel_2);
		
		JLabel label_26 = new JLabel("\u2665");
		label_26.setForeground(Color.RED);
		label_26.setFont(new Font("±¼¸²", Font.PLAIN, 19));
		label_26.setBackground(Color.RED);
		label_26.setBounds(205, 22, 20, 18);
		contentPane.add(label_26);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(14, 58, 281, 347);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("\uC74C\uB8CC", null, panel, null);
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uC544\uBA54\uB9AC\uCE74\uB178");
		lblNewLabel_1.setBounds(30, 31, 70, 18);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("\uCE74\uD398\uB77C\uB5BC");
		label.setBounds(44, 62, 56, 18);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\uBE14\uB799\uBC00\uD06C\uD2F0");
		label_1.setBounds(30, 92, 70, 18);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\uB9DD\uACE0\uC2A4\uBB34\uB514");
		label_2.setBounds(30, 122, 70, 18);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\uC6B0\uB871\uD2F0");
		label_3.setBounds(58, 152, 42, 18);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("\uCD08\uCF54\uC2A4\uBB34\uB514");
		label_4.setBounds(30, 182, 70, 18);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("\uB538\uAE30\uB77C\uB5BC");
		label_5.setBounds(44, 212, 56, 18);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("\uD751\uB2F9\uB77C\uB5BC");
		label_6.setBounds(44, 242, 56, 18);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("\uCCAD\uD3EC\uB3C4\uC5D0\uC774\uB4DC");
		label_7.setBounds(16, 272, 84, 18);
		panel.add(label_7);
		
		JRadioButton ameyes = new JRadioButton("\uD310\uB9E4");
		if(sell.americano==true) {
			ameyes.setSelected(true);
		}
		ameyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					sell.americano=true;

				}		    	
				else {
					 sell.americano=false;
				
				}
				
			}
		});
		ameyes.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		buttonGroup.add(ameyes);
		ameyes.setBackground(new Color(255, 255, 255));
		ameyes.setBounds(120, 27, 64, 27);
		panel.add(ameyes);
		
		
		
		JRadioButton ameno = new JRadioButton("\uBBF8\uD310\uB9E4");
		if(sell.americano==false) {
			ameno.setSelected(true);
		}
		ameno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.americano=false;
				}		    	
				else {
					 sell.americano=true;
				}	
			}
		});
		buttonGroup.add(ameno);
		ameno.setBackground(new Color(255, 255, 255));
		ameno.setBounds(190, 27, 76, 27);
		panel.add(ameno);
		
		
		JRadioButton cateyes = new JRadioButton("\uD310\uB9E4");
		if(sell.caffelatte==true) {
			cateyes.setSelected(true);
		}
		cateyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.caffelatte=true;
				}		    	
				else {
					sell.caffelatte=false;
				}
			}
		});
		buttonGroup_1.add(cateyes);
		cateyes.setBackground(Color.WHITE);
		cateyes.setBounds(120, 58, 64, 27);
		panel.add(cateyes);
		
		JRadioButton cateno = new JRadioButton("\uBBF8\uD310\uB9E4");
		if(sell.caffelatte==false) {
			cateno.setSelected(true);
		}
		cateno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.caffelatte=false;
				}		    	
				else {
					sell.caffelatte=true;
				}
			}
		});
		buttonGroup_1.add(cateno);
		cateno.setBackground(Color.WHITE);
		cateno.setBounds(190, 58, 76, 27);
		panel.add(cateno);
		
		JRadioButton milkyes = new JRadioButton("\uD310\uB9E4");
		if(sell.blackmilktea==true) {
			milkyes.setSelected(true);
		}
		milkyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.blackmilktea=true;
				}		    	
				else {
					sell.blackmilktea=false;
				}
			}
		});
		buttonGroup_2.add(milkyes);
		milkyes.setBackground(Color.WHITE);
		milkyes.setBounds(120, 88, 64, 27);
		panel.add(milkyes);
		
		JRadioButton milkno = new JRadioButton("\uBBF8\uD310\uB9E4");
		if(sell.blackmilktea==false) {
			milkno.setSelected(true);
		}
		milkno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.blackmilktea=false;
				}		    	
				else {
					sell.blackmilktea=true;
				}
			}
		});
		buttonGroup_2.add(milkno);
		milkno.setBackground(Color.WHITE);
		milkno.setBounds(190, 88, 76, 27);
		panel.add(milkno);
		
		
		JRadioButton mangoyes = new JRadioButton("\uD310\uB9E4");
		if(sell.mangosmoodie==true) {
			mangoyes.setSelected(true);
		}
		mangoyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.mangosmoodie=true;
				}		    	
				else {
					sell.mangosmoodie=false;
				}
			}
		});
		buttonGroup_3.add(mangoyes);
		mangoyes.setBackground(Color.WHITE);
		mangoyes.setBounds(120, 118, 64, 27);
		panel.add(mangoyes);
		
		JRadioButton mangono = new JRadioButton("\uBBF8\uD310\uB9E4");
		if(sell.mangosmoodie==false) {
			mangono.setSelected(true);
		}
		mangono.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.mangosmoodie=false;
				}		    	
				else {
					sell.mangosmoodie=true;
				}
			}
		});
		buttonGroup_3.add(mangono);
		mangono.setBackground(Color.WHITE);
		mangono.setBounds(190, 118, 76, 27);
		panel.add(mangono);
		
		JRadioButton teayes = new JRadioButton("\uD310\uB9E4");
		if(sell.tea==true) {
			teayes.setSelected(true);
		}
		teayes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.tea=true;
				}		    	
				else {
					sell.tea=false;
				}
			}
		});
		buttonGroup_4.add(teayes);
		teayes.setBackground(Color.WHITE);
		teayes.setBounds(120, 148, 64, 27);
		panel.add(teayes);
		
		JRadioButton teano = new JRadioButton("\uBBF8\uD310\uB9E4");
		if(sell.tea==false) {
			teano.setSelected(true);
		}
		teano.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.tea=false;
				}		    	
				else {
					sell.tea=true;
				}
			}
		});
		buttonGroup_4.add(teano);
		teano.setBackground(Color.WHITE);
		teano.setBounds(190, 148, 76, 27);
		panel.add(teano);
		
		JRadioButton chocoyes = new JRadioButton("\uD310\uB9E4");
		if(sell.chocosmoodie==true) {
			chocoyes.setSelected(true);
		}
		chocoyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.chocosmoodie=true;
				}		    	
				else {
					sell.chocosmoodie=false;
				}
			}
		});
		buttonGroup_5.add(chocoyes);
		chocoyes.setBackground(Color.WHITE);
		chocoyes.setBounds(120, 178, 64, 27);
		panel.add(chocoyes);
		
		JRadioButton chocono = new JRadioButton("\uBBF8\uD310\uB9E4");
		if(sell.chocosmoodie==false) {
			chocono.setSelected(true);
		}
	
		chocono.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.chocosmoodie=false;
				}		    	
				else {
					sell.chocosmoodie=true;
				}
			}
		});
		buttonGroup_5.add(chocono);
		chocono.setBackground(Color.WHITE);
		chocono.setBounds(190, 178, 76, 27);
		panel.add(chocono);
		
		JRadioButton strawyes = new JRadioButton("\uD310\uB9E4");
		if(sell.strawberrylatte==true) {
			strawyes.setSelected(true);
		}
		strawyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.strawberrylatte=true;
				}		    	
				else {
					sell.strawberrylatte=false;
				}
			}
		});
		buttonGroup_6.add(strawyes);
		strawyes.setBackground(Color.WHITE);
		strawyes.setBounds(120, 208, 64, 27);
		panel.add(strawyes);
		
		JRadioButton strawno = new JRadioButton("\uBBF8\uD310\uB9E4");
		if(sell.strawberrylatte==false) {
			strawno .setSelected(true);
		}
		strawno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.strawberrylatte=false;
				}		    	
				else {
					sell.strawberrylatte=true;
				}
			
			}
		});
		buttonGroup_6.add(strawno);
		strawno.setBackground(Color.WHITE);
		strawno.setBounds(190, 208, 76, 27);
		panel.add(strawno);
		
		JRadioButton blackyes = new JRadioButton("\uD310\uB9E4");
		if(sell.blacksugarlatte==true) {
			blackyes .setSelected(true);
		}
		blackyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.blacksugarlatte=true;
					 
				}		    	
				else {
					sell.blacksugarlatte=false;
				}
			}
		});
		buttonGroup_7.add(blackyes);
		blackyes.setBackground(Color.WHITE);
		blackyes.setBounds(120, 238, 64, 27);
		panel.add(blackyes);
		
		JRadioButton blackno = new JRadioButton("\uBBF8\uD310\uB9E4");
		if(sell.blacksugarlatte==false) {
			blackno .setSelected(true);
		}
		blackno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.blacksugarlatte=false;
				}		    	
				else {
					sell.blacksugarlatte=true;
				}
				
			}
		});
		buttonGroup_7.add(blackno);
		blackno.setBackground(Color.WHITE);
		blackno.setBounds(190, 238, 76, 27);
		panel.add(blackno);
		
		JRadioButton adeyes = new JRadioButton("\uD310\uB9E4");
		if(sell.grapeade==true) {
			adeyes.setSelected(true);
		}
		adeyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.grapeade=true;
				}		    	
				else {
					sell.grapeade=false;
				}
			}
		});
		buttonGroup_8.add(adeyes);
		adeyes.setBackground(Color.WHITE);
		adeyes.setBounds(120, 268, 64, 27);
		panel.add(adeyes);
		
		JRadioButton adeno = new JRadioButton("\uBBF8\uD310\uB9E4");
		if(sell.grapeade==false) {
			adeno.setSelected(true);
		}
		adeno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.grapeade=false;
				}		    	
				else {
					sell.grapeade=true;
				}
				
			}
		});
		buttonGroup_8.add(adeno);
		adeno.setBackground(Color.WHITE);
		adeno.setBounds(190, 268, 76, 27);
		panel.add(adeno);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(Color.WHITE);
		tabbedPane.addTab("\uB514\uC800\uD2B8", null, panel_1, null);
		
		JLabel label_8 = new JLabel("\uCD08\uCF54\uCF00\uC774\uD06C");
		label_8.setBounds(30, 31, 70, 18);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("\uD2F0\uB77C\uBBF8\uC218");
		label_9.setBounds(44, 62, 56, 18);
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel("\uD5C8\uB2C8\uBE0C\uB808\uB4DC");
		label_10.setBounds(30, 92, 70, 18);
		panel_1.add(label_10);
		
		JLabel label_11 = new JLabel("\uCEE4\uD53C\uBC88");
		label_11.setBounds(58, 122, 42, 18);
		panel_1.add(label_11);
		
		JLabel label_12 = new JLabel("\uCE58\uC988\uCF00\uC774\uD06C");
		label_12.setBounds(30, 152, 70, 18);
		panel_1.add(label_12);
		
		JLabel label_13 = new JLabel("\uB538\uAE30\uD0C0\uB974\uD2B8");
		label_13.setBounds(30, 182, 70, 18);
		panel_1.add(label_13);
		
		JLabel label_14 = new JLabel("\uC0AC\uACFC\uC7BC\uC640\uD50C");
		label_14.setBounds(30, 212, 70, 18);
		panel_1.add(label_14);
		
		JLabel label_15 = new JLabel("\uD06C\uB808\uD398");
		label_15.setBounds(58, 242, 42, 18);
		panel_1.add(label_15);
		
		JLabel label_16 = new JLabel("\uCD08\uCF54\uCFE0\uD0A4");
		label_16.setBounds(44, 272, 56, 18);
		panel_1.add(label_16);
		
		JRadioButton chococakeyes = new JRadioButton("\uD310\uB9E4");
		if(sell.chococake==true) {
			chococakeyes.setSelected(true);
		}
		chococakeyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.chococake=true;
				}		    	
				else {
					sell.chococake=false;
				}
				
				
			}
		});
		
		buttonGroup_9.add(chococakeyes);
		chococakeyes.setBackground(Color.WHITE);
		chococakeyes.setBounds(120, 27, 64, 27);
		panel_1.add(chococakeyes);
		
		JRadioButton chococakeno = new JRadioButton("\uBBF8\uD310\uB9E4");
		if(sell.chococake==false) {
			chococakeno.setSelected(true);
		}
		chococakeno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.chococake=false;
				}		    	
				else {
					sell.chococake=true;
				}
				
			}
		});
		buttonGroup_9.add(chococakeno);
		chococakeno.setBackground(Color.WHITE);
		chococakeno.setBounds(190, 27, 76, 27);
		panel_1.add(chococakeno);
		
		JRadioButton tirayes = new JRadioButton("\uD310\uB9E4");
		if(sell.tiramisu==true) {
			tirayes.setSelected(true);
		}
		tirayes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.tiramisu=true;
				}		    	
				else {
					sell.tiramisu=false;
				}
				
			}
		});
		buttonGroup_10.add(tirayes);
		tirayes.setBackground(Color.WHITE);
		tirayes.setBounds(120, 58, 64, 27);
		panel_1.add(tirayes);
		
		JRadioButton tirano = new JRadioButton("\uBBF8\uD310\uB9E4");
		if(sell.tiramisu==false) {
			tirano.setSelected(true);
		}
		tirano.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.tiramisu=false;
				}		    	
				else {
					sell.tiramisu=true;
				}
				
			}
		});
		buttonGroup_10.add(tirano);
		tirano.setBackground(Color.WHITE);
		tirano.setBounds(190, 58, 76, 27);
		panel_1.add(tirano);
		
		JRadioButton honeyyes = new JRadioButton("\uD310\uB9E4");
		if(sell.honeybread==true) {
			honeyyes.setSelected(true);
		}
		honeyyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.honeybread=true;
				}		    	
				else {
					sell.honeybread=false;
				}
				
			}
		});

		buttonGroup_11.add(honeyyes);
		honeyyes.setBackground(Color.WHITE);
		honeyyes.setBounds(120, 88, 64, 27);
		panel_1.add(honeyyes);
		
		JRadioButton honeyno = new JRadioButton("\uBBF8\uD310\uB9E4");
		if(sell.honeybread==false) {
			honeyno.setSelected(true);
		}
		honeyno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.honeybread=false;
				}		    	
				else {
					sell.honeybread=true;
				}
				
			}
		});
		buttonGroup_11.add(honeyno);
		honeyno.setBackground(Color.WHITE);
		honeyno.setBounds(190, 88, 76, 27);
		panel_1.add(honeyno);
		
		JRadioButton burnyes = new JRadioButton("\uD310\uB9E4");
		if(sell.coffeeburn==true) {
			burnyes.setSelected(true);
		}
		burnyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.coffeeburn=true;
				}		    	
				else {
					sell.coffeeburn=false;
				}
				
			}
		});

		buttonGroup_12.add(burnyes);
		burnyes.setBackground(Color.WHITE);
		burnyes.setBounds(120, 118, 64, 27);
		panel_1.add(burnyes);
		
		JRadioButton burnno = new JRadioButton("\uBBF8\uD310\uB9E4");
		if(sell.coffeeburn==false) {
			burnno.setSelected(true);
		}
		burnno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.coffeeburn=false;
				}		    	
				else {
					sell.coffeeburn=true;
				}
				
			}
		});
		buttonGroup_12.add(burnno);
		burnno.setBackground(Color.WHITE);
		burnno.setBounds(190, 118, 76, 27);
		panel_1.add(burnno);
		
		JRadioButton cheeseyes = new JRadioButton("\uD310\uB9E4");
		if(sell.cheesecake==true) {
			cheeseyes.setSelected(true);
		}
		cheeseyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.cheesecake=true;
				}		    	
				else {
					sell.cheesecake=false;
				}
				
			}
		});

		buttonGroup_13.add(cheeseyes);
		cheeseyes.setBackground(Color.WHITE);
		cheeseyes.setBounds(120, 148, 64, 27);
		panel_1.add(cheeseyes);
		
		JRadioButton cheeseno = new JRadioButton("\uBBF8\uD310\uB9E4");
		if(sell.cheesecake==false) {
			cheeseno.setSelected(true);
		}
		cheeseno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.cheesecake=false;
				}		    	
				else {
					sell.cheesecake=true;
				}
				
			}
		});
		buttonGroup_13.add(cheeseno);
		cheeseno.setBackground(Color.WHITE);
		cheeseno.setBounds(190, 148, 76, 27);
		panel_1.add(cheeseno);
		
		JRadioButton tarteyes = new JRadioButton("\uD310\uB9E4");
		if(sell.tarte==true) {
			tarteyes.setSelected(true);
		}
		tarteyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.tarte=true;
				}		    	
				else {
					sell.tarte=false;
				}
				
			}
		});

		buttonGroup_14.add(tarteyes);
		tarteyes.setBackground(Color.WHITE);
		tarteyes.setBounds(120, 178, 64, 27);
		panel_1.add(tarteyes);
		
		JRadioButton tarteno = new JRadioButton("\uBBF8\uD310\uB9E4");
		if(sell.tarte==false) {
			tarteno.setSelected(true);
		}
		tarteno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.tarte=false;
				}		    	
				else {
					sell.tarte=true;
				}
				
			}
		});
		buttonGroup_14.add(tarteno);
		tarteno.setBackground(Color.WHITE);
		tarteno.setBounds(190, 178, 76, 27);
		panel_1.add(tarteno);
		
		JRadioButton waffleyes = new JRadioButton("\uD310\uB9E4");
		if(sell.waffle==true) {
			waffleyes.setSelected(true);
		}
		waffleyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.waffle=true;
				}		    	
				else {
					sell.waffle=false;
				}
				
			}
		});
	
		buttonGroup_15.add(waffleyes);
		waffleyes.setBackground(Color.WHITE);
		waffleyes.setBounds(120, 208, 64, 27);
		panel_1.add(waffleyes);
		
		JRadioButton waffleno = new JRadioButton("\uBBF8\uD310\uB9E4");
		if(sell.waffle==false) {
			waffleno.setSelected(true);
		}
		waffleno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.waffle=false;
				}		    	
				else {
					sell.waffle=true;
				}
				
			}
		});
		buttonGroup_15.add(waffleno);
		waffleno.setBackground(Color.WHITE);
		waffleno.setBounds(190, 208, 76, 27);
		panel_1.add(waffleno);
		
		JRadioButton crepeyes = new JRadioButton("\uD310\uB9E4");
		if(sell.crepe==true) {
			crepeyes.setSelected(true);
		}
		crepeyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.crepe=true;
				}		    	
				else {
					sell.crepe=false;
				}
				
			}
		});
	
		buttonGroup_16.add(crepeyes);
		crepeyes.setBackground(Color.WHITE);
		crepeyes.setBounds(120, 238, 64, 27);
		panel_1.add(crepeyes);
		
		JRadioButton crepeno = new JRadioButton("\uBBF8\uD310\uB9E4");
		if(sell.crepe==false) {
			crepeno.setSelected(true);
		}
		crepeno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.crepe=false;
				}		    	
				else {
					sell.crepe=true;
				}
				
			}
			
		});
		buttonGroup_16.add(crepeno);
		crepeno.setBackground(Color.WHITE);
		crepeno.setBounds(190, 238, 76, 27);
		panel_1.add(crepeno);
		
		JRadioButton cookieyes = new JRadioButton("\uD310\uB9E4");
		if(sell.cookie==true) {
			cookieyes.setSelected(true);
		}
		cookieyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.cookie=true;
				}		    	
				else {
					sell.cookie=false;
				}
				
			}
		});
	
		buttonGroup_17.add(cookieyes);
		cookieyes.setBackground(Color.WHITE);
		cookieyes.setBounds(120, 268, 64, 27);
		panel_1.add(cookieyes);
		
		JRadioButton cookieno = new JRadioButton("\uBBF8\uD310\uB9E4");
		if(sell.cookie==false) {
			cookieno.setSelected(true);
		}
		cookieno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.cookie=false;
				}		    	
				else {
					sell.cookie=true;
				}
				
			}
		});
		buttonGroup_17.add(cookieno);
		cookieno.setBackground(Color.WHITE);
		cookieno.setBounds(190, 268, 76, 27);
		panel_1.add(cookieno);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(Color.WHITE);
		tabbedPane.addTab("\uC545\uC138\uC0AC\uB9AC", null, panel_2, null);
		
		JLabel label_17 = new JLabel("2020\uB2E4\uC774\uC5B4\uB9AC");
		label_17.setBounds(12, 31, 88, 18);
		panel_2.add(label_17);
		
		JLabel label_18 = new JLabel("\uD140\uBE14\uB7EC");
		label_18.setBounds(58, 62, 42, 18);
		panel_2.add(label_18);
		
		JLabel label_19 = new JLabel("\uD55C\uC815\uD310\uB178\uD2B8");
		label_19.setBounds(30, 92, 70, 18);
		panel_2.add(label_19);
		
		JLabel label_20 = new JLabel("\uCEE4\uD53C\uCF69");
		label_20.setBounds(58, 122, 42, 18);
		panel_2.add(label_20);
		
		JLabel label_21 = new JLabel("\uBE48\uD2F0\uC9C0\uC720\uB9AC\uCEF5");
		label_21.setBounds(16, 152, 84, 18);
		panel_2.add(label_21);
		
		JLabel label_22 = new JLabel("\uC720\uB9AC\uC2A4\uD2B8\uB85C\uC6B0");
		label_22.setBounds(16, 182, 84, 18);
		panel_2.add(label_22);
		
		JLabel label_23 = new JLabel("\uBA64\uBC84\uC2ED\uCE74\uB4DC");
		label_23.setBounds(30, 212, 70, 18);
		panel_2.add(label_23);
		
		JLabel label_24 = new JLabel("\uCEE4\uD53C\uCF69\uC2A4\uD53C\uCEE4");
		label_24.setBounds(16, 242, 84, 18);
		panel_2.add(label_24);
		
		JLabel label_25 = new JLabel("\uBA38\uADF8\uCEF5");
		label_25.setBounds(58, 272, 42, 18);
		panel_2.add(label_25);
		
		JRadioButton diaryyes = new JRadioButton("\uD310\uB9E4");
		diaryyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.diary=true;
				}		    	
				else {
					sell.diary=false;
				}
			}
		});
		buttonGroup_18.add(diaryyes);
		diaryyes.setBackground(Color.WHITE);
		diaryyes.setBounds(120, 27, 64, 27);
		panel_2.add(diaryyes);
		
		JRadioButton diaryno = new JRadioButton("\uBBF8\uD310\uB9E4");
		diaryno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.diary=false;
				}		    	
				else {
					sell.diary=true;
				}
			}
		});
		buttonGroup_18.add(diaryno);
		diaryno.setBackground(Color.WHITE);
		diaryno.setBounds(190, 27, 76, 27);
		panel_2.add(diaryno);
		
		JRadioButton tumyes = new JRadioButton("\uD310\uB9E4");
		tumyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.tumblr=true;
				}		    	
				else {
					sell.tumblr=false;
				}
			}
		});
		buttonGroup_19.add(tumyes);
		tumyes.setBackground(Color.WHITE);
		tumyes.setBounds(120, 58, 64, 27);
		panel_2.add(tumyes);
		
		JRadioButton tumno = new JRadioButton("\uBBF8\uD310\uB9E4");
		tumno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.tumblr=false;
				}		    	
				else {
					sell.tumblr=true;
				}
			}
		});
		buttonGroup_19.add(tumno);
		tumno.setBackground(Color.WHITE);
		tumno.setBounds(190, 58, 76, 27);
		panel_2.add(tumno);
		
		JRadioButton noteyes = new JRadioButton("\uD310\uB9E4");
		noteyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.note=true;
				}		    	
				else {
					sell.note=false;
				}
			}
		});
		buttonGroup_20.add(noteyes);
		noteyes.setBackground(Color.WHITE);
		noteyes.setBounds(120, 88, 64, 27);
		panel_2.add(noteyes);
		
		JRadioButton noteno = new JRadioButton("\uBBF8\uD310\uB9E4");
		noteno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.note=false;
				}		    	
				else {
					sell.note=true;
				}
			}
		});
		buttonGroup_20.add(noteno);
		noteno.setBackground(Color.WHITE);
		noteno.setBounds(190, 88, 76, 27);
		panel_2.add(noteno);
		
		JRadioButton beanyes = new JRadioButton("\uD310\uB9E4");
		beanyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.coffeebean=true;
				}		    	
				else {
					sell.coffeebean=false;
				}
			}
		});
		buttonGroup_21.add(beanyes);
		beanyes.setBackground(Color.WHITE);
		beanyes.setBounds(120, 118, 64, 27);
		panel_2.add(beanyes);
		
		JRadioButton beanno = new JRadioButton("\uBBF8\uD310\uB9E4");
		beanno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.coffeebean=false;
				}		    	
				else {
					sell.coffeebean=true;
				}
			}
		});
		buttonGroup_21.add(beanno);
		beanno.setBackground(Color.WHITE);
		beanno.setBounds(190, 118, 76, 27);
		panel_2.add(beanno);
		
		JRadioButton glassyes = new JRadioButton("\uD310\uB9E4");
		glassyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.glass=true;
				}		    	
				else {
					sell.glass=false;
				}
			}
		});
		buttonGroup_22.add(glassyes);
		glassyes.setBackground(Color.WHITE);
		glassyes.setBounds(120, 148, 64, 27);
		panel_2.add(glassyes);
		
		JRadioButton glassno = new JRadioButton("\uBBF8\uD310\uB9E4");
		glassno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.glass=false;
				}		    	
				else {
					sell.glass=true;
				}
			}
		});
		buttonGroup_22.add(glassno);
		glassno.setBackground(Color.WHITE);
		glassno.setBounds(190, 148, 76, 27);
		panel_2.add(glassno);
		
		JRadioButton glassstrawyes = new JRadioButton("\uD310\uB9E4");
		glassstrawyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.glassstraw=true;
				}		    	
				else {
					sell.glassstraw=false;
				}
			}
		});
		buttonGroup_23.add(glassstrawyes);
		glassstrawyes.setBackground(Color.WHITE);
		glassstrawyes.setBounds(120, 178, 64, 27);
		panel_2.add(glassstrawyes);
		
		JRadioButton glassstrawno = new JRadioButton("\uBBF8\uD310\uB9E4");
		glassstrawno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.glassstraw=false;
				}		    	
				else {
					sell.glassstraw=true;
				}
			}
		});
		buttonGroup_23.add(glassstrawno);
		glassstrawno.setBackground(Color.WHITE);
		glassstrawno.setBounds(190, 178, 76, 27);
		panel_2.add(glassstrawno);
		
		JRadioButton cardyes = new JRadioButton("\uD310\uB9E4");
		cardyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.card=true;
				}		    	
				else {
					sell.card=false;
				}
			}
		});
		buttonGroup_24.add(cardyes);
		cardyes.setBackground(Color.WHITE);
		cardyes.setBounds(120, 208, 64, 27);
		panel_2.add(cardyes);
		
		JRadioButton cardno = new JRadioButton("\uBBF8\uD310\uB9E4");
		cardno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.card=false;
				}		    	
				else {
					sell.card=true;
				}
			}
		});
		buttonGroup_24.add(cardno);
		cardno.setBackground(Color.WHITE);
		cardno.setBounds(190, 208, 76, 27);
		panel_2.add(cardno);
		
		JRadioButton speakeryes = new JRadioButton("\uD310\uB9E4");
		speakeryes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.speaker=true;
				}		    	
				else {
					sell.speaker=false;
				}
			}
		});

		buttonGroup_25.add(speakeryes);
		speakeryes.setBackground(Color.WHITE);
		speakeryes.setBounds(120, 238, 64, 27);
		panel_2.add(speakeryes);
		
		JRadioButton speakerno = new JRadioButton("\uBBF8\uD310\uB9E4");
		speakerno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.speaker=false;
				}		    	
				else {
					sell.speaker=true;
				}
			}
		});
		buttonGroup_25.add(speakerno);
		speakerno.setBackground(Color.WHITE);
		speakerno.setBounds(190, 238, 76, 27);
		panel_2.add(speakerno);
		
		JRadioButton mugyes = new JRadioButton("\uD310\uB9E4");
		mugyes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.mug=true;
				}		    	
				else {
					sell.mug=false;
				}
			}
		});
		buttonGroup_26.add(mugyes);
		mugyes.setBackground(Color.WHITE);
		mugyes.setBounds(120, 268, 64, 27);
		panel_2.add(mugyes);
		
		JRadioButton mugno = new JRadioButton("\uBBF8\uD310\uB9E4");
		mugno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					 sell.mug=false;
				}		    	
				else {
					sell.mug=true;
				}
			}
		});
		buttonGroup_26.add(mugno);
		mugno.setBackground(Color.WHITE);
		mugno.setBounds(190, 268, 76, 27);
		panel_2.add(mugno);
	}
}
