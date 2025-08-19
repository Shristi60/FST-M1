package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> colours=new HashMap<Integer,String>(); 
		colours.put(0, "Black");
		colours.put(1, "Blue");
		colours.put(2, "Yellow");
		colours.put(3, "Green");
		colours.put(4, "Pink");
		
		System.out.println(colours);
		
		colours.remove(2);
		System.out.println("Green colour exists: "+colours.containsValue("Green"));
		System.out.println("Size of map: "+colours.size());
		
		System.out.println(colours);

	}

}
