package array;

public class ArraySum {
	//Create a method which accept array and return sum of all Array
	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5};
		
		//This method will return sum
		int sum= SumArray(a);
		
		System.out.println(sum);
	}
	
	private static int SumArray(int[] a) {
		
		int sum=0;
		
		for (int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
		}
		
		return sum;
		// TODO Auto-generated method stub
		
	}

}
