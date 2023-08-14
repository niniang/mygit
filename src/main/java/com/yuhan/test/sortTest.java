package com.yuhan.test;

import java.util.Arrays;

public class sortTest {
    public static void main(String[] agrs){
        int[] list = {7,9,6,5,0,1,3,2,4,8};
        //插入排序
        for(int i=0;i<list.length-1;i++){
            for(int j=i+1;j>=1;j--){
                if(list[j]<list[j-1]){
                    int tmp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = tmp;
                }else {
                    break;
                }
            }

        }
        System.out.println("插入排序：" + Arrays.toString(list));

        //冒泡排序
        for(int i=1;i<list.length;i++){
            for (int j=0;j<list.length-i;j++){
                if(list[j]>list[j+1]){
                    int tmp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = tmp;
                }else {
                    break;
                }
            }
        }
        System.out.println("冒泡排序：" + Arrays.toString(list));

        //选择排序
        for (int i=0;i<list.length-1;i++){
            int min = list[i];
            int minIndex = i;
            for (int j=i+1;j<list.length;j++){
                if (min>list[j]){
                    min = list[j];
                    minIndex = j;
                }
                list[minIndex] = list[i];
                list[i] = min;

            }
        }
        System.out.println("选择排序：" + Arrays.toString(list));
    }
}
