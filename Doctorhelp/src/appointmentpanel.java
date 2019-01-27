import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class appointmentpanel extends JPanel {
	
	public JLabel appointmenttitle;
	
	public appointmentpanel() {
		
		appointmenttitle = new JLabel("Apointments");
		appointmenttitle.setForeground(Color.white);
		appointmenttitle.setFont(new Font("TimesRoman",Font.ITALIC,50));
		appointmenttitle.setBounds(0, 0, 600, 60);
		this.add(appointmenttitle);
		
	}

}
