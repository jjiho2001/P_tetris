package Thread_Practice;

public class RunThreads {

	public RunThreads() {
		
	}
	
	void runBasic() {
		RunnableSample runnable = new RunnableSample();
		new Thread(runnable).start();
		
		ThreadSample thread = new ThreadSample();
		thread.start();
		
		System.out.println("RunThreads.runBasic() method is ended");
	}

	public static void main(String[] args) {
		
		RunThreads threads = new RunThreads();
		threads.runBasic();

	}

}
