package com.wj.sort.CreSort;

import com.wj.sort.Sort;

/**
 * Created by wdd
 * Time 2015/3/23 0023  14:01
 * min  to  max
 */
public class SelectSort extends Sort {
    public  void sort(int[] arr) {
        int temp = 0;       //中间变量
        int min = 0;        //标记最小下表
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            //交换当前i位置和最小值位置
            if (min != i) {
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
