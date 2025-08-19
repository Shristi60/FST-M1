package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList= new ArrayList<>();
		myList.add("Monica");
		myList.add("Chandler");
		myList.add("Joey");
		myList.add("Phoebe");
		myList.add("Ross");
		for(String str: myList)
		{
			System.out.println(str);
		}
		
		System.out.println(myList.get(2));
		System.out.println("Does Ross exist in the list? "+myList.contains("Ross"));
		System.out.println("Size of Array List: "+myList.size());
		myList.remove(3);
		System.out.println("Size of Array List: "+myList.size());
		

	}

}
