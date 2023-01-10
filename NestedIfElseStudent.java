package com.hundred_code_pratices;

import java.util.Scanner;

public class NestedIfElseStudent {
	public void checkStudentPerformance(int PASSING_MARKS, int obtainedMarks) {
		char grade;
		if(obtainedMarks >= PASSING_MARKS) {
			if(obtainedMarks > 90) 
				grade = 'A';
			else if(obtainedMarks > 70)
				grade = 'B';
			else if(obtainedMarks > 65) 
				grade = 'C';
			else 
				grade = 'D';
			System.out.println("You passed the exam and your grade is " +grade);
		}
		else {
			grade = 'F';
			System.out.println("You failed and your grade is " +grade);
		}
	}
	public static void main(String[] args) {
		int PASSING_MARKS = 30; 
		int obtainedMarks;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks obtained by you");
		obtainedMarks = sc.nextInt();

		NestedIfElseStudent obj = new NestedIfElseStudent();
		obj.checkStudentPerformance(PASSING_MARKS, obtainedMarks);
	}
}