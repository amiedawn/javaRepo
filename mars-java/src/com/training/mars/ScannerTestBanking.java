package com.training.mars;

import java.util.Scanner;

public class ScannerTestBanking {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = scan.nextInt();
		System.out.println("value = " +a);

		scan.close();
	}
	
}
