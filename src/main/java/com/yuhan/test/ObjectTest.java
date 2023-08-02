package com.yuhan.test;

public class ObjectTest implements Cloneable{
    private int age;
    private String name;

    public ObjectTest(int age,String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "-" + age;
    }

    public boolean equals(Object o){
        if(o instanceof ObjectTest){
            ObjectTest ot = (ObjectTest) o;
            return age == ot.age && name.equals(ot.name);
        }
        else
            return false;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] agrs) throws CloneNotSupportedException {
        //重写toString
        System.out.println(new ObjectTest(29,"yuhan").toString());

        //重写equals
        String name = "yuhan01";
        ObjectTest ot01 = new ObjectTest(29,name);
        ObjectTest ot02 = new ObjectTest(29,name);
        System.out.println(ot01.equals(ot02));

        System.out.println(ot01.hashCode());

        //实现clone方法
        ObjectTest ot03 = (ObjectTest) ot01.clone();
        System.out.println(ot03.equals(ot01));

        //获取运行时类，反射机制
        Class clz = ot03.getClass();
        System.out.println(clz);
        System.out.println(clz.getName());
    }

}