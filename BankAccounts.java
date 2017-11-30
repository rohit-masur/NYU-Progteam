package edu.nyu.progteam;

import java.util.Scanner;

public class BankAccounts {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int noScen = sc.nextInt();
		while (noScen != 0) {
			int noPay = sc.nextInt();
			 
				float[] arr = new float[noPay + 3];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = sc.nextInt();
				}

				float upfront = arr[2];
				float fee = 0;
				float fee1 = 0;
				for (int i = 3; i < arr.length; i++) {
					float temp = arr[1]/100 * arr[i];
					if(temp > arr[0]){
						fee1 = temp;
					}else{
						fee1 = arr[0];
					}
					fee += fee1;
				}

				if (fee > upfront) {
					System.out.println("upfront");
				} else {
					System.out.println("fee");
				}

				

			noScen--;
		}
		sc.close();
	}

}
