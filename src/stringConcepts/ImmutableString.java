package stringConcepts;

public class ImmutableString {
	
	public static void main(String[] args) {
		String s="Deepak";
		
		System.out.println(s);
		
		String p=s.concat("Bharty");
		
		System.out.println(p);
		
		String s1= new String("Deepak");
		
		System.out.println(s1);
		
		String s2=s+s1;
		
		System.out.println(s2);
		
		String num1="100";
		
		String num2="ree";
		
		System.out.println(num1+num2);
	}

}
