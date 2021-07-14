package com.sbr.basic.example20210620;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * n个猴子围成一圈，从编号为k的开始报数1-2-m-1-2-m-……报“m”的猴子就被淘汰，游戏一直进行到圈内只剩一只猴子它就是猴大王了。
 *
 * @author dell
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 猴子数量
		System.out.println("请输入猴子的数量:");
		int num = in.nextInt();
		System.out.println("请输入报数到几淘汰:");
		int law = in.nextInt();

//		method1(num, law);
		method2(num, law);

	}

	/**
	 * 集合方式
	 * @param num
	 * @param law
	 */
	private static void method2(int num, int law) {
		Map<Integer, Integer> m = new HashMap();
		// 猴子编号起始数
		int p = 15;
		// 猴子报数起始数
		int c = 1;
		for (int i = 1; i < num + 1; i++) {
			m.put(i, i);
		}
		while (m.size() > 1) {
//			if (c == law) {
//				m.remove(p);
//			}
//
//			p++;
//			if (p == num + 1) {
//				p = 1;
//			}
//
//			if (m.get(p) != null) {
//				c++;
//			}
//
//			if (c == law + 1) {
//				c = 1;
//			}
			if(m.get(p) != null) {
				c++;
				if (c == law + 1) {
					m.remove(p);
					c = 1;
				}
			}
			p++;
			if (p == num + 1) {
				p = 1;
			}

		}
		String result = m.keySet().toString();
		System.out.println("猴王的编号为：" + result.substring(1, result.length() - 1));
	}

	/**
	 * 数组方式
	 * @param num
	 * @param law
	 */
	private static void method1(int num, int law) {
		// 用来标记每个猴子是否淘汰（初始都没有被淘汰）
		boolean[] m = new boolean[num];
		// 报数
		int count = 0;
		// 循环报数时猴子的下标
		int index = 0;

		while (num > 1) {
			if (!m[index]) {
				count++;
				if (count == law) {
					num--;
					m[index] = true;
					count = 0;
				}
			}
			index++;
			if (index == m.length) {
				index = 0;
			}
		}
		for (int i = 0; i < m.length; i++) {
			if (!m[i]) {
				System.out.println(String.format("第%s只猴子是大王", i + 1));
				break;
			}
		}
	}
}
