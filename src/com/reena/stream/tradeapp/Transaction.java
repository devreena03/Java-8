package com.reena.stream.tradeapp;

public class Transaction {
	
	private Trader trader;
	private int year;
	private Integer value;
	
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {
		return trader;
	}

	public int getYear() {
		return year;
	}

	public Integer getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
	
}
