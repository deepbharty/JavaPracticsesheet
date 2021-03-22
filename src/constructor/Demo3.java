package constructor;

public class Demo3 {
	int l,b,h;
	public Demo3(int l) {
		
		this.l=l;
	}

	 public void squareArea() {
		 int area=l*l;
		 
		 System.out.println("Square Area is "+ area);
	 }
	
	public Demo3(int l, int b) {
		
		this(l);
		this.b=b;
	}
	
	public void rectArea() {
	
 int area=l*b;
		 
		 System.out.println("Rect Area is "+ area);
	}
	
public Demo3(int l, int b, int h) {
	this(l,b);
	this.h=h;
}

public void cubeArea() {
	
	 int area=l*b*h;
			 
			 System.out.println("Cube Area is "+ area);
		}

public static void main(String[] args) {
	
	Demo3 d= new Demo3(3,4,5);
	
	d.squareArea();
	d.rectArea();
	d.cubeArea();
}
}
