 package runnable;

public class HelloRunnable implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Hello .. Welcome to Capgemini .."+ Thread.currentThread().getName());

		
	}

}
