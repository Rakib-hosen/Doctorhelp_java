import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class historypanel extends JPanel {
	private JLabel historytitle;
	historypanel()
	{
		historytitle = new JLabel("History");
		historytitle.setBounds(0,0,200,60);
		historytitle.setFont(new Font("TimesRoman",Font.ITALIC,50));
		historytitle.setForeground(Color.WHITE);
		this.add(historytitle);
	}

}
