package string;

public class splitDemo {

	public static void main(String[] args) {
		
		String s="my name is deepak bharty";
		
		
		String [] s1=s.split(" ");
		
		for(int i=s1.length-1;i>=0;i--) {
			
			String name= s1[i].substring(0,1).toUpperCase()+s1[i].substring(1);
			
			System.out.println(name);
		}
	}
}
