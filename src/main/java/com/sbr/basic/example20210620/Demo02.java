package com.sbr.basic.example20210620;

/**
 * 任何大于6的偶数都能分成两个质数之和 求100以内的这样的数
 *
 * @author dell
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		for (int i = 8; i <= 100; i += 2) {
			for(int j =2;j<=i/2;j++) {
				if(isPrime(j) && isPrime(i-j)) {
					System.out.println(i + "=" + j + "+" + (i-j));
				}
			}
		}

	}

	//判断某个数是否为质数
	private static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i =2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}