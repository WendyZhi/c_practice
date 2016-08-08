package com.zhiyuan.learn;

public class Printletters {

	public static void main(String[] args) {
		int letter=65;
		do{
			System.out.print(letter);
			System.out.println((char)letter);
			letter++;
		}while(letter<=90);

	}

}
