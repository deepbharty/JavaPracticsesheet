package string;

public class ComparisonDemo {

	
	
	public static void main(String[] args) {
		
		String s= "deepak bharty" ;
		
		
		String s1=s.substring(0, 1).toUpperCase()+s.substring(1,6);
		
		String s2=s.substring(7, 8).toUpperCase();
		
				//.toUpperCase()+s.substring(7,13);
		System.out.println(s1+s2);
			
		}
	}

	
