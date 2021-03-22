package constructor;

public class Demo2 {

//This keyword is being used here to access current class method.	
	public void Demo2(){
		
		System.out.println("Hellow World");
	}
	
	public void demo1() {
		System.out.println("lets rock");
	}
	public void cal() {
		
		System.out.println("You are here ");
		this.Demo2();
		this.demo1();
	}
	

	public static void main(String[] args) {
		
	
	Demo2 d= new Demo2();
	
	d.cal();
}}
