package com.zhiyuan.learn;

public class LearnPop {
	public static void main(String args[]){
		int score[]={12,13,56,78,43,21,45,90,45};
		for(int i=0;i<score.length;i++){
			for(int j=i+1;j<score.length;j++){
				if(score[j]>score[i]){
					int temp;
					temp=score[i];
					score[i]=score[j];
					score[j]=temp;
				}
			}
			System.out.println(score[i]);
		}

	}
}
