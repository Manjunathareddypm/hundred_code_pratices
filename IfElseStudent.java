package com.hundred_code_pratices;

import java.util.Scanner;

public class IfElseStudent {
	public static void checkStudentPerformance(int PASSING_MARKS, int obtainedMarks) {
		if(obtainedMarks >= PASSING_MARKS) {
			System.out.println("Student is pass.");
		}else {
			System.out.println("Student is fail.");
		}
	}
	public static void main(String[] args) {
		int PASSING_MARKS = 30;
		int obtainedMarks;

		Scanner sc = new Scanner(System.in);
		System.out.println("entert the student obtained marks");
		obtainedMarks = sc.nextInt();

		checkStudentPerformance(PASSING_MARKS, obtainedMarks);
	}
}
