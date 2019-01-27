import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Homepage extends JFrame{
	
	public ImageIcon closeicon;
	public int framew=852;
	public int frameh=580;
	
	public JTextField searchField;
	
	public ImageIcon icon;
	public JPanel panel;
	public JButton closeiconplace;
	public JButton minimize;
	
	public JPanel sidepanel;
	public JLabel title;
	public JLabel title2;
	public JLabel simg;
	
	public String[] sidepanelname = {"home","search","appointment","profile","shop"};
	
	
	public JPanel home;
	public JLabel homeicon;
	public JLabel hometext;
	public homepanel homepanel;
	public JLabel hometitle;
	public boolean homeselect;
	
	public JPanel login;
	
	public JPanel search;
	public searchpanel searchpanel;
	public JLabel searchicon;
	public JLabel searchtext;
	public JLabel searchtitle;
	public boolean searchselect;
	
	public JPanel appointment;
	public JLabel appointmenticon;
	public JLabel appointmenttext;
	public appointmentpanel appointmentpanel;
	public boolean appointmentselect;
	
	
	
	public JPanel history;
	public JLabel historyicon;
	public JLabel historytext;
	public historypanel historypanel;
	public boolean historyselect;
	
	
	public JPanel profile;
	public JLabel profileicon;
	public JLabel profiletext;
	public profilepanel profilepanel;
	public boolean profileselect;
	
	
	public JPanel shop;
	public JLabel shopicon;
	public JLabel shoptext;
	public shoppanel shoppanel;
	public boolean shopselect;
	
	public JLabel copyrighttext1;
	public JLabel copyrighttext2;
	public JLabel copyrighticon;
	
	public Homepage()
	{
		super("Doctor help");
		setLayout(null);
		
		//main panel
		
		panel = (JPanel) new MotionPanel(this);
		panel.setBackground(new Color(0,51,153));
		panel.setBounds(0,0,framew,frameh);
		panel.setLayout(null);
		add(panel);
		
		//side bar menu
		
		sidepanel = (JPanel) new MotionPanel(this);
		sidepanel.setLayout(null);
		
		sidepanel.setBackground(new Color(0,204,255));
		sidepanel.setBounds(0,0,framew/3-20,frameh);
		panel.add(sidepanel);
		
		
		//title of the application
		
		title =new JLabel("Doctors Help");
		title.setForeground(Color.WHITE);
		title.setFont(new Font("TimesRoman",Font.ITALIC,35));
		title.setBounds(5,0,200,40);
		sidepanel.add(title);
//		title2 =new JLabel("Help");
//		title2.setForeground(Color.WHITE);
//		title2.setFont(new Font("TimesRoman",Font.ITALIC,50));
//		title2.setBounds(130,70,100,60);
//		sidepanel.add(title2);
		
		//home panel
		
		home =  new JPanel();
		home.setBackground(new Color(51,153,255));
		home.setBounds(0,170,framew/3-20,40);
		home.setLayout(null);
		sidepanel.add(home);
		
		homeicon = new JLabel(new ImageIcon(getClass().getResource("home.png")));
		//homeicon.setBorder(BorderFactory.createEmptyBorder());
		homeicon.setBounds(15, 5, 32, 32);
	//	homeicon.setContentAreaFilled(false);
		home.add(homeicon);
		
		hometext =new JLabel("Home");
		hometext.setForeground(Color.WHITE);
		hometext.setFont(new Font("TimesRoman",Font.ITALIC,35));
		hometext.setBounds(70,3,200,35);
		//hometext.setContentAreaFilled(false);
		home.add(hometext); 
		
		home.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt)
			{
//				homepanel.setVisible(true);
//				home.setBackground(new Color(0,0,0));
//				homeselect = true;
//				
//				searchselect = false;
//				searchpanel.setVisible(false);
//				search.setBackground(new Color(51,153,255));
				
				
				homeselect=returnbool(1);
				
				
			}
			
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        home.setBackground(new Color(0,26,51));
		        hometext.setFont(new Font("TimesRoman",Font.ITALIC,40));
		        homeicon.setBorder(BorderFactory.createEmptyBorder());
		      //  homeicon.setContentAreaFilled(false);
		        homeicon.setBounds(15, 5, 40, 40);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	home.setBackground(new Color(51,153,255));
		    	hometext.setFont(new Font("TimesRoman",Font.ITALIC,35));
		    	homeicon.setBounds(15, 5, 32, 32);
		    	if(homeselect)
		    	{
		    		home.setBackground(new Color(0,0,0));
		    		
		    	}
		    }
		});
		
		
		homepanel = new homepanel(this);
		//homesppanel.setBounds(framew/3-20,100,framew-(framew/3-20),frameh-100);
		homepanel.setBounds(framew/3-20,100,framew-(framew/3-20),frameh-100);
		homepanel.setBackground(new Color(0,0,0));
		homepanel.setLayout(null); 
		panel.add(homepanel);
		
		
		 
		//................search panel...............
		
		search = new JPanel();
		search.setBackground(new Color(51,153,255));
		search.setBounds(0,211,framew/3-20,40);
		search.setLayout(null);
		sidepanel.add(search);
		
		searchicon = new JLabel(new ImageIcon(getClass().getResource("search.png")));
		searchicon.setBorder(BorderFactory.createEmptyBorder());
		searchicon.setBounds(15, 5, 32, 32);
		search.add(searchicon);
		
		searchtext =new JLabel("Search");
		searchtext.setForeground(Color.WHITE);
		searchtext.setFont(new Font("TimesRoman",Font.ITALIC,35));
		searchtext.setBounds(70,3,150,35);
		search.add(searchtext);
		
		search.addMouseListener(new java.awt.event.MouseAdapter() {
			
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
//				searchpanel.setVisible(true);
//				homepanel.setVisible(false);
//				search.setBackground(new Color(0,0,0));
//				searchselect=true;
//				homeselect = false;
//				home.setBackground(new Color(51,153,255));
				
				searchselect=returnbool(2);
			}
			
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        search.setBackground(new Color(0,26,51));
		        searchtext.setFont(new Font("TimesRoman",Font.ITALIC,40));
		        //search.setBounds(0,211-5,framew/3-20,50);
		        searchicon.setBounds(15, 5, 40, 40);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	search.setBackground(new Color(51,153,255));
		    	searchtext.setFont(new Font("TimesRoman",Font.ITALIC,35));
		    	search.setBounds(0,211,framew/3-20,40);
		    	searchicon.setBounds(15, 5, 32, 32);
		    	
		    	if(searchselect)
		    	{
		    		search.setBackground(new Color(0,0,0));
		    		//home.setBackground(new Color(51,153,255));
		    		
		    	}
		    }
		});
		
		
		searchpanel =new searchpanel();
		//homesppanel.setBounds(framew/3-20,100,framew-(framew/3-20),frameh-100);
		searchpanel.setBounds(framew/3-20,100,framew-(framew/3-20),frameh-100);
		searchpanel.setBackground(Color.white);
		searchpanel.setLayout(null);
		searchpanel.setVisible(false);
		panel.add(searchpanel);
		
		
		
		//appointment panel
		
		appointment =  new JPanel();
		appointment.setBackground(new Color(51,153,255));
		appointment.setBounds(0,252,framew/3-20,40);
		appointment.setLayout(null);
		sidepanel.add(appointment);
		
		appointmenticon = new JLabel(new ImageIcon(getClass().getResource("appointment.png")));
		appointmenticon.setBorder(BorderFactory.createEmptyBorder());
		appointmenticon.setBounds(15, 5, 32, 32);
		appointment.add(appointmenticon);
		
		appointmenttext =new JLabel("Appointment");
		appointmenttext.setForeground(Color.WHITE);
		appointmenttext.setFont(new Font("TimesRoman",Font.ITALIC,35));
		appointmenttext.setBounds(70,0,200,35);
		appointment.add(appointmenttext);
		
		appointment.addMouseListener(new java.awt.event.MouseAdapter() {
			
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
				appointmentselect = returnbool(3);
			}
			
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	appointment.setBackground(new Color(0,26,51));
		    	appointmenttext.setFont(new Font("TimesRoman",Font.ITALIC,38));
		    	appointmenttext.setBounds(60,3,200,35);
		    	appointmenticon.setBounds(15, 3, 40, 40);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	appointment.setBackground(new Color(51,153,255));
		    	appointmenttext.setFont(new Font("TimesRoman",Font.ITALIC,35));
		    	appointmenttext.setBounds(70,3,200,35);
		    	appointmenticon.setBounds(15, 5, 32, 32);
		    	if(appointmentselect)
		    	{
		    		appointment.setBackground(new Color(0,0,0));
		    	}
		    }
		});
		
		appointmentpanel = new appointmentpanel();
		appointmentpanel.setBounds(framew/3-20,100,framew-(framew/3-20),frameh-100);
		appointmentpanel.setBackground(new Color(0,0,0));
		appointmentpanel.setLayout(null);
		appointmentpanel.setVisible(false);
		panel.add(appointmentpanel);
		
		
		//history panel
		
		history =  new JPanel();
		history.setBackground(new Color(51,153,255));
		history.setBounds(0,293,framew/3-20,40);
		history.setLayout(null);
		sidepanel.add(history);
		
		historyicon = new JLabel(new ImageIcon(getClass().getResource("History.png")));
		historyicon.setBorder(BorderFactory.createEmptyBorder());
		historyicon.setBounds(15, 5, 32, 32);
		history.add(historyicon);
		
		historytext =new JLabel("History");
		historytext.setForeground(Color.WHITE);
		historytext.setFont(new Font("TimesRoman",Font.ITALIC,35));
		historytext.setBounds(70,3,200,35);
		history.add(historytext);
		
		history.addMouseListener(new java.awt.event.MouseAdapter() {
			
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
				historyselect=returnbool(4);
			}
			
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	history.setBackground(new Color(0,26,51));
		    	historytext.setFont(new Font("TimesRoman",Font.ITALIC,38));
		    	historytext.setBounds(70,0,200,35);
		    	historyicon.setBounds(15, 5, 40, 40);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	history.setBackground(new Color(51,153,255));
		    	historytext.setFont(new Font("TimesRoman",Font.ITALIC,35));
		    	historytext.setBounds(70,3,200,35);
		    	historyicon.setBounds(15, 5, 32, 32);
		    	if(historyselect)
		    	{
		    		history.setBackground(new Color(0,0,0));
		    	}
		    }
		});
		
		historypanel= new historypanel();
		historypanel.setBounds(framew/3-20,100,framew-(framew/3-20),frameh-100);
		historypanel.setBackground(new Color(0,0,0));
		historypanel.setLayout(null);
		historypanel.setVisible(false);
		panel.add(historypanel);
		
		
		//profile panel
		
		profile =  new JPanel();
		profile.setBackground(new Color(51,153,255));
		profile.setBounds(0,334,framew/3-20,40);
		profile.setLayout(null);
		sidepanel.add(profile);
		
		profileicon = new JLabel(new ImageIcon(getClass().getResource("Maleprofile.png")));
		profileicon.setBorder(BorderFactory.createEmptyBorder());
		profileicon.setBounds(15, 5, 32, 32);
		profile.add(profileicon);
		
		profiletext =new JLabel("Profile");
		profiletext.setForeground(Color.WHITE);
		profiletext.setFont(new Font("TimesRoman",Font.ITALIC,35));
		profiletext.setBounds(70,3,200,35);
		profile.add(profiletext);
		
		profile.addMouseListener(new java.awt.event.MouseAdapter() {
			
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
				profileselect = returnbool(5);
			}
			
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	profile.setBackground(new Color(0,26,51));
		    	profiletext.setFont(new Font("TimesRoman",Font.ITALIC,40));
		    	profileicon.setBounds(15, 5, 40, 40);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	profile.setBackground(new Color(51,153,255));
		    	profiletext.setFont(new Font("TimesRoman",Font.ITALIC,35));
		    	profileicon.setBounds(15, 5, 32, 32);
		    	if(profileselect)
		    	{
		    		profile.setBackground(new Color(0,0,0));
		    	}
		    }
		});
		
		profilepanel= new profilepanel();
		profilepanel.setBounds(framew/3-20,100,framew-(framew/3-20),frameh-100);
		profilepanel.setBackground(new Color(0,0,0));
		profilepanel.setLayout(null);
		profilepanel.setVisible(false);
		panel.add(profilepanel);
		
		//shop panel
		
		shop =  new JPanel();
		shop.setBackground(new Color(51,153,255));
		shop.setBounds(0,375,framew/3-20,40);
		shop.setLayout(null);
		sidepanel.add(shop);
		
		shopicon = new JLabel(new ImageIcon(getClass().getResource("Shop.png")));
		shopicon.setBorder(BorderFactory.createEmptyBorder());
		shopicon.setBounds(15, 5, 32, 32);
		shop.add(shopicon);
		
		shoptext =new JLabel("Shop");
		shoptext.setForeground(Color.WHITE);
		shoptext.setFont(new Font("TimesRoman",Font.ITALIC,35));
		shoptext.setBounds(70,3,200,35);
		shop.add(shoptext);
		
		shop.addMouseListener(new java.awt.event.MouseAdapter() {
			
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
				shopselect=returnbool(6);
			}
			
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	shop.setBackground(new Color(0,26,51));
		    	shoptext.setFont(new Font("TimesRoman",Font.ITALIC,40));
		        shopicon.setBounds(15, 5, 40, 40);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	shop.setBackground(new Color(51,153,255));
		    	shoptext.setFont(new Font("TimesRoman",Font.ITALIC,35));
		    	shopicon.setBounds(15, 5, 32, 32);
		    	if(shopselect)
		    	{
		    		shop.setBackground(new Color(0,0,0));
		    		
		    	}
		    }
		});
		
		shoppanel= new shoppanel();
		shoppanel.setBounds(framew/3-20,100,framew-(framew/3-20),frameh-100);
		shoppanel.setBackground(new Color(0,0,0));
		shoppanel.setLayout(null);
		shoppanel.setVisible(false);
		panel.add(shoppanel);
		
		//copyright text
		
		copyrighttext1 =new JLabel("Made by Rakib");
		copyrighttext1.setForeground(Color.black);
		copyrighttext1.setFont(new Font("TimesRoman",Font.ITALIC,20));
		copyrighttext1.setBounds(20,530,200,20);
		sidepanel.add(copyrighttext1);
		
		copyrighticon = new JLabel(new ImageIcon(getClass().getResource("Copyrigh.png")));
		copyrighticon.setBorder(BorderFactory.createEmptyBorder());
		copyrighticon.setBounds(20, 550,20,20);
		sidepanel.add(copyrighticon);
		
		copyrighttext2 =new JLabel("to Rakib Inc.");
		copyrighttext2.setForeground(Color.black);
		copyrighttext2.setFont(new Font("TimesRoman",Font.ITALIC,20));
		copyrighttext2.setBounds(43,550,200,20);
		sidepanel.add(copyrighttext2);
		
		
		
		//Application icon
		
		icon=new ImageIcon(getClass().getResource("doctor-icon.jpg"));
		this.setIconImage(icon.getImage());
		
		//closing option

		closeiconplace = new JButton(new ImageIcon(getClass().getResource("icons8_Delete_32px_1.png")));
		closeiconplace.setBackground(Color.red);
		closeiconplace.setToolTipText("Exit");
		closeiconplace.setBorder(BorderFactory.createEmptyBorder());
		closeiconplace.addActionListener(e-> {
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog (null, "Would You Like to close the program","Warning",dialogButton);
			if(dialogResult == JOptionPane.YES_OPTION){
				System.exit(0);
			}
		});
		//closeiconplace.setContentAreaFilled(false);
		closeiconplace.setBounds(framew-32,0,32,32);
		panel.add(closeiconplace);
		
		
		//minimize option
		
		minimize = new JButton(new ImageIcon(getClass().getResource("MinimizeWindow.png")));
		minimize.setBounds(framew-2*32,0,32,32);
		minimize.setBorder(BorderFactory.createEmptyBorder());
		minimize.setToolTipText("Minimize");
		minimize.setContentAreaFilled(false);
		minimize.addActionListener(e->{
			this.setExtendedState(this.getExtendedState() | JFrame.HIDE_ON_CLOSE);
		
		});
		panel.add(minimize);
		
		
		}
	public void selectedpanel(int s)
	{
		homepanel.setVisible(false);
		home.setBackground(new Color(51,153,255));
		searchpanel.setVisible(false);
		search.setBackground(new Color(51,153,255));
		appointmentpanel.setVisible(false);
		appointment.setBackground(new Color(51,153,255));
		historypanel.setVisible(false);
		history.setBackground(new Color(51,153,255));
		profilepanel.setVisible(false);
		profile.setBackground(new Color(51,153,255));
		shoppanel.setVisible(false);
		shop.setBackground(new Color(51,153,255));
		
		
		

			if(1==s)
			{
				homepanel.setVisible(true);
				home.setBackground(new Color(0,0,0));
				
				
			}
			if(2==s)
			{
				searchpanel.setVisible(true);
				search.setBackground(new Color(0,0,0));
				
				
			}
			if(3==s)
			{
				appointmentpanel.setVisible(true);
				appointment.setBackground(new Color(0,0,0));
				
				
			}
			if(4==s)
			{
				historypanel.setVisible(true);
				history.setBackground(new Color(0,0,0));
				
				
			}
			if(5==s)
			{
				profilepanel.setVisible(true);
				profile.setBackground(new Color(0,0,0));
				
				
			}
			if(6==s)
			{
				shoppanel.setVisible(true);
				shop.setBackground(new Color(0,0,0));
				
				
			}
			
	}
	
	Boolean returnbool(int i)
	{
		selectedpanel(i);
		homeselect=false;
		searchselect=false;
		appointmentselect= false;
		historyselect = false;
		profileselect = false;
		shopselect = false;
	
		return true;
	}

}
	










