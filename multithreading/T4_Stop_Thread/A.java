package T4_Stop_Thread;

public class A extends Thread {
	boolean stop = false;

	public void run() {
		while (true) {
			System.out.println("I am Alive");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
			if(stop){
				break;
			}
			
		}
	}

}
