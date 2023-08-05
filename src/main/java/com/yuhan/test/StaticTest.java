package com.yuhan.test;


public class StaticTest {
    //静态变量只有一个副本
    static String name;
    static  int age;

    public String toString(){
        return  "Name:" + name + ",Age:" + age;
    }

    //静态方法
    public  static  void  print(String s){
        System.out.println("静态方法输出："+s);
    }

    public static void main(String[] agrs){
        StaticTest st01 = new StaticTest();
        st01.name = "yuhan";
        st01.age = 29;

        StaticTest st02 = new StaticTest();
        st02.name = "zhaiyujia";
        st02.age = 32;

        System.out.println(st01);
        System.out.println(st02);

        StaticTest.print("123");
    }
}
