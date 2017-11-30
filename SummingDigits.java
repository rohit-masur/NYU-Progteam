package edu.nyu.progteam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SummingDigits {

	public static void main(String[] args) {
		List<Long> arrList = new ArrayList<Long>();
		List<Long> resList = new ArrayList<Long>();
		Scanner sc = new Scanner(System.in);
		
		long i = sc.nextLong();
		
		while (i != 0) {
			arrList.add(i);
			i = sc.nextLong();

		}

		for (long number : arrList) {

			long res = summed(number);
			resList.add(res);
		}

		for (long res : resList) {
			System.out.println(res);
		}
		sc.close();
	}

	public static long summed(long num) {
		long sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		sum = (sum < 10) ? sum : summed(sum);
		return sum;
	}
}
