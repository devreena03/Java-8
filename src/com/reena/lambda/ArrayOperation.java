package com.reena.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntPredicate;

public class ArrayOperation {

	public static void main(String[] args) {
		
		//jprint();
		
		List<Integer> asList = Arrays.asList(1,3,5,6,8,7,9,4);
		
		//evenNumber(asList);
		
		List<Integer> evenNumber = filter(asList, (int i)->i%2==0);
		accept(evenNumber, (i)-> System.out.println(i));
		
		List<Integer> oddNumber = filter(asList, (int i)->i%2!=0);
		accept(oddNumber, (i)-> System.out.println(i));
		
		//sorting with comparator and implementing compare method 
		asList.sort((i, j)-> i.compareTo(j));
		accept(asList, (i)-> System.out.print(i));
		
		//Decreasing order
		asList.sort((i, j)-> j.compareTo(i));
		accept(asList, (i)-> System.out.print(i));
		
		 
	}

	//filter Values Based On Given Condition
	private static List<Integer> filter(List<Integer> asList, IntPredicate t) {
		List<Integer> result = new ArrayList<>();
		for(int i: asList) {
			if(t.test(i)) {
				result.add(i);
			}
		}
		return result;
	}

	private static void evenNumber(List<Integer> numbers) {
		numbers.forEach((Integer i)-> {
			if(i%2==0) {
				System.out.println(i);
			}
		});
	}

	private static void print() {
		
		List<String> list = Arrays.asList("Home","Hi","Some");
		
		//with Lambda
		list.forEach((String s)->System.out.println(s));
		
		//own print method
		accept(list, (String s)->System.out.println(s));
	}
	
	private static <T> void accept(List<T> value, Consumer<T> t) {
		for(T input: value) {
			t.accept(input);
		}
	}
}
