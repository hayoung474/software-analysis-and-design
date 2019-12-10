package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Manage.AdminMenuEdit;
import Manage.manageMember;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField id_input;
	private JPasswordField pw_input;
	
	

	Register register = new Register();
	manageMember manage = new manageMember();	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		
		
		setTitle("\uB85C\uADF8\uC778");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 294);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel mainImage = new JLabel("");
		//mainImage.setIcon(new ImageIcon("C:\\Users\\\uBA4D\uC5B4\uC9C0\\Desktop\\kumgongcha.jpg"));
		mainImage.setIcon(new ImageIcon("kumgongcha.jpg"));
		mainImage.setBounds(14, 32, 200, 190);
		contentPane.add(mainImage);
		
		JLabel id_lb = new JLabel("\uC544\uC774\uB514");
		id_lb.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 20));
		id_lb.setBounds(253, 55, 54, 33);
		contentPane.add(id_lb);
		
		JLabel pw_lb = new JLabel("\uBE44\uBC00\uBC88\uD638");
		pw_lb.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 20));
		pw_lb.setBounds(235, 102, 72, 38);
		contentPane.add(pw_lb);
		
		id_input = new JTextField();
		id_input.setBounds(321, 54, 148, 30);
		contentPane.add(id_input);
		id_input.setColumns(10);
		
		JButton Login = new JButton("\uB85C\uADF8\uC778");
		Login.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 18));
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				try {
					manage.CheckMember(id_input.getText(),pw_input.getText());
					if(manage.successLogin==true) {
						dispose();	
						AdminMenuEdit admin = new AdminMenuEdit();
						admin.SetPerm(manage.LoginedName, manage.LoginedGrade);
						Main main = new Main(manage.LoginedName,manage.LoginedGrade,admin.check);
						main.setVisible(true);
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}
		});
		Login.setForeground(Color.BLACK);
		Login.setBackground(new Color(255, 235, 205));
		Login.setBounds(476, 54, 102, 86);
		contentPane.add(Login);
		
		JButton Register = new JButton("\uD68C\uC6D0\uAC00\uC785\r\n");
		Register.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 18));
		Register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				register.setVisible(true);
				
			}
		});
		Register.setBackground(new Color(233, 150, 122));
		Register.setBounds(228, 164, 168, 58);
		contentPane.add(Register);
		
		pw_input = new JPasswordField();
		pw_input.setBounds(321, 110, 148, 30);
		contentPane.add(pw_input);
		
		JButton Cancel = new JButton("\uC885\uB8CC");
		Cancel.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 18));
		Cancel.setBackground(new Color(233, 150, 122));
		Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		Cancel.setBounds(410, 164, 168, 58);
		contentPane.add(Cancel);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{id_input, pw_input, Login, Register, Cancel, contentPane, mainImage, id_lb, pw_lb}));
		
	}
}
