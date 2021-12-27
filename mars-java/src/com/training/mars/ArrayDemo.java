package com.training.mars;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// intialize the nested array with 3 rows and 4 columns
		int[][] twoDArray = new int[3][4];
		
		// 2[0,0]  3[0,1]  4[0,2]  6[0,3]
		// 1[1,0]  8[1,1]  7[1,2]  9[1,3]
		// 5[2,0]  3[2,1]  2[2,2]  6[2,3]
		
//		System.out.println("Length of array: "+twoDArray[0].length);
		
		for (int i=0;i<twoDArray.length; i++) { // 3 rows
			for(int j=0; j<twoDArray[0].length; j++) { // 4 columns
				twoDArray[i][j] = i+j; // makes values "0, 1, 2, 3" etc
			}
		}
		
		// to extract values, write another nested loop
		System.out.println("Display 2 dimensional array values");
		for (int i=0;i<twoDArray.length; i++) { // 3 rows
			for(int j=0; j<twoDArray[0].length; j++) { // 4 columns
				System.out.print(twoDArray[i][j]+" "); // print instead of println
			}
			System.out.println(); // makes it print as a matrix
		}
		
		
//		print out values of an array start
//		int[] myArray = new int[10];
//		//System.out.println("First element of array: " +myArray[0]);
//		
//		for (int i=0; i<myArray.length; i++) {
//			// populate array with numbers
//			myArray[i] = i*2;
//		}
//
//		// loop through array to see the values
//		for (int j=0; j<myArray.length; j++) {
//			System.out.println(myArray[j]);
//		}
//		print out values of an array end
	
	}

}
