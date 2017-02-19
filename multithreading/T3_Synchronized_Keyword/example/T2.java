package T3_Synchronized_Keyword.example;

public class T2 extends Thread {
	A a;
	T2(A a){
		this.a = a;
	}
	@Override
	public void run() {
		a.fun(30);
	}
}
