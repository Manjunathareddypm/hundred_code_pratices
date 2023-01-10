package com.hundred_code_pratices;

import java.util.Scanner;

public class LargestNumber{
	public void toFindLargestNumber(int number1, int number2, int number3) {
		if(number1 > number2 && number1 > number3) {
			System.out.println(number1+ " is greater");
		}else if(number2 > number1 && number2 > number3) {
			System.out.println(number2+ " is greater");
		}else {
			System.out.println(number3+ " is greater");
		}
	}
	public static void main(String[] args) {
		int number1, number2, number3;
		Scanner sc = new Scanner(System.in);

		System.out.println("Entert the first number");
		number1 = sc.nextInt();
		System.out.println("Entert the second number");
		number2 = sc.nextInt();
		System.out.println("Entert the third number");
		number3 = sc.nextInt();
		
		LargestNumber obj = new LargestNumber();
		obj.toFindLargestNumber(number1, number2, number3);

	}
}
