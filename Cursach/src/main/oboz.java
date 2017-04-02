package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class oboz extends JPanel {

	public JTextField textField;
	public JLabel label_1;
	public JButton btnNewButton;
	public JButton button_1;
	
	public oboz() {
	
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		JPanel oboz = new JPanel();
		oboz.setBounds(0, 0, 684, 662);
		add(oboz);
		oboz.setLayout(null);
	
		JButton button = new JButton("\u041C\u0433\u043D\u043E\u0432\u0435\u043D\u043D\u0430\u044F \u043A\u043E\u043D\u0441\u0443\u043B\u044C\u0442\u0430\u0446\u0438\u044F");
		button.setBounds(19, 10, 208, 23);
		button.setEnabled(false);
		oboz.add(button);
		button.setFont(new Font("Arial", Font.ITALIC, 11));
		button.setForeground(new Color(0, 0, 255));
	
		JLabel label = new JLabel("\u0412 \u0432\u043E\u0448\u043B\u0438 \u043A\u0430\u043A: ");
		label.setBounds(344, 12, 90, 15);
		oboz.add(label);
		label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		label.setForeground(new Color(0, 128, 0));
	
		label_1 = new JLabel("");
		label_1.setBounds(449, 10, 124, 17);
		oboz.add(label_1);
		label_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnNewButton = new JButton("\u0412\u044B\u0439\u0442\u0438");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		}
		});
		btnNewButton.setBounds(583, 9, 88, 23);
		oboz.add(btnNewButton);
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 13));
	
	
	
		JButton button_7 = new JButton("\u0421\u043E\u0437\u0434\u0430\u0442\u044C \u0437\u0430\u043A\u0430\u0437");
		button_7.setBounds(345, 622, 139, 23);
		button_7.setEnabled(false);
		oboz.add(button_7);
		button_7.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		button_7.setForeground(Color.BLUE);
		
		JButton kuhnya = new JButton("\u041A\u0443\u0445\u043E\u043D\u043D\u0430\u044F \u043C\u0443\u0431\u0435\u043B\u044C");
		kuhnya.setBounds(42, 55, 200, 50);
		oboz.add(kuhnya);
		kuhnya.setFont(new Font("Arial", Font.BOLD, 14));
		
	
		
		JButton vannaya = new JButton("\u041C\u0435\u0431\u0435\u043B\u044C \u0434\u043B\u044F \u0432\u0430\u043D\u043D\u044B");
		vannaya.setBounds(440, 55, 200, 50);
		oboz.add(vannaya);
		vannaya.setFont(new Font("Arial", Font.BOLD, 14));
		
		JButton spalnya = new JButton("\u0421\u043F\u0430\u043B\u044C\u043D\u0430\u044F \u043C\u0435\u0431\u0435\u043B\u044C\r\n");
		spalnya.setBounds(241, 55, 200, 50);
		oboz.add(spalnya);
		spalnya.setFont(new Font("Arial", Font.BOLD, 14));
		
		JButton zanaves = new JButton("\u0412\u044B\u0431\u0435\u0440\u0438\u0442\u0435 \u043A\u0430\u0442\u0435\u0433\u043E\u0440\u0438\u044E \u0442\u043E\u0432\u0430\u0440\u043E\u0432!");
		zanaves.setBounds(42, 126, 598, 422);
		oboz.add(zanaves);
		zanaves.setFont(new Font("Arial", Font.BOLD, 16));
		zanaves.setEnabled(false);
		
		JLabel l31 = new JLabel("\u0422\u0443\u043C\u0431\u0430-\u0440\u0430\u043A\u043E\u0432\u0438\u043D\u0430");
		l31.setBounds(60, 128, 110, 21);
		oboz.add(l31);
		l31.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton b31 = new JButton("");
		b31.setBounds(60, 148, 110, 110);
		oboz.add(b31);
		b31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b31.setBackground(Color.WHITE);
		b31.setIcon(new ImageIcon("C:\\Users\\\u0420\u0443\u0441\u043B\u0430\u043D\\Desktop\\fb1e76fd2338f995d7fce8df5f7ab321.jpg"));
		
		JCheckBoxMenuItem d31 = new JCheckBoxMenuItem("\u0414\u043E\u0441\u0442\u0430\u0432\u043A\u0430");
		d31.setBounds(60, 278, 110, 22);
		oboz.add(d31);
		d31.setBackground(Color.PINK);
		d31.setHorizontalAlignment(SwingConstants.CENTER);
		
		JCheckBoxMenuItem s31 = new JCheckBoxMenuItem("\u0421\u0431\u043E\u0440\u043A\u0430");
		s31.setBounds(60, 256, 110, 22);
		oboz.add(s31);
		s31.setBackground(Color.PINK);
		s31.setHorizontalAlignment(SwingConstants.CENTER);
			
			JButton b32 = new JButton("");
			b32.setBackground(Color.WHITE);
			b32.setBounds(289, 148, 110, 110);
			oboz.add(b32);
			
			JLabel l32 = new JLabel("\u0422\u0443\u043C\u0431\u0430-\u0440\u0430\u043A\u043E\u0432\u0438\u043D\u0430");
			l32.setHorizontalAlignment(SwingConstants.CENTER);
			l32.setBounds(289, 128, 110, 21);
			oboz.add(l32);
			
			JCheckBoxMenuItem s32 = new JCheckBoxMenuItem("\u0421\u0431\u043E\u0440\u043A\u0430");
			s32.setHorizontalAlignment(SwingConstants.CENTER);
			s32.setBackground(Color.PINK);
			s32.setBounds(289, 256, 110, 22);
			oboz.add(s32);
			
			JCheckBoxMenuItem d32 = new JCheckBoxMenuItem("\u0414\u043E\u0441\u0442\u0430\u0432\u043A\u0430");
			d32.setHorizontalAlignment(SwingConstants.CENTER);
			d32.setBackground(Color.PINK);
			d32.setBounds(289, 278, 110, 22);
			oboz.add(d32);
			
			JButton b33 = new JButton("");
			b33.setBackground(Color.WHITE);
			b33.setBounds(517, 148, 110, 110);
			oboz.add(b33);
			
			JLabel l33 = new JLabel("\u0422\u0443\u043C\u0431\u0430-\u0440\u0430\u043A\u043E\u0432\u0438\u043D\u0430");
			l33.setHorizontalAlignment(SwingConstants.CENTER);
			l33.setBounds(517, 128, 110, 21);
			oboz.add(l33);
			
			JCheckBoxMenuItem s33 = new JCheckBoxMenuItem("\u0421\u0431\u043E\u0440\u043A\u0430");
			s33.setHorizontalAlignment(SwingConstants.CENTER);
			s33.setBackground(Color.PINK);
			s33.setBounds(517, 256, 110, 22);
			oboz.add(s33);
			
			JCheckBoxMenuItem d33 = new JCheckBoxMenuItem("\u0414\u043E\u0441\u0442\u0430\u0432\u043A\u0430");
			d33.setHorizontalAlignment(SwingConstants.CENTER);
			d33.setBackground(Color.PINK);
			d33.setBounds(517, 278, 110, 22);
			oboz.add(d33);
			
			JLabel l34 = new JLabel("\u0422\u0443\u043C\u0431\u0430-\u0440\u0430\u043A\u043E\u0432\u0438\u043D\u0430");
			l34.setHorizontalAlignment(SwingConstants.CENTER);
			l34.setBounds(60, 329, 110, 21);
			oboz.add(l34);
			
			JButton b34 = new JButton("");
			b34.setBackground(Color.WHITE);
			b34.setBounds(60, 349, 110, 110);
			oboz.add(b34);
			
			JCheckBoxMenuItem s34 = new JCheckBoxMenuItem("\u0421\u0431\u043E\u0440\u043A\u0430");
			s34.setHorizontalAlignment(SwingConstants.CENTER);
			s34.setBackground(Color.PINK);
			s34.setBounds(60, 457, 110, 22);
			oboz.add(s34);
			
			JCheckBoxMenuItem d34 = new JCheckBoxMenuItem("\u0414\u043E\u0441\u0442\u0430\u0432\u043A\u0430");
			d34.setHorizontalAlignment(SwingConstants.CENTER);
			d34.setBackground(Color.PINK);
			d34.setBounds(60, 479, 110, 22);
			oboz.add(d34);
			
			JLabel l35 = new JLabel("\u0422\u0443\u043C\u0431\u0430-\u0440\u0430\u043A\u043E\u0432\u0438\u043D\u0430");
			l35.setHorizontalAlignment(SwingConstants.CENTER);
			l35.setBounds(289, 329, 110, 21);
			oboz.add(l35);
			
			JButton b35 = new JButton("");
			b35.setBackground(Color.WHITE);
			b35.setBounds(289, 349, 110, 110);
			oboz.add(b35);
			
			JCheckBoxMenuItem s35 = new JCheckBoxMenuItem("\u0421\u0431\u043E\u0440\u043A\u0430");
			s35.setHorizontalAlignment(SwingConstants.CENTER);
			s35.setBackground(Color.PINK);
			s35.setBounds(289, 457, 110, 22);
			oboz.add(s35);
			
			JCheckBoxMenuItem d35 = new JCheckBoxMenuItem("\u0414\u043E\u0441\u0442\u0430\u0432\u043A\u0430");
			d35.setHorizontalAlignment(SwingConstants.CENTER);
			d35.setBackground(Color.PINK);
			d35.setBounds(289, 479, 110, 22);
			oboz.add(d35);
			
			JLabel l36 = new JLabel("\u0422\u0443\u043C\u0431\u0430-\u0440\u0430\u043A\u043E\u0432\u0438\u043D\u0430");
			l36.setHorizontalAlignment(SwingConstants.CENTER);
			l36.setBounds(517, 329, 110, 21);
			oboz.add(l36);
			
			JButton b36 = new JButton("");
			b36.setBackground(Color.WHITE);
			b36.setBounds(517, 349, 110, 110);
			oboz.add(b36);
			
			JCheckBoxMenuItem s36 = new JCheckBoxMenuItem("\u0421\u0431\u043E\u0440\u043A\u0430");
			s36.setHorizontalAlignment(SwingConstants.CENTER);
			s36.setBackground(Color.PINK);
			s36.setBounds(517, 457, 110, 22);
			oboz.add(s36);
			
			JCheckBoxMenuItem d36 = new JCheckBoxMenuItem("\u0414\u043E\u0441\u0442\u0430\u0432\u043A\u0430");
			d36.setHorizontalAlignment(SwingConstants.CENTER);
			d36.setBackground(Color.PINK);
			d36.setBounds(517, 479, 110, 22);
			oboz.add(d36);
			
	
			
			JLabel label_2 = new JLabel("\u041E\u0431\u0449\u0430\u044F \u0441\u0442\u043E\u0438\u043C\u043E\u0441\u0442\u044C:");
			label_2.setBounds(67, 626, 132, 15);
			oboz.add(label_2);
			label_2.setBackground(Color.LIGHT_GRAY);
			label_2.setForeground(Color.RED);
			label_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
				
				textField = new JTextField();
				textField.setBounds(209, 623, 126, 21);
				oboz.add(textField);
				textField.setBackground(Color.WHITE);
				textField.setHorizontalAlignment(SwingConstants.LEFT);
				textField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
				textField.setEditable(false);
				textField.setColumns(10);
			
				
				button_1 = new JButton("\u0412\u042B\u0425\u041E\u0414");
				button_1.setBounds(550, 614, 124, 41);
				oboz.add(button_1);
				button_1.setIcon(new ImageIcon(oboz.class.getResource("/javax/swing/plaf/metal/icons/ocean/warning.png")));
				button_1.setBackground(Color.LIGHT_GRAY);
		
				
		vannaya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				zanaves.setVisible(false);
				vannaya.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
				vannaya.setForeground(Color.RED);
				vannaya.setBounds(440, 55, 200, 60);
				spalnya.setFont(new Font("Arial", Font.BOLD, 14));
				spalnya.setBounds(241, 55, 200, 50);
				spalnya.setForeground(Color.BLACK);
				kuhnya.setFont(new Font("Arial", Font.BOLD, 14));
				kuhnya.setBounds(42, 55, 200, 50);
				kuhnya.setForeground(Color.BLACK);
				l31.setText("Тумба-раковина");
				l32.setText("Светильник");
				l33.setText("Душевая кабина");
				l34.setText("Напольный камод");
				l35.setText("Зеркало-шкаф");
				l36.setText("Зеркало");

			}
		});
		
		kuhnya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				zanaves.setVisible(false);
				kuhnya.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
				kuhnya.setForeground(Color.RED);
				kuhnya.setBounds(42, 55, 200, 60);
				spalnya.setFont(new Font("Arial", Font.BOLD, 14));
				spalnya.setBounds(241, 55, 200, 50);
				spalnya.setForeground(Color.BLACK);
				vannaya.setFont(new Font("Arial", Font.BOLD, 14));
				vannaya.setBounds(440, 55, 200, 50);
				vannaya.setForeground(Color.BLACK);
				l31.setText("Гарнитур (тип А)");
				l32.setText("Гарнитур (тип Б)");
				l33.setText("Гарнитур (тип В)");
				l34.setText("Стол со стульями");
				l35.setText("Кухонный угол");
				l36.setText("Шкаф навесной");

			}
		});
		spalnya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				zanaves.setVisible(false);
				spalnya.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
				spalnya.setForeground(Color.RED);
				spalnya.setBounds(241, 55, 200, 60);
				kuhnya.setFont(new Font("Arial", Font.BOLD, 14));
				kuhnya.setBounds(42, 55, 200, 50);
				kuhnya.setForeground(Color.BLACK);
				vannaya.setFont(new Font("Arial", Font.BOLD, 14));
				vannaya.setBounds(440, 55, 200, 50);
				vannaya.setForeground(Color.BLACK);
				l31.setText("Кровать (тип А)");
				l32.setText("Кровать (тип Б)");
				l33.setText("Кровать (тип В)");
				l34.setText("Тумба прикроватная");
				l35.setText("Шкаф");
				l36.setText("Зеркало настенное");
			}
		});
}
}
