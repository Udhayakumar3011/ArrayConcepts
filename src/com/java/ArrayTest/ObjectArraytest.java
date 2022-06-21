package com.java.ArrayTest;

public class ObjectArraytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] obj = new Object[5];
		obj[0] = "String123"; //10mb
		obj[1] = 123;  //20kb
		obj[2] = 'C';  //2mb
		obj[3] = "Test";  //6mb
		obj[4] = 55;  //17mb

		System.out.println(obj[3]);
		for (int j = 0; j < obj.length; j++) {
			System.out.println(obj[j]);
		}

	}

}
