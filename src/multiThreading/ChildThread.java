package multiThreading;

public class ChildThread extends Test1{
	@Override
	public void run()
	{
		//print  the statement whenever child thread is called
		for (int i = 0; i < 5; i++) {
			System.out.println("Child thread");
		}
	}

}
