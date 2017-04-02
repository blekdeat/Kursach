package main;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;


public class osnovnoy extends JApplet{
		
	
	public osnovnoy() {
				
	login LOG = new login();	
	LOG.setBounds(0, 0, 684, 662);
	getContentPane().add(LOG);
	getContentPane().setLayout(null);
	LOG.setVisible(true);
	
	user US = new user();	
	US.setBounds(0,0, 684, 662);
	getContentPane().add(US);
	getContentPane().setLayout(null);
	US.setVisible(false);
	
	oboz OBZ = new oboz();	
	OBZ.setBounds(0,0, 684, 662);
	getContentPane().add(OBZ);
	getContentPane().setLayout(null);
	OBZ.setVisible(false);
	
	konsult KST = new konsult();	
	KST.setBounds(0, 0, 684, 662);
	getContentPane().add(KST);
	getContentPane().setLayout(null);
	KST.setVisible(false);
	
	zakaz ZKZ = new zakaz();	
	ZKZ.setBounds(0,0, 684, 662);
	getContentPane().add(ZKZ);
	getContentPane().setLayout(null);
	ZKZ.setVisible(false);
	
	LOG.button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			LOG.setVisible(false);
			US.setVisible(true);
			US.label_1.setText(LOG.textField.getText()) ;
			/*
			System.out.println(LOG.textField.getText());
			System.out.println(LOG.textField_1.getText());

			int x=0;
			String[] login={"admin","red","blue","green","yellow" };
			String[] password={"admin","red","blue","green","yellow" };
			int i=0;		
			while (login[i]!= LOG.textField.getText() && password[i]!= LOG.textField_1.getText() && i<15) {
				if (login[0]=="admin") {
					x=2;
				}
				else {
					x=1;
				}
				i++;
			}
			
			if (x==1){	
			LOG.setVisible(false);
			US.setVisible(true);
			US.label_1.setText(LOG.textField.getText()) ;
			} else{
				LOG.textField.setText("ОШИБКА");
				LOG.textField_1.setText("ОШИБКА");
			}*/
		}
	});
	
	LOG.obozr.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			LOG.setVisible(false);
			OBZ.setVisible(true);
			OBZ.label_1.setText("\u041E\u0431\u043E\u0437\u0440\u0435\u0432\u0430\u0442\u0435\u043B\u044C") ;
			OBZ.label_1.setForeground(Color.RED);
			}
	});
	
	LOG.button_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			 System.exit(0);
			}
	});
	
	US.btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			LOG.setVisible(true);
			US.setVisible(false);
			}
	});
	
	US.button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			US.setVisible(false);
			KST.setVisible(true);
		}	
	});
	
	US.button_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			 System.exit(0);
			}
	});
	
	US.button_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			US.setVisible(false);
			ZKZ.setVisible(true);
		}	
	});
	
	OBZ.btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			LOG.setVisible(true);
			OBZ.setVisible(false);
			}
	});
	
	OBZ.button_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			 System.exit(0);
			}
	});
	
	KST.button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			US.setVisible(true);
			KST.setVisible(false);
			}
	});
	
	ZKZ.button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			 System.exit(0);
			}
	});
	
}
}

