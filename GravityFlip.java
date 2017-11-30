package edu.nyu.progteam;

import java.util.*;

public class GravityFlip {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
	//	List<Integer> list = new ArrayList<Integer>();
		
		int cols = sc.nextInt();
		int[] arr = new int[cols];
		
		for (int i = 0; i < cols; i++) {
			arr[i] = sc.nextInt();
		}
		
		 Arrays.sort(arr);
		
		
		for(int i = 0; i < arr.length; i++){
			sb.append(arr[i] + " ");
		}
		
		System.out.println(sb.toString().trim());
		sc.close();
	}

}