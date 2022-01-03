package com.training.mars;

import java.util.Scanner;
import java.io.*;

public class ElectricBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0-200 units: $50
		// 201-500 units: $1.25/unit
		// 501-1000 units: $1.00/unit
		// 1001+ units: $0.75/unit
		// units in whole numbers
		
		// use "System.out.printf("%.2f", val);" to print a float with 2 decimal places; example:
		//float floatValue=22.34555f;
		//System.out.print(String.format("%.2f", floatValue));
		
		Scanner scan = new Scanner(System.in); // get input, # of consumers

		int size;
		System.out.println("How many consumers' bills would you like to be prepared? ");
		size = scan.nextInt();
		scan.skip(System.lineSeparator());
		
		String[] consumersArr = new String[size];
				
		// separate all values by comma
		for (int counter=0; counter<size; counter++) {
			System.out.println("Please enter consumer " + (counter + 1) + "'s details in format: consumer number,name,unit consumption (no spaces): ");
			consumersArr[counter] = scan.nextLine(); // read the entire line
		}
		scan.close();
		
		// split comma-separated details into a list
//		String[] fields = consumersArr.split(", ?"); // regex takes a comma followed or not by a space
//		String consumerNum = fields[0];
//		String name = fields[1];
//		String consumption = fields[2];
		
		
		
		//String[] splitConsumersArr = consumersArr.split(",");
		
		// calculations
		
		
//		System.out.println("Printing all consumer bills, in format consumer number, name, unit consumption, bill payment: ");
//		for (int counter=0; counter<size; counter++) {
//			System.out.println(lineVectorconsumersArr[counter]);
//		}
	}

}
