package com.zhiyuan.learn;

import java.util.Scanner;

public class MonthNum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int month=scanner.nextInt();
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(31);
			break;
		case 2:
			System.out.println(28);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
		default:
			System.out.println("wrong month number");
		}

	}

}
