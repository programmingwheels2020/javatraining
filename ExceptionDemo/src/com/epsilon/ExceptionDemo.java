package com.epsilon;

import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5 };
		try {
			// int data = 200/0;
			// System.out.println(data);
			//System.out.println(arr[5]);
			
			String str=null;
			//System.out.println(str.length()); null pointer exception
			
			String str1 = "45";
			
			
			int a = Integer.parseInt(str1); 
			System.out.println(a);
			
			try {
				int data = 200/10; //ArithmeticException
				System.out.println(data);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("_____________Nested Catch____");
				System.out.println(e.toString());
			}
			
			throw new IOException("File Could not found");
		} catch (Exception e) {
			System.out.println("----Outside-----");
			System.out.println(e.toString()); 
		} finally {
			System.out.println("Closing the connection");
		}

		

	}

}
