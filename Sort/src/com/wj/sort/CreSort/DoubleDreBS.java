package com.wj.sort.CreSort;
import com.wj.sort.Sort;

/**
 * Created by Administrator on 2015/7/20 0020.
 */
public class DoubleDreBS extends Sort {
    @Override
    public void sort(int[] array) {
        //元素位置发生了交互，设置为true
        boolean flag = false;
        /*外层循环每次循环完毕能确定俩个数值，一个最大值一个最小值，所以循环次数减半，
        如果数组长度为奇数时，最后一次循环将剩余一个数值，此值必为中间值，无需再排
        列；如果数组长度为偶数时，循环array.length/2*/
        int loop = array.length/2;
        for(int n = 0;n < loop;n++  ){
            flag = false;
            for(int m = n;m < array.length  - n -1; m++){
                if(array[m] > array[m+1]){
                    flag = true;
                    //正向冒泡
                    int temp = array[m];
                    array[m] = array[m+1];
                    array[m+1] = temp;
                }
                //array.length - 1 -m 倒数第1的元素，array.length - m -2倒数第2个元素
                if(array[array.length - 1 -m] < array[array.length - m -2]){
                    flag = true;
                    //逆向冒泡
                    int temp = array[array.length - 1 -m];
                    array[array.length - 1 -m] = array[array.length - m -2];
                    array[array.length - m -2] = temp;
                }
            }
            if(flag==false){
                return;
            }
        }
    }
}
