package edu.nyu.progteam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumStocks {

	public static void main(String[] args) throws IOException {

		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(reader);
		String line;

		while ((line = in.readLine()) != null) {
			int days = Integer.parseInt(line);
			String stockPrice = in.readLine();
			long amount = Long.parseLong(in.readLine());
			long[] stockPrices = convertLong(stockPrice);
			long amountSpent = 0;
			long stocksCount = 0;


		
				for (int i = 1; i < stockPrices.length +1; i++) {
					if (amountSpent < (amount - stockPrices[i -1])) {
						for (int j = 1; j <= i; j++) {
							if(amountSpent < (amount - stockPrices[i -1])){
								amountSpent+= stockPrices[i -1];
								stocksCount++;
							}
						}
					}
				
			}
			System.out.println(stocksCount);
		}

	}

	public static long[] convertLong(String stockPrice) {
		String[] ch = stockPrice.split(" ");
		long[] prices = new long[ch.length];
		for (int i = 0; i < ch.length; i++) {
			prices[i] = Long.parseLong(ch[i]);
		}

		return prices;

	}

}
