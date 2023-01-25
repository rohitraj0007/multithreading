package multithreading;

public class ThreadExceptionHandling {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				throw new RuntimeException("throwing exception to cause critical error");
			}
		}) {
			
		};
		thread.setName("Bad thread");
		thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("A critical error occured in our thread "+t.getName() + " the error is "+ e.getMessage());
				
			}
		});
		thread.start();
	}

}
