package Practice_swing;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Login_window extends JFrame{

	Label lbid;
	Label lbpw;
	JTextField txtid;
	JTextField txtpw;
	
	public Login_window() {
		setLayout(new GridLayout(2,2));
		setSize(300, 100);
		lbid = new Label("id");
		lbpw = new Label("pw");
		txtid = new JTextField();
		txtpw = new JTextField("password");
		
		add(lbid);
		add(txtid);
		add(lbpw);
		add(txtpw);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
