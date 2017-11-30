package edu.nyu.progteam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Test {
	/**
	 * Iterate through each line of input.
	 */

	static String test="";

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		while ((line = in.readLine()) != null) {

			if (line.length() == 0)
				continue;
			String[] lineArray = line.split(":");
			double weightLimit = Integer.parseInt(lineArray[0].trim());
			String[] items = lineArray[1].trim().split(" ");
			int index[] = new int[items.length];
			double val[] = new double[items.length];
			double wt[] = new double[items.length];

			for (int i = 0; i < items.length; i++) {
				String[] itemDetails = items[i].split(",");
				index[i] = Integer.parseInt(itemDetails[0].substring(1));
				wt[i] = Double.parseDouble(itemDetails[1]);
				val[i] = Double.parseDouble(itemDetails[2].substring(1, itemDetails[2].length() - 1));
				
			}
			combineItems(weightLimit, wt, val, items.length);
			System.out.println(test);
			test = "";
		}

	}

	static double combineItems(double W, double wt[], double val[], int n) {
		if (n == 0 || W == 0)
			return 0;

		if (wt[n - 1] > W)
			return combineItems(W, wt, val, n - 1);

		else {
			double a = val[n - 1] + combineItems(W - wt[n - 1], wt, val, n - 1);
			double b = combineItems(W, wt, val, n - 1);
			if(a>b) {
				test+=n-1;
				return a;
			} else {
				return b;
			}
		}
	}

}