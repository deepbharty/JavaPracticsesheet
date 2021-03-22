package mathsPractise;

import java.util.Scanner;

public class Factorial {
	
	
	public static void main(String[] args) {
		int num, fact=1;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter the number");
		
		num= sc.nextInt();
		
		
		if (num<0) {
			System.out.println("Number should be non-negative");}
		
		else {
			
			for(int i=1;i<=num;i++) {
				
				fact=fact*i;	
			}
			System.out.println(fact);
		}
	}

}
