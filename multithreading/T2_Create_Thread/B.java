package T2_Create_Thread;

public class B implements Runnable{

	@Override
	public void run() {
		
	}
	
	public static void main(String[] args) {
		B b = new B();
		Thread t = new Thread(b);
		t.start();
	}

}
