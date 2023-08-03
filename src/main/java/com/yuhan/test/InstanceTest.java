package com.yuhan.test;

public class InstanceTest {
    //静态属性
    private static String staticField = getStaticField();

    //静态方法
    private static String getStaticField(){
        String staticFiled = "静态属性初始化";
        return staticFiled;
    }
    //静态代码块
    {
        System.out.println(staticField);
        System.out.println("静态代码块初始化");
    }

    //普通属性
    private String field = getField();

    //普通方法
    public String getField(){
        String field = "普通属性初始化";
        return field;
    }

    //普通代码块
    {
        System.out.println(field);
        System.out.println("普通代码块初始化");
    }

    //构造方法
    public InstanceTest(){
        System.out.println("构造方法初始化");
    }

    public static void main(String[] agrs){
        new InstanceTest();
    }

}
