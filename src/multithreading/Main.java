package multithreading;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("We are now in thread: "+ Thread.currentThread().getName());
				System.out.println("Current thread priprity is: "+ Thread.currentThread().getPriority());
			}
		}) {
			
		};
		thread.setName("First thread");
		System.out.println("We are in thread: "+ Thread.currentThread().getName()+ " before starting a new thred");
		//Thread.sleep(10000);
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();
		//Thread.sleep(10000);
		System.out.println("We are in thread: "+ Thread.currentThread().getName()+ " after starting a new thred");
		
		Thread.sleep(10000);
	}

}
