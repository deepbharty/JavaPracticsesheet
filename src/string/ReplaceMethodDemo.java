package string;

public class ReplaceMethodDemo {
	public static void main(String[] args) {
		
		String str= "Deepak Bharty";
		
		String str1=str.replaceAll("Bharty", "Giri");
		
		System.out.println(str1);
		
		Integer x=127;
		
		Integer y=127;
		
		
		// -128 to +127
		
		if (x==y) {
			
			System.out.println("True");
			
		
		}else {
			System.out.println(" false");
		}
	}

}
