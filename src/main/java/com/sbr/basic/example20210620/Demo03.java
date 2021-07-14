package com.sbr.basic.example20210620;

/**
 * 求累加、阶乘
 * 实际开发中 递归慎用 ，对内存开销比较大，容易内存溢出
 */
public class Demo03 {
	public static void main(String[] args) {

		System.out.println(sum(10));
		System.out.println(jieCheng(5));

	}
	// 累加求和
	public static int sum(int n) {
		if(n == 1) {
			return 1;
		}
		return n + sum(n-1);
	}

	//求阶乘
	public static int jieCheng(int n) {
		if(n == 1) {
			return 1;
		}
		return n * jieCheng(n-1);
	}
}
