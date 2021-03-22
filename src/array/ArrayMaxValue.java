package array;

public class ArrayMaxValue {

	/*3 4 5
	 *2 6 8
	 *7 1 9 */

	public static void main(String[] args) {
	
		//declaring 2D array
		int test[][]= { {3,4,5} , {2,6,8} ,{ 7,1,9}};
		
	int	max=test[0][0];
	
	System.out.println(max);
	
	//Parsing the array values
	
		for(int row=0;row<3; row++) {
		
			for(int column=0;column<3;column++) {
				
				if(test[row][column]>max) {
					
					max=test[row][column];
					System.out.println("Maximum value of the test array is" +max);
				}
			}
		}
	}
}