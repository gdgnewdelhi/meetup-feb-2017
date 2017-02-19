package T3_Synchronized_Keyword.example;

public class Test {
	public static void main(String[] args) {
		
		A a = new A();
		T1 t1 = new T1(a);
		T2 t2 = new T2(a);
		t1.start();
		t2.start();
	}
}
