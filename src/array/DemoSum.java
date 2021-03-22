package array;

public class DemoSum {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};
		int Sum=0;
		
		for(int i=0;i<a.length;i++) {
			
			Sum=Sum+a[i];
		}
		System.out.println("Sum Value is "+Sum);
	}

}
