package com.reena.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Comparator.comparing;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {

public static void main(String[] args) {
		
		
		List<Integer> asList = Arrays.asList(1,3,5,6,8,7,9,4);
		
		asList.forEach(System.out::print);
		
		//sorting descending
		asList.sort((s1,s2)->s2.compareTo(s1));
		asList.forEach(System.out::print);
		
		//sorting ascending
		asList.sort(Integer::compareTo);
		asList.forEach(System.out::print);
				
		List<Apple> list = new ArrayList<Apple>();
		list.add(new Apple(2, "red"));
		list.add(new Apple(3, "Green"));
		list.add(new Apple(5, "Green"));
		list.add(new Apple(1, "red"));
		
		list.sort(comparing(Apple::getWeight));
		
		//list.forEach(System.out::println);
		
		//reverse order
		list.sort(comparing(Apple::getWeight).reversed());
		
		//list.forEach(System.out::println);
		
		list = new ArrayList<Apple>();
		
		//constructor - no arg
		Supplier<Apple> s = Apple::new;
		Apple a1 = s.get();
		list.add(a1);
		
		//constructor-1 arg
		Function<Integer, Apple> f = Apple::new;
		Apple a2 = f.apply(10);
		list.add(a2);
		
		//constructor -2 arg
		BiFunction<Integer, String, Apple> b = Apple::new;
		Apple a3 = b.apply(10, "red");
		list.add(a3);
		list.forEach(System.out::println);
		
		
		 
	}
}


