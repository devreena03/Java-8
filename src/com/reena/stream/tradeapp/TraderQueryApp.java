package com.reena.stream.tradeapp;

import java.util.Arrays;
import java.util.List;

public class TraderQueryApp {
	
	public static void main(String[] args) {
		
		List<Transaction> transactions = transactions();
		
		//1. All transactions in the year 2011 and sort them by value(small to high)
		transactions.stream()
			.filter(t->t.getYear()==2011)
			.sorted((t1,t2)->t1.getValue().compareTo(t2.getValue()))
			.forEach(System.out::println);
		
		//2.what are all unique cities where traders works
		transactions.stream()
			.map((t)->t.getTrader().getCity())
			.distinct()
			.forEach(System.out::println);
		
		//3.Find all traders from CA and sort them by name
		transactions.stream()
			.filter(t->t.getTrader().getCity().equalsIgnoreCase("CA"))
			.map(Transaction::getTrader)
			.distinct()
			.sorted((t1,t2)->t1.getName().compareTo(t2.getName()))
			.forEach(System.out::println);
		
		//4.Return a string of all traders names sorted alphabetically
		transactions.stream()
			.map((t)->t.getTrader().getName())
			.distinct()
			.sorted((s1,s2)->s1.compareTo(s2))
			.forEach(System.out::println);	
		
		//5.are any traders based in UK
		System.out.println(transactions.stream()
			.anyMatch((t)->t.getTrader().getCity().equals("UK"))
		);
	}
	
	private static List<Transaction> transactions(){
		Trader bob = new Trader("Bob", "CA");
		Trader mario = new Trader("Mario", "AU");
		Trader alean = new Trader("Alan", "UK");
		Trader jone = new Trader("Jone", "CA");
		Trader david = new Trader("David", "UK");
		
		List<Transaction> transactions = Arrays.asList(
				new Transaction(david, 2011, 300),
				new Transaction(mario, 2012, 1000),
				new Transaction(alean, 2011, 400),
				new Transaction(jone, 2012, 500),
				new Transaction(bob, 2012, 200),
				new Transaction(david, 2011, 350),
				new Transaction(bob, 2011, 700),
				new Transaction(jone, 2011, 900)
				);
		
		return transactions;
	}

}
