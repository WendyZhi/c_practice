package com.zhiyuan.learn;

import java.util.Scanner;

public class LearnSwitch {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("please input level:");
		String level=scanner.next();
		
			switch(level){
			case "Excellent":
					System.out.println(5);
					break;
			case "Good":
					System.out.println(4);
					break;
			case "Passed":
					System.out.println(3);
					break;
			case "Failed":
				System.out.println(2);
				break;
			default:
					System.out.println("There is not this level");
					break;
			}
		}

	}


