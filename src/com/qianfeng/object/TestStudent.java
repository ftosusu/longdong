package com.qianfeng.object;

public class TestStudent {
    public static void main(String[] args) {
        //new实体类时会执行构造方法!!!!    jetbrains    webstorm
        Student student = new Student();//无参构造
        Student student1 = new Student(2, "张三", 22, "打篮球");
        System.out.println(student);
        System.out.println(student1);
    }
}
