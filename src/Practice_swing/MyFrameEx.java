package Practice_swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class MyFrameEx extends JFrame{

	Container c;
	JButton[] button = new JButton[4];
	String[] button_name = {"확인","취소","뒤로가기","앞으로가기"};
	
	public MyFrameEx() {
	
		setTitle("두 번쨰 프레임");
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setButton();
		setVisible(true);
	}
	
	void setButton() {
		
		c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("프로그램");
		c.add(label);
		for(int i = 0; i < button_name.length; i++) {
			button[i] = new JButton(button_name[i]);
			c.add(button[i]);
		}
	}


}
