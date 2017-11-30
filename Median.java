package edu.nyu.progteam;

import java.util.*;

public class Median {

	public static void main(String[] args) {
	//	long[] arr = new long[10000];
		List<Long> list = new ArrayList<Long>();
		Scanner sc = new Scanner(System.in);
		String j = "";
		do {
			j = sc.nextLine();
			list.add(Long.parseLong(j.trim()));
			System.out.println(getMedian(list));
			
		
		} while (sc.hasNextLine() && j != "");

		
		sc.close();
	}
	
	public static long getMedian(List<Long> list){
		long median = 0;
		
		Collections.sort(list);
		
		int size = list.size();
		if(size ==1){
			median = list.get(0);
		}else if(size % 2 != 0){
			int medianElemOdd = (size/2);
			median = list.get(medianElemOdd);
		}else{
			int k = size/2;
			median = (list.get(k-1) + list.get(k))/2;
		}
		
		return median;
		
	}

}
