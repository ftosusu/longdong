package com.qianfeng.jdbc;

import com.qianfeng.object.HobbyAvgAge;

import java.sql.*;
import java.util.ArrayList;

public class TestJdbcStudentGroupHobbyAvgAge {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_longdong?useSSL=false&characterEnconding=utf-8", "root", "root");
            String sql = "select stu_hobby,avg(stu_age) from tb_student group by stu_hobby";
            PreparedStatement prep = connection.prepareStatement(sql);
            ResultSet res= prep.executeQuery();
            ArrayList<HobbyAvgAge> avgAgeArrayList = new ArrayList<>();
            while (res.next()){
                double avgAge = res.getDouble("avg(stu_age)");
                String hobby = res.getString("stu_hobby");
                HobbyAvgAge hobbyAvgAge = new HobbyAvgAge(hobby,avgAge);
                avgAgeArrayList.add(hobbyAvgAge);
            }
            System.out.println(avgAgeArrayList);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
