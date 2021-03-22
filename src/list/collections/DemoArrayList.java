package list.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayList {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		ArrayList list= new ArrayList();
		
		list.add("Deepak");
		list.add("Swati");
		list.add("Aashu");
		list.add("Golu");
		list.add("Molu");
		list.add(123);
		list.add("Polu");
		list.add(0110);
		list.add("Tolu");
		list.add("Folu");
		

		
		System.out.println(list);
		
		System.out.println(list.contains("Deepak"));
		
	System.out.println(list.get(4));
	
	list.set(5, " My Reports ");
	
	list.remove(6);
	System.out.println(list);	
	System.out.println("*********************");	
	
	list.add(6, "dhdgvhv");
	System.out.println("*********************");		
	System.out.println(list);	
	
	Iterator itr=list.iterator();
	
	while(itr.hasNext()){//check if iterator has the elements  
		   System.out.println(itr.next());//printing the element and move to next  
		  }  
		
	list.removeAll(list);
	
	System.out.println(list);}
	
	

}
