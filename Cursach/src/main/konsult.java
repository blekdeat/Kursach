package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.UIManager;

public class konsult extends JPanel {
	
	public JButton button;
	
	public konsult() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JPanel konsult = new JPanel();
		add(konsult, BorderLayout.CENTER);
		konsult.setBounds(0, 0, 684, 662);
		add(konsult);
		
				
		JTextPane textPane = new JTextPane();
		textPane.setForeground(new Color(220, 20, 60));
		textPane.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
		textPane.setAlignmentX(5.0f);
		textPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textPane.setEditable(false);
		textPane.setBackground(UIManager.getColor("Button.background"));
		textPane.setText("\u041A \u0441\u043E\u0436\u0430\u043B\u0435\u043D\u0438\u044E, \u0434\u0430\u043D\u043D\u0430\u044F \u0444\u0443\u043D\u043A\u0446\u0438\u044F \r\n\r\n       \u0432\u0440\u0435\u043C\u0435\u043D\u043D\u043E \u043D\u0435\u0434\u043E\u0441\u0442\u0443\u043F\u043D\u0430.\r\n\r\n       \u0415\u0441\u043B\u0438 \u0443 \u0432\u0430\u0441 \u0435\u0441\u0442\u044C \u0432\u043E\u043F\u0440\u043E\u0441,\r\n\r\n      \u043F\u043E\u0437\u0432\u043E\u043D\u0438\u0442\u0435 \u043F\u043E \u0442\u0435\u043B\u0435\u0444\u043E\u043D\u0443:\r\n\r\n                8-800-300-0550\r\n");
		textPane.setBounds(107, 66, 419, 301);
		konsult.add(textPane);
		
		JLabel lblNewLabel = new JLabel("\u2665");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 99));
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setBounds(57, 329, 105, 215);
		konsult.add(lblNewLabel);
		
		JLabel label = new JLabel("\u041F\u0440\u0438\u043D\u043E\u0441\u0438\u043C \u0441\u0432\u043E\u0438 \u0438\u0437\u0432\u0438\u043D\u0435\u043D\u0438\u044F!");
		label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));
		label.setForeground(new Color(107, 142, 35));
		label.setBounds(212, 397, 335, 80);
		konsult.add(label);
		
		
		
		button = new JButton("\u0412\u0415\u0420\u041D\u0423\u0422\u042C\u0421\u042F");
		button.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		button.setBackground(new Color(30, 144, 255));
		button.setForeground(new Color(0, 0, 0));
		button.setBounds(245, 600, 221, 59);
		konsult.add(button);
	}

}
