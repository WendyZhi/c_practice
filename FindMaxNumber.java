package com.zhiyuan.learn;

import java.util.Scanner;

public class FindMaxNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input two number:");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		if (num1 != num2) {

			if (num1 > num2) {
				System.out.println("The max number is num1:" + num1);
			} else {
				System.out.println("The max number is num2:" + num2);
			}
		} else {
			System.out.println("num1=num2=" + num1);
		}

	}

}
