package constructor;

public class Demo1 {
	int a, b,c;
	Demo1(int a, int b, int c){
		
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void cal() {
		
		int z=a+b*c;
		
		System.out.println(z);
	}
	

	public static void main(String[] args) {
		
	
	Demo1 d= new Demo1(3,4,5);
	
	d.cal();
}
}