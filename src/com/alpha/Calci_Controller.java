package com.alpha;

import java.util.Scanner;

public class Calci_Controller {
 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	Calculator_Implementation cal = new Calculator_Implementation();
	boolean flag = true;
	
	while(flag) {
		System.out.println("Welcome to the Calci");
		System.out.println("1: Enter 1 to Addition");
		System.out.println("2: Enter 2 to Subtraction");
		System.out.println("3: Enter 3 to Multiplication");
		System.out.println("4: Enter 4 to Division");
		System.out.println("5: Enter 5 to EXIT");
		
		int choice = sc.nextInt();
		switch(choice) {
		case 1: {
			System.out.println("Enter two values");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int sum = cal.add(a, b);
			System.out.println("sum = "+sum);
			break;
		}
		
		case 2: {
			System.out.println("Enter two values");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int diff = cal.sub(a, b);
			System.out.println("Difference = "+diff);
			break;
			
		}
		
		case 3:{
			System.out.println("Enter two values");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int mul = cal.mul(a, b);
			System.out.println("Multiplication = "+mul);
			break;
			
		}
		
		case 4: {
			System.out.println("Enter two values");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int div = cal.div(a, b);
			System.out.println("Division = "+div);
			break;
			
		}
		
		case 5: {
			flag = false;
			break;
		}
		
		}
		
	}
	sc.close();
}
}
