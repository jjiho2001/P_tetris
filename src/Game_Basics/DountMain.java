package Game_Basics;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class DountMain extends JFrame{

	public DountMain() {
		initUI();
	}
	
	private void initUI() {
		
		add(new DountBoard());
		
		setSize(330, 330);
		setTitle("Dount");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(() -> {
			DountMain ex = new DountMain();
			ex.setVisible(true);
		});

	}

}
