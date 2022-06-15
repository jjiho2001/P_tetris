package Game_Basics;

import java.awt.EventQueue;

public class BasicMain {

	public static void main(String[] args) {

		EventQueue.invokeLater(() -> {
			BasicApplication ex = new BasicApplication();
			ex.setVisible(true);
		});
	}

}
