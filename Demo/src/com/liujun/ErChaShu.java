package com.liujun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ErChaShu {
	static int V;
	static int E;
	static int A;
	static int B;
	static int[] E1;
	static int[] E2;
	static int Answer1;
	static int Answer2;

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("F:\\test\\test1.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			V = sc.nextInt();
			E = sc.nextInt();
			A = sc.nextInt();
			B = sc.nextInt();
			E1 = new int[E];
			E2 = new int[E];
			for (int j = 0; j < E; j++) {
				E1[j] = sc.nextInt();
				E2[j] = sc.nextInt();
			}
//			List la=getJdList(B);
			List<Integer> la = getSdList(A);
			List<Integer> lb = getSdList(B);
			Answer1 = 0;
			Answer2 = 0;

			for (int j = 0; j < la.size(); j++) {
				boolean flag = false;
				for (int j2 = 0; j2 < lb.size(); j2++) {
					if (la.get(j) == lb.get(j2)) {
						Answer1 = la.get(j);
						flag = true;
						break;
					}
				}
				if (flag) {
					break;
				}
			}
			Answer2 = bld(Answer1);

			System.out.println("#" + i + " " + Answer1 + " " + Answer2);
		}
	}

	private static int bld(int a) {
		int sum = 1;
		for (int i = 0; i < E; i++) {
			if (a == E1[i]) {
				sum += bld(E2[i]);
			}
		}
		return sum;
	}

	private static List getJdList(int a2) {
		List l = new ArrayList();
		for (int i = 0; i < E; i++) {
			if (a2 == E2[i]) {
				l = getJdList(E1[i]);
				l.add(E1[i]);
			}
		}
		return l;
	}

	private static List getGdList(int a) {
		List l = new ArrayList();
		LinkedList<Integer> ll = new LinkedList();
		ll.add(a);
		while (!ll.isEmpty()) {
			int c = ll.pop();
			for (int i = 0; i < E; i++) {
				if (c == E2[i]) {
					ll.offer(E1[i]);
					l.add(E1[i]);
				}

			}
		}
		return l;
	}

	private static List getSdList(int a) {
		List l = new ArrayList();
		LinkedList<Integer> ll = new LinkedList();
		ll.add(a);
		while (!ll.isEmpty()) {
			int c = ll.pop();
			for (int i = 0; i < E; i++) {
				if (c == E2[i]) {
					ll.push(E1[i]);
					l.add(E1[i]);
				}

			}
		}
		return l;
	}

}
