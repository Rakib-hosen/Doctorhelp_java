import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class profilepanel extends JPanel {
	private JLabel profiletitle;
	profilepanel()
	{
		profiletitle=new JLabel("Profile");
		profiletitle.setBounds(0,0,200,60);
		profiletitle.setFont(new Font("TimesRoman",Font.ITALIC,50));
		profiletitle.setForeground(Color.white);
		this.add(profiletitle);
	}

}
