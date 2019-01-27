import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JFrame;


class Main {
	public static void main(String[] args)
	{
		Homepage r= new Homepage();
		r.setSize(852,580);
		Rectangle rec= r.getBounds();
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setLocation(((Toolkit.getDefaultToolkit().getScreenSize().width)-rec.width )/ 2, ((Toolkit.getDefaultToolkit().getScreenSize().height-rec.height)/ 2));
		r.setUndecorated(true);
		
		r.setVisible(true);
	}

}
