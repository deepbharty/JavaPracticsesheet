package array;

public class ArrayMinValue {
	
	/*3 4 5
	 *2 6 8
	 *7 1 9 */

	public static void main(String[] args) {
	
		//declaring 2D array
		int test[][]= { {3,4,5} , {2,6,8} ,{ 7,1,9}};
		
	int	min=test[0][0];
	
	//Parsing the array values
	
		for(int row=0;row<test.length; row++) {
		
			for(int column=0;column<test[row].length;column++) {
				
				if(test[row][column]<min) {
					
					min=test[row][column];
					System.out.println("Minimum value of the test array is" +min);
				}
			}
		}
	}
}
