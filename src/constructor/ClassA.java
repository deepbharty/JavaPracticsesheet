package constructor;

public class ClassA {
	ClassB obj;
	
	void A(ClassA classA){
		
		System.out.println("This is constructor");
	}
	
	public void show() {
		A(this);
	}

}
