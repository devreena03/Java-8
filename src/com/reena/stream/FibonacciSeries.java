package com.reena.stream;

import java.util.stream.Stream;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		//fibonacci tuples
		Stream.iterate(new int[] {0, 1},n->new int[] {n[1], n[0]+n[1]})
				.limit(10)
				.forEach(n->System.out.println("("+n[0]+","+n[1]+")"));
		
		//fibonacci Series
		Stream.iterate(new int[] {0, 1},n->new int[] {n[1], n[0]+n[1]})
			.limit(10)
			.map(n->n[0])
			.forEach(System.out::println);
	}

}
