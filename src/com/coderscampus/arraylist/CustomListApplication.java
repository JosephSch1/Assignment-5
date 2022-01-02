package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {
		// Here is an example of the instantiation of the custom array list. Any data type can be applied.
		CustomList<String> tests = new CustomArrayList<>(); 
		
		tests.add("Initial test String");
		System.out.println("Initial size of test list: " + tests.getSize());
		
		System.out.println("-----");
		
		for (int i = 0; i < 20; i++)  {
			tests.add("A test String");
			System.out.println(tests.get(i));
		}
		
		System.out.println("New size of test list: " + tests.getSize());

	}

}
