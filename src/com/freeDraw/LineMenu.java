package com.freeDraw;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LineMenu extends JPanel{
	JLabel title;
	JButton small,medium,large,massive,delete;
	public LineMenu() {
		// TODO Auto-generated constructor stub
		Cursor c=new Cursor(Cursor.HAND_CURSOR);
		setBackground(Color.DARK_GRAY);
		GridBagLayout gbl_p = new GridBagLayout();
		gbl_p.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_p.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_p.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_p.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gbl_p);
		
		JLabel lblX = new JLabel("X");
		lblX.setForeground(Color.RED);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblX.setCursor(c);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Home.sp.setLeftComponent(null);
			}
		});
		GridBagConstraints gbc_lblX = new GridBagConstraints();
		gbc_lblX.insets = new Insets(0, 0, 5, 5);
		gbc_lblX.gridx = 9;
		gbc_lblX.gridy = 0;
		add(lblX, gbc_lblX);
		
		title = new JLabel("Edit line");
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Tahoma", Font.BOLD, 25));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.gridwidth = 5;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 1;
		add(title, gbc_lblNewLabel);
		
		small = new JButton("Small");
		small.setFont(new Font("Tahoma", Font.PLAIN, 15));
		small.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Home.red){
					Home.redsize=4;
				}
				if(Home.black){
					Home.blacksize=4;
				}
				if(Home.blue){
					Home.bluesize=4;
				}
				if(Home.pink){
					Home.pinksize=4;
				}
				if(Home.green){
					Home.greensize=4;
				}
				if(Home.yellow){
					Home.yellowsize=4;
				}
				if(Home.gray){
					Home.graysize=4;
				}
				if(Home.white){
					Home.whitesize=4;
				}
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 3;
		add(small, gbc_btnNewButton);
		
		medium = new JButton("Medium");
		medium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Home.red){
					Home.redsize=10;
				}
				if(Home.black){
					Home.blacksize=10;
				}
				if(Home.blue){
					Home.bluesize=10;
				}
				if(Home.pink){
					Home.pinksize=10;
				}
				if(Home.green){
					Home.greensize=10;
				}
				if(Home.yellow){
					Home.yellowsize=10;
				}
				if(Home.gray){
					Home.graysize=10;
				}
				if(Home.white){
					Home.whitesize=10;
				}
				
			}
		});
		medium.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnLarge = new GridBagConstraints();
		gbc_btnLarge.fill = GridBagConstraints.BOTH;
		gbc_btnLarge.insets = new Insets(0, 0, 5, 5);
		gbc_btnLarge.gridx = 3;
		gbc_btnLarge.gridy = 5;
		add(medium, gbc_btnLarge);
		
		large = new JButton("Large");
		large.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(Home.red){
					Home.redsize=15;
				}
				if(Home.black){
					Home.blacksize=15;
				}
				if(Home.blue){
					Home.bluesize=15;
				}
				if(Home.pink){
					Home.pinksize=15;
				}
				if(Home.green){
					Home.greensize=15;
				}
				if(Home.yellow){
					Home.yellowsize=15;
				}
				if(Home.gray){
					Home.graysize=15;
				}
				if(Home.white){
					Home.whitesize=15;
				}
				
			}
		});
		large.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnLarge_1 = new GridBagConstraints();
		gbc_btnLarge_1.fill = GridBagConstraints.BOTH;
		gbc_btnLarge_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnLarge_1.gridx = 3;
		gbc_btnLarge_1.gridy = 7;
		add(large, gbc_btnLarge_1);
		
		massive = new JButton("Massive");
		massive.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(Home.red){
					Home.redsize=20;
				}
				if(Home.black){
					Home.blacksize=20;
				}
				if(Home.blue){
					Home.bluesize=20;
				}
				if(Home.pink){
					Home.pinksize=20;
				}
				if(Home.green){
					Home.greensize=20;
				}
				if(Home.yellow){
					Home.yellowsize=20;
				}
				if(Home.gray){
					Home.graysize=20;
				}
				if(Home.white){
					Home.whitesize=20;
				}
			}
		});
		massive.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnMassive = new GridBagConstraints();
		gbc_btnMassive.fill = GridBagConstraints.BOTH;
		gbc_btnMassive.insets = new Insets(0, 0, 0, 5);
		gbc_btnMassive.gridx = 3;
		gbc_btnMassive.gridy = 9;
		add(massive, gbc_btnMassive);
		
	/**	delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(Home.red){
					Home.redsize=0;
				}
				if(Home.black){
					Home.blacksize=0;
				}
				if(Home.blue){
					Home.bluesize=0;
				}
				if(Home.pink){
					Home.pinksize=0;
				}
				if(Home.green){
					Home.greensize=0;
				}
				if(Home.yellow){
					Home.yellowsize=0;
				}
				if(Home.gray){
					Home.graysize=0;
				}
				if(Home.white){
					Home.whitesize=0;
				}
			}
		});
		delete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbcdelete = new GridBagConstraints();
		gbcdelete.fill = GridBagConstraints.BOTH;
		gbcdelete.insets = new Insets(0, 0, 0, 5);
		gbcdelete.gridx = 3;
		gbcdelete.gridy = 13;
		add(delete, gbcdelete);
		*/
	}
}
