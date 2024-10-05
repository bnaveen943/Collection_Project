package multiThreading;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("Entering into deadlock");
		try {
			Thread.currentThread().join();
			System.out.println("This statement will never excecute");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
