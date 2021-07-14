package com.sbr.basic.example20210620;

/**
 * 已知两个完全平方三位数abc 和 xyz，其中a、 b、 c、 x、 y、 z 未必是不同的， 而ax、 by、 cz 是三个完全平方数。求abc 和
 * xyz
 *
 * @author dell
 *
 */
public class Demo06 {

	public static void main(String[] args) {
		method01();
//		method02();
	}

	/**
	 * 方式一
	 */
	public static void method01() {

		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int c = i % 10;
				int b = i / 10 % 10;
				int a = i / 100;
				int z = j % 10;
				int y = j / 10 % 10;
				int x = j / 100;
				if (isSquare(i) && isSquare(j) && isSquare(a * 10 + x) && isSquare(b * 10 + y)
						&& isSquare(c * 10 + z)) {
					System.out.println("abc:" + i + ", xyz:" + j);
				}
			}
		}

	}

	public static boolean isSquare(int n) {
		if (n < 0) {
			return false;
		}

		if (n == 0 || n == 1) {
			return true;
		}
		for (int i = 1; i <= n / 2; i++) {
			if (i * i == n) {
				return true;
			}
		}

		return false;
	}

	/**
	 * 方式二
	 */
	public static void method02() {
		// 遍历 三位完全平方数 abc
		for (int i = 10, abc = i * i; abc <= 999; i++, abc = i * i) {
			// 遍历 三位完全平方数 xyz
			for (int j = 10, xyz = j * j; xyz <= 999; j++, xyz = j * j) {
				// 声明一个计数器，用于记录末位构造数是完全平方数的次数
				int count = 0;
				int abcTemp = abc;
				int xyzTemp = xyz;
				// 依次取出末位数字
				while ((abcTemp != 0) || (xyzTemp != 0)) {
					// 取出 abc 和 xyz 末位
					int abcLast = abcTemp % 10;
					int xyzLast = xyzTemp % 10;
					// 构造ax by cz
					int lastNum = abcLast * 10 + xyzLast;
					// 判断构造数是不是完全平方数
					int sqrt = (int) (Math.sqrt(lastNum));
					if (lastNum == (sqrt * sqrt)) {
						count++;
					}
					abcTemp /= 10;
					xyzTemp /= 10;
				}
				if (count == 3) {
					System.out.println("abc = " + abc + " xyz = " + xyz);
				}
			}
		}
	}
}
