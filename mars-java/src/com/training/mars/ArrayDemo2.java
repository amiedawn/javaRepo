package com.training.mars;

public class ArrayDemo2 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		// initialize the nested array with 3 rows and 4 columns
		int[][] twoDArray = new int[3][3];
		
		// display in console 3x3 matrix as below:
		// 1[0,0]
		// 1[1,0]  2[1,1]  
		// 1[2,0]  2[2,1]  3[2,2]
		
		
		// solution 1:
//		for (int i=1;i<=3; i++) { // 3 rows
//			for(int j=1; j<=i; j++) { // 3 columns
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		// solution 2:
		int rows = 3;
		
		for (int i=1; i<=rows; ++i) {
			for (int j=1; j<=i; ++j) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}