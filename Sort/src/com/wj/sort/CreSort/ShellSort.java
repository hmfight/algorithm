package com.wj.sort.CreSort;

import com.wj.sort.Sort;

/**
 * Created by wdd
 * Time 2015/3/25 0025  13:09
 */
public class ShellSort  extends Sort{
    public void sort(int[] arr){
        int i,j,h;
        int temp;
        int len = arr.length;
        for(h= len/2;h>0;h=h/2){
            /**
             * 以下for循环的算法属于选择排序，只是将选择排序的步长改变为h;
             */
            for (i = h; i <len ; i++) {
                temp =arr[i];
                for(j=i-h;j>=0;j-=h){
                    if(temp<arr[j]){
                        arr[j+h]=arr[j];
                    }
                    else{
                        break;
                    }
                }
                arr[j+h]=temp;
            }
        }
    }
}
