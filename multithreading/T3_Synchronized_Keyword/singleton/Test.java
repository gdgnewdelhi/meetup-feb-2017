package T3_Synchronized_Keyword.singleton;


public class Test {
	public static void main(String[] args) {
		//A a = new A();
		A a = A.getObjectOfA();
		A a1 = A.getObjectOfA();
	}
}
