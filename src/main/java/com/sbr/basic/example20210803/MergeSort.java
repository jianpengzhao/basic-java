package com.sbr.basic.example20210803;

import java.util.Arrays;

/**
 * 初始状态: 3, 2, 10
 * 第一次:  {3},{2},{10}
 * 第二次:  {2,3,10}
 *
 * @ClassName: MergeSort
 * @Description: 归并排序
 * @Author: ZhaoJianPeng
 * @Date: 2021-08-03 09:35
 */
public class MergeSort {

    public static int[] mergeSort(int[] nums, int l, int h) {
        if (l == h) {
            return new int[] { nums[l] };
        }

        int mid = l + (h - l) / 2;
        //左有序数组
        int[] leftArr = mergeSort(nums, l, mid);
        //右有序数组
        int[] rightArr = mergeSort(nums, mid + 1, h);
        //新有序数组
        int[] newNum = new int[leftArr.length + rightArr.length];

        int m = 0, i = 0, j = 0;
        while (i < leftArr.length && j < rightArr.length) {
            newNum[m++] = leftArr[i] < rightArr[j] ? leftArr[i++] : rightArr[j++];
        }
        while (i < leftArr.length) {
            newNum[m++] = leftArr[i++];
        }
        while (j < rightArr.length) {
            newNum[m++] = rightArr[j++];
        }
        return newNum;
    }
    public static void main(String[] args) {
        int[] nums = new int[] { 3, 2, 10 };
        int[] newNums = mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(newNums));
    }
}
