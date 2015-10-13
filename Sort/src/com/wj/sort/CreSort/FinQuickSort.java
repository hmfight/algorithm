package com.wj.sort.CreSort;

import com.wj.sort.Sort;

/**
 * Created by wangjia .
 * Date:2015/9/27 0027
 * Time:12:32
 */
public class FinQuickSort extends Sort {
    @Override
    public void sort(int[] nums) {
        quick_sort(nums, 0, nums.length - 1);
    }

    private void quick_sort(int[] nums, int left, int right) {
        int flag = parttion2(nums, left, right);
        if (flag > left) {
            quick_sort(nums, left, flag - 1);
        }
        if (flag < right) {
            quick_sort(nums, flag + 1, right);
        }
    }

    /**
     * OK
     * @param arr
     * @param left
     * @param right
     * @return
     */
    private int parttion(int arr[], int left, int right) {
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
        return i;
    }

    private int parttion2(int arr[], int left, int right) {
        int flag = arr[left];
        int i = left, j = right;
        while (i < j) {
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
        return i;
    }

    private int parttion3(int[] arr,int left,int right){
        int pivot = arr[left];
        int storeIndex = left;
        //这个循环比一般的写法简洁高效，呵呵维基百科上看到的
        for(int i = left; i < right; ++i) {
            if(arr[i] < pivot) {
                swap(arr,i, storeIndex);
                ++storeIndex;
            }
        }
        swap(arr,storeIndex, right);
        return storeIndex;
    }

    private static void swap(int[] arr, int i, int j) {//交换数组中i,j元素位置！
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
