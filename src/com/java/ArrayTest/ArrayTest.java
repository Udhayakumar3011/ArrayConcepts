package com.java.ArrayTest;

public class ArrayTest {

	public static void main(String[] args) {
		/*
		 * int a = 100; int b = 100; int c = 100; int d = 100;
		 */

		int[] arr = new int[5];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		//(,){,}
		
		//Simplified Version
		int []brr= {100,200,300,400,500};
		
		System.out.println(arr[3]);
		System.out.println(arr.length);

		// size-Length
		// If we call above defined size, it throws ArrayOutBound Expection
	}

}
