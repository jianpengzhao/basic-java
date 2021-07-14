package com.sbr.basic.example20210620;

/**
 * 判断一个整数的二进制数据中有多少个1
 */
public class Demo01 {
	public static void main(String[] args) {
		int num = 7;
		int count = 0;
		for (int i = 0; i < 32; i++) {
			int t = num >> i;
			if ((t & 1) != 0) {
 				count++;
			}
		}
		System.out.println(count);
	}

}
