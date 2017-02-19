package T1_Intro;

public class A {
	public static void main(String[] args) throws InterruptedException {
	
		
		Thread t = Thread.currentThread();
		
		

		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.getState());
		
		
		
	}
}
