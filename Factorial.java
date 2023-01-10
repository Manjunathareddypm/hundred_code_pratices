package com.hundred_code_pratices;

import java.util.Scanner;

public class Factorial {
	private void checkingForFactorials(int number) {
		int fact = 1;
		if(number < 0) {
			System.out.println("Number should be non-negative.");
		}else {
			for(int i = 1; i<=number; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of " +number+ " is = " +fact);
		}
	}
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer Number to calculate it's factorial ");
		number = sc.nextInt();

		Factorial obj = new Factorial();
		obj.checkingForFactorials(number);
	}
}
