package com.liujun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Hxc {

	static int Answer;
	static int N;
	static int M;
	static int[][] arr;
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("F:\\test\\test1.txt"));
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for (int t = 1; t <= T; t++) {
			N=sc.nextInt();
			M=sc.nextInt();
			arr =new int[N][M];
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= M; j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			Answer=0;
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= M; j++) {
					int sum = getDp(arr[i][j]);
				}
			}	
			
			System.out.println("#"+t+" "+Answer);
		}
	}
//	private static int getDp(int i) {
//		
//	}
}
