package Thread_Practice;

public class ThreadNameMain {

	public ThreadNameMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� : " + mainThread.getName());
		
		Thread threadA = new Thread() {
			
			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println("�۾������� �̸� : " + getName());
				}
			}
		};
		threadA.start();
		
		ThreadName threadB = new ThreadName();
		threadB.start();
		System.out.println("asdf");
	}
}
