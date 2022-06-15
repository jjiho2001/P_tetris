package Practice_swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExam extends JFrame{

	public GridLayoutExam() {
		setTitle("Grid Layout");
		setLayout(new GridLayout(2,3));
		setSize(300,400);
		
		add(new JButton("버튼1"));
		add(new JButton("버튼2"));
		add(new JButton("버튼3"));
		add(new JButton("버튼4"));
		add(new JButton("버튼5"));
		add(new JButton("버튼6"));
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
