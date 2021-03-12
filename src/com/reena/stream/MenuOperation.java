package com.reena.stream;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class MenuOperation {

	public static void main(String[] args) {
		
		List<Dish> menu = getMenu();
		
		System.out.println("=====three High Calory dish name====");
		List<String> threeHighCalorydishanme = 
				menu.stream()
				.filter(d->d.getCalories()>300)
				.map(Dish::getName)
				.limit(3)
				.collect(toList());
		threeHighCalorydishanme.forEach(System.out::println);
		
		System.out.println("====Filter veg dishes===");
		menu.stream()
			.filter(Dish::isVegetarian)
			.map(Dish::getName)
			.forEach(System.out::println);
		
		
		System.out.println("====Skip 3 high calory dish===");
		menu.stream()
			.sorted((d1, d2)-> d2.getCalories().compareTo(d1.getCalories())) 
			.skip(3)
			.map(Dish::getName)
			.forEach(System.out::println);
		
		System.out.println("==== 3 highiest calory dish===");
		menu.stream()
			.sorted((d1, d2)-> d2.getCalories().compareTo(d1.getCalories()))
			.limit(3)
			.map(Dish::getName)
			.forEach(System.out::println);
		
		System.out.println("==== Any dish less than equal 100 K ===");
		boolean flag = menu.stream()
			.anyMatch(d->d.getCalories()<=100);
		System.out.println(flag);
		
		System.out.println("==== all match dish greater than  100 K ===");
		boolean all = menu.stream()
			.noneMatch(d->d.getCalories()>100);
		System.out.println(all);
		
		System.out.println("==== none match dish less than  100 K ===");
		boolean none = menu.stream()
			.noneMatch(d->d.getCalories()<100);
		System.out.println(none);
		
				
	}

	private static List<Dish> getMenu() {
		List<Dish> menu = new ArrayList<>();
		menu.add(new Dish("pork", false, 800, Dish.Type.MEAT));
		menu.add(new Dish("beef", false, 700, Dish.Type.MEAT));
		menu.add(new Dish("chicken", false, 400, Dish.Type.MEAT));
		menu.add(new Dish("french fries", true, 530, Dish.Type.OTHER));
		menu.add(new Dish("rice", true, 350,Dish.Type.OTHER));
		menu.add(new Dish("pizza", true, 500,Dish.Type.OTHER));
		menu.add(new Dish("prawns", false, 800,Dish.Type.FISH));
		menu.add(new Dish("apple", true, 200,Dish.Type.FRUIT));
		menu.add(new Dish("orange", true, 100,Dish.Type.FRUIT));
		menu.add(new Dish("roti", true, 200,Dish.Type.OTHER));
		return menu;
	}
}
