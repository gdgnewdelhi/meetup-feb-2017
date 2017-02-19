package T3_Synchronized_Keyword.singleton;



public class A {

	private static A a;

	private A() {

	}
	
	public void fun(){
		synchronized (this) {
			
		}
	}

	public static A getObjectOfA() {
		if(a==null){
		synchronize(){
			if (a == null) {
				
					a = new A();
				}
			}
		}
		
		return a;
	}
	
	
	
	
	
	
	

}
