package com.reena.stream;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamBuilder {
	
	public static void main(String[] args) {
		
		//empty stream
		Stream<String> emptyStream = Stream.empty();
		emptyStream.forEach(System.out::println);
		
		//stream from values
		Stream<String> stream = Stream.of("Java8", "Lambda", "In", "Action");
		stream.map(String::toUpperCase).forEach(System.out::println);
		
		//fromArray();
		
		fromFile();
		
		//create Infinite stream
		Stream.iterate(2, n->n+2).limit(10).forEach(System.out::println); //10 even number
		
	}
	
	public static void fromFile() {
		long uniqueWord = 0;
		
		try(Stream<String> lines= Files.lines(Paths.get("data.txt"), Charset.defaultCharset())){
			uniqueWord = lines.flatMap(line->Arrays.stream(line.split(" ")))
					.distinct()
					.count();
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("unique Word: "+uniqueWord);
	}

	public static void fromArray() {
		int[] numbers = {2, 4, 7, 1, 9, 1, 4};
		System.out.println(Arrays.stream(numbers).count());
		System.out.println(Arrays.stream(numbers).sum());
		System.out.println(Arrays.stream(numbers).average());
		
		System.out.println(Arrays.stream(numbers).reduce(1, (a,b)->a*b));
		
		Arrays.stream(numbers).distinct().forEach(System.out::println);
		Arrays.stream(numbers).filter(a->a>4).forEach(System.out::println);
		
		System.out.println(Arrays.stream(numbers).anyMatch(a->a==9));
	}
	
	
}
