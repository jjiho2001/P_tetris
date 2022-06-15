package Practice_swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelLayoutExam extends JFrame{

	JButton btn1 = new JButton("WestButton");
	JButton btn2 = new JButton("CenterButton");
	
	JPanel jp = new JPanel();
	
	JButton btn3 = new JButton("File");
	JButton btn4 = new JButton("Help");
	
	public PanelLayoutExam() {
		setTitle("PanelLayoutExam");
		
		jp.add(btn4);
		jp.add(btn3);
		
		add(jp, "North");
		add(btn1, "West");
		add(btn2, "Center");
		
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
