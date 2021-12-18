package com.stockers.services;

import com.stockers.stocks.Stocks;

public class StockComparision {
	public static int noOfStocksRoseToday(Stocks[] stocksArr) {
		int noOfStocksRisedToday = 0;
		for (int i = 0; i < stocksArr.length; i++) {
			if (stocksArr[i].DidPriceRiseToday() == true)
				noOfStocksRisedToday++;
		}
		return noOfStocksRisedToday;
	}

	public static int noOfStocksFellToday(Stocks[] stocksArr) {
		int noOfStocksFellToday = 0;
		for (int i = 0; i < stocksArr.length; i++) {
			if (stocksArr[i].DidPriceRiseToday() == false)
				noOfStocksFellToday++;
		}
		return noOfStocksFellToday;
	}
}
