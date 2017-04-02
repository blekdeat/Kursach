package main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class zakaz extends JPanel {
	
	public JTextField textField;
	public JButton button;

		
		
	public zakaz(){
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		double a=Math.random();
		int b= (int) (a*1000000000);
		String qwe = Integer.toString(b);
		
		JPanel zakaz = new JPanel();
		zakaz.setBounds(0, 0, 684, 662);
		add(zakaz);
		zakaz.setLayout(null);
		
		button = new JButton("\u0417\u0430\u0432\u0435\u0440\u0448\u0435\u043D\u0438\u0435 \u0440\u0430\u0431\u043E\u0442\u044B \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u044B");
		button.setForeground(new Color(165, 42, 42));
		button.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
		button.setBounds(103, 535, 471, 60);
		zakaz.add(button);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		textPane.setBackground(UIManager.getColor("Button.background"));
		textPane.setSelectedTextColor(Color.WHITE);
		textPane.setText("    \u0412\u044B \u0443\u0441\u043F\u0435\u0448\u043D\u043E \u043E\u0444\u043E\u0440\u043C\u0438\u043B\u0438 \u0437\u0430\u043A\u0430\u0437!\r\n      \u0412\u0441\u044F \u0438\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u044F \u043F\u043E\u0441\u0442\u0443\u043F\u0438\u043B\u0430 \r\n                  \u043D\u0430 \u043D\u0430\u0448 \u0441\u0435\u0440\u0432\u0435\u0440.\r\n      \u0417\u0430\u043F\u043E\u043C\u043D\u0438\u0442\u0435 \u0443\u043A\u0430\u0437\u0430\u043D\u043D\u044B\u0439 \u043D\u0438\u0436\u0435 \r\n        \u043A\u043E\u0434, \u043F\u043E \u043D\u0435\u043C\u0443 \u0412\u044B \u0441\u043C\u043E\u0436\u0435\u0442\u0435\r\n   \u0431\u044B\u0441\u0442\u0440\u043E \u043E\u0444\u043E\u0440\u043C\u0438\u0442\u044C \u0432\u044B\u0431\u0440\u0430\u043D\u043D\u044B\u0435 \r\n   \u0442\u043E\u0432\u0430\u0440\u044B \u0438  \u0443\u0441\u043B\u0443\u0433\u0438 \u0432 \u043E\u0442\u0434\u0435\u043B\u0435\u043D\u0438\u044F\u0445\r\n                \u043D\u0430\u0448\u0435\u0433\u043E \u043C\u0430\u0433\u0430\u0437\u0438\u043D\u0430\r\n");
		textPane.setBounds(161, 64, 362, 206);
		zakaz.add(textPane);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.BOLD, 20));
		textField.setBounds(209, 317, 314, 49);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText(qwe);
		zakaz.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\u2116");
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setBounds(161, 314, 31, 49);
		zakaz.add(label);
		
		JLabel label_1 = new JLabel("\u0421\u041F\u0410\u0421\u0418\u0411\u041E!");
		label_1.setForeground(new Color(0, 128, 0));
		label_1.setFont(new Font("Arial", Font.ITALIC, 56));
		label_1.setBounds(188, 389, 298, 116);
		zakaz.add(label_1);
	}

}

