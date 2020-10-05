package com.numberplaylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

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
	}

}
