package learning.java8.nileshsirwebinar;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MethodRefDemo03Main {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("It's", "All", "Functional");
		
		for (String str : list) // Iterable --> iterator()
			System.out.println(str);
		System.out.println();
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		System.out.println();

		// list.forEach() with lambda
		list.forEach(s -> System.out.println(s));
		
		// list.forEach() with method reference
	}
}