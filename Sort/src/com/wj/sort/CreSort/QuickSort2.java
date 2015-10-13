package com.wj.sort.CreSort;

import com.wj.sort.Sort;

/**
 * Created by Administrator on 2015/7/20 0020.
 */
public class QuickSort2 extends Sort {
    //快速排序
    @Override
    public void sort(int[] arr) {
        quick_sort(arr, 0, arr.length - 1);
    }

    void quick_sort(int arr[], int left, int right) {   //挖坑填数
        if (left >= right) {
            return;
        }
        int i = left, j = right;
        int tmp = arr[left];
        while (i < j) {
            while (i < j && arr[j] >= tmp) {// 从右向左找第一个小于x的数
                j--;
            }
            if (i < j) {
                arr[i++] = arr[j];
            }
            while (i < j && arr[i] < tmp) { // 从左向右找第一个大于等于x的数
                i++;
            }
            if (i < j) {
                arr[j--] = arr[i];
            }
        }
        arr[i] = tmp;
        quick_sort(arr, left, i - 1); // 递归调用
        quick_sort(arr, i + 1, right);
    }

}
