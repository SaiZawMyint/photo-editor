package com.freeDraw;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

public class TextMenu extends JPanel{
	JLabel title,fontfamily,fontsize,fontColor;
	JComboBox ffamily,fcolor;
	JSpinner fsize;
	JButton okbtn;
	public TextMenu() {
		Cursor c=new Cursor(Cursor.HAND_CURSOR);
		setBackground(Color.darkGray);
		GridBagLayout gbl_p = new GridBagLayout();
		gbl_p.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_p.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_p.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_p.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		gbc_lblX.gridx = 15;
		gbc_lblX.gridy = 0;
		add(lblX, gbc_lblX);
		
		title = new JLabel("Edit Font");
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Tahoma", Font.BOLD, 25));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.gridwidth = 6;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 1;
		add(title, gbc_lblNewLabel);
		
		fontfamily = new JLabel("Font Family");
		fontfamily.setForeground(Color.WHITE);
		fontfamily.setHorizontalAlignment(SwingConstants.TRAILING);
		fontfamily.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 3;
		add(fontfamily, gbc_lblNewLabel_1);
		
		ffamily =new JComboBox();
		ffamily.addItem("Tahoma");
		ffamily.addItem("Agency FB");
		ffamily.addItem("Algerian");
		ffamily.addItem("Arial");
		ffamily.addItem("Arial Rounded MT");
		ffamily.addItem("Bahnschrift");
		ffamily.addItem("Baskerville Old Face");
		ffamily.addItem("Bauhaus 93");
		ffamily.addItem("Bell MT");
		ffamily.addItem("Berlin Sans FB");
		ffamily.addItem("Blackadder ITC");
		ffamily.addItem("Bradley Hand ITC");
		ffamily.addItem("Candara");

		GridBagConstraints gbc_choice = new GridBagConstraints();
		gbc_choice.fill = GridBagConstraints.BOTH;
		gbc_choice.gridwidth = 6;
		gbc_choice.insets = new Insets(0, 0, 5, 5);
		gbc_choice.gridx = 4;
		gbc_choice.gridy = 3;
		add(ffamily, gbc_choice);
		
		fontsize = new JLabel("Font Size");
		fontsize.setForeground(Color.WHITE);
		fontsize.setHorizontalAlignment(SwingConstants.TRAILING);
		fontsize.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 3;
		gbc_lblNewLabel_2.gridy = 5;
		add(fontsize, gbc_lblNewLabel_2);
		
		fsize = new JSpinner();
		fsize.setModel(new SpinnerNumberModel(new Integer(20), new Integer(0), null, new Integer(1)));
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.fill = GridBagConstraints.BOTH;
		gbc_spinner.gridwidth = 6;
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 4;
		gbc_spinner.gridy = 5;
		add(fsize, gbc_spinner);
		
		fontColor = new JLabel("Color");
		fontColor.setForeground(Color.WHITE);
		fontColor.setHorizontalAlignment(SwingConstants.TRAILING);
		fontColor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 3;
		gbc_lblNewLabel_3.gridy = 7;
		add(fontColor, gbc_lblNewLabel_3);
		
		fcolor = new JComboBox();
		fcolor.addItem("black");
		fcolor.addItem("white");
		fcolor.addItem("red");
		fcolor.addItem("green");
		fcolor.addItem("blue");
		fcolor.addItem("pink");
		fcolor.addItem("gray");
		fcolor.addItem("yellow");
		fcolor.addItem("orange");
		fcolor.addItem("darkgray");
		
		GridBagConstraints gbc_choice_1 = new GridBagConstraints();
		gbc_choice_1.fill = GridBagConstraints.BOTH;
		gbc_choice_1.gridwidth = 6;
		gbc_choice_1.insets = new Insets(0, 0, 5, 5);
		gbc_choice_1.gridx = 4;
		gbc_choice_1.gridy = 7;
		add(fcolor, gbc_choice_1);
		
		okbtn = new JButton("OK");
		okbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		okbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Home.font=(String) ffamily.getSelectedItem();
				String color=(String) fcolor.getSelectedItem();
				if(color.equals("black")){
					Home.textcolor=Color.black;
				}
				if(color.equals("white")){
					Home.textcolor=Color.white;
				}
				if(color.equals("red")){
					Home.textcolor=Color.red;
				}
				if(color.equals("green")){
					Home.textcolor=Color.green;
				}
				if(color.equals("blue")){
					Home.textcolor=Color.blue;
				}
				if(color.equals("pink")){
					Home.textcolor=Color.pink;
				}
				if(color.equals("gray")){
					Home.textcolor=Color.gray;
				}
				if(color.equals("yellow")){
					Home.textcolor=Color.yellow;
				}
				if(color.equals("orange")){
					Home.textcolor=Color.orange;
				}
				if(color.equals("darkgray")){
					Home.textcolor=Color.darkGray;
				}
				Home.fontsize=(int) fsize.getValue();
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 6;
		gbc_btnNewButton.gridy = 9;
		add(okbtn, gbc_btnNewButton);
		
	}
}
