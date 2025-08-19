package activities;

import java.util.HashSet;

public class Activity10 {
	public static void main(String[] args) {
		
		HashSet hs= new HashSet();
		hs.add("Apple");
		hs.add("Banana");
		hs.add("Guava");
		hs.add("Mango");
		hs.add("Kiwi");
		
		System.out.println("Size of hash set: "+hs.size());
		hs.remove("Kiwi");
		hs.remove("Litchi");
		System.out.println("Does the set contain Litchi: "+hs.contains("Litchi"));
		System.out.println(hs);
	}

}
