package com.day2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SearchingUsingStreams {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("brahma", "vishnu", "maheshwar");

		Optional<String> result = names.stream().filter(name -> name.equals("maheshwar")).findFirst();
		result.ifPresent(System.out::println);
	}
}
