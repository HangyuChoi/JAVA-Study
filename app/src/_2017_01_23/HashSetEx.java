package _2017_01_23;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("4");
		set.add("5");
		set.add("6");
		
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		int size = set.size();
		System.out.println("ÃÑ °´Ã¼ ¼ö : " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("ÃÑ °´Ã¼¼ö : " + set.size());
		
		for (String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) { System.out.println("ºñ¾î ÀÖÀ½"); }
		
	}
}
