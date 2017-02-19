package T2_Create_Thread;

public class A extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println("Hi  " + Thread.currentThread().getName() + " " + Thread.currentThread().getState());
		}
	}

	public static void main(String[] args) {

		A a = new A();
		a.start();
		// a.run();

		A a1 = new A();
		a1.start();

		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println("Hi  " + Thread.currentThread().getName() + " " + Thread.currentThread().getState());
		}

	}
}
