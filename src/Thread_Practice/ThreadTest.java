package Thread_Practice;

public class ThreadTest implements Runnable{

	public ThreadTest() {
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("thread_01 : " + i);
		}
	}

}
