import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;



public class shoppanel  extends JPanel {
	private JLabel shoptitle;
	
	shoppanel()
	{
		shoptitle = new JLabel("Shop");
		shoptitle.setBounds(0,0,200,60);
		shoptitle.setFont(new Font("TimesRoman",Font.ITALIC,50));
		shoptitle.setForeground(Color.white);
		this.add(shoptitle);
	}
	

}
