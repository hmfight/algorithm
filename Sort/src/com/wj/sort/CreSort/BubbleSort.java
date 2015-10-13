package com.wj.sort.CreSort;

import com.wj.sort.Sort;

/**
 * Created by wdd
 * Time 2015/3/23 0023  20:17
 * describe :  min  to   max
 */
public class BubbleSort extends Sort{
   public  void sort(int[] arr){
        int len=arr.length;
        int temp;
        for(int i=1;i<len;i++){
            for (int j = 0; j < len-i  ; j++) {
                if(arr[j]>arr[j+1]){// 前面的数大于后面的数  就交换
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }


}

