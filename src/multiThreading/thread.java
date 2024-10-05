package multiThreading;

public class thread implements Runnable{
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("State the thread1 while it called join() it joined on method-2");

	}

}
