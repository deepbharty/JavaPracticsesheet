package string;

import java.util.Scanner;

public class RepeatingCharacters {

public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	
	String str=sc.nextLine();
	
System.out.println("Characters"+"\t"+ "Frequency");

	
for(char ch='a'; ch<='z';ch++ ) {
	
	int count=0;
	for(int i=0;i<str.length(); i++) {
		
		
		if(ch==str.charAt(i)) {
			
			count++;
		}
		if (count!=0) 
		System.out.println(ch + "\t\t" +count);
	}
			
		}
	}}





