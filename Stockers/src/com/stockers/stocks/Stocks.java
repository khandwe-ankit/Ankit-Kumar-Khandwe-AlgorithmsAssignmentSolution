package com.stockers.stocks;

public class Stocks {
	private int stockNumber;
	private double stockPrice;
	private boolean didPriceRoseToday;

	public Stocks(int stockNumber, double stockPrice, boolean didPriceRoseToday) {
		super();
		this.stockNumber = stockNumber;
		this.stockPrice = stockPrice;
		this.didPriceRoseToday = didPriceRoseToday;
	}

	public int getStockNumber() {
		return stockNumber;
	}

	public void setStockNumber(int stockNumber) {
		this.stockNumber = stockNumber;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public boolean DidPriceRiseToday() {
		return didPriceRoseToday;
	}

	public void setDidPriceRoseToday(boolean didPriceRoseToday) {
		this.didPriceRoseToday = didPriceRoseToday;
	}

}
