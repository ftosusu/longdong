package com.qianfeng.object;

/**
 * @author ZhangrongHao
 * @date 2022/5/10 11:33
 */

/**
 * 学生类的爱好和年龄
 */
public class HobbyAvgAge {
    private String hobby;
    private Double avgAge;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Double getAvgAge() {
        return avgAge;
    }

    public void setAvgAge(Double avgAge) {
        this.avgAge = avgAge;
    }

    @Override
    public String toString() {
        return "HobbyAvgAge{" +
                "hobby='" + hobby + '\'' +
                ", avgAge=" + avgAge +
                '}';
    }

    public HobbyAvgAge() {
    }

    public HobbyAvgAge(String hobby, Double avgAge) {
        this.hobby = hobby;
        this.avgAge = avgAge;
    }
}
