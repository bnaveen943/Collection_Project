package multiThreading;

public class Test1 extends Thread {
	public static void main(String[] args) {

		// Getting reference to main method
		Thread t = Thread.currentThread();

		// Getting the name of main Thread
		System.out.println("Current Thread " + t.getName());

		// Changing the name of main thread
		t.setName("Naveen");
		System.out.println("After name change: " + t.getName());

		// getting the priority of main thread
		System.out.println("Main thread priority: " + t.getPriority());

		// Setting the priority of main thread max
		t.setPriority(MAX_PRIORITY);

		// print and display main thread priority
		System.out.println("Main thread new priority " + t.getPriority());

		for (int i = 0; i < 5; i++) {
			System.out.println("Main thread");
		}

		// main thread creating a child
		Thread ct = new Thread() {

			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Child thread");
				}
			}
		};

		System.out.println("Child thread priority " + ct.getPriority());

		ct.setPriority(MIN_PRIORITY);

		System.out.println("Child thread new Priority " + ct.getPriority());

		ct.start();

	}

}
