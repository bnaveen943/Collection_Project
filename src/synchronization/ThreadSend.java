package synchronization;

public class ThreadSend extends Thread {
	private String msg;
	Sender sender;
	
	ThreadSend(String m,Sender s)
	{
		msg=m;
		sender=s;
	}
	public void run()
	{
		synchronized (sender) {
			sender.send(msg);
		}
	}
	

}
