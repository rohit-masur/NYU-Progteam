package edu.nyu.progteam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperCase {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(reader);
		String line;
		
		while((line =in.readLine())!=null){
			int upCount =0;
			int lowCount =0;
			char[] charArr = line.toCharArray();
			
			for(int i = 0; i< charArr.length; i++){
				if(Character.isUpperCase(charArr[i])){
					upCount++;
				}else{
					lowCount++;
				}
			}
			if(upCount > lowCount){
				System.out.println(line.toUpperCase());
			}else{
				System.out.println(line.toLowerCase());
			}
				
			
		}

	}

}
