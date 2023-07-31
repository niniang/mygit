package com.yuhan.test;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringTest {
    public static void main(String[] args){
        //StringBuilder拼接字符串
        List<Integer> values = Arrays.asList(1,3,5);
        StringBuilder sb = new StringBuilder("(");
        for(int i = 0;i<values.size();i++){
            sb.append(values.get(i));
            if(i != values.size()-1){
                sb.append(",");
            }
        }
        sb.append(")");
        System.out.println(sb);

        //StringJoiner拼接字符串
        List<Integer> values01 = Arrays.asList(1,3,5);
        StringJoiner sj = new StringJoiner(",","(",")");
        for (Integer value : values01){
            sj.add(value.toString());
        }
        System.out.println(sj);


    }
}
