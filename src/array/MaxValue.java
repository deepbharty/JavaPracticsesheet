package array;

public class MaxValue {
	
	public static void main(String[] args) {
		
		/*
		 * 15 23 11
		 * 08 15 14
		 * 17 35 21*/
		int a[][]= {{15,23,11},{8,5,14},{17,35,23}};
		
		//int a[]= {22, 12, 33, 3, 40, 55, 76, 11, 9, 8, 97};
		int max= a[0][0];
		int row, col;
		System.out.println("Max value intially set to "+max);
		for(row=0;row<a.length; row++) {
			
			{for(col=1;col<=row; col++) {
			
			if(a[row][col]>max) {
				
				max=a[row][col];
				
				System.out.println("Current Max Value is"+max);
			}
		}
	}

	}System.out.println("Maximumvalue of array is"+max);
		
	}}
