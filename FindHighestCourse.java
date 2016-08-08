package com.zhiyuan.learn;

import java.util.Scanner;

public class FindHighestCourse {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("please input java android sql score:");
		int javaScore=scanner.nextInt();
		int androidScore=scanner.nextInt();
		int sqlScore=scanner.nextInt();
		if(javaScore>=androidScore&&javaScore>=sqlScore){
			System.out.println("java is your best thing");
		}
		if(androidScore>=javaScore&&androidScore>=sqlScore){
			System.out.println("android is your best thing");
		}
		if(sqlScore>=javaScore&&sqlScore>=androidScore){
			System.out.println("sql is your best thing");
		}
		

	}

}
