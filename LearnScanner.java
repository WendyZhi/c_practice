package com.zhiyuan.learn;

import java.util.Scanner;

public class LearnScanner {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("name:");
		String name=scanner.next();
		
		System.out.println("age:");
		int age=scanner.nextInt();
		
		System.out.println("sex:");
		char sex=scanner.next().charAt(0);
		
		System.out.println("height");
		int height=scanner.nextInt();
		
		System.out.println("character");
		String character=scanner.next();
		
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("sex:"+sex);
		System.out.println("height:"+height);
		System.out.println("character:"+character);
		
	}

}
