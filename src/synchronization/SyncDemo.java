package synchronization;

public class SyncDemo {
	public static void main(String[] args) {
		Sender send = new Sender();
		ThreadSend a1=new ThreadSend("Hi", send);
		ThreadSend a2 = new ThreadSend("Bye", send);
		
		a1.start();
		a2.start();
		
		try {
			a1.join();
			a2.join();
			
		} catch (Exception e) {
			System.out.println("Intruptted");
		}
	}

}
