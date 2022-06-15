package Practice_swing;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextExam extends JFrame{

	JTextField text = new JTextField("이름 입력");
	JTextArea textArea = new JTextArea("내용 입력");
	JScrollPane jp = new JScrollPane(textArea);
	
	JPasswordField pwd = new JPasswordField();
	
	public TextExam() {
		setTitle("TextExam");
		
		add(text, "North");
		add(jp, "Center");
		add(pwd, "South");
		
		text.setText("JTextArea 글쓰기");
		
		String newLine = System.getProperty("line.separator");
		textArea.append(newLine);
		textArea.append("JTextArea영역에 텍스트 추가~");
		
		text.setEditable(false);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
