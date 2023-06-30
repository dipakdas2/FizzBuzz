package com.bnpp.assignment;

import java.util.Scanner;

public class FizzBuzzApp {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number for FizzBuzz Test: ");  
		int num = sc.nextInt();
		String result = new FizzBuzzApp().readNumber(num);
		System.out.println(num + " read as :: "+result);
	}

	/**
	 * Method to read a number
	 * @param num
	 * @return
	 */
	public String readNumber(int num) {	
		return String.valueOf(num);
	}
	
	

}
