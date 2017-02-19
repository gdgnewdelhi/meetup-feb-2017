package T4_Stop_Thread;

public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a.stop = true;
	}
}
