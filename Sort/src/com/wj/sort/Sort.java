package com.wj.sort;

import com.wj.sort.CreSort.CountingSort;

/**
 * Created by wdd
 * Time 2015/3/23 0023  22:31
 */
public abstract class Sort {
    public abstract void sort(int[] arr);

    public static void main(String[] args) {
        int[] a = {1, 1, 3, 5, 6, 4, 5, 0, 0};
        for (int i : a) {
            System.out.printf(i + " ");
        }
        System.out.println(" ");
        Sort sort;
        sort = new CountingSort();
        sort.sort(a);
        for (int i : a) {
            System.out.printf(i + " ");
        }
        System.out.println(" ");
    }
}
