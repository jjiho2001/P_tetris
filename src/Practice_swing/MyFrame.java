package Practice_swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{

	MyFrame(){
		
		setTitle("ù��° ������");
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton j = new JButton("Ȯ��");
		JButton j2 = new JButton("���");
		
		c.add(j);
		c.add(j2);
		
		JLabel l1 = new JLabel("�̸�");
		
		c.add(l1);
		
		setVisible(true);
	}

}
