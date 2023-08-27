package com.bean;

import java.util.Collections;
import java.util.List;

public class CollectionsEmptyList {

	public static void main(String[] args) {
		/*
		 * In Java, the Collections class provides a utility method called 'emptyList()' which 
		 * returns an immutable empty list(a list with no elements).
		 * This can be useful when you need to work with an empty list 
		 * without creating a new instance each time
		 * 
		 */
	List<String> emptyList=Collections.emptyList();
	System.out.println("Empty List:"+emptyList);
	System.out.println("Size of Empty List"+emptyList.size());
	
	/*
	 * Immutable empty List.
	 * The size of this list is 0,
	 * And trying to add elements to it will
	 * result in an 'UnsupportedOperationException'
	 * because the list is designed to be read only
	 */
	
/*
 * Remember that because that returned list is immutable 
 * you cannot add, remove, or modify its elements. It's 
 * primarily useful when you need to provide an empty list to
 * methods or return an empty list from methods without creating 
 * a new instance each time.
 */
	}

}
