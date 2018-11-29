package com.yuhan.test;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadJSON {
    public static Properties prop;
    public static String content;

    public static void main(String[] args) throws IOException {
        //readJsonFile();
        readFile();
    }

    public static void readJsonFile() throws IOException {
        File file = new File("./src//main/java/com/yuhan/data/test.json");

        String content = FileUtils.readFileToString(file,"utf8");

        JSONObject jsonObject = new JSONObject(content);

        System.out.println(jsonObject.toString());
        System.out.println("姓名：" + jsonObject.getString("name"));
        System.out.println("年龄：" + jsonObject.getString("age"));
        System.out.println("生日：" + jsonObject.getString("birthday"));
        System.out.println("车：" + jsonObject.getBoolean("car"));
        System.out.println("房：" + jsonObject.getBoolean("hourse"));
    }

    public static void readFile(){
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "./src//main/java/com/yuhan/data/config.properties");
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        content = prop.getProperty("content");
        System.out.println(content);
    }
}
