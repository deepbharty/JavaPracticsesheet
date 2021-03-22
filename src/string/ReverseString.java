package string;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String MyName="Deepak Bharty";
		
		System.out.println(MyName.length());
		
		String ReverseName="";
	//Writing for loop for reversing the string
		
		for(int i=MyName.length()-1;i>=0;i--) {
			
			ReverseName=ReverseName+MyName.charAt(i);
		}
		System.out.println(ReverseName);
	
	
	//Using StringBuffer Class to reverse it.
	
	StringBuffer sb= new StringBuffer("Deepak Bharty");
	
	System.out.println(sb.reverse());
	
	
}}
