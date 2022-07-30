package com.freeDraw;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Icon extends JFrame{

	JLabel b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30;
	DrawIn d;
	Icon(){
		setSize(400, 500);
		setResizable(false);
		setType(Type.UTILITY);
		
		Container c;
		c=getContentPane();
		c.setBackground(Color.black);
		c.setLayout(new FlowLayout());
		b1=new JLabel(new ImageIcon("icon/teeth-smile-close-eye-icon.png"));
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/teeth-smile-close-eye.png";
				
			}
		});
		
		b2=new JLabel(new ImageIcon("icon/teeth-smile-icon.png"));
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/teeth-smile.png";
			}
		});
		
		b3=new JLabel(new ImageIcon("icon/sweet-smile-icon.png"));
		b3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/sweet-smile.png";
			}
		});
		
		b4=new JLabel(new ImageIcon("icon/sweet-icon.png"));
		b4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/sweet.png";
			}
		});
		b5=new JLabel(new ImageIcon("icon/satisfied-icon.png"));
		b5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/satisfied.png";
			}
		});
		b6=new JLabel(new ImageIcon("icon/as-icon.png"));
		b6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/as.png";
			}
		});
		b7=new JLabel(new ImageIcon("icon/blushing-smile-icon.png"));
		b7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/blushing-smile.png";
			}
		});
		b8=new JLabel(new ImageIcon("icon/blushing-smile-worry-icon.png"));
		b8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/blushing-smile-worry.png";
			}
		});
		b9=new JLabel(new ImageIcon("icon/close-1eye-icon.png"));
		b9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/close-1eye.png";
			}
		});
		b10=new JLabel(new ImageIcon("icon/close-eye-smile-icon.png"));
		b10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/close-eye-smile.png";
			}
		});
		b11=new JLabel(new ImageIcon("icon/eye-love-icon.png"));
		b11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/eye-love.png";
			}
		});
		b12=new JLabel(new ImageIcon("icon/ll-icon.png"));
		b12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/ll.png";
			}
		});
		b13 = new JLabel(new ImageIcon("icon/hakhak-icon.png"));
		b13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/hakhak.png";
			}
		});
		b14=new JLabel(new ImageIcon("icon/sleep-icon.png"));
		b14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/sleep.png";
			}
		});
		b15=new JLabel(new ImageIcon("icon/sad worry-icon.png"));
		b15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/sad worry.png";
			}
		});
		b16=new JLabel(new ImageIcon("icon/sure-icon.png"));
		b16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/sure.png";
			}
		});
		b17=new JLabel(new ImageIcon("icon/too angry-icon.png"));
		b17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/too angry.png";
			}
		});
		b18=new JLabel(new ImageIcon("icon/what that-icon.png"));
		b18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/what that.png";
			}
		});
		b19=new JLabel(new ImageIcon("icon/bad-guy-icon.png"));
		b19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/bad-guy.png";
			}
		});
		b20=new JLabel(new ImageIcon("icon/hum-icon.png"));
		b20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/hum.png";
			}
		});
		b21=new JLabel(new ImageIcon("icon/what-icon.png"));
		b21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/what.png";
			}
		});
		b22=new JLabel(new ImageIcon("icon/yellow-icon.png"));
		b22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/yellow.png";
			}
		});
		b23=new JLabel(new ImageIcon("icon/green-icon.png"));
		b23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/green.png";
			}
		});
		b24=new JLabel(new ImageIcon("icon/h blue-icon.png"));
		b24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/h blue.png";
			}
		});
		b25=new JLabel(new ImageIcon("icon/alive-icon.png"));
		b25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/alive.png";
			}
		});
		b26=new JLabel(new ImageIcon("icon/apple-icon.png"));
		b26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/apple.png";
			}
		});
		b27=new JLabel(new ImageIcon("icon/drag-icon.png"));
		b27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/drag.png";
			}
		});
		b28=new JLabel(new ImageIcon("icon/death-icon.png"));
		b28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.iconstatus=true;
				Home.icon="icon/death.png";
			}
		});
		
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		c.add(b6);
		c.add(b7);
		c.add(b8);
		c.add(b9);
		c.add(b10);
		c.add(b11);
		c.add(b12);
		c.add(b13);
		c.add(b14);
		c.add(b15);
		c.add(b16);
		c.add(b17);
		c.add(b18);
		c.add(b19);
		c.add(b20);
		c.add(b21);
		c.add(b22);
		c.add(b23);
		c.add(b24);
		c.add(b25);
		c.add(b26);
		c.add(b27);
		c.add(b28);
		
	}


}
