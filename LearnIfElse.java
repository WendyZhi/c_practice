package com.zhiyuan.learn;

import java.util.Scanner;

public class LearnIfElse {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please input your grade:");
		int grade=scanner.nextInt();
		if(grade>=0){
			if(grade>=60){
				System.out.println("passed");
			}else{
				System.out.println("failed");
			}
			
		}else{
			System.out.println("inappropriate number");
		}

	}

}
