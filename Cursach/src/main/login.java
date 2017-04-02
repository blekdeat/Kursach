package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import javax.swing.JPanel;

public class login extends JPanel {
	
	public JTextField textField;
	public JTextField textField_1;
	public JButton button;
	public JButton button_1;
	public JButton obozr;
		
	public login() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
	JPanel login = new JPanel();
	login.setBackground(new Color(221, 160, 221));
	login.setBounds(0, 0, 684, 662);
	add(login);
	login.setLayout(null);
	
	//* TELEFON
	JTextPane textPane_1 = new JTextPane();
	textPane_1.setBounds(42, 542, 165, 45);
	login.add(textPane_1);
	textPane_1.setText("  *\u0417\u0430\u0431\u044B\u043B\u0438 \u043B\u043E\u0433\u0438\u043D \u0438\u043B\u0438 \u043F\u0430\u0440\u043E\u043B\u044C?\r\n          \u041F\u043E\u0437\u0432\u043E\u043D\u0438\u0442\u0435 \u0432 \u0441\u043B\u0443\u0436\u0431\u0443 \r\n\u043F\u043E\u0434\u0434\u0435\u0440\u0436\u043A\u0438 \u0442\u0435\u043B. 8-800-300-0550");
	textPane_1.setForeground(new Color(107, 142, 35));
	textPane_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 10));
	textPane_1.setEditable(false);
	//*textPane_1.setDropMode(DropMode.ON);
	textPane_1.setBackground(new Color(221, 160, 221));
	
	//* VVEDITE
	JLabel label_3 = new JLabel("\u0412\u0432\u0435\u0434\u0438\u0442\u0435:");
	label_3.setBounds(130, 267, 63, 15);
	login.add(label_3);
	label_3.setForeground(Color.BLACK);
	label_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
	
	//* VARNING
	JLabel label = new JLabel("\u0412\u043D\u0438\u043C\u0430\u043D\u0438\u0435!");
	label.setBounds(329, 167, 69, 15);
	login.add(label);
	label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
	label.setForeground(Color.RED);
	label.setBackground(Color.LIGHT_GRAY);
	
	//* INSTRUCTIONS
	JTextPane textPane = new JTextPane();
	textPane.setBounds(100, 119, 486, 81);
	login.add(textPane);
	textPane.setEditable(false);
	textPane.setBackground(new Color(221, 160, 221));
	textPane.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
	textPane.setForeground(Color.BLUE);
	//*textPane.setDropMode(DropMode.ON);
	textPane.setText("         \u0417\u0434\u0440\u0430\u0432\u0441\u0442\u0432\u0443\u0439\u0442\u0435, \u0412\u044B \u0432\u043E\u043B\u044C\u0437\u0443\u0435\u0442\u0435\u0441\u044C \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u043E\u0439 \u041C\u0435\u0431\u0435\u043B\u044C\u043D\u044B\u0439\u0420\u0430\u0439, \r\n             \u0434\u043B\u044F \u043F\u0440\u043E\u0434\u043E\u043B\u0436\u0435\u043D\u0438\u044F \u0440\u0430\u0431\u043E\u0442\u044B \u043D\u0435\u043E\u0431\u0445\u043E\u0434\u0438\u043C\u043E \u0432\u043E\u0439\u0442\u0438 \u0432 \u0441\u0438\u0441\u0442\u0435\u043C\u0443.\r\n              \u0415\u0441\u043B\u0438 \u0443 \u0412\u0430\u0441 \u043D\u0435\u0442 \u0443\u0447\u0435\u0442\u043D\u043E\u0439 \u0437\u0430\u043F\u0438\u0441\u0438, \u0437\u0430\u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0438\u0440\u0443\u0439\u0442\u0435\u0441\u044C \u0438\u043B\u0438 \r\n     \u0432\u043E\u0439\u0434\u0438\u0442\u0435 \u043A\u0430\u043A \"\u043E\u0431\u043E\u0437\u0440\u0435\u0432\u0430\u0442\u0435\u043B\u044C\".                     \u0412 \u0440\u0435\u0436\u0438\u043C\u0435 \"\u043E\u0431\u043E\u0437\u0440\u0435\u0432\u0430\u0442\u0435\u043B\u044C\" \r\n               \u043D\u0435\u043B\u044C\u0437\u044F \u043F\u0440\u043E\u0438\u0437\u0432\u0435\u0441\u0442\u0438 \u0437\u0430\u043A\u0430\u0437 \u0438\u043B\u0438 \u043F\u043E\u043B\u0443\u0447\u0438\u0442\u044C \u043A\u043E\u043D\u0441\u0443\u043B\u044C\u0442\u0430\u0446\u0438\u044E.");
	
	//* LOGIN
	textField = new JTextField();
	textField.setBounds(150, 304, 86, 20);
	login.add(textField);
	textField.setColumns(10);
	
	//* PASS
	textField_1 = new JTextField();
	textField_1.setBounds(150, 342, 86, 20);
	login.add(textField_1);
	textField_1.setColumns(10);
	
	//* LOGIN
	JLabel label_1 = new JLabel("\u041B\u043E\u0433\u0438\u043D - ");
	label_1.setBounds(61, 307, 40, 14);
	login.add(label_1);
	label_1.setHorizontalAlignment(SwingConstants.RIGHT);
	label_1.setVerticalAlignment(SwingConstants.BOTTOM);
	
	//* PASS
	JLabel label_2 = new JLabel("\u041F\u0430\u0440\u043E\u043B\u044C - ");
	label_2.setBounds(61, 345, 47, 14);
	login.add(label_2);
	label_2.setHorizontalAlignment(SwingConstants.RIGHT);
	label_2.setVerticalAlignment(SwingConstants.BOTTOM);
	
	//* IN
	button = new JButton("\u0412\u041E\u0419\u0422\u0418");
	button.setBounds(121, 376, 86, 23);
	login.add(button);
	button.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
	button.setForeground(new Color(34, 139, 34));
	button.setBackground(new Color(221, 160, 221));
	
	//* REGISTRATION
	JButton btnNewButton = new JButton("\u0417\u0430\u0440\u0435\u0433\u0435\u0441\u0442\u0440\u0438\u0440\u043E\u0432\u0430\u0442\u044C\u0441\u044F");
	btnNewButton.setBounds(385, 301, 197, 23);
	login.add(btnNewButton);
	btnNewButton.setForeground(new Color(0, 0, 205));
	btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
	btnNewButton.setBackground(new Color(221, 160, 221));
	
	//* OBOZREVATEL
	obozr = new JButton("\u0412\u043E\u0439\u0442\u0438 \u043A\u0430\u043A \u043E\u0431\u043E\u0437\u0440\u0435\u0432\u0430\u0442\u0435\u043B\u044C");
	obozr.setBounds(385, 339, 201, 23);
	login.add(obozr);
	obozr.setForeground(Color.RED);
	obozr.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
	obozr.setBackground(new Color(221, 160, 221));
	
	//* EXIT
	button_1 = new JButton("\u0412\u042B\u0425\u041E\u0414");
	button_1.setBounds(550, 615, 125, 41);
	login.add(button_1);
	button_1.setBackground(new Color(221, 160, 221));
	button_1.setIcon(new ImageIcon(login.class.getResource("/com/sun/java/swing/plaf/windows/icons/Warn.gif")));
	
	
}}
