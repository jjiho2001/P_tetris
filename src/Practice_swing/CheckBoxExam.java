package Practice_swing;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxExam extends JFrame{

	Checkbox hobby1 = new Checkbox("수영");
	Checkbox hobby2 = new Checkbox("등산", true);
	Checkbox hobby3 = new Checkbox("낚시");
	Checkbox hobby4 = new Checkbox("놀고먹기", true);
	
	CheckboxGroup group = new CheckboxGroup();
	Checkbox man = new Checkbox("남자", true, group);
	Checkbox woman = new Checkbox("여자", false, group);
	
	JLabel hobby = new JLabel("취미 : ");
	JLabel gender = new JLabel("성별 : ");
	
	JPanel north = new JPanel();
	JPanel center = new JPanel();
	
	CheckBoxExam(){
		super("CheckboxExam");
		
		north.add(hobby);
		north.add(hobby1);
		north.add(hobby2);
		north.add(hobby3);
		north.add(hobby4);
		
		center.add(gender);
		center.add(man);
		center.add(woman);
		
		add(north, "North");
		add(center, "Center");
		
		north.setBackground(Color.gray);
		center.setBackground(new Color(122,220,100));
		
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
