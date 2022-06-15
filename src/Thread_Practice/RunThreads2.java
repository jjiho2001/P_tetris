package Thread_Practice;

public class RunThreads2 {

	public RunThreads2() {
		
	}
	
	public void runBasic2() {
		RunnableSample[] runnable = new RunnableSample[5];
		ThreadSample[] thread = new ThreadSample[5];
		
		int loop;
		for (loop = 0; loop < 5; loop++) {
			
			runnable[loop] = new RunnableSample();
			thread[loop] = new ThreadSample();
			
			new Thread(runnable[loop]).start();
			thread[loop].start();
		}
		
		System.out.println("RunThreads.runBasic() method is ended");
	}

	public static void main(String[] args) {
		
		RunThreads2 threads = new RunThreads2();
		threads.runBasic2();

	}

}
