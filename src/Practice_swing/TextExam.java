package Practice_swing;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextExam extends JFrame{

	JTextField text = new JTextField("�̸� �Է�");
	JTextArea textArea = new JTextArea("���� �Է�");
	JScrollPane jp = new JScrollPane(textArea);
	
	JPasswordField pwd = new JPasswordField();
	
	public TextExam() {
		setTitle("TextExam");
		
		add(text, "North");
		add(jp, "Center");
		add(pwd, "South");
		
		text.setText("JTextArea �۾���");
		
		String newLine = System.getProperty("line.separator");
		textArea.append(newLine);
		textArea.append("JTextArea������ �ؽ�Ʈ �߰�~");
		
		text.setEditable(false);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
