package com.freeDraw;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;


public class Home extends JFrame implements ActionListener {
	Container c;
	JMenuBar jmb;
	JLabel lbinlbtitle, lb2,imgex;
	private JMenu file, color,image,editImageIcon;
	private JMenuItem item;
	static JSplitPane sp ;
	leftPanel leftPanel;
	
	//show message to user
	static boolean msgstatus=false;
	static String msg="";
	static String msgicon="";
	static int msgposrtion=40;
	static int boxposition=20;
	
	static int redsize=6;
	static int bluesize=6;
	static int blacksize=6;
	static int pinksize=6;
	static int greensize=6;
	static int yellowsize=6;
	static int graysize=6;
	static int whitesize=6;
	static int img_width=0;
	static int img_height=0;
	static int icon_width=30;
	static int icon_height=30;
	static int icon_rotate=0;
	static int adjustImgwidth=0;
	static int adjustImgheight=0;
	static String img="";
	static String icon="";
	
	//text
	static String text="";
	static Color textcolor=Color.BLACK;
	static String font="Tahoma";
	static int fontsize=20;
	static int fontlocationx=100;
	static int fontlocationy=50;
	static boolean textstatus=false;
	static boolean movetext=false;
	
	Cursor hand;
	static boolean hide = false;
	static boolean moveimage = false;
	static boolean moveicon = false;
	static boolean imagestatus = false;
	static boolean iconstatus = false;
	static boolean remove = false;
	static boolean resize = false;
	static boolean resizeicon = false;
	static boolean red = false;
	static boolean green = false;
	static boolean blue = false;
	static boolean black = false;
	static boolean pink = false;
	static boolean white = false;
	static boolean yellow = false;
	static boolean gray = false;
	static boolean showicon = false;
	static boolean iconRote = false;

	static DrawIn d;
	Icon i;
	static ImageMenu im;
	IconMenu iconmenu;
	TextMenu textmenu;
	LineMenu line;
	ImageIcon logo=new ImageIcon(getClass().getClassLoader().getResource("jicon.png"));

	public Home() {
		setSize(1000, 600);
		setTitle("J.Image Editor");
		setLocation(50, 30);
		setIconImage(logo.getImage());
		c = getContentPane();
		c.setBackground(Color.DARK_GRAY);
		FileBar();
		ColorBar();
		ImageBar();
		EditImageIcon();
		sp=new JSplitPane();
		sp.setDividerLocation(getWidth()/3);
		sp.setDividerSize(3);
		
		d=new DrawIn();
		jmb = new JMenuBar();
		setJMenuBar(jmb);
		jmb.add(file);
		
		jmb.add(color);
		jmb.add(image);
		jmb.add(editImageIcon);
		imgex=new JLabel(new ImageIcon("icon/teeth-smile-close-eye-icon.png"));
		d.add(imgex);
		sp.setLeftComponent(null);
		sp.setRightComponent(d);
		
		c.add(sp);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Home h = new Home();
		
		h.setVisible(true);
	}
	public void ShowIcon(){
		
			
			
	}

	public void FileBar() {

		file = new JMenu("Setting");
		item = new JMenuItem("Hide");
		item.addActionListener(this);
		file.add(item);
		
		item = new JMenuItem("Remove");
		item.addActionListener(this);
		file.add(item);

		item = new JMenuItem("Quit");
		item.addActionListener(this);
		file.add(item);

	}

	

	public void ColorBar() {
		color = new JMenu("Line");

		item = new JMenuItem("Red");
		item.addActionListener(this);
		color.add(item);

		item = new JMenuItem("Green");
		item.addActionListener(this);
		color.add(item);

		item = new JMenuItem("Blue");
		item.addActionListener(this);
		color.add(item);

		item = new JMenuItem("Pink");
		item.addActionListener(this);
		color.add(item);

		item = new JMenuItem("Black");
		item.addActionListener(this);
		color.add(item);

		item = new JMenuItem("Yellow");
		item.addActionListener(this);
		color.add(item);

		item = new JMenuItem("Gray");
		item.addActionListener(this);
		color.add(item);

		item = new JMenuItem("White");
		item.addActionListener(this);
		color.add(item);
	}
	public void ImageBar() {
		
		image=new JMenu("Add");
	
		item=new JMenuItem("image");
		
		item.addActionListener(this);
		image.add(item);
		
		item=new JMenuItem("icon");
		item.addActionListener(this);
		image.add(item);
		
		item=new JMenuItem("Text");
		item.addActionListener(this);
		image.add(item);
		
		item=new JMenuItem("memes");
		item.addActionListener(this);
		image.add(item);
		
		item=new JMenuItem("delete");
		item.addActionListener(this);
		image.add(item);
		
	}
	public void EditImageIcon(){
		editImageIcon=new JMenu("Edit");
		
		item=new JMenuItem("Edit Image");
		
		item.addActionListener(this);
		editImageIcon.add(item);
		
		item=new JMenuItem("Edit Icon");
		item.addActionListener(this);
		editImageIcon.add(item);
		
		item=new JMenuItem("Edit text");
		item.addActionListener(this);
		editImageIcon.add(item);
		
		item=new JMenuItem("delete");
		item.addActionListener(this);
		editImageIcon.add(item);
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String s = ae.getActionCommand();

		if(s.equals("image")){
			
			JFileChooser jfc=new JFileChooser();
			int select =jfc.showOpenDialog(null);
			if(select==JFileChooser.APPROVE_OPTION){
				resize=false;
				File image=jfc.getSelectedFile();
				img=File.separator+image;
				msgicon="icon/right-icon.png";
				boxposition=20;
				msgposrtion=40;
				msgstatus=true;
				msg="image is added!";
				imagestatus=true;
				moveicon=false;
				moveimage=true;
				movetext=false;
				red = false;
				blue = false;
				black = false;
				pink = false;
				yellow = false;
				green = false;
				gray = false;
				white = false;
				moveicon=false;
				hide = false;
				im=new ImageMenu();
				this.sp.setLeftComponent(im);
				d.repaint();
			}
			
						
		}
		if(s.equals("Text")){
			text=JOptionPane.showInputDialog(null, "Enter Text Here");
			if(text!=null){
				boxposition=20;
				msgposrtion=40;
				msgstatus=true;
				msg="Text is added!";
				msgicon="icon/right-icon.png";
				textstatus=true;
				movetext=true;
				textmenu=new TextMenu();
				this.sp.setLeftComponent(textmenu);
			}else{
				textstatus=false;
				msgstatus=false;
			}
			d.repaint();
		}
		if(movetext){
			movetext=true;
			moveicon=false;
			moveimage=false;
			red = false;
			blue = false;
			black = false;
			pink = false;
			yellow = false;
			green = false;
			gray = false;
			white = false;
			hide = false;
		}
		if(s.equals("icon")){
			
			movetext=false;
			iconstatus=true;
			moveicon=true;
			moveimage=false;
			red = false;
			blue = false;
			black = false;
			pink = false;
			yellow = false;
			green = false;
			gray = false;
			white = false;
			hide = false;
			leftPanel=new leftPanel();
		
			this.sp.setLeftComponent(leftPanel);
			
			d.repaint();
			
		}
		if (s.equals("delete")) {
			
			
			if(imagestatus){
			if(JOptionPane.showConfirmDialog(null, "Delete Image?","Delete", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
				
				imagestatus=false;
				moveimage=false;
				boxposition=20;
				msgposrtion=40;
				msgstatus=true;
				msgicon="icon/right-icon.png";
				msg="Image is deleted!";
				if(iconstatus){
					iconmenu = new IconMenu();
				this.sp.setLeftComponent(iconmenu);
				movetext=false;
				}else{
					
					this.sp.setLeftComponent(null);
				}
				if(textstatus){
					
					textmenu=new TextMenu();
					this.sp.setLeftComponent(textmenu);
					moveicon=false;
				}else{
					
					this.sp.setLeftComponent(null);
				}
			}else{
				moveimage=true;
			}}
		if(iconstatus){
			if(JOptionPane.showConfirmDialog(null, "Delete Icon?","Delete", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
				this.sp.setLeftComponent(null);
				boxposition=20;
				msgposrtion=40;
				msgstatus=true;
				msg="Icon is deleted!";
				msgicon="icon/right-icon.png";
				moveicon=false;
				iconstatus=false;
				if(imagestatus){
					im = new ImageMenu();
				this.sp.setLeftComponent(im);
				movetext=false;
				}else{
					
					this.sp.setLeftComponent(null);
				}
				if(textstatus){
					textmenu=new TextMenu();
					this.sp.setLeftComponent(textmenu);
					moveimage=false;
				}else{
					this.sp.setLeftComponent(null);
				}
			}else{
				moveicon=true;
			}
		}
		if(textstatus){
			if(JOptionPane.showConfirmDialog(null, "Delete Text?","Delete", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
				this.sp.setLeftComponent(null);
				textstatus=false;
				movetext=false;
				boxposition=20;
				msgposrtion=40;
				msgstatus=true;
				msg="Text is deleted!";
				text="";
				if(imagestatus){
					im = new ImageMenu();
				this.sp.setLeftComponent(im);
				moveicon=false;
				}else{
					
					this.sp.setLeftComponent(null);
				}
				if(iconstatus){
					iconmenu=new IconMenu();
					this.sp.setLeftComponent(iconmenu);
					moveimage=false;
				}else{
					this.sp.setLeftComponent(null);
				}
			}else{
				moveicon=true;
			}
		}
		if(!imagestatus && !iconstatus && !textstatus){
			
			this.sp.setLeftComponent(null);
			boxposition=20;
			msgposrtion=40;
			msgstatus=true;
			msg="No Item here!";
			msgicon="icon/alert-icon.png";
		}
		}

		if (s.equals("Hide")) {
			hide = true;

		}
		if (s.equals("Remove")) {
			
			
		}

		if (s.equals("Red")) {
			movetext=false;
			red = true;
			blue = false;
			black = false;
			pink = false;
			yellow = false;
			green = false;
			gray = false;
			white = false;
			moveimage=false;
			moveicon=false;
			hide = false;
			
		}
		if (s.equals("Blue")) {
			blue = true;
			red = false;
			black = false;
			pink = false;
			yellow = false;
			green = false;
			gray = false;
			white = false;
			hide = false;
			moveimage=false;
			moveicon=false;
			movetext=false;
		}
		if (s.equals("Black")) {
			black = true;
			red = false;
			blue = false;
			pink = false;
			yellow = false;
			green = false;
			gray = false;
			white = false;
			movetext=false;
			hide = false;
			moveimage=false;
			moveicon=false;
		}
		if (s.equals("Pink")) {
			pink = true;
			blue = false;
			black = false;
			red = false;
			yellow = false;
			green = false;
			gray = false;
			white = false;
			hide = false;
			moveimage=false;
			movetext=false;
			moveicon=false;
		}
		if (s.equals("Yellow")) {
			yellow = true;
			movetext=false;
			blue = false;
			black = false;
			pink = false;
			red = false;
			green = false;
			gray = false;
			white = false;
			hide = false;
			moveimage=false;
			moveicon=false;
		}
		if (s.equals("Green")) {
			green = true;
			blue = false;
			black = false;
			pink = false;
			yellow = false;
			movetext=false;
			red = false;
			gray = false;
			white = false;
			hide = false;
			moveimage=false;
			moveicon=false;
		}
		if (s.equals("Gray")) {
			gray = true;
			blue = false;
			black = false;
			pink = false;
			movetext=false;
			yellow = false;
			green = false;
			red = false;
			white = false;
			hide = false;
			moveimage=false;
			moveicon=false;
		}
		if (s.equals("White")) {
			white = true;
			blue = false;
			black = false;
			pink = false;
			yellow = false;
			green = false;
			movetext=false;
			gray = false;
			red = false;
			hide = false;
			moveimage=false;
			moveicon=false;
		}
		if(red){
			if(s.equals("small")){
				redsize-=2;
			}
			if(s.equals("medium")){
				redsize+=4;
			}
			if(s.equals("large")){
				redsize+=9;
			}
			if(s.equals("Volumenous")){
				redsize+=14;
			}
			
		}
		if(black){
			if(s.equals("small")){
				blacksize-=2;
			}
			if(s.equals("medium")){
				blacksize+=4;
			}
			if(s.equals("large")){
				blacksize+=9;
			}
			if(s.equals("Volumenous")){
				blacksize+=14;
			}
			
		}
		if(blue){
			if(s.equals("small")){
				bluesize-=2;
			}
			if(s.equals("medium")){
				bluesize+=4;
			}
			if(s.equals("large")){
				bluesize+=9;
			}
			if(s.equals("Volumenous")){
				bluesize+=14;
			}
			
		}
		if(pink){
			if(s.equals("small")){
				pinksize-=2;
			}
			if(s.equals("medium")){
				pinksize+=4;
			}
			if(s.equals("large")){
				pinksize+=9;
			}
			if(s.equals("Volumenous")){
				pinksize+=14;
			}
			
		}
		if(green){
			if(s.equals("small")){
				greensize-=2;
			}
			if(s.equals("medium")){
				greensize+=4;
			}
			if(s.equals("large")){
				greensize+=9;
			}
			if(s.equals("Volumenous")){
				greensize+=14;
			}
			
		}
		if(yellow){
			if(s.equals("small")){
				yellowsize-=2;
			}
			if(s.equals("medium")){
				yellowsize+=4;
			}
			if(s.equals("large")){
				yellowsize+=9;
			}
			if(s.equals("Volumenous")){
				yellowsize+=14;
			}
			
		}
		if(gray){
			if(s.equals("small")){
				graysize-=2;
			}
			if(s.equals("medium")){
				graysize+=4;
			}
			if(s.equals("large")){
				graysize+=9;
			}
			if(s.equals("Volumenous")){
				graysize+=14;
			}
			
		}
		if(white){
			if(s.equals("small")){
				whitesize-=2;
			}
			if(s.equals("medium")){
				whitesize+=4;
			}
			if(s.equals("large")){
				whitesize+=9;
			}
			if(s.equals("Volumenous")){
				whitesize+=14;
			}
			
		}
		
		if(s.equals("Edit Image")){
			
			if(!imagestatus){
				this.sp.setLeftComponent(null);
				boxposition=20;
				msgposrtion=40;
				msgstatus=true;
				msg="No image here!";
				msgicon="icon/alert-icon.png";
			}else{
				moveimage=true;
				moveicon=false;
				movetext=false;
				im=new ImageMenu();
				this.sp.setLeftComponent(im);
			}
		}
		if(s.equals("Edit Icon")){
			
			if(!iconstatus){
				this.sp.setLeftComponent(null);
				boxposition=20;
				msgposrtion=40;
				msgstatus=true;
				msg="No icon here!";
				msgicon="icon/alert-icon.png";
			}else{
				moveimage=false;
				moveicon=true;
				movetext=false;
				iconmenu=new IconMenu();
				this.sp.setLeftComponent(iconmenu);
			}
		}
		if(s.equals("Edit text")){
			
			if(!textstatus){
				this.sp.setLeftComponent(null);
				boxposition=20;
				msgposrtion=40;
				msgstatus=true;
				msg="No text here!";
				msgicon="icon/alert-icon.png";
			}else{
				moveimage=false;
				moveicon=false;
				movetext=true;
				textmenu=new TextMenu();
				this.sp.setLeftComponent(textmenu);
			}
		}
		if (s.equals("Quit")) {
			if(JOptionPane.showConfirmDialog(null, "Exit?","Free Draw",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
				System.exit(0);
			}
		}
		if(red || black || green || blue || yellow || white ||gray ||pink ){
			line=new LineMenu();
			this.sp.setLeftComponent(line);
		}

	}

}
