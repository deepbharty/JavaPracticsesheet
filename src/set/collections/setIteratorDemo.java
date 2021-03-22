package set.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setIteratorDemo {

	
	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		
		set.add("Deepak");
		set.add("Ravi");
		set.add("Suraj");
		set.add("Shyam");
		set.add("Rahul");
		
		System.out.println(set);
		
		Iterator<String> itr= set.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}
}
