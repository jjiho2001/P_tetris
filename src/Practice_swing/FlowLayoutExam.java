package Practice_swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExam extends JFrame{

	JButton btn1 = new JButton("버튼1");
	JButton btn2 = new JButton("버튼2");
	JButton btn3 = new JButton("버튼3");
	FlowLayout flow = new FlowLayout();
	
	public FlowLayoutExam() {
		setTitle("First swing");
		setLayout(flow);
		
		add(btn1);
		add(btn2);
		add(btn3);
		
		setSize(300,400);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
