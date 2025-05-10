package com.day2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SearchingUsingList {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30);
		int index = list.indexOf(10);
		System.out.println(index);
		boolean found = list.contains(10);
		System.out.println(found);
		Optional<Integer> result = list.stream().filter(name->name.equals(10)).findFirst();
		result.ifPresent(System.out::println);
	}

}
