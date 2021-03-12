package com.reena.lambda;

public class Apple {
	
	int weight;
	String color;
	
	public Apple() {}
	
	public Apple(int weight) {
		super();
		this.weight = weight;
	}
	
	public Apple(int weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", color=" + color + "]";
	}

}
