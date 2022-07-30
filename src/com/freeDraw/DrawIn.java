package com.freeDraw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrawIn extends JPanel{

	int[][] x;
	private int[][] y;
	private int[] n;
	private int imagex=0;
	private int imagey=0;
	private int iconx=500;
	private int icony=100;
	private int lx=0;
	private int ly=0;

	static int img_width=100;
	static int img_height=100;
	Cursor hand;
	JLabel l;
	public DrawIn() {
		n = new int[9];
		x = new int[9][1000000];
		y = new int[9][1000000];
		addMouseMotionListener(new Draw());
		setLayout(null);
	}

	

	// draw
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;

		// background
		GradientPaint background = new GradientPaint(0, 0, Color.CYAN, 0,
				getWidth() / 2, Color.BLUE);
		g2.setPaint(background);
		g2.fill(new Rectangle2D.Float(0, 0, getWidth(), getHeight()));
		
		
		//set image
		if(Home.imagestatus){
		ImageIcon image=new ImageIcon(Home.img);
		if(Home.resize){
			g2.drawImage(image.getImage(), imagex, imagey,Home.img_width,Home.img_height, null);
		}else{
			
			g2.drawImage(image.getImage(), imagex, imagey, null);
			
			
			
		}
		
		}else{
			Home.img="";
		}
		//set Icon
		
		if(Home.iconstatus){
		ImageIcon icon = new ImageIcon(Home.icon);
		if(Home.resizeicon){
		
		g2.drawImage(icon.getImage(), iconx, icony,Home.icon_width,Home.icon_height, null);
		}else{
			g2.drawImage(icon.getImage(), iconx, icony, null);
		}
		}else{
			Home.icon="";
		}
		
		// cursor color
		if (Home.hide) {

		}else{
		
		g2.setStroke(new BasicStroke(Home.redsize));
		if(Home.redsize!=0){
		g2.setColor(Color.red);
		}else{
			g2.setColor(null);
		}
		g.drawPolyline(x[0], y[0], n[0]);
		
		

		g2.setStroke(new BasicStroke(Home.bluesize));
		if(Home.bluesize!=0){
			g2.setColor(Color.blue);
			}else{
				g2.setColor(null);
			}
		g.drawPolyline(x[1], y[1], n[1]);

		g2.setStroke(new BasicStroke(Home.blacksize));
		if(Home.blacksize!=0){
			g2.setColor(Color.black);
			}else{
				g2.setColor(null);
			}
		g.drawPolyline(x[2], y[2], n[2]);

		g2.setStroke(new BasicStroke(Home.pinksize));
		if(Home.pinksize!=0){
			g2.setColor(Color.pink);
			}else{
				g2.setColor(null);
			}
		g.drawPolyline(x[3], y[3], n[3]);

		g2.setStroke(new BasicStroke(Home.greensize));
		if(Home.greensize!=0){
			g2.setColor(Color.green);
			}else{
			g2.setColor(null);
			}
		g.drawPolyline(x[4], y[4], n[4]);

		g2.setStroke(new BasicStroke(Home.yellowsize));
		if(Home.yellowsize!=0){
			g2.setColor(Color.yellow);
			}else{
				g2.setColor(null);
			}
		g.drawPolyline(x[5], y[5], n[5]);

		g2.setStroke(new BasicStroke(Home.graysize));
		if(Home.graysize!=0){
			g2.setColor(Color.gray);
			}else{
				g2.setColor(null);
			}
		g.drawPolyline(x[6], y[6], n[6]);

		g2.setStroke(new BasicStroke(Home.whitesize));
		if(Home.whitesize!=0){
			g2.setColor(Color.white);
			}else{
				g2.setColor(null);
			}
		g.drawPolyline(x[7], y[7], n[7]);
		}
		
		//add text
		g2.setColor(Home.textcolor);
		g2.setFont(new Font(Home.font,Font.PLAIN,Home.fontsize));
		if(Home.text!=null){
		g2.drawString(Home.text, Home.fontlocationx, Home.fontlocationy);
		}else{
			
		}
		//sent message to user
		if(Home.msgstatus){
			ImageIcon message=new ImageIcon(Home.msgicon);
		g2.setColor(Color.LIGHT_GRAY);
		g2.fillRoundRect((getWidth()/2)-100, Home.boxposition, 170, 30, 10, 5);
		g2.setColor(Color.blue);
		g2.setFont(new Font("Arial Rounded MT",Font.BOLD,16));
		g2.drawString(Home.msg, (getWidth()/2)-60, Home.msgposrtion);
		g2.drawImage(message.getImage(), (getWidth()/2)-95, Home.msgposrtion-20, null);
			try{
				Thread.sleep(30);
				if(Home.boxposition!=0){
					Home.boxposition--;
					Home.msgposrtion--;
				}else{
					Home.msgstatus=false;
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		
		}else{
			
		}
		repaint();
		
	}
	
	BufferedImage iconRotation(String FileName){
		BufferedImage img=null;
		try {
			img=ImageIO.read(new File(FileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return img;
	}
	public void resizeIcon(File Original,File resize,int width,int height,String format){
		try{
			BufferedImage or=ImageIO.read(Original);
			BufferedImage re=ImageIO.read(resize);
			ImageIO.write(re, format, resize);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	class Draw extends MouseMotionAdapter {
		public void mouseDragged(MouseEvent m) {
			
			if (Home.red) {
				Cursor c=new Cursor(Cursor.CROSSHAIR_CURSOR);
				setCursor(c);
				x[0][n[0]] = m.getX();
				y[0][n[0]] = m.getY();
				n[0]++;
				
			}
			
			if (Home.blue) {
				x[1][n[1]] = m.getX();
				y[1][n[1]] = m.getY();
				n[1]++;
			}
			if (Home.black) {
				x[2][n[2]] = m.getX();
				y[2][n[2]] = m.getY();
				n[2]++;
			}
			if (Home.pink) {
				x[3][n[3]] = m.getX();
				y[3][n[3]] = m.getY();
				n[3]++;
			}
			if (Home.green) {
				x[4][n[4]] = m.getX();
				y[4][n[4]] = m.getY();
				n[4]++;
			}
			if (Home.yellow) {
				x[5][n[5]] = m.getX();
				y[5][n[5]] = m.getY();
				n[5]++;
			}
			if (Home.gray) {
				x[6][n[6]] = m.getX();
				y[6][n[6]] = m.getY();
				n[6]++;
			}
			if (Home.white) {
				x[7][n[7]] = m.getX();
				y[7][n[7]] = m.getY();
				n[7]++;
			}
			if(Home.moveimage){
				Cursor c=new Cursor(Cursor.MOVE_CURSOR);
				setCursor(c);
				imagey=m.getY();
				imagex=m.getX();
			}
			
			if(Home.moveicon){
				
				icony=m.getY();
				iconx=m.getX();
			}
			if(Home.movetext){
				Home.fontlocationx=m.getX();
				Home.fontlocationy=m.getY();
			}
			if(!Home.moveicon && !Home.moveimage){
				Cursor c=new Cursor(Cursor.DEFAULT_CURSOR);
				setCursor(c);
			}
			
			repaint();
		}
	}

	
	

}
