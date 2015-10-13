package com.wj.sort.CreSort;

import com.wj.sort.Sort;

/**
 * Created by wangjia .
 * Date:2015/10/3 0003
 * Time:11:25
 */
public class GuiBSort extends Sort{
    @Override
    public void sort(int[] arr) {
        gb(arr,0,arr.length-1);
    }

    private void gb(int[] arr,int start , int end){
        if(start == end){
            return ;
        }
        int mid = (start + end)/2;
        gb(arr,start,mid);
        gb(arr,mid+1,end);
        merge(arr,start,mid,end);
    }

    private void merge(int[] data, int left,int center,int right){
        int[] tmpArr = new int[data.length];
        // 右数组第一个元素索引
        int mid = center + 1;
        // third 记录临时数组的索引
        int third = left;
        // 缓存左数组第一个元素的索引
        int tmp = left;
        while (left <= center && mid <= right) {
            // 从两个数组中取出最小的放入临时数组
            if (data[left] <= data[mid]) {
                tmpArr[third++] = data[left++];
            } else {
                tmpArr[third++] = data[mid++];
            }
        }
        // 剩余部分依次放入临时数组（实际上两个while只会执行其中一个）
        while (mid <= right) {
            tmpArr[third++] = data[mid++];
        }
        while (left <= center) {
            tmpArr[third++] = data[left++];
        }
        // 将临时数组中的内容拷贝回原数组中
        // （原left-right范围的内容被复制回原数组）
        while (tmp <= right) {
            data[tmp] = tmpArr[tmp++];
        }
    }
}
