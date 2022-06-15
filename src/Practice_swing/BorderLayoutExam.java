package Practice_swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExam extends JFrame{

	JButton btn1 = new JButton("East");
	JButton btn2 = new JButton("West");
	JButton btn3 = new JButton("North");
	JButton btn4 = new JButton("South");
	JButton btn5 = new JButton("Center");
	
	BorderLayout bl = new BorderLayout();
	
	public BorderLayoutExam() {
		setTitle("Border Layout");
		setLayout(bl);
		setSize(1000,1000);
		
		add(btn1, "East");
		add(btn2, "West");
		add(btn3, "North");
		add(btn4, "South");
		add(btn5, "Center");
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
