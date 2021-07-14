package com.sbr.basic.example20210620;

import java.util.Scanner;

/**
 * 两个不同的自然数a和b，如果整数a的全部因子(包含1，不含a本身)之和等于b；
 * 且整数b的全部因子(包含1，不含b本身)之和等于a，则整数a和b称为亲密数。
 * 求3000以内的全部亲密数
 * @author dell
 *
 */
public class Demo07 {
    public static void main(String[] args) {
        System.out.println("----------打印你想要的范围之内的亲密数------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("你要打印多少以内的亲密数：");
		int num = sc.nextInt();
        //a = 2，因为1是因子
		for(int a = 2; a < num; a++) {
            int b = sum(a);
            //a < b是将a、b排序，把重复的数排除
            if (sum(b) == a && a < b) {
                System.out.println(a + "的亲密数是：" + b);
            }
        }
        System.out.println("-------------输出第n项斐波那契数------------");

		//输出第n项斐波那契数
       System.out.println(fib(8));
    }

    /**
     * 计算此数所有因子的和
     */
    public static int sum(int n) {
        int sum = 0;
        for(int i = 1; i <= n / 2; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
    }

    /**
     * 打印斐波那契数列中第几项
     * @param n
     * @return
     */
    public static int fib(int n) {
        int[] res = {0, 1};
        if (n < 2) {
            return res[n];
        }
        int one = 1;
        int two = 0;
        int fibN = 0;
        for (int i = 2; i <= n; i++) {
            fibN = (one + two) % 1000000007;
            two = one;
            one = fibN;
        }
        return fibN;
    }
}