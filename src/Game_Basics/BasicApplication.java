package Game_Basics;

import javax.swing.JFrame;

public class BasicApplication extends JFrame{

	public BasicApplication() {
		initUI();
	}
	
	private void initUI() {
		
		add(new BasicBoard());
		
		setSize(250,200);
		setTitle("Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

}
