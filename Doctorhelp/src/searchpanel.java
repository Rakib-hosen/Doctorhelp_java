import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class searchpanel extends JPanel {
	
	private JLabel searchtitle;
	
	
	searchpanel()
	{
		searchtitle = new JLabel("this is the search page");
		searchtitle.setForeground(Color.BLACK);
		searchtitle.setFont(new Font("TimesRoman",Font.ITALIC,25));
		searchtitle.setBounds(0, 0, 600, 50);
		this.add(searchtitle);
	}

}
