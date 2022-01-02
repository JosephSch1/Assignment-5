package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10]; // this is the array that will back the list
	int i = 0; //keeps track of the size of the array being referenced

	@Override
	public boolean add(T item) { 
		if (i == items.length) {
			items = addSize();
		}
		items[i] = item;
		i++;
		return true;
	}
	
    //the addSize method exists to move the previous method into a larger one and return that. 
	private Object[] addSize() { 
		Object[] biggerArray = new Object[i * 2];
		for (int j = 0; j < i; j++) {
			biggerArray[j] = items[j];
		}
		return biggerArray;
	}

	@Override
	public int getSize() {
		return i;
	}

	@Override
	public T get(int index) {
		return (T) items[index];
	}

}