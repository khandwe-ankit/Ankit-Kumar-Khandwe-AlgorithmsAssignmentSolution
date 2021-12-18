package com.stockers.driver;

import java.util.Scanner;

import com.stockers.services.SortingSolution;
import com.stockers.services.StockComparision;
import com.stockers.services.StockSearch;
import com.stockers.stocks.Stocks;

public class StockersDriver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of companies");
		int numOfCo = sc.nextInt();
		Stocks[] stocks = new Stocks[numOfCo];
		for (int i = 0; i < numOfCo; i++) {
			System.out.println("Enter current stock price of the company " + (i + 1));
			double stockPrice = sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			boolean didPriceRoseToday = sc.nextBoolean();
			stocks[i] = new Stocks(i + 1, stockPrice, didPriceRoseToday);
		}

		int option;
		do {
			System.out.println("------------------------------------");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("0. press 0 to exit");
			System.out.println("------------------------------------");
			System.out.println();
			option = sc.nextInt();

			switch (option) {
			case 1: {
				// Display the companies stock prices in ascending order
				SortingSolution.displayStocksInAscendingOrder(stocks);
				break;
			}
			case 2: {
				// Display the companies stock prices in descending order
				SortingSolution.displayStocksInDescendingOrder(stocks);
				break;
			}
			case 3: {
				// Display the total no of companies for which stock prices rose today
				int count = StockComparision.noOfStocksRoseToday(stocks);
				System.out.println("Total no of companies whose stock price rose today : " + count);
				break;
			}
			case 4: {
				// Display the total no of companies for which stock prices declined today
				int count = StockComparision.noOfStocksFellToday(stocks);
				System.out.println("Total no of companies whose stock price declined today : " + count);
				break;
			}
			case 5: {
				// Search a specific stock price
				System.out.println("Enter the key value");
				double keyvalue = sc.nextDouble();
				if (StockSearch.doesStockExist(stocks, keyvalue))
					System.out.println("Stock of value " + keyvalue + " is present");
				else
					System.out.println("Value not found");
				break;
			}
			case 0: {
				// Exit the program;
				System.out.println("Exited successfully");
				sc.close();
				System.exit(0);

			}
			default:
				System.out.println("Unexpected value: " + option + ", please enter between 0-5");
			}
		} while (option != 0);
		sc.close();
	}

}
