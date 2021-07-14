package com.sbr.basic.example20210620;

import java.util.Scanner;

/**
 * 螺旋填数
 *
 * @author dell
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入行数:");
		int rn = in.nextInt();
		System.out.println("请输入列数:");
		int cn = in.nextInt();
		// 定义二维数组
		int[][] arr = new int[rn][cn];
		// 定义行和列
		int row = 0;
		int col = 0;
		// 赋予初始值
		arr[row][col] = 1;
		// 定义方向数组
		int[][] direction = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		// 控制数组方向的下标值
		int directionIndex = 0;

		// 循环赋值
		for (int i = 2; i <= rn*cn; i++) {
			//计算新的行、列值
			row = row + direction[directionIndex][0];
			col = col + direction[directionIndex][1];
			//判断出界条件
			if((row>=rn||row<0)||(col>=cn||col<0)||(arr[row][col]!=0)) {
				//计算上一次的行、列，即转向的行、列值
				row = row - direction[directionIndex][0];
				col = col - direction[directionIndex][1];
				//转向
				directionIndex++;
				if(directionIndex == direction.length) {
					directionIndex = 0;
				}

				//计算新的行、列值
				row = row + direction[directionIndex][0];
				col = col + direction[directionIndex][1];
			}
			//赋值
			arr[row][col] = i;
		}

		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
