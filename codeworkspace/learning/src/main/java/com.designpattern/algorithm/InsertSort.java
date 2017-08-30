package com.designpattern.algorithm;

/**
 * Created by wei on 2017/5/18 0018.
 */
public class InsertSort {

    /**
     * 直接插入排序
     */
    public InsertSort() {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            int j = i - 1;
            temp = a[i];
            for (; j >= 0 && temp < a[j]; j--) {
                //将大于temp的值整体后移一个单位
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("直接插入排序结果：" + a[i]);
        }
    }


    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort();
    }
}
