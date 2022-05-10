package com.qianfeng.object;

public class Student /**
 * @author ZhangrongHao
 * @date 2022/5/10 8:23
 */ {
     private  int stuId;
     private String stuName;
     private int stuAge;
     private String stuHobby;

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuHobby() {
        return stuHobby;
    }

    public void setStuHobby(String stuHobby) {
        this.stuHobby = stuHobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuHobby='" + stuHobby + '\'' +
                '}';
    }
    //构造方法：修饰符（public，private），类名{}
    //实体类中没有自行添加构造方法，默认有一个无参构造方法
    //自动生成有参和无参构造方法
    //new实体类时会执行构造方法!!!!
    public Student(){

    }
    public Student(int stuId, String stuName, int stuAge, String stuHobby) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuHobby = stuHobby;
    }
}
