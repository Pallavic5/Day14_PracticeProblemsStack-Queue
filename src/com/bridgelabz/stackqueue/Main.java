package com.bridgelabz.stackqueue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
		int choice = 0;
		do {
			System.out.println("\n1.PUSH\n2.POP\n3.Display\n4.PEAK\n5.Exit");
			System.out.println("Enter Choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Element:");
				stack.push(sc.nextInt());
				break;
			case 2:
				stack.pop();
				break;
			case 3:
				stack.display();
				break;
			case 4:
				stack.peak();
				break;
			case 5:
				System.out.println("Byeee!!");
				break;
			default:
				System.out.println("Select From Menu");
			}
		} while (choice != 5);

	}

}
