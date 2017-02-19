package T3_Synchronized_Keyword.example;

class T1 extends Thread {
	A a;
	T1(A a){
		this.a = a;
	}
	@Override
	public void run() {
		a.fun(100);
	}
}
