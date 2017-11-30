package edu.nyu.progteam;

import java.util.*;
public class AB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int noOfLines = sc.nextInt();
		
		
		do{
			int sum =0;
			int noOfElem=sc.nextInt();
			do{
				sum+=sc.nextInt();
				noOfElem--;
			}while(noOfElem >0);
				System.out.println(sum);
				System.out.println();
		noOfLines--;	
		}while(noOfLines > 0);
sc.close();
	}

}
