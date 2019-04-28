package com.liujun;

import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		//push方法拿到链表中第一个元素
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
