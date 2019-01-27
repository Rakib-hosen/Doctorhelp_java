import java.awt.Color;

import javax.swing.JPanel;

public class selectedpanel extends Homepage{
	private JPanel panels[];
	private JPanel insidepanels[];
	private int b;
	int i =0;
	selectedpanel(int s)
	{
		Homepage r = new Homepage();
		r.homepanel.setVisible(false);
		r.home.setBackground(new Color(51,153,255));
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
		System.out.println("ook");
		
		
		

			if(1==s)
			{
				r.homepanel.setVisible(true);
				r.home.setBackground(new Color(0,0,0));
				System.out.println("ook1");
				
				
			}
			if(2==s)
			{
				r.searchpanel.setVisible(true);
				r.search.setBackground(new Color(0,0,0));
				System.out.println("ook2");
				
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
	
	Boolean returnbool()
	{
		
		homeselect=false;
		searchselect=false;
		appointmentselect= false;
		historyselect = false;
		profileselect = false;
		shopselect = false;
	
		return true;
	}

}
