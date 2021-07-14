package com.sbr.basic.example20210620;

/**
 * 二分查找（折半查找）
 */
public class ArraySearch {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9,10 };
		//查找数
		int num = 11;
		//数组初始最小值下标
		int min = 0;
		//数组初始最大值下标
		int max = arr.length - 1;
		//数组初始中间值下标
		int mid = (min + max) / 2;
		//标识
		boolean flag = true;
		//循环比较
		while (arr[mid] != num) {
			//大于中间下标的元素值
			if(num > arr[mid]) {
				min = mid + 1;
			}
			//小于中间下标的元素值
			if(num < arr[mid]) {
				max = mid - 1;
			}
			//判断有没有出界
			if(min > max) {
				flag = false;
				System.out.println("查无此数");
				break;
			}
			//计算中间下标值
			mid = (min + max)/2;

		}
		//输出中间下标
		if(flag) {
			System.out.println(mid);
		}
	}
}