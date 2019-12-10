package GUI;

import Manage.manageMember;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;


public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField idid;
	private JTextField pwpw;
	private JTextField nmnm;
	public String personID;
	public String personPW;
	public String personName;
	public String personGrade;
	
	manageMember man = new manageMember();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Register() {
		setTitle("\uD68C\uC6D0\uAC00\uC785");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 496);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb1 = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lb1.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 25));
		lb1.setBounds(114, 23, 96, 29);
		contentPane.add(lb1);
		
		JPanel pn1 = new JPanel();
		pn1.setBackground(SystemColor.text);
		pn1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pn1.setBounds(14, 74, 296, 135);
		contentPane.add(pn1);
		pn1.setLayout(null);
		
		JLabel label = new JLabel("\uC544\uC774\uB514");
		label.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 20));
		label.setBounds(47, 37, 54, 18);
		pn1.add(label);
		
		JLabel label_1 = new JLabel("\uBE44\uBC00\uBC88\uD638\r\n");
		label_1.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 20));
		label_1.setBounds(29, 87, 72, 18);
		pn1.add(label_1);
		
		idid = new JTextField();
		idid.setBounds(115, 31, 154, 30);
		pn1.add(idid);
		idid.setColumns(10);
		
		pwpw = new JTextField();
		pwpw.setColumns(10);
		pwpw.setBounds(115, 82, 154, 30);
		pn1.add(pwpw);
		
		JPanel pn2 = new JPanel();
		pn2.setBackground(SystemColor.text);
		pn2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pn2.setBounds(14, 221, 296, 150);
		contentPane.add(pn2);
		pn2.setLayout(null);
		
		JLabel label_2 = new JLabel("\uC774\uB984");
		label_2.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 20));
		label_2.setBounds(50, 44, 36, 18);
		pn2.add(label_2);
		
		nmnm = new JTextField();
		nmnm.setColumns(10);
		nmnm.setBounds(100, 38, 154, 30);
		pn2.add(nmnm);
		
		JLabel label_3 = new JLabel("\uC9C1\uAE09");
		label_3.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 20));
		label_3.setBounds(50, 95, 36, 18);
		pn2.add(label_3);
		
		JComboBox grade = new JComboBox();
		grade.setBackground(new Color(255, 218, 185));
		grade.setModel(new DefaultComboBoxModel(new String[] {"\uC0AC\uC7A5", "\uC815\uC9C1\uC6D0", "\uC544\uB974\uBC14\uC774\uD2B8"}));
		grade.setToolTipText("");
		grade.setBounds(100, 89, 154, 30);
		pn2.add(grade);
		
		JButton Register = new JButton("\uD68C\uC6D0\uAC00\uC785");
		Register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				int result=JOptionPane.showConfirmDialog(null, "¼º°øÀûÀ¸·Î È¸¿ø°¡ÀÔ ¿Ï·á µÇ¼Ì½À´Ï´Ù!", "¼º°ø", YES_NO_OPTION);
				if(result==YES_OPTION) {
					personID = idid.getText();
					personPW = pwpw.getText();
					personName = nmnm.getText();
					personGrade=(String) grade.getSelectedItem();
					man.AddMember(personID, personPW, personName, personGrade);
					dispose();
				}
				
			}
		});
		Register.setBackground(new Color(255, 218, 185));
		Register.setForeground(SystemColor.desktop);
		Register.setBounds(24, 383, 125, 54);
		contentPane.add(Register);
		
		JButton close = new JButton("\uCDE8\uC18C");
		close.setBackground(new Color(255, 218, 185));
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		close.setBounds(174, 383, 125, 54);
		contentPane.add(close);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{idid, pwpw, nmnm, grade, Register, close, contentPane, lb1, pn1, label, label_1, pn2, label_2, label_3}));
	}
}
