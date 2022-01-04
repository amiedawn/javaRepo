package com.training.mars;

import java.util.Scanner;

public class IntegerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 10 numbers > 0: ");
		try {
			for (int i = 0; i < 10; i++) {
				int number = sc.nextInt();
				if (number < 0) {
					throw new MyException2("negative numbers are not allowed");
				}
			}
		} catch (MyException2 e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}
}
