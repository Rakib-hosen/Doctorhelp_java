import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class homepanel extends JPanel {
	
	private JLabel hometitle;
	private JTextArea appdiscreption;
	
	private JPanel hhome;
	private JLabel hhometext;
	private JLabel hhomeicon;
	
	private JPanel hsearch;
	private JLabel hsearchtext;
	private JLabel hsearchicon;
	
	private JPanel happointment;
	private JLabel happointmenttext;
	private JLabel happointmenticon;
	
	
	private JPanel hhistory;
	private JLabel hhistorytext;
	private JLabel hhistoryicon;
	
	
	private JPanel hprofile;
	private JLabel hprofiletext;
	private JLabel hprofileicon;
	
	private JPanel hshop;
	private JLabel hshoptext;
	private JLabel hshopicon;
	
	
	
	
	homepanel(JFrame r)
	{
		
		hometitle = new JLabel("Doctors Help");
		hometitle.setOpaque(true);
		hometitle.setForeground(Color.white);
		hometitle.setBackground(Color.gray);
		hometitle.setFont(new Font("TimesRoman",Font.ITALIC,50));
		hometitle.setHorizontalAlignment(JLabel.CENTER);
		hometitle.setVerticalAlignment(JLabel.CENTER);
		hometitle.setBounds(0, 0, 600, 70);
		hometitle.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		this.add(hometitle);
		
		appdiscreption = new JTextArea("Lorem ipsum dolor sit amet, consectetur adipiscing elit\n."
				+  "Suspendisse molestie eros augue, quis tincidunt neque d\n"
				+  "ignissim vel. Curabitur ipsum dui, finibus eget dictums\n"
				+ "ed, aliquet et lorem. Nunc consequat libero mi. Sed soda\n"
				+ "les, turpis ac pulvinar finibus, ex libero porta dolor,\n"
				+ "isus, eget dapibus est mauris eget dolor. Vestibulum al\n"
				+ "iquet feugiat massa ultrices sagittis.");
		appdiscreption.setBounds(0,72,600,200);
		appdiscreption.setFont(new Font("TimesRoman",Font.ITALIC,20));
		appdiscreption.setForeground(Color.white);
		appdiscreption.setBackground(Color.gray);
		this.add(appdiscreption);
		
		hhome = new JPanel();
		hhome.setBounds(10,300,100,100);
		hhome.setBackground(Color.gray);
		hhome.setOpaque(true);
		this.add(hhome);
		hhome.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt)
			{
				selectedpanel r = new selectedpanel(1);
			}
		});
		
		hhomeicon = new JLabel(new ImageIcon(getClass().getResource("home.png")));
		hhomeicon.setBounds(0, 0, 32, 32);
		hhome.add(hhomeicon);
		
		hhometext = new JLabel("Home");
		hhometext.setBounds(0,60,30,20);
		hhometext.setFont(new Font("TimesRoman",Font.ITALIC,30));
		hhometext.setForeground(Color.WHITE);
		hhome.add(hhometext);
		
		hsearch = new JPanel();
		hsearch.setBounds(10,300,100,100);
		hsearch.setBackground(Color.gray);
		hsearch.setOpaque(true);
		this.add(hsearch);
		hhome.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt)
			{
				selectedpanel r = new selectedpanel(1);
			}
		});
		
		hsearchtext = new JLabel("Search");
		hsearchtext.setBounds(0,0,30,20);
		hsearchtext.setFont(new Font("TimesRoman",Font.ITALIC,20));
		hsearchtext.setForeground(Color.WHITE);
		hsearch.add(hsearchtext);
		
	}

}
