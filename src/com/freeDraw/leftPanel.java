package com.freeDraw;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class leftPanel extends JPanel{
	JLabel b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30;
	IconMenu icon;
	public leftPanel() {
		// TODO Auto-generated constructor stub
		Cursor cursor=new Cursor(Cursor.HAND_CURSOR);
		setBackground(Color.DARK_GRAY);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setBackground(getBackground());
		setLayout(gbl_panel);
		
		JLabel lblX = new JLabel("X");
		lblX.setForeground(Color.RED);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblX.setCursor(cursor);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.sp.setLeftComponent(null);
			}
		});
		GridBagConstraints gbc_lblX = new GridBagConstraints();
		gbc_lblX.insets = new Insets(0, 0, 5, 5);
		gbc_lblX.gridx = 17;
		gbc_lblX.gridy = 0;
		add(lblX, gbc_lblX);
		
		
		b1= new JLabel(new ImageIcon("mainIcon/icon/teeth-smile-close-eye-icon.png"));
		
		b1.setCursor(cursor);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		add(b1, gbc_lblNewLabel);
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/teeth-smile-close-eye.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		
		b2=new JLabel(new ImageIcon("icon/teeth-smile-icon.png"));
		
		b2.setCursor(cursor);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 3;
		gbc_label.gridy = 1;
		add(b2, gbc_label);
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/teeth-smile.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";

				Home.msgicon="icon/right-icon.png";
				
			}
		});
		
		b3=new JLabel(new ImageIcon("icon/sweet-smile-icon.png"));
		b3.setCursor(cursor);
		b3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/sweet-smile.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 5;
		gbc_lblNewLabel_2.gridy = 1;
		add(b3, gbc_lblNewLabel_2);
		
		b4=new JLabel(new ImageIcon("icon/sweet-icon.png"));
		b4.setCursor(cursor);
		b4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/sweet.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 7;
		gbc_lblNewLabel_3.gridy = 1;
		add(b4, gbc_lblNewLabel_3);
		
		b5=new JLabel(new ImageIcon("icon/satisfied-icon.png"));
		b5.setCursor(cursor);
		b5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/satisfied.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 9;
		gbc_lblNewLabel_4.gridy = 1;
		add(b5, gbc_lblNewLabel_4);
		
		b6=new JLabel(new ImageIcon("icon/as-icon.png"));
		b6.setCursor(cursor);
		b6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/as.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 11;
		gbc_lblNewLabel_5.gridy = 1;
		add(b6, gbc_lblNewLabel_5);
		
		b7=new JLabel(new ImageIcon("icon/blushing-smile-icon.png"));
		b7.setCursor(cursor);
		b7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/blushing-smile.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 13;
		gbc_lblNewLabel_6.gridy = 1;
		add(b7, gbc_lblNewLabel_6);
		
		b8=new JLabel(new ImageIcon("icon/blushing-smile-worry-icon.png"));
		b8.setCursor(cursor);
		b8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/blushing-smile-worry.png";
				icon=new IconMenu();
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.sp.setLeftComponent(icon);
				Home.msgicon="icon/right-icon.png";
				}
		});
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_7.gridx = 15;
		gbc_lblNewLabel_7.gridy = 1;
		add(b8, gbc_lblNewLabel_7);
		
		b9=new JLabel(new ImageIcon("icon/close-1eye-icon.png"));
		b9.setCursor(cursor);
		b9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/close-1eye.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 3;
		add(b9, gbc_label_1);
		
		b10=new JLabel(new ImageIcon("icon/close-eye-smile-icon.png"));
		b10.setCursor(cursor);
		b10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/close-eye-smile.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 3;
		add(b10, gbc_lblNewLabel_1);
		
		b11=new JLabel(new ImageIcon("icon/eye love-icon.png"));
		b11.setCursor(cursor);
		b11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/eye love.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 5;
		gbc_lblNewLabel_8.gridy = 3;
		add(b11, gbc_lblNewLabel_8);
		
		b12=new JLabel(new ImageIcon("icon/ll-icon.png"));
		b12.setCursor(cursor);
		b12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/ll.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 7;
		gbc_lblNewLabel_9.gridy = 3;
		add(b12, gbc_lblNewLabel_9);
		
		b13 = new JLabel(new ImageIcon("icon/hakhak-icon.png"));
		b13.setCursor(cursor);
		b13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/hakhak.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 9;
		gbc_label_2.gridy = 3;
		add(b13, gbc_label_2);
		
		b14=new JLabel(new ImageIcon("icon/sleep-icon.png"));
		b14.setCursor(cursor);
		b14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/sleep.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 11;
		gbc_label_3.gridy = 3;
		add(b14, gbc_label_3);
		
		b15=new JLabel(new ImageIcon("icon/sad worry-icon.png"));
		b15.setCursor(cursor);
		b15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/sad worry.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints g15 = new GridBagConstraints();
		g15.insets = new Insets(0, 0, 5, 5);
		g15.gridx = 13;
		g15.gridy = 3;
		add(b15, g15);
		
		
		b16=new JLabel(new ImageIcon("icon/sure-icon.png"));
		b16.setCursor(cursor);
		b16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/sure.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints g16 = new GridBagConstraints();
		g16.insets = new Insets(0, 0, 5, 5);
		g16.gridx = 15;
		g16.gridy = 3;
		add(b16, g16);
		
		b17=new JLabel(new ImageIcon("icon/too angry -icon.png"));
		b17.setCursor(cursor);
		b17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/too angry .png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints g17 = new GridBagConstraints();
		g17.insets = new Insets(0, 0, 5, 5);
		g17.gridx = 1;
		g17.gridy = 5;
		add(b17, g17);
		
		b18=new JLabel(new ImageIcon("icon/what that-icon.png"));
		b18.setCursor(cursor);
		b18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/what that.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints g18 = new GridBagConstraints();
		g18.insets = new Insets(0, 0, 5, 5);
		g18.gridx = 3;
		g18.gridy = 5;
		add(b18, g18);
		
		b19=new JLabel(new ImageIcon("icon/bad-guy-icon.png"));
		b19.setCursor(cursor);
		b19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/bad-guy.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints g19 = new GridBagConstraints();
		g19.insets = new Insets(0, 0, 5, 5);
		g19.gridx = 5;
		g19.gridy = 5;
		add(b19, g19);
		
		b20=new JLabel(new ImageIcon("icon/hmm-icon.png"));
		b20.setCursor(cursor);
		b20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/hmm.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints g20 = new GridBagConstraints();
		g20.insets = new Insets(0, 0, 5, 5);
		g20.gridx = 7;
		g20.gridy = 5;
		add(b20, g20);
		
		b21=new JLabel(new ImageIcon("icon/what-icon.png"));
		b21.setCursor(cursor);
		b21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/what.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints g21 = new GridBagConstraints();
		g21.insets = new Insets(0, 0, 5, 5);
		g21.gridx = 9;
		g21.gridy = 5;
		add(b21, g21);
		
		b22=new JLabel(new ImageIcon("icon/yellow-icon.png"));
		b22.setCursor(cursor);
		b22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/yellow.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints g22 = new GridBagConstraints();
		g22.insets = new Insets(0, 0, 5, 5);
		g22.gridx = 11;
		g22.gridy = 5;
		add(b22, g22);
		
		b23=new JLabel(new ImageIcon("icon/green-icon.png"));
		b23.setCursor(cursor);
		b23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/green.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints g23= new GridBagConstraints();
		g23.insets = new Insets(0, 0, 5, 5);
		g23.gridx = 13;
		g23.gridy = 5;
		add(b23, g23);
		
		b24=new JLabel(new ImageIcon("icon/h blue-icon.png"));
		b24.setCursor(cursor);
		b24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/h blue.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints g24 = new GridBagConstraints();
		g24.insets = new Insets(0, 0, 5, 5);
		g24.gridx = 15;
		g24.gridy = 5;
		add(b24, g24);
		
		b25=new JLabel(new ImageIcon("icon/alive-icon.png"));
		b25.setCursor(cursor);
		b25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/alive.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints g25 = new GridBagConstraints();
		g25.insets = new Insets(0, 0, 5, 5);
		g25.gridx = 1;
		g25.gridy = 7;
		add(b25, g25);
		
		b26=new JLabel(new ImageIcon("icon/apple-icon.png"));
		b26.setCursor(cursor);
		b26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/apple.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints g26 = new GridBagConstraints();
		g26.insets = new Insets(0, 0, 5, 5);
		g26.gridx = 3;
		g26.gridy = 7;
		add(b26, g26);
		
		b27=new JLabel(new ImageIcon("icon/drag-icon.png"));
		b27.setCursor(cursor);
		b27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.resizeicon=false;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/drag.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints g27 = new GridBagConstraints();
		g27.insets = new Insets(0, 0, 5, 5);
		g27.gridx = 5;
		g27.gridy = 7;
		add(b27, g27);
		
		b28=new JLabel(new ImageIcon("icon/death-icon.png"));
		b28.setCursor(cursor);
		b28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.resizeicon=false;
				Home.iconstatus=true;
				Home.moveicon=true;
				Home.moveimage=false;
				Home.red = false;
				Home.blue = false;
				Home.black = false;
				Home.pink = false;
				Home.yellow = false;
				Home.green = false;
				Home.gray = false;
				Home.white = false;
				Home.hide = false;
				Home.icon="icon/death.png";
				icon=new IconMenu();
				Home.sp.setLeftComponent(icon);
				Home.boxposition=20;
				Home.msgposrtion=40;
				Home.msgstatus=true;
				Home.msg="Icon is added!";
				Home.msgicon="icon/right-icon.png";
			}
		});
		GridBagConstraints g28 = new GridBagConstraints();
		g28.insets = new Insets(0, 0, 5, 5);
		g28.gridx = 7;
		g28.gridy = 7;
		add(b28, g28);
		
		
	}
	
		
		
	
	
}
