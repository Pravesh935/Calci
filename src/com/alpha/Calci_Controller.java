package com.alpha;

import java.util.Scanner;

public class Calci_Controller {
 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	Calculator_Implementation cal = new Calculator_Implementation();
	boolean flag = true;
	
	while(flag) {
		System.out.println(" Welcome !");
		System.out.println("1: Enter 1 to Addition");
		System.out.println("2: Enter 2 to Subtract");
		System.out.println("3: Enter 3 to Multiplication");
		System.out.println("4: Enter 4 to Division");
		System.out.println("5: Enter 5 to EXIT");
		
		int choice = sc.nextInt();
		switch(choice) {
		case 1: {
			System.out.println("Enter two values");
			int a=sc.nextInt();
			int b=sc.nextInt();
			cal.add(a, b);
			break;
		}
		
		case 2: {
			System.out.println("Enter two values");
			int a=sc.nextInt();
			int b=sc.nextInt();
			cal.sub(a, b);
			break;
			
		}
		
		case 3:{
			System.out.println("Enter two values");
			int a=sc.nextInt();
			int b=sc.nextInt();
			cal.mul(a, b);
			break;
			
		}
		
		case 4: {
			System.out.println("Enter two values");
			int a=sc.nextInt();
			int b=sc.nextInt();
			cal.div(a, b);
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
