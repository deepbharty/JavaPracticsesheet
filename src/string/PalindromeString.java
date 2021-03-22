package string;

public class PalindromeString {
	public static void main(String[] args) {
		
	String MyName="HannaH";
		
		String ReverseName="";
	//Writing for loop for reversing the string
		
		for(int i=MyName.length()-1;i>=0;i--) {
			
			ReverseName=ReverseName+MyName.charAt(i);
		}
		System.out.println(ReverseName);
		// Doing comparison between both names
		
		if(MyName.equals(ReverseName)) {
			
			System.out.println("This is a palindrome string");
		}
		
	}
	
	}

