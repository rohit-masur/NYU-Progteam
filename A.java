package edu.nyu.progteam;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		int[] arr = new int[100];
		Scanner sc = new Scanner(System.in);
		int noOfLines = sc.nextInt();

		while (noOfLines > 0) {
			int sizeOfArray = sc.nextInt();

			for (int i = 0; i < sizeOfArray; i++) {
				arr[i] = sc.nextInt();
			}

			int elemToBeSearched = sc.nextInt();
			int position = search(arr, sizeOfArray, elemToBeSearched);
			System.out.println(position);
			noOfLines--;
		}
		sc.close();
	}

	private static  int search(int[] arr, int sizeOfArray, int elemToBeSearched) {

		for (int i = 0; i < sizeOfArray; i++) {
			if (arr[i] == elemToBeSearched) {
				return i;
			}
		}
		return -1;
	}

}
