package com.zhiyuan.learn;

import java.util.Scanner;

public class LearnLogic {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please input Five score:");
		int score=scanner.nextInt();
		boolean notFiveScore =score<=0 || score>=5;
		System.out.println("score="+score+"score is not Five Score:"+notFiveScore);

	}

}
