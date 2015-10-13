package com.wj.sort.CreSort;

import com.wj.sort.Sort;

/**
 * Created by wdd
 * Time 2015/3/24 0024  21:42
 */
public class QuickSort extends Sort{
    @Override
    public void sort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }
    public static void quickSort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int flag=arr[left];
        int i=left,j=right;
        while(i<j) {
            while (arr[j] >= flag && i < j) {
                j--;
            }
            //所以交换结束后,需要为第一个基准元素找位置,这个位置就是现在i的位置.
            while (arr[i] <= flag && i < j) {
                i++;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, left, i);
        quickSort(arr, left, i - 1);
        quickSort(arr,i+1,right);
    }

    private static void swap(int[] arr, int i, int j) {//交换数组中i,j元素位置！
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
