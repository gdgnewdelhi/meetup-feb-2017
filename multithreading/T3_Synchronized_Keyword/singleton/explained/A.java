package T3_Synchronized_Keyword.singleton.explained;

public class A {

	

	private A() {

	}

	public static A getObjectOfA() {
		return new A();
	}

}
