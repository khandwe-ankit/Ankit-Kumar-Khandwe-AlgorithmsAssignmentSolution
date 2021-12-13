package com.stockers.sorting;

import com.stockers.stocks.Stocks;

public class SortingSolution {

	public static void displayStocksInAscendingOrder(Stocks[] stocks) {
		Stocks[] sortedStocks = sortStocksInAcendingOrder(stocks, 0, stocks.length - 1);
		System.out.println("Stock prices in ascending order are :");
		for (int i = 0; i < sortedStocks.length; i++)
			System.out.print(sortedStocks[i].getStockPrice() + " ");
		System.out.println();
	}

	public static void displayStocksInDescendingOrder(Stocks[] stocks) {
		Stocks[] sortedStocks = sortStocksInAcendingOrder(stocks, 0, stocks.length - 1);
		System.out.println("Stock prices in descending order are :");
		for (int i = sortedStocks.length - 1; i >= 0; i--)
			System.out.print(sortedStocks[i].getStockPrice() + " ");
		System.out.println();
	}

	private static Stocks[] sortStocksInAcendingOrder(Stocks[] stocks, int left, int right) {

		if (left < right) {
			int mid = (left + right) / 2;

			sortStocksInAcendingOrder(stocks, left, mid);
			sortStocksInAcendingOrder(stocks, mid + 1, right);
			mergeSortedStocks(stocks, left, mid, right);
		}
		return stocks;
	}

	private static void mergeSortedStocks(Stocks[] stocks, int left, int mid, int right) {
		int size1 = mid - left + 1;
		int size2 = right - mid;

		Stocks[] leftArr = new Stocks[size1];
		Stocks[] rightArr = new Stocks[size2];

		for (int i = 0; i < size1; i++) {
			leftArr[i] = stocks[left + i];
		}
		for (int i = 0; i < size2; i++) {
			rightArr[i] = stocks[mid + 1 + i];
		}
		int i, j;
		int k = left;
		i = j = 0;
		while (i < size1 && j < size2) {
			// reversing below condition will make it descending order merge sort.
			if (leftArr[i].getStockPrice() < rightArr[j].getStockPrice())
				stocks[k++] = leftArr[i++];
			else
				stocks[k++] = rightArr[j++];
		}
		while (i < size1)
			stocks[k++] = leftArr[i++];
		while (j < size2)
			stocks[k++] = rightArr[j++];
	}

}
