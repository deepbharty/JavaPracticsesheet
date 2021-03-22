package array;

import java.util.HashMap;

public class DupliacteFindings {
	public static void main(String[] args) {
		
	
	
	String name[]={"Deepak", "Rahul", "Deepak", "Rahul", "Shiva"};
	
	for (int i=0; i<name.length; i++) {
		
		for (int j=i+1; j<name.length; j++) {
			
		String str=name[i];
		if(str.equals(name[j])) {
			
	       System.out.println("dupliacte name is"+str);
		}
		
	}}
	
	System.out.println("***************Hash map technique******************");
	
	HashMap <String,Integer> map=new HashMap<>();
	
	for (int i=0; i<name.length; i++) {
		
	if(map.containsKey(name[i])) {
		
		int count=map.get(name[i]);
		
				map.put(name[i],count+1);
	}
	else {
		map.put(name[i],1);
	}
		
	}
	System.out.println(map);
}}