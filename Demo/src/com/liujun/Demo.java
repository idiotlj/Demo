package com.liujun;

import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		//push�����õ������е�һ��Ԫ��
		LinkedList l =new LinkedList();
		l.offer(1);
		l.offer(2);
		l.offer(3);
		System.out.println(l.pop());
		System.out.println(l.poll());
		l.push(4);
		l.push(5);
		l.push(6);
		System.out.println(l.pop());
		System.out.println(l.poll());
		System.out.println();

	}

}
