package mathsPractise;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the number");
		
		int a=sc.nextInt();
		int value=a;
		
		for (int i=1; i<=10;i++) {
			
			int Table=value*i;
			
			System.out.println(Table);
		}
	}

}
