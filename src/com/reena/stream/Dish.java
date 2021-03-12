package com.reena.stream;

public class Dish {
	private String name;
	private boolean vegetarian;
	private Integer calories;
	private Type type;
	
	public Dish(String name, boolean vegetarian, int calories, Type type) {
		super();
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}
	
	public enum Type { MEAT, FISH, OTHER , FRUIT}

	public String getName() {
		return name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public Integer getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}
	
}
