package com.yuhan.test;

import com.yuhan.bean.Yuhan;
import org.json.JSONObject;

import java.util.HashMap;

public class Demo01 {
    public static void main(String[] args){
        //example();
        //createJsonByMap();
        createJsonByBean();
    }

    public static void example(){
        JSONObject yuhan = new JSONObject();
        yuhan.put("name","yuhan");
        yuhan.put("age",24);
        yuhan.put("birthday","1994-05-12");
        yuhan.put("car",false);
        yuhan.put("hourse",false);

        System.out.println(yuhan.toString());
    }

    public static void createJsonByMap(){
        HashMap<String,Object> yuhan = new HashMap<String, Object>();
        yuhan.put("name","yuhan");
        yuhan.put("age",24);
        yuhan.put("birthday","1994-05-12");
        yuhan.put("car",false);
        yuhan.put("hourse",false);
        System.out.println(new JSONObject(yuhan).toString());
    }

    public static void createJsonByBean(){
        Yuhan yuhan = new Yuhan();
        yuhan.setName("yuhan");
        yuhan.setAge("24");
        yuhan.setBirthday("1994-05-12");
        yuhan.setCar(false);
        yuhan.setHourse(false);

        System.out.println(new JSONObject(yuhan).toString());
    }
}
