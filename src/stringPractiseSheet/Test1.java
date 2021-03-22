package stringPractiseSheet;

// Print HELLO for the given string "AHCECLWLXO"
public class Test1 {
	
	public static void main(String[] args) {
		
		String s="AHCECLWLXO";
		
		String[] split = s.split("");
		
		for (int i = 1; i < split.length; i = i + 2) {
		System.out.print(split[i]);
		}
		
		System.out.println("\n*********************************************");
		

		//2: Print HELLO in CAPITAL letters for the given string "ahceclwlxo"
		
		String s1="ahceclwlxo";
		
String[] split1 = s1.split("");
		
		for (int i = 1; i < split1.length; i = i + 2) {
		System.out.print(split1[i].toUpperCase());
		}
	
		
		
		
		
		
		
				
	}

}
