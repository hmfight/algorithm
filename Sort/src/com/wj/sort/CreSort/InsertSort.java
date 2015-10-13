package com.wj.sort.CreSort;

import com.wj.sort.Sort;

/**
 * Created by wdd
 * Time 2015/3/23 0023  14:19
 */
public class InsertSort extends Sort {
    public void sort(int[] arr){
        int i,j;
        int temp;
        int len= arr.length;
        for ( i = 1; i <len; i++) {
            temp=arr[i];  //arr[0]  不用排，
            for( j=i-1;j>=0;j--){
                if(temp<arr[j]) {
                    arr[j+1]=arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1]=temp;
        }
    }
}
