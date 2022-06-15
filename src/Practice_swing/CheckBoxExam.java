package Practice_swing;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxExam extends JFrame{

	Checkbox hobby1 = new Checkbox("����");
	Checkbox hobby2 = new Checkbox("���", true);
	Checkbox hobby3 = new Checkbox("����");
	Checkbox hobby4 = new Checkbox("���Ա�", true);
	
	CheckboxGroup group = new CheckboxGroup();
	Checkbox man = new Checkbox("����", true, group);
	Checkbox woman = new Checkbox("����", false, group);
	
	JLabel hobby = new JLabel("��� : ");
	JLabel gender = new JLabel("���� : ");
	
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
