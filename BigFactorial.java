package com.hundred_code_pratices;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {

	protected void checkingForBigFactorial(BigInteger inc, BigInteger fact, int number) {
		for (int i = 1; i <= number; i++) {
			fact = fact.multiply(inc);
			inc = inc.add(BigInteger.ONE);
			}
			System.out.println(number + "! = " + fact);
	}

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer");
		number = sc.nextInt();
		BigInteger inc = new BigInteger("1");
		BigInteger fact = new BigInteger("1");

		BigFactorial obj = new BigFactorial();
		obj.checkingForBigFactorial(inc, fact, number);

	}

}
