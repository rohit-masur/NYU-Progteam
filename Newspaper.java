package edu.nyu.progteam;

import java.util.HashMap;
import java.util.Scanner;

public class Newspaper {

	public static void main(String[] args) {
		
		char[] arr = new char[100];
		HashMap<Character, Double> map = new HashMap<Character, Double>();
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int noOfTests = sc.nextInt();
		
		while(noOfTests > 0){
			int noOfChars = sc.nextInt();
			while(noOfChars > 0){
				map.put(sc.next().charAt(0), sc.nextDouble());
				
			noOfChars--;	
			}
			int noOfLines = sc.nextInt();
			while(noOfLines >0){
				sb.append(sc.next());
			noOfLines--;	
			}
			String s = sb.toString();
			arr = s.toCharArray();
			double res = calculateCost(arr,map);
			//System.out.println();
			System.out.println(res/100+"$");
			
		noOfTests--;
		}
		
		sc.close();
	}
	
	public static double calculateCost(char[] arr, HashMap<Character,Double> map){
		double cost =0;
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				cost = cost + map.get(arr[i]);
			}
		}
		
		return cost;
	}

}
