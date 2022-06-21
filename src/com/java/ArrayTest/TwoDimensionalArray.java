package com.java.ArrayTest;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		// int a[] = new int[3]; // Single Dimension Array
		// int b[] = { 10, 10, 10 }; // Simplified Version

		// Two Dimensional Array
		// 0 1 //row //column
		int a[][] = new int[3][3];
		a[0][0] = 100;  
		a[0][1] = 200;
		a[0][2] = 300;

		a[1][0] = 400;
		a[1][1] = 500;
		a[1][2] = 600;

		a[2][0] = 700;
		a[2][1] = 800;
		a[2][2] = 900;
		// int b[][]= {{10,10,10},{20,20,20}};

		System.out.println(a[0].length); // row size find
		System.out.println(a[1].length); // column size find

		// a[1][1]=500;
		System.out.println(a[1][1]);

		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {
				System.out.print(a[row][column]+" ");
			}
			System.out.println(" ");
		}

	}

}
