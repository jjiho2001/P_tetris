package Thread_Practice;

public class ThreadName extends Thread{

	public ThreadName() {
		// TODO Auto-generated constructor stub
		setName("ThreadB");
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("작업스레드 이름 : " + getName());
		}
	}

}
