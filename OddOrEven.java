package com.hundred_code_pratices;

import java.util.Scanner;

public class OddOrEven {

	public void checkTheGivenNumberOddOrEven(int number) {

		if(number % 2 == 0) {
			System.out.println(number+ " is Even number");
		}else {
			System.out.println(number+ " is Odd number");
		}
	}
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check Even or Odd.");
		number = sc.nextInt();

		OddOrEven obj = new OddOrEven();
		obj.checkTheGivenNumberOddOrEven(number);
	}
}
