package list.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class DemoLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		System.out.println(list);
		
		ListIterator<String> itr= list.listIterator();
		
	
		
		while(itr.hasNext()) {
			
	String s= itr.next();
		
	System.out.println(s);
	
		}
		System.out.println("***************************");
		while(itr.hasPrevious()) {
			
			String s1= itr.previous();
				
			System.out.println(s1);
			
				}
	}

}
