package T3_Synchronized_Keyword.example;

public class A {
	int i=0;
	
	Object a1  = new Object();
	public   void  fun(int n) {
	
		for (  ; i <= n; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i * n);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
