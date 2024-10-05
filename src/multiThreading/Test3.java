package multiThreading;

public class Test3  extends Thread
{
	public void run() {
		System.out.println("Inside the run");
	}
	public static void main(String[] args) {
		Test3 t1=new Test3();
		Test3 t2=new Test3();
		Test3 t3=new Test3();
		
		System.out.println("t1 thread priority "+t1.getPriority());
		System.out.println("t2 thread priority "+t2.getPriority());
		System.out.println("t3 thread priority "+t3.getPriority());
		
		t1.setPriority(3);
		t2.setPriority(5);
		t3.setPriority(7);
		
		System.out.println("t1 thread priority "+t1.getPriority());
		System.out.println("t2 thread priority "+t2.getPriority());
		System.out.println("t3 thread priority "+t3.getPriority());
		
		System.out.println("Currently excecuting thread "+Thread.currentThread().getName());
		
		System.out.println("main thread "+Thread.currentThread().getPriority());
		
		try {
			Thread.currentThread().setPriority(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("Main thread priority "+Thread.currentThread().getPriority());
		
	}

}
