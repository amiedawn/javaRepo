package com.training.mars;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ElectricBill {

	public static void main(String[] args) {
		// 0-200 units: $50
		// 201-500 units: $1.25/unit
		// 501-1000 units: $1.00/unit
		// 1001+ units: $0.75/unit
		
		Scanner scan = new Scanner(System.in); // get input, # of consumers

		int size;
		System.out.println("How many consumers' bills would you like to be prepared? ");
		size = scan.nextInt();
		scan.skip(System.lineSeparator());
		
		String[] consumersArr = new String[size];
		
		for (int counter=0; counter<size; counter++) {
			System.out.println("Please enter consumer " + (counter + 1) + "'s details in format: consumer number,name,unit consumption (no spaces): ");
			consumersArr[counter] = scan.nextLine(); // read the entire line
			// split comma-separated details into a list
			String[] fields = consumersArr[counter].split(", ?"); // regex takes a comma followed or not by a space
			String consumerNum = fields[0];
			String name = fields[1];
			String consumption = fields[2];
			int consumptionInt = Integer.valueOf(consumption);
			
			// calculations
			double payment = 0;
			if (consumptionInt <= 200) {
				payment = 50;
			} else if (consumptionInt > 200 && consumptionInt <=500) {
				payment = (consumptionInt - 200) * 1.25 + 50;
			} else if (consumptionInt > 500 && consumptionInt <= 1000) {
				payment = (consumptionInt - 500) * 1 + (300 * 1.25) + 50;
			} else if (consumptionInt > 1000) {
				payment = (consumptionInt - 1000) * .75 + (500 * 1) + (300 * 1.25) + 50;
			}	
			
			DecimalFormat df = new DecimalFormat("0.00");
			//df.setMaximumFractionDigits(2);
			System.out.println("Consumer Number " + consumerNum + " - Bill Amount $" + df.format(payment));
		}
		scan.close();		

	}

}
