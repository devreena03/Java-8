package com.reena.lambda;

public class MathOperationTest {
	
	public static void main(String[] args) {
		MathOperationTest test = new MathOperationTest();
		
		MathOperation sum = (int a,int b) -> a+b;
		MathOperation diff = (int a,int b) -> a-b;
		MathOperation multi = (int a,int b) -> a*b;
		MathOperation div = (int a,int b) -> a/b;
		
		System.out.println(sum.operate(2, 3));
		System.out.println(diff.operate(2, 3));
		System.out.println(multi.operate(2, 3));
		System.out.println(div.operate(6, 3));
		
		test.print(12, 13,(int a, int b)->a+b);
		
	}
	
	public void print(int a, int b, MathOperation s) {
		System.out.println(s.operate(a, b));
	}

}
