package com.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SearchingUsingHashSet {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<> (Arrays.asList(10,20,30));
		boolean found = set.contains(10);
		System.out.println(found);
	}

}
