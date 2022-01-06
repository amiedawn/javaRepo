package com.training.mars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1,2,3,4,5);
		//List<Integer> square = (List<Integer>)number.stream().map(n -> n*n).collect(Collectors.toList());

//		System.out.println("Displaying number: ");
	//	for(Integer i:square) {
		//	System.out.println(i);
	//	}
		System.out.println("Displaying numbers: ");
		//num.stream().map(n -> n*n).forEach(x -> System.out.println::println); // method reference
		num.stream().map(n -> n*n).forEach(x -> System.out.println(x));
		
		int sum = num.stream().map(n -> n*n).reduce(0, (ans, i) -> ans + i);
		System.out.println("Sum of squares is: " + sum);
		
		List<String> names = Arrays.asList("Stream", "Sigma", "Reflect", "Java");
		List<String> namesWithS = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		System.out.println("Displaying names: ");
		for(String name:namesWithS) {
			System.out.println(name);
		}
	}

}
