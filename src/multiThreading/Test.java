package multiThreading;

public class Test implements Runnable{
	public static Thread thread1;
	public static Test obj;

	public static void main(String[] args) {
		obj = new Test();
		thread1=new Thread(obj);
		
		System.out.println("State thread1 after creating it "+thread1.getState());
		thread1.start();
		
		System.out.println("state of thread1 after calling .start() method on it "+thread1.getState());

	}
	public void run()
	{
		thread myThread = new thread();
		Thread thread2 = new Thread(myThread);
		
		System.out.println("state of thread2 after creating it "+thread2.getState());
		thread2.start();
		
		System.out.println("state of thread 2 after calling .sleep() method on it "+thread2.getState());
		
		
		try {
			
			Thread.sleep(200);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("state of thread 2 after calling .sleep() method on it "+thread2.getState());
		
		try {
			thread2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("state the thread2 when it has finished its excecution "+thread2.getState());
		
		
	}

}
