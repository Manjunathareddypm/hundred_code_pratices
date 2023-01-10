package com.hundred_code_pratices;

public class Condition {

	public void conditionCheck(boolean learning) {
		if(learning) {
			System.out.println("Condition is True");
		}else{
			System.out.println("Condition is False");
		}
	}
	public static void main(String[] args) {
		
		boolean learning = true;
		Condition obj = new Condition();
		obj.conditionCheck(learning);

	}
}
