package com.bridgelabz.emp;

public class EmployeeWage {

	public static void main(String[] args) {
		int IS_FULL_TIME=1;
		double empcheck=Math.floor(Math.random()*10)%2;
		if (IS_FULL_TIME==empcheck) {
			System.out.println("Employee is present");          
		}
		else {
			System.out.println("Employee is absent");   
		}

	}

}
