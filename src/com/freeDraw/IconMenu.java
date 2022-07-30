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
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class IconMenu extends JPanel{
	JLabel title,size,rotate;
	JSpinner jsw,jsr;
	JButton okbtn;
	public IconMenu() {
		// TODO Auto-generated constructor stub
Cursor c=new Cursor(Cursor.HAND_CURSOR);
		setBackground(Color.DARK_GRAY);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gbl_panel);
		
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
		gbc_lblX.gridx = 6;
		gbc_lblX.gridy = 0;
		add(lblX, gbc_lblX);
		
		title = new JLabel("Resize Icon");
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Tahoma", Font.BOLD, 25));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 5;
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		add(title, gbc_lblNewLabel);
		
		size = new JLabel("Size");
		size.setForeground(Color.WHITE);
		size.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 5;
		add(size, gbc_lblNewLabel_1);
		
		jsw = new JSpinner();
		jsw.setModel(new SpinnerNumberModel(new Integer(30), null, null, new Integer(1)));
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.gridwidth = 2;
		gbc_spinner.fill = GridBagConstraints.BOTH;
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 4;
		gbc_spinner.gridy = 5;
		add(jsw, gbc_spinner);
		
	/**	rotate = new JLabel("Rotation");
		size.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints grotate = new GridBagConstraints();
		grotate.insets = new Insets(0, 0, 5, 5);
		grotate.gridx = 2;
		grotate.gridy = 7;
		add(rotate, grotate);
		
		jsr = new JSpinner();
		jsr.setModel(new SpinnerNumberModel(new Integer(30), null, null, new Integer(1)));
		GridBagConstraints gjsr = new GridBagConstraints();
		gjsr.gridwidth = 2;
		gjsr.fill = GridBagConstraints.BOTH;
		gjsr.insets = new Insets(0, 0, 5, 5);
		gjsr.gridx = 4;
		gjsr.gridy = 7;
		add(jsr, gjsr);
		*/
		JButton btnNewButton = new JButton("ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Home.icon_width=(int) jsw.getValue();
				Home.icon_height=(int) jsw.getValue();
				Home.resizeicon=true;
				
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 9;
		add(btnNewButton, gbc_btnNewButton);
		repaint();
		

	}
}
