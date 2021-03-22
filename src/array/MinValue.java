package array;

public class MinValue {

public static void main(String[] args) {
	

	int a[]= {22, 12, 33, 3, 40, 55, 76, 11, 9, 8, 97};
	int min= a[0];
	System.out.println("Minimum value is intially set to "+min);
	int count=0;
	for(int i=0;i<a.length; i++) {
		
		if(a[i]<min) {
			
			min=a[i];
			
			
			System.out.println("Current Min Value is"+min);
		}
		count++;
		System.out.println("count value is"+count);
	}
	System.out.println("Minimum value of array is"+min);
}

}

