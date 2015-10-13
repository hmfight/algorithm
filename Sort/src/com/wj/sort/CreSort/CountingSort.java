package com.wj.sort.CreSort;

import com.wj.sort.Sort;
/**
 * Created by wangjia .
 * Date:2015/10/13 0013
 * Time:20:26
 * Applicable situation：元素在[0,max]范围内，并且max的范围可接受。
 * how:利用一个额外数组temp，每个数组对应index位置记录数index在原数组arr中出现的次数，
 * 最后遍历temp，让不为的index，取出来放到原数组中arr中
 */
public class CountingSort extends Sort {
    @Override
    public void sort(int[] arr) {
        //find the max element in array
        int max = arr[0];
        for (int i : arr) {
            max = i > max ? i : max;
        }
        //visit whole array,and init temp
        int[] temp = new int[max + 1];
        for (int i : arr) {
            temp[i]++;
        }
        //reset arr
        int j = 0;
        for (int i = 0; i <= max; i++) {
            while (temp[i] != 0) {
                arr[j++] = i;
                temp[i]--;
            }
        }
    }
}
