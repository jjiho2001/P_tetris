package Thread_Practice;

public class ThreadNameMain {

	public ThreadNameMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());
		
		Thread threadA = new Thread() {
			
			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println("작업스레드 이름 : " + getName());
				}
			}
		};
		threadA.start();
		
		ThreadName threadB = new ThreadName();
		threadB.start();
		System.out.println("asdf");
	}
}
