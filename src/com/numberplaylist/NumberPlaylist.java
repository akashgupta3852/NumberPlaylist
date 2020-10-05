package com.numberplaylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NumberPlaylist {

	public static void main(String[] args) {
		System.out.println("Welcome to Number Playlist Program");
		
		List<Integer> numberPlayList = new ArrayList<>();
		System.out.println("Enter the size of the list:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i= 0; i<size; i++)
			numberPlayList.add(i);

		System.out.println("Elements in the list:");
		numberPlayList.stream().forEach(n -> {System.out.println(n);});
		
		Function<Integer, Double> integertoDouble = n -> n.doubleValue();
		numberPlayList.stream().map(integertoDouble).forEach((n) -> {System.out.println("After conversion, element in the number list : "+n);});
		
		List<Double> doubleList = numberPlayList.stream().map(integertoDouble).collect(Collectors.toList());
		System.out.println("List of double values after conversion : "+doubleList);
		
		Predicate<Integer> isEven = n -> n>0 && n%2==0;
		List<Double> evenList = numberPlayList.stream().filter(isEven).map(integertoDouble).collect(Collectors.toList());
		System.out.println("List of even number : "+evenList);
		
		Double firstEvenNumber = numberPlayList.stream().filter(isEven).map(integertoDouble)
				.findFirst()
				.orElse(null);
		System.out.println("First even number : "+firstEvenNumber);
		
		Integer minEvenNumber = numberPlayList.stream().filter(isEven)
				.min((x,y) -> x-y)
				.orElse(null);
		System.out.println("Minimum even number : "+minEvenNumber.doubleValue());
		
		Integer maxEvenNumber = numberPlayList.stream().filter(isEven)
				.min((x,y) -> x+y)
				.orElse(null);
		System.out.println("Maximum even number : "+maxEvenNumber.doubleValue());
		
	}

}
