package Thread_Practice;

public class ThreadTestMain {

	public ThreadTestMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Runnable task = new ThreadTest();
		Thread thread_01 = new Thread(task);
		
		thread_01.start();
		
		Thread thread_02 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println("thread_02 : " + i);
				}
			}
		});
		
		thread_02.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("MainThread() : " + i);
		}
				
				

	}

}
