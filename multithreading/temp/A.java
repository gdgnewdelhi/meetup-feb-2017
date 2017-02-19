package temp;

public class A {
	static A a;// = new A();

	private A() {
	}

	static A fun() {
		if (a == null) {
			a = new A();
		}
		return a;
	}

	// static void fun2(){
	//
	// }
}
